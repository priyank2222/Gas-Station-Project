package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.PriceDao;
import com.Dao.PumpDao;
import com.Model.Price;
import com.Model.Pump;

/**
 * Servlet implementation class PriceController
 */
public class PriceController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PriceController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		if(request.getParameter("submit").equalsIgnoreCase("Edit"))
		{
		
		
		
		request.getRequestDispatcher("updateprice.jsp").forward(request, response);
		
		}
		if(request.getParameter("submit").equalsIgnoreCase("Update"))
		{
		
			String petrol = request.getParameter("petrol");
			System.out.println("Petrol prise :- "+petrol);
			String diesel = request.getParameter("diesel");
			String power = request.getParameter("power");
			String mix = request.getParameter("mix");
			
			int j =0;
			Price price = new Price();
			price.setPetrol(Float.parseFloat(petrol));
			price.setDiesel(Float.parseFloat(diesel));
			price.setPower(Float.parseFloat(power));
			price.setMix(Float.parseFloat(mix));
			j = PriceDao.updatePrice(price);
			
			if(j>0){
        		List<Price> list = PriceDao.getPrice();
        		request.setAttribute("list", list);
				request.getRequestDispatcher("price.jsp").forward(request, response);
				
        		
			}else {
				System.out.println("error");
			}

			
			
			
		
		
		}
		

		
				
		
	}

}
