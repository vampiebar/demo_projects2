package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OdevTakipUnite {

	private String id;
	private String egitim_turu;
	private String alan;
	private String ders;
	private String unite;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEgitim_turu() {
		return egitim_turu;
	}

	public void setEgitim_turu(String egitim_turu) {
		this.egitim_turu = egitim_turu;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public String getDers() {
		return ders;
	}

	public void setDers(String ders) {
		this.ders = ders;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

}
