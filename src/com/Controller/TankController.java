package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.FuelDao;
import com.Dao.TankDao;
import com.Model.Fuel;
import com.Model.Tank;

/**
 * Servlet implementation class TankController
 */
public class TankController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TankController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
        if(request.getParameter("submit").equalsIgnoreCase("Submit")){
			
        	int tanks = Integer.parseInt(request.getParameter("tanks"));
        	String[] fuels = request.getParameterValues("fuel");
        	String[] balance = request.getParameterValues("n");
        	String[] name = request.getParameterValues("name");
        	int j =0;
        	for (int i = 1; i <= tanks; i++) {
        		//String name = "tank"+i;
        		//String name = request.getParameter("name");
        		Tank tank = new Tank();
				tank.setTankname(name[i-1]);
				tank.setFuelbalance(Float.parseFloat(balance[i-1]));
				tank.setFuelid(Integer.parseInt(fuels[i-1]));
				 j = TankDao.addTank(tank);
								
				        	
			}
        	if(j>0){
				List<Tank> list = TankDao.getTank();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewtank.jsp").forward(request, response);
			}else {
				System.out.println("error");
			}

		}
        if(request.getParameter("submit").equalsIgnoreCase("Delete"))
        {
        	int id = Integer.parseInt(request.getParameter("id"));
        	int j = TankDao.deleteTank(id);
        	if(j>0)
        	{
        		List<Tank> list = TankDao.getTank();
        		request.setAttribute("list", list);
        		request.getRequestDispatcher("viewtank.jsp").forward(request,response);
        		
        	}
        	else
        	{
        	
        		response.sendRedirect("error.jsp");
        	}
        }
        if(request.getParameter("submit").equalsIgnoreCase("Edit")){
			int id = Integer.parseInt(request.getParameter("id"));
			Tank tank = TankDao.findTank(id);
			request.setAttribute("tank", tank);
			request.getRequestDispatcher("updatetank.jsp").forward(request, response);
		}
	
        if(request.getParameter("submit").equalsIgnoreCase("Update")){
			int id  = Integer.parseInt(request.getParameter("id"));
			//int tanks = Integer.parseInt(request.getParameter("tanks"));
        	String fuels = request.getParameter("fuel");
        	String balance = request.getParameter("n");
        	int j =0;
        
        		//String name = "tank"+id;
        	String name = request.getParameter("name");
        		Tank tank = new Tank();
        		tank.setId(id);
				tank.setTankname(name);
				tank.setFuelbalance(Float.parseFloat(balance));
				tank.setFuelid(Integer.parseInt(fuels));
				 j = TankDao.updateTank(tank);
								
				        	
			
        	if(j>0){
				List<Tank> list = TankDao.getTank();
				request.setAttribute("list", list);
				request.getRequestDispatcher("viewtank.jsp").forward(request, response);
			}else {
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
