package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EgitimTuruUnite {

	private String id;
	private String egitim_turu_adi;
	private String alan_adi;
	private String unite_adi;

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

	public String getAlan_adi() {
		return alan_adi;
	}

	public void setAlan_adi(String alan_adi) {
		this.alan_adi = alan_adi;
	}

	public String getUnite_adi() {
		return unite_adi;
	}

	public void setUnite_adi(String unite_adi) {
		this.unite_adi = unite_adi;
	}

}
