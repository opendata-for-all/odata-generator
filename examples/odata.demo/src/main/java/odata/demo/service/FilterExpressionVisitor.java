package odata.demo.service;

import java.util.List;
import java.util.Locale;

import org.apache.olingo.commons.api.edm.EdmEnumType;
import org.apache.olingo.commons.api.edm.EdmProperty;
import org.apache.olingo.commons.api.edm.EdmType;
import org.apache.olingo.commons.api.http.HttpStatusCode;
import org.apache.olingo.commons.core.edm.primitivetype.EdmString;
import org.apache.olingo.server.api.ODataApplicationException;
import org.apache.olingo.server.api.uri.UriResource;
import org.apache.olingo.server.api.uri.UriResourcePrimitiveProperty;
import org.apache.olingo.server.api.uri.queryoption.expression.BinaryOperatorKind;
import org.apache.olingo.server.api.uri.queryoption.expression.Expression;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitException;
import org.apache.olingo.server.api.uri.queryoption.expression.ExpressionVisitor;
import org.apache.olingo.server.api.uri.queryoption.expression.Literal;
import org.apache.olingo.server.api.uri.queryoption.expression.Member;
import org.apache.olingo.server.api.uri.queryoption.expression.MethodKind;
import org.apache.olingo.server.api.uri.queryoption.expression.UnaryOperatorKind;
import org.jooq.Record;
import org.jooq.SelectQuery;
import org.jooq.impl.DSL;

public class FilterExpressionVisitor implements ExpressionVisitor<Object> {

	private String tableName;
	private SelectQuery<Record> query;

  public FilterExpressionVisitor(SelectQuery<Record> query, String tableName) {
    this.query = query;
    this.tableName = tableName;
	}

