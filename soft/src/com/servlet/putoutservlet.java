package com.servlet;
import java.sql.Timestamp;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.*;

import com.db.DoString;
import com.db.OpDB;


public class putoutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public putoutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//将活动信息的发布插入到数据库中
		ServletContext servletContext = getServletContext();
		Timestamp dateNow=new Timestamp(System.currentTimeMillis());
		request.setCharacterEncoding("utf-8"); 
		HttpSession session = request.getSession();//获取session
		OpDB myOp = new OpDB();			
		String sql = "insert into tb_info(info_type,info_title,info_content,info_linkman,info_phone,info_date1,info_date2,info_state,info_peoplenum,info_peoplefreenum,info_place,output_person)"
				+"values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Integer type = Integer.parseInt(request.getParameter("type"));			//获取信息类别
		String	title = request.getParameter("title");						//获取信息标题
		String	content = request.getParameter("content");
		String	phone = request.getParameter("phone");					//获取联系电话
		phone = phone.replaceAll(",","●");						//替换“,”符号
		String linkman = (String) session.getAttribute("name");			//获取联系人
		String date2 = request.getParameter("date2");
		String state = "0";											//设置已审核状态为“0”
		String peoplenum = request.getParameter("peoplefreenum");				//报名人数
		String peoplefreenum = request.getParameter("peoplefreenum");     //剩余人数
		String place = request.getParameter("place");
		String outputPerson = servletContext.getAttribute("output_person").toString();
		Object[] params = { type, title, content, linkman, phone, dateNow, date2, state, peoplenum, peoplefreenum, place, outputPerson};
		if(myOp.OpUpdate(sql, params) != -1){								//存在该用户，登录成功
			//重新获取信息列表
			String sqlMyInfo = "SELECT * FROM tb_info WHERE (output_person = ?)";
			Object[] paramsList= {outputPerson};
			List myPulbishInfoList = myOp.OpListShow(sqlMyInfo, paramsList);		//调用业务对象中获取信息列表的方法，返回List对象
			request.setAttribute("mylist", myPulbishInfoList);
            request.getRequestDispatcher("/my-output.jsp").forward(request,response);
		}
		else {
			response.sendRedirect("putout.jsp?error=yes");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

}
