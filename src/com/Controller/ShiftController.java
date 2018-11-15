package com.Controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Dao.TransactionDao;
import com.Model.FinalTransaction;

/**
 * Servlet implementation class ShiftController
 */
public class ShiftController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShiftController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String start =request.getParameter("date");
		DateFormat format=new SimpleDateFormat("MM/dd/yyyy");
		String start1 =request.getParameter("date1");
		DateFormat format1=new SimpleDateFormat("MM/dd/yyyy");
		
		java.util.Date utilDate1=null;
		java.util.Date utilDate2=null;
		try
		{
			utilDate1=format.parse(start);
			utilDate2=format1.parse(start1);
				
		}
		catch(ParseException e){
			e.printStackTrace();
		}
		
		java.sql.Date startD;
		java.sql.Date startD1;
		startD=new java.sql.Date(utilDate1.getTime());
		startD1=new java.sql.Date(utilDate2.getTime());
		
		List<FinalTransaction> list = TransactionDao.getTransactionByDate(startD,startD1);
		/*List<FinalTransaction> list1 = TransactionDao.getTransactionByDate(startD1);*/
		request.setAttribute("list", list);
		request.getRequestDispatcher("realreports.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("submit").equalsIgnoreCase("Submit"))
		{
			String shift = request.getParameter("shift");
			System.out.println("Shift by which Admin Needs Record :-"+shift+" shft.");
			List<FinalTransaction> list = TransactionDao.getTransactionByShift(shift);
			request.setAttribute("list", list);
			request.getRequestDispatcher("realreports.jsp").forward(request, response);
			
			
			
		}
	}

}
