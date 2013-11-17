package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EgitimTuru {

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEgitim_turu_adi() {
		return egitim_turu_adi;
	}

	public void setEgitim_turu_adi(String egitim_turu_adi) {
		this.egitim_turu_adi = egitim_turu_adi;
	}

	private String id;
	private String egitim_turu_adi;

}
