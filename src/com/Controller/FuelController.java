package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.FuelDao;



import com.Model.Fuel;


/**
 * Servlet implementation class FuelController
 */
public class FuelController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FuelController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		if(request.getParameter("submit").equalsIgnoreCase("Submit")){
			
			String name = request.getParameter("fuelname");
			//int id = Integer.parseInt(request.getParameter("fuelid"));
			Fuel fuel = new Fuel();
			//fuel.setFuelid(id);
			fuel.setFuelname(name);
			int i = FuelDao.addFuel(fuel);
			if(i>0){
				List<Fuel> list = FuelDao.getFuel();
				request.setAttribute("list", list);
				response.sendRedirect("viewFuel.jsp");
			}else {
				System.out.println("error");
			}
		}
		
		
		if(request.getParameter("submit").equalsIgnoreCase("Delete")){
			int id = Integer.parseInt(request.getParameter("fuelid"));
			int j = FuelDao.deleteFuel(id);
			
			if(j>0){
				List<Fuel> list = FuelDao.getFuel();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewFuel.jsp").forward(request, response);
			}else {
				response.sendRedirect("error.jsp");
			}
		}
		if(request.getParameter("submit").equalsIgnoreCase("Edit")){
			int id = Integer.parseInt(request.getParameter("id"));
			Fuel fuel = FuelDao.findFuel(id);
	
			request.setAttribute("fuel", fuel);
			request.getRequestDispatcher("addfuel.jsp").forward(request, response);
		}
		
		if(request.getParameter("submit").equalsIgnoreCase("Update")){
			int id  = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("fuelname");
	
			Fuel fuel = new Fuel();
			fuel.setFuelid(id);
			fuel.setFuelname(name);
			
			int i = FuelDao.updateFuel(fuel);
			
			
			
			if(i>0){
				List<Fuel> list = FuelDao.getFuel();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewFuel.jsp").forward(request, response);
			}else {
				response.sendRedirect("error.jsp");
			}
			
		}
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			
		
		
		
		
		
		
		
	}

}
