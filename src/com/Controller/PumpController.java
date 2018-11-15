package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.PumpDao;
import com.Dao.TankDao;
import com.Model.Pump;
import com.Model.Tank;

/**
 * Servlet implementation class PumpController
 */
public class PumpController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PumpController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
			if(request.getParameter("submit").equalsIgnoreCase("Submit")){
			
        	int pumps = Integer.parseInt(request.getParameter("pumps"));
        	String[] tank = request.getParameterValues("tank");
        
        	String[] name = request.getParameterValues("name");
        	int j =0;
        	for (int i = 1; i <= pumps; i++) {
        		//String name = "pump"+i;
        		//String name = request.getParameter("name");
        		Pump pump = new Pump();
        		Tank tank3 = TankDao.findTank(Integer.parseInt(tank[i-1]));
        		pump.setPumpname(name[i-1]);
        		pump.setTankid(Integer.parseInt((tank[i-1])));
        		pump.setFuelid(tank3.getFuelid());
        	
        		
        		//Tank tank = new Tank();
				//tank.setTankname(name);
				//tank.setFuelbalance(Float.parseFloat(balance[i-1]));
				//tank.setFuelid(Integer.parseInt(fuels[i-1]));
				 j = PumpDao.addPump(pump);
								
				        	
			}
        	if(j>0){
        		List<Pump> list = PumpDao.getPump();
        		request.setAttribute("list", list);
				request.getRequestDispatcher("viewpump.jsp").forward(request, response);
				
        		
			}else {
				System.out.println("error");
			}

		}

			 if(request.getParameter("submit").equalsIgnoreCase("Delete"))
		        {
		        	int id = Integer.parseInt(request.getParameter("id"));
		        	int j = PumpDao.deletePump(id);
		        	if(j>0)
		        	{
		        		List<Pump> list = PumpDao.getPump();
		        		request.setAttribute("list", list);
		        		request.getRequestDispatcher("viewpump.jsp").forward(request,response);
		        		
		        	}
		        	else
		        	{
		        	
		        		response.sendRedirect("error.jsp");
		        	}
		        }
		
			 if(request.getParameter("submit").equalsIgnoreCase("Edit")){
					int id = Integer.parseInt(request.getParameter("id"));
					
					Pump pump = PumpDao.findPump(id);
					request.setAttribute("pump", pump);
					request.getRequestDispatcher("updatepump.jsp").forward(request, response);
				}
			 if(request.getParameter("submit").equalsIgnoreCase("Update")){
				 String id = request.getParameter("id");
				 	
		        	String tank = request.getParameter("tank");
		        	
		        	String fueltype = request.getParameter("fueltype");
		        	int j =0;
		        	
		        		//String name = "pump"+id;
		        	
		        		String name = request.getParameter("name");
		        		Pump pump = new Pump();
		        		//Tank tank3 = TankDao.findTank(Integer.parseInt(tank));
		        		pump.setId(Integer.parseInt(id));
		        		pump.setPumpname(name);
		        		pump.setTankid(Integer.parseInt((tank)));
		        		pump.setFuelid(Integer.parseInt(fueltype));
		       
		        		
		        		//Tank tank = new Tank();
						//tank.setTankname(name);
						//tank.setFuelbalance(Float.parseFloat(balance[i-1]));
						//tank.setFuelid(Integer.parseInt(fuels[i-1]));
						 j = PumpDao.updatePump(pump);
										
						        	
					
		        	if(j>0){
		        		List<Pump> list = PumpDao.getPump();
		        		request.setAttribute("list", list);
						request.getRequestDispatcher("viewpump.jsp").forward(request, response);
						
		        		
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