  public Object visitMember(final Member member) throws ExpressionVisitException, ODataApplicationException {
    
    final List<UriResource> uriResourceParts = member.getResourcePath().getUriResourceParts();
    
    
    if(uriResourceParts.size() == 1 && uriResourceParts.get(0) instanceof UriResourcePrimitiveProperty) {
      UriResourcePrimitiveProperty uriResourceProperty = (UriResourcePrimitiveProperty) uriResourceParts.get(0);
      return uriResourceProperty.getProperty();
    } else {
      throw new ODataApplicationException("Only primitive properties are implemented in filter expressions", 
          HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
    }
  }
  
  public Object visitLiteral(Literal literal) throws ExpressionVisitException, ODataApplicationException {
    
    String literalAsString = literal.getText();
    if(literal.getType() instanceof EdmString) {
      String stringLiteral = "";
      if(literal.getText().length() > 2) {
        stringLiteral = literalAsString.substring(1, literalAsString.length() - 1);
      }
      
      return stringLiteral;
    } else {
      try {
        return Integer.parseInt(literalAsString);
      } catch(NumberFormatException e) {
    	  try {
    		  return Double.parseDouble(literalAsString);
    	  }
    	  catch (NumberFormatException ee) {
    		  throw new ODataApplicationException("Only Edm.Int32, Edm.Numeric and Edm.String literals are implemented", 
    		            HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
    	  }
       
      }
    }
  }
  
  public Object visitUnaryOperator(UnaryOperatorKind operator, Object operand) 
      throws ExpressionVisitException, ODataApplicationException {
    // operand
    
    if(operator == UnaryOperatorKind.NOT && operand instanceof Boolean) {
      return !(Boolean) operand;
    } else if(operator == UnaryOperatorKind.MINUS && operand instanceof Integer){
      return -(Integer) operand;
    }
    
    throw new ODataApplicationException("Invalid type for unary operator", 
        HttpStatusCode.BAD_REQUEST.getStatusCode(), Locale.ENGLISH);
  }

	public Object visitBinaryOperator(BinaryOperatorKind operator, Object left, Object right) 
	    throws ExpressionVisitException, ODataApplicationException {
		
	  
	 if (operator == BinaryOperatorKind.EQ
        || operator == BinaryOperatorKind.NE
        || operator == BinaryOperatorKind.GE
        || operator == BinaryOperatorKind.GT
        || operator == BinaryOperatorKind.LE
        || operator == BinaryOperatorKind.LT) {
      return evaluateComparisonOperation(operator, left, right);
	  } else {
	    throw new ODataApplicationException("Binary operation " + operator.name() + " is not implemented", 
          HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	  }
  }

	private Object evaluateBooleanOperation(BinaryOperatorKind operator, Object left, Object right)
	    throws ODataApplicationException {
	  
		 throw new ODataApplicationException("Boolean operations are not implemented", 
			        HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	}

  private Object evaluateComparisonOperation(BinaryOperatorKind operator, Object left, Object right) 
      throws ODataApplicationException {
    
 if(operator.equals(BinaryOperatorKind.LE))
	 if(left instanceof EdmProperty){
		 query.addConditions(DSL.field(tableName +"." +((EdmProperty)left).getName().toLowerCase()).le(right));
	 }
 if(operator.equals(BinaryOperatorKind.EQ))
	 if(left instanceof EdmProperty){
		 query.addConditions(DSL.field(tableName +"." +((EdmProperty)left).getName().toLowerCase()).eq(right));
	 }
 if(operator.equals(BinaryOperatorKind.GE))
	 if(left instanceof EdmProperty){
		 query.addConditions(DSL.field(tableName +"." +((EdmProperty)left).getName().toLowerCase()).ge(right));
	 }
 if(operator.equals(BinaryOperatorKind.GT))
	 if(left instanceof EdmProperty){
		 query.addConditions(DSL.field(tableName +"." +((EdmProperty)left).getName().toLowerCase()).gt(right));
	 }
 if(operator.equals(BinaryOperatorKind.LT))
	 if(left instanceof EdmProperty){
		 query.addConditions(DSL.field(tableName +"." +((EdmProperty)left).getName().toLowerCase()).lt(right));
	 }

 return query;
  }

  private Object evaluateArithmeticOperation(BinaryOperatorKind operator, Object left, 
      Object right) throws ODataApplicationException {
	  throw new ODataApplicationException("Arithmetic operations are not implemented", 
		        HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
  }

	public Object visitMethodCall(MethodKind methodCall, List<Object> parameters) 
	    throws ExpressionVisitException, ODataApplicationException {
    
    if(methodCall == MethodKind.CONTAINS) {
    
      if(parameters.get(0) instanceof EdmProperty && parameters.get(1) instanceof String) {
        EdmProperty property = (EdmProperty) parameters.get(0);
        String valueParam2 = (String) parameters.get(1);
        query.addConditions(DSL.field(tableName +"." +property.getName().toLowerCase()).contains(valueParam2));
        return query;
      } else {
        throw new ODataApplicationException("Contains needs two parametes of type Edm.String", 
            HttpStatusCode.BAD_REQUEST.getStatusCode(), Locale.ENGLISH);
      }
    } else {
      throw new ODataApplicationException("Method call " + methodCall + " not implemented", 
          HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
    }
	}

	public Object visitTypeLiteral(EdmType type) throws ExpressionVisitException, ODataApplicationException {
	  throw new ODataApplicationException("Type literals are not implemented", 
        HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	}
	
	  public Object visitAlias(String aliasName) throws ExpressionVisitException, ODataApplicationException {
	   throw new ODataApplicationException("Aliases are not implemented", 
         HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	 }
	 
	  public Object visitEnum(EdmEnumType type, List<String> enumValues) 
	      throws ExpressionVisitException, ODataApplicationException {
	    throw new ODataApplicationException("Enums are not implemented", 
          HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	  }

	  public Object visitLambdaExpression(String lambdaFunction, String lambdaVariable, Expression expression) 
	      throws ExpressionVisitException, ODataApplicationException {
	    throw new ODataApplicationException("Lamdba expressions are not implemented", 
          HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	  }

	  public Object visitLambdaReference(String variableName) 
	      throws ExpressionVisitException, ODataApplicationException {
	    throw new ODataApplicationException("Lamdba references are not implemented", 
	        HttpStatusCode.NOT_IMPLEMENTED.getStatusCode(), Locale.ENGLISH);
	  }
}

