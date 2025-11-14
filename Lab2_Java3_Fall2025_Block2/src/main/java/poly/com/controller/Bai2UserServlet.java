package poly.com.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/bai2user")
public class Bai2UserServlet extends HttpServlet
{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	req.setAttribute("message", "welcome to fpoly");
	Map<String, Object> map = new HashMap<>();
	map.put("fullname", "bruhbruhlonglmao");
	map.put("gender", "Sigmamale");
	map.put("country", "Vietnamvodich");
	req.setAttribute("user", map);
	req.getRequestDispatcher("page.jsp").forward(req, resp);
}
}
