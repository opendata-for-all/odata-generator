package odata.demo.service;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

public class Storage {
	private DSLContext create; 

	public Storage () throws IOException{
		InputStream s = getClass().getResourceAsStream("/config.properties");

		Properties props = new Properties();
		props.load(s);
		try {
			Class.forName(props.getProperty("db.driver"));
			Connection conn = DriverManager.getConnection(props.getProperty("db.url"), props.getProperty("db.user"), props.getProperty("db.password"));
			setCreate(DSL.using(conn, SQLDialect.MYSQL));
	    } 

	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	public DSLContext getCreate() {
		return create;
	}

	public void setCreate(DSLContext create) {
		this.create = create;
	}
}
