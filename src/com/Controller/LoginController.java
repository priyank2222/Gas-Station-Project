package com.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Dao.LoginDao;
import com.Dao.SetupDao;

import com.Model.Setup;
import com.Model.User;

/**
 * Servlet implementation class Loginontroller
 */
public class LoginController extends HttpServlet {


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
/*		HttpSession session = null;
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		if(email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword()))
		{
			session = request.getSession(true);
			session.setMaxInactiveInterval(30);
			session.setAttribute("user", user);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
		}
		else
		{
			request.setAttribute("msg", "sorry data not inserted");
			request.getRequestDispatcher("sign-in.jsp").forward(request, response);
		
		}

		
		System.out.println("test");*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = null;
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		User user = new User();
		user.setEmail(email);
		user.setPassword(password);
		User user2 = LoginDao.authenticate(user);
		List<Setup> list = SetupDao.getSetups();

		System.out.println("size : " + list.size());
		//System.out.println("next line");
		boolean v=list==null;
		session = request.getSession(true);
		session.setAttribute("user2", user2);
		if(user2!=null && list.size()==0)
		{
			
			//session.setMaxInactiveInterval(30);
			
			//if(rs.next()){
			response.sendRedirect("addfuel.jsp");
			}
		else if (user2!=null) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		
		
		else
		{
			request.setAttribute("msg", "sorry data not inserted");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		
		}


		
		
	}

}

