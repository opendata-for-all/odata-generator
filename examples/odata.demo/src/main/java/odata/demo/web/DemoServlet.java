package odata.demo.web;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import odata.demo.service.EdmProvider;
import odata.demo.service.SQLCollectionProcessor;
import odata.demo.service.SQLEntityProcessor;

import org.apache.olingo.server.api.OData;
import org.apache.olingo.server.api.ODataHttpHandler;
import org.apache.olingo.server.api.ServiceMetadata;
import org.apache.olingo.commons.api.edmx.EdmxReference;


public class DemoServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void service(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {

    try {
      OData odata = OData.newInstance();
      ServiceMetadata edm = odata.createServiceMetadata(new EdmProvider(), new ArrayList<EdmxReference>());
      ODataHttpHandler handler = odata.createHandler(edm);
      handler.register(new SQLCollectionProcessor());
      handler.register(new SQLEntityProcessor());		

      handler.process(req, resp);

    } catch (RuntimeException e) {
      throw new ServletException(e);
    }
  }
}
