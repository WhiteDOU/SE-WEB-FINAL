package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Logoutservlet
 */
@WebServlet("/Logoutservlet")
public class Logoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Logoutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet(HttpServletRequest request, HttpServletResponse   
    		  
    		  
response)  
            throws ServletException, IOException {  
        HttpSession session=request.getSession();  
        if(session==null){  
        	request.getRequestDispatcher("/index.jsp").forward(request,response);
            return;  
        }  
          
        session.invalidate();
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }  
  
  
    public void doPost(HttpServletRequest request, HttpServletResponse   
  
  
response)  
            throws ServletException, IOException {  
       doGet(request,response);  
    }  
  
  
}  