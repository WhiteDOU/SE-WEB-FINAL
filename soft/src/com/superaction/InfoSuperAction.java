package com.superaction;

import com.Single.InfoSingle;

public class InfoSuperAction extends MySuperAction {
	protected InfoSingle infoSingle; //用来封装从数据表中查询出的记录和发布信息时的表单数据

	public InfoSingle getInfoSingle() {
		return infoSingle;
	}
	public void setInfoSingle(InfoSingle infoSingle) {
		this.infoSingle = infoSingle;
	}	
}
