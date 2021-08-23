package com.servletProject;

import com.google.inject.servlet.ServletModule;

public class MyServletModule extends ServletModule {

	   @Override
	   protected void configureServlets() {
	          //serve("*.html").with(MyServlet.class);
		   serve("/*").with(MyServlet.class);
	   }
	}
