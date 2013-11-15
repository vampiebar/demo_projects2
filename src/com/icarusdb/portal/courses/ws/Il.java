package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Il {

	private String il_id;
	private String il_adi;

	public String getIl_id() {
		return il_id;
	}

	public void setIl_id(String il_id) {
		this.il_id = il_id;
	}

	public String getIl_adi() {
		return il_adi;
	}

	public void setIl_adi(String il_adi) {
		this.il_adi = il_adi;
	}

}
