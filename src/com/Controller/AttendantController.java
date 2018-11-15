package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.AttendantDao;
import com.Dao.FuelDao;
import com.Model.Attendant;
import com.Model.Fuel;

/**
 * Servlet implementation class AttendantController
 */
public class AttendantController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AttendantController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("submit").equalsIgnoreCase("Submit"))
		{
			
			String firstname = request.getParameter("fname");
			String lastname = request.getParameter("lname");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String address = request.getParameter("address");
			String contact = request.getParameter("contact");
			String pump = request.getParameter("pump");
			String shift = request.getParameter("shift");
			String uname=request.getParameter("uname");
			Attendant attendant = new Attendant();
			attendant.setUser_name(uname);
			attendant.setName(firstname);
			attendant.setLastname(lastname);
			attendant.setEmail(email);
			attendant.setPassword(password);
			attendant.setAddress(address);
			attendant.setContact(contact);
			attendant.setPumpid(Integer.parseInt(pump));
			attendant.setShift(shift);
			int i = AttendantDao.addAttendant(attendant);
			if(i>0)
			{
				List<Attendant> list = AttendantDao.getAttendant();
				request.setAttribute("list", list);
				response.sendRedirect("viewattendant.jsp");
			}
			else
			{
				System.out.println("error");
			}
		}
		if(request.getParameter("submit").equalsIgnoreCase("Delete")){
			int id = Integer.parseInt(request.getParameter("id"));
			int j = AttendantDao.deleteAttendant(id);
			
			if(j>0){
				List<Attendant> list = AttendantDao.getAttendant();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewattendant.jsp").forward(request, response);
			}else {
				response.sendRedirect("error.jsp");
			}
		}
		if(request.getParameter("submit").equalsIgnoreCase("Edit"))
		{
			int id = Integer.parseInt(request.getParameter("id"));
			Attendant attendant = AttendantDao.finAttendant(id);
			
			request.setAttribute("attendant", attendant);
			request.getRequestDispatcher("updateattendant.jsp").forward(request, response);
			
			
		}
		if(request.getParameter("submit").equalsIgnoreCase("Update"))
		{
			
			int id = Integer.parseInt(request.getParameter("id"));
			String fname = request.getParameter("fname");
			String lname = request.getParameter("lname");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String shift = request.getParameter("shift");
			
			Attendant attendant = new Attendant();
			attendant.setId(id);
			attendant.setName(fname);
			attendant.setLastname(lname);
			attendant.setEmail(email);
			attendant.setPassword(password);
			attendant.setShift(shift);
			int i = AttendantDao.updateAttendant(attendant);
			
			if(i>0){
				List<Attendant> list = AttendantDao.getAttendant();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewattendant.jsp").forward(request, response);
			}else {
				response.sendRedirect("error.jsp");
			}
		}
		if(request.getParameter("submit").equalsIgnoreCase("Block"))
		{
			
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
