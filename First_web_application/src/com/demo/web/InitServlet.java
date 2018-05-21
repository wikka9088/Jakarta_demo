package com.demo.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class InitServlet extends HttpServlet {
	public void init() throws ServletException {
		ServletContext context = getServletContext();
		
		context.setAttribute("base", context.getContextPath());
		context.setAttribute("site", "Wikka first web application demo");
	}
}
