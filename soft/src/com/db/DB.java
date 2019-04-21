package com.db;
import java.sql.*;
public class DB {
		private Connection con;
		private PreparedStatement pstm;
		private String user="root";
		private String password="ablinchao812";
		private String className="com.mysql.jdbc.Driver";
		private String url="jdbc:mysql://localhost:3306/db_book?characterEncoding=utf-8&useSSL=false";
		public DB(){
			try{
				Class.forName(className);
			}catch(ClassNotFoundException e){
				e.printStackTrace();
			}
		}
		public Connection getCon(){
			try{
				con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_book?characterEncoding=utf-8&useSSL=false",user,password);
			}catch(SQLException e){
				con=null;
				e.printStackTrace();
			}
			return con;
		}
		public void doPstm(String sql,Object[] params){
			if(sql!=null && !sql.equals("")){
				if (params == null )params = new Object[0];
				getCon();
				if(con!=null){
					try{
						pstm=con.prepareStatement(sql);
						System.out.println("out");
						for(int i=0;i<params.length;i++){
							pstm.setObject(i+1,params[i]);
							System.out.println(params[i]);
						}
						pstm.execute();
					}catch(SQLException e){
						e.printStackTrace();
					}
				}
			}
		}
		
		
		
		public ResultSet getRs() throws SQLException{
			return pstm.getResultSet();
		}
		public int getCount() throws SQLException{
			return pstm.getUpdateCount();
		}
		public void closed(){
			try{
				if(pstm!=null)
					pstm.close();			
			}catch(SQLException e){
				e.printStackTrace();
			}
			try{
				if(con!=null){
					con.close();
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
}
