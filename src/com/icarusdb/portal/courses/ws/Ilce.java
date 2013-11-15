package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ilce {

	private String il_id;
	private String ilce_id;
	private String ilce_adi;

	public String getIl_id() {
		return il_id;
	}

	public void setIl_id(String il_id) {
		this.il_id = il_id;
	}

	public String getIlce_id() {
		return ilce_id;
	}

	public void setIlce_id(String ilce_id) {
		this.ilce_id = ilce_id;
	}

	public String getIlce_adi() {
		return ilce_adi;
	}

	public void setIlce_adi(String ilce_adi) {
		this.ilce_adi = ilce_adi;
	}

}
