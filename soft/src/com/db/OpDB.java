package com.db;
import java.io.IOException;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

import javax.servlet.http.HttpSession;

import com.Single.*;


public class OpDB {
	private DB mydb;
	public OpDB(){
		mydb=new DB();	
	}
	public List OpListShow(String sql, Object[] params){
		List onelist=new ArrayList();
		mydb.doPstm(sql, params); 		//调用DB类的doPstm()方法查询数据库
		try{
			ResultSet rs=mydb.getRs();//获取ResultSet结果集对象
			if(rs!=null){
				while(rs.next()){
					InfoSingle infoSingle = new InfoSingle();	//创建一个信息类对象
					infoSingle.setId(rs.getInt("id"));           //id
					infoSingle.setInfoType(rs.getInt("info_type"));                //类型
					infoSingle.setInfoTitle(rs.getString("info_title"));              //标题
					infoSingle.setInfoContent(rs.getString("info_content"));           //活动内容
					infoSingle.setInfoLinkman(rs.getString("info_linkman"));          //联系人
					infoSingle.setInfoPhone(rs.getString("info_phone"));              //电话
					infoSingle.setInfoEmail(rs.getString("info_email"));              //email
					infoSingle.setInfoDate1(DoString.dateTimeChange(rs.getTimestamp("info_date1")));     //发布时间
					infoSingle.setInfoDate2(rs.getString("info_date2"));     //活动时间
					infoSingle.setInfoState(rs.getString("info_state"));                  //审核状态
					infoSingle.setInfoPeopleNum(rs.getString("info_peoplenum"));           //报名人数
					infoSingle.setInfoPeopleFreeNum(rs.getString("info_peoplefreenum"));    //报名剩余人数
					infoSingle.setInfoPlace(rs.getString("info_place"));
					infoSingle.setOutPutPerson(rs.getString("output_person"));
					onelist.add(infoSingle);			//将信息类的对象保存到List集合对象中			
				}
			}
			rs.close();//关闭结果集对象
		}catch (Exception e){
			System.out.println("查看信息列表失败！(查询数据库)");			
			e.printStackTrace();
		}finally{
			mydb.closed();		//关闭数据库连接	
		}
		return onelist;		
	}
	public List OpListShowUserman(String sql,Object[] params){
		List onelist=new ArrayList();
		mydb.doPstm(sql, params); 		//调用DB类的doPstm()方法查询数据库
		try{
			ResultSet rs=mydb.getRs();//获取ResultSet结果集对象
			if(rs!=null){
				while(rs.next()){
					Personal personal=new Personal();	//创建一个信息类对象
					personal.setName(rs.getString("c_name"));           //报名人数
					personal.setAct(rs.getString("c_act"));    //报名剩余人数
					onelist.add(personal);			//将信息类的对象保存到List集合对象中			
				}
			}
			rs.close();//关闭结果集对象
		}catch (Exception e){
			System.out.println("查看信息列表失败！(查询数据库)");			
			e.printStackTrace();
		}finally{
			mydb.closed();		//关闭数据库连接	
		}
		return onelist;		
	}
	
	public InfoSingle OpSingleShow(String sql,Object[] params){
		InfoSingle infoSingle=null;
		mydb.doPstm(sql, params);       		//调用DB类的doPstm()方法查询数据库
		try{
		    ResultSet rs=mydb.getRs();	//获取ResultSet结果集对象
			if(rs!=null&&rs.next()){//如果rs不为null，并且存在记录
				InfoSingle infosingle=new InfoSingle();	//创建一个信息类对象
				infosingle.setId(rs.getInt("id"));           //id
				infosingle.setInfoType(rs.getInt("info_type"));                //类型
				infosingle.setInfoTitle(rs.getString("info_title"));              //标题
				infosingle.setInfoContent(rs.getString("info_content"));           //活动内容
				infosingle.setInfoLinkman(rs.getString("info_linkman"));          //联系人
				infosingle.setInfoPhone(rs.getString("info_phone"));              //电话
				infosingle.setInfoEmail(rs.getString("info_email"));              //email
				infosingle.setInfoDate1(DoString.dateTimeChange(rs.getTimestamp("info_date1")));     //发布时间
				infosingle.setInfoDate2(rs.getString("info_date2"));     //活动时间
				infosingle.setInfoState(rs.getString("info_state"));                  //审核状态
				infosingle.setInfoPeopleNum(rs.getString("info_peoplenum"));           //报名人数
				infosingle.setInfoPeopleFreeNum(rs.getString("info_peoplefreenum"));    //报名剩余人数
				infoSingle.setOutPutPerson(rs.getString("output_person"));
				rs.close();	//关闭结果集对象			
			}
		}catch(Exception e){
			System.out.println("查看详细内容失败！(查询数据库)");
			e.printStackTrace();			
		}finally{
			mydb.closed();//关闭数据库连接
		}
		return infoSingle;
	}
	public int OpUpdate(String sql,Object[] params){		
		int i=-1;
		mydb.doPstm(sql, params);	//调用DB类的doPstm()方法更新数据库
		try{
			i=mydb.getCount();					//获取更新操作所影响的记录数	
		}catch(SQLException e){
			System.out.println("执行OpUpdate()方法失败！(更新数据库)");
			e.printStackTrace();
		}finally{
			mydb.closed();
		}
		return i;
	}
	public int LogOn(String sql,Object[] params){
		mydb.doPstm(sql, params);	//查询数据库获取结果集
		try {
			ResultSet rs=mydb.getRs();			//获取结果集	
			UserSingle usersingle=new UserSingle();
			int a = 0;
			if(rs!=null&&rs.next()){
			a=Integer.parseInt(rs.getString("user_type"));}
			boolean mark=(rs==null||!rs.next()?false:true);	//判断用户是否存在，不存在返回false，存在返回true
			rs.close();
			return a;			
		} catch (SQLException e) {
			System.out.println("登录失败！");
			e.printStackTrace();
			return 0;
		}
		finally{
			mydb.closed();
		}
	}

}
	
	
