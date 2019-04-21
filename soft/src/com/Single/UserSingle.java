package com.Single;

public class UserSingle{
	public String userName;							//对应表单中的“用户名”字段
	public String userPassword;							//对应表单中的“密码”字段
	public String type;

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
}
