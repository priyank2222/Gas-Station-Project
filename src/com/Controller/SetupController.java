package com.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.SetupDao;
import com.Model.Setup;

/**
 * Servlet implementation class SetupController
 */
public class SetupController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SetupController() {
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
		
		String pump = request.getParameter("pump_no");
		String tank = request.getParameter("tank_no");
		
		Setup setup = new Setup();
		setup.setPump(Integer.parseInt(pump));
		setup.setTank(Integer.parseInt(tank));
		int i = SetupDao.addSetup(setup);
		
		if(i>0)
		{
			request.setAttribute("setup",setup);
			request.getRequestDispatcher("tank.jsp").forward(request, response);
			//response.sendRedirect("tank.jsp");
			
		}
		else
		{
			System.out.println("error");
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
