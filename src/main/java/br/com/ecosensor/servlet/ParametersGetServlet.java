package br.com.ecosensor.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/parameters/url-get")
public class ParametersGetServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String param = req.getParameter("param");
		String name = req.getParameter("name");
		String codeIN = req.getParameter("code");
		Integer code = (codeIN != null) ? Integer.valueOf(codeIN) : null;
		
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Get Parameters from URL</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Get Parameters from URL</h1>");
		if (param != null)
			out.println("<h2>Param = " + param + "</h2>");
		if (name != null)
			out.println("<h3>Name = " + name + "</h3>");
		if (code != null)
			out.println("<h3>Code = " + code + "</h3>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}
}
