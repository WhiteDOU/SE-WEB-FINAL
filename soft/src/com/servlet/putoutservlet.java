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
		//�����Ϣ�ķ������뵽���ݿ���
		ServletContext servletContext = getServletContext();
		Timestamp dateNow=new Timestamp(System.currentTimeMillis());
		request.setCharacterEncoding("utf-8"); 
		HttpSession session = request.getSession();//��ȡsession
		OpDB myOp = new OpDB();			
		String sql = "insert into tb_info(info_type,info_title,info_content,info_linkman,info_phone,info_date1,info_date2,info_state,info_peoplenum,info_peoplefreenum,info_place,output_person)"
				+"values(?,?,?,?,?,?,?,?,?,?,?,?)";
		Integer type = Integer.parseInt(request.getParameter("type"));			//��ȡ��Ϣ���
		String	title = request.getParameter("title");						//��ȡ��Ϣ����
		String	content = request.getParameter("content");
		String	phone = request.getParameter("phone");					//��ȡ��ϵ�绰
		phone = phone.replaceAll(",","��");						//�滻��,������
		String linkman = (String) session.getAttribute("name");			//��ȡ��ϵ��
		String date2 = request.getParameter("date2");
		String state = "0";											//���������״̬Ϊ��0��
		String peoplenum = request.getParameter("peoplefreenum");				//��������
		String peoplefreenum = request.getParameter("peoplefreenum");     //ʣ������
		String place = request.getParameter("place");
		String outputPerson = servletContext.getAttribute("output_person").toString();
		Object[] params = { type, title, content, linkman, phone, dateNow, date2, state, peoplenum, peoplefreenum, place, outputPerson};
		if(myOp.OpUpdate(sql, params) != -1){								//���ڸ��û�����¼�ɹ�
			//���»�ȡ��Ϣ�б�
			String sqlMyInfo = "SELECT * FROM tb_info WHERE (output_person = ?)";
			Object[] paramsList= {outputPerson};
			List myPulbishInfoList = myOp.OpListShow(sqlMyInfo, paramsList);		//����ҵ������л�ȡ��Ϣ�б�ķ���������List����
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
