package com.Controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.AttendantDao;
import com.Dao.PumpDao;
import com.Dao.TransactionDao;
import com.Model.Attendant;
import com.Model.FinalTransaction;
import com.Model.Pump;
import com.Model.Transaction;

/**
 * Servlet implementation class TransactionController
 */
public class TransactionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransactionController() {
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
			
		String fuel = request.getParameter("fuelid");	
		String fuelamount = request.getParameter("amount");
		
		//String pump = request.getParameter("pump");
		int id =Integer.parseInt( request.getParameter("empid"));
		
		Date utilDate= new Date();
		java.sql.Date date=new java.sql.Date(utilDate.getTime());
		System.out.println("Date :- "+date);
		
		/*int j;
		int[] empid = PumpDao.findPump(Integer.parseInt(pump[j-1]));
		*/
		int i = 0;
		//Pump pump1 = PumpDao.findPump(Integer.parseInt(id));
		Attendant attendant = AttendantDao.finAttendant(id);
		int pump = attendant.getPumpid();
		
		Transaction transaction = new Transaction();
		transaction.setFuelid(Integer.parseInt(fuel));
		transaction.setFuelamount(Float.parseFloat(fuelamount));
		transaction.setPumpid(pump);
		transaction.setEmpid(id);
		transaction.setToday(date);
		i = TransactionDao.addTransaction(transaction);
		
		if(i>0)
		{
			List<FinalTransaction> list = TransactionDao.getTransaction();
			request.setAttribute("list", list);
			request.getRequestDispatcher("viewtransaction.jsp").forward(request, response);
			//response.sendRedirect("viewtransaction.jsp");
		}
		else
		{
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
