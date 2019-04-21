package com.servlet;

import java.io.IOException;
import java.util.List;

import javax.jms.Session;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Single.UserSingle;
import com.db.OpDB;

/**
 * Servlet implementation class LogInOutservlet
 */

public class LogInOutservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected UserSingle user;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogInOutservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		response.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();//��ȡsession
		OpDB myOp = new OpDB();	
		Object ob=session.getAttribute("name");
 		//�������Ϊ�գ����߲���UserSingle���ʵ������ʾû�е�¼
		if(ob!=null) {
            request.getRequestDispatcher("/index.jsp").forward(request,response);
			System.out.println("�Ѿ���½");
			int t = Integer.parseInt((String)(session.getAttribute("type")));
			if(t == 1) {
				request.getRequestDispatcher("/index1.jsp").forward(request, response);
			} else if(t == 2) {
				//��ǰ����ϵͳ�ķ����û�
				request.setAttribute("output_person", session.getAttribute("name"));
				request.getRequestDispatcher("/index2.jsp").forward(request, response);
			}
			else if(t==3) {
				request.getRequestDispatcher("/index3.jsp").forward(request,response);
			}

		}//���ص�¼ҳ��
		else{						//�Ѿ���¼
			String sql = "select * from tb_user where name=? and password=?";
			String name = request.getParameter("name");
			String pwd = request.getParameter("pwd");
			servletContext.setAttribute("output_person", name);
			Object[] params={name,pwd};
			int k;
			if(( k=myOp.LogOn(sql, params)) != 0){								//���ڸ��û�����¼�ɹ�
				session.setAttribute("name", name);// ���û��������뱣����session��
				session.setAttribute("pwd", pwd);// ���û��������뱣����session��
				session.setAttribute("type", k);
				String outputPerson = servletContext.getAttribute("output_person").toString();
				String sqlMyInfo = "SELECT * FROM tb_info WHERE (output_person = ?)";
				Object[] paramsList= {outputPerson};
				List myPulbishInfoList = myOp.OpListShow(sqlMyInfo, paramsList);		//����ҵ������л�ȡ��Ϣ�б��ķ���������List����
				session.setAttribute("mylist", myPulbishInfoList);

				if(k==1) {
					request.getRequestDispatcher("/index1.jsp").forward(request,response);
				} else if(k==2) {
					request.getRequestDispatcher("/index2.jsp").forward(request, response);
				} else if(k==3)
					request.getRequestDispatcher("/index3.jsp").forward(request,response);
			}
			else {
				response.sendRedirect("login.jsp?error=yes");
			}
		}
	}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}



}