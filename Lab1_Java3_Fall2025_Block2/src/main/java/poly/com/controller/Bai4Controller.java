package poly.com.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet({"/bai4","/nv/insert","/nv/update","/nv/delete","/nv/find"})
public class Bai4Controller extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	req.getRequestDispatcher("bai4.jsp").forward(req, resp);
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri=req.getRequestURI();
		if (uri.contains("/nv/insert")) {
			resp.getWriter().print("<h1>insert data </h1>");
		} else if (uri.contains("/nv/update")) {
			resp.getWriter().print("<h1>update data </h1>");
	} else if (uri.contains("/nv/delete")) {
		resp.getWriter().print("<h1>delete data </h1>");
}else if (uri.contains("/nv/find")) {
	resp.getWriter().print("<h1>find data...</h1>");
}
}
}
