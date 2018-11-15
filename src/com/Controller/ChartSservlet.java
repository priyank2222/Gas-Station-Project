package com.Controller;

import java.awt.BasicStroke;
import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import com.Util.DbUtil;


public class ChartSservlet extends HttpServlet
{
	double bal =0;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String tank = request.getParameter("tank");
		System.out.println(tank);
		
		Connection connection = DbUtil.getCon();
		
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			ps = connection.prepareStatement("select * from tank where Tank_Id = " + Integer.parseInt(tank));
			rs =ps.executeQuery();
			while(rs.next())
			{
				
				bal = (rs.getDouble("Fuel_Balance")*100)/1000;
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("bal : " + bal);
		response.setContentType("image/png");

		OutputStream outputStream = response.getOutputStream();

		JFreeChart chart = getChart();
		int width = 500;
		int height = 350;
		ChartUtilities.writeChartAsPNG(outputStream, chart, width, height);

		

}



public JFreeChart getChart() {
	DefaultPieDataset dataset = new DefaultPieDataset();
	dataset.setValue("Filled", bal);
	dataset.setValue("Empty", 100-bal);
	
	//dataset.setValue("Yugo", 44.2);

	boolean legend = true;
	boolean tooltips = false;
	boolean urls = false;

	JFreeChart chart = ChartFactory.createPieChart("Tank", dataset, legend, tooltips, urls);
	
	chart.setBorderPaint(Color.GREEN);
	chart.setBorderStroke(new BasicStroke(5.0f));
	chart.setBorderVisible(true);

	return chart;
	
	
}
}
