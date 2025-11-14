package poly.com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/bai3", "/form/create", "/form/update"})
public class Bai3formservlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("message", "welcome to fpoly");
		Map<String, Object> map = new HashMap<>();
		map.put("fullname", "bruhbruhlonglmao");
		map.put("gender", "true");
		map.put("country", "My");
		req.setAttribute("user", map);
		req.getRequestDispatcher("/form/form.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String uri= req.getRequestURI();
		if(uri.contains("/form/update")) {
			String fullname=req.getParameter("fullname");
			System.out.print(fullname);
			String gender=req.getParameter("gender");
			String country=req.getParameter("country");
			Map<String, Object> map = new HashMap<>();
			map.put("fullname", fullname);
			map.put("gender", gender);
			map.put("country", country);
			req.setAttribute("user", map);
			req.setAttribute("CapNhat","Update Success" );
			req.getRequestDispatcher("/form/form.jsp").forward(req, resp);
		}
		else if (uri.contains("/form/create")) {
			String fullname=req.getParameter("fullname");
			String gender=req.getParameter("gender");
			String country=req.getParameter("country");
			Map<String, Object> map = new HashMap<>();
			map.put("fullname", fullname);
			map.put("gender", gender);
			map.put("country", country);
			req.setAttribute("user", map);
			req.getRequestDispatcher("/form/themoi.jsp").forward(req, resp);
		}
	}
}
