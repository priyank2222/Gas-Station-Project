package com.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.CustomerDao;
import com.Model.Customer;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerController() {
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
			String email = request.getParameter("email");
			
			Customer customer = new Customer();
			customer.setCustomername(firstname);
			customer.setEmail(email);
			
			int i =CustomerDao.addCustomer(customer);
			
			if(i>0)
			{
				List<Customer> list = CustomerDao.getCustomer();
			
				request.setAttribute("list", list);
				//response.sen("viewcustomer.jsp");
				request.getRequestDispatcher("viewcustomer.jsp").forward(request, response);
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
