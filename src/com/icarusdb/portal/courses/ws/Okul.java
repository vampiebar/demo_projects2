package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Okul {

	private String il_id;
	private String ilce_id;
	private String okul_id;
	private String okul_adi;

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

	public String getOkul_id() {
		return okul_id;
	}

	public void setOkul_id(String okul_id) {
		this.okul_id = okul_id;
	}

	public String getOkul_adi() {
		return okul_adi;
	}

	public void setOkul_adi(String okul_adi) {
		this.okul_adi = okul_adi;
	}

}
