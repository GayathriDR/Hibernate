package com.xworkz.house.house;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.house.dao.HouseDAO;
import com.xworkz.house.dao.HouseDAOImpl;
import com.xworkz.house.dto.HouseDTO;

/**
 * Servlet implementation class HouseServlet
 */
@WebServlet("/register")
public class HouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HouseDAOImpl houseDAOImpl;


	public void init() {
		houseDAOImpl=new HouseDAOImpl();
	}


	/**
	 * Default constructor. 
	 */
	public HouseServlet() { 
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.sendRedirect("register.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		register(request, response);
	}
	private void register(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException {
		String houseName=request.getParameter("houseName");
		String houseLocation=request.getParameter("houseLocation");
		String houseColor=request.getParameter("houseColor");
		int noOfMembers=Integer.parseInt(request.getParameter("noOfMembers"));

		HouseDTO houseDTO=new HouseDTO();
		houseDTO.setHouseName(houseName);
		houseDTO.setHouseLocation(houseLocation);
		houseDTO.setHouseColo(houseColor);
		houseDTO.setNoOfMembers(noOfMembers);
		HouseDAO houseDAOImpl=new HouseDAOImpl();
		houseDAOImpl.addHouseInfo(houseDTO);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("register-success.jsp");
		dispatcher.forward(request, response);

	}

}
