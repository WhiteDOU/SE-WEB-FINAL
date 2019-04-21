package com.servlet;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.OpDB;

/**
 * Servlet implementation class enrollservlet
 */
@WebServlet("/enrollservlet")
public class enrollservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public enrollservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setCharacterEncoding("utf-8"); 
		HttpSession session = request.getSession();//获取session
		OpDB myOp = new OpDB();			
		String sql="insert into contact values(?,?)";
		String xueyuan = request.getParameter("xueyuan");
		System.out.println(xueyuan);
		String name=(String) session.getAttribute("name");
		String state1 = "公安的";
		Object[] params= {name,state1};
		int t=myOp.OpUpdate(sql, params);
		String sql1 = "SELECT * FROM tb_info WHERE (info_state = ?)";
		String state = "0";
		Object[] params2 = {state};
		List allsublist = myOp.OpListShow(sql1, params2);		//调用业务对象中获取信息列表的方法，返回List对象
		request.setAttribute("allsublist", allsublist);
		request.getRequestDispatcher("/index1.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
