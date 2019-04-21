package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.db.OpDB;

public class TypeFindservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TypeFindservlet() {
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
		String sql="SELECT * FROM tb_info WHERE (info_type = ?)";
		String type = request.getParameter("type");
		Object[] params={type};
		List typefindlist=myOp.OpListShow(sql, params);		//调用业务对象中获取信息列表的方法，返回List对象
		request.setAttribute("typefindlist",typefindlist);
            request.getRequestDispatcher("/typefind.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
