package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class IndirimTuru {

	private String indirim_turu;
	private String indirim_sekli;
	private String indirim_miktari;

	public String getIndirim_turu() {
		return indirim_turu;
	}

	public void setIndirim_turu(String indirim_turu) {
		this.indirim_turu = indirim_turu;
	}

	public String getIndirim_sekli() {
		return indirim_sekli;
	}

	public void setIndirim_sekli(String indirim_sekli) {
		this.indirim_sekli = indirim_sekli;
	}

	public String getIndirim_miktari() {
		return indirim_miktari;
	}

	public void setIndirim_miktari(String indirim_miktari) {
		this.indirim_miktari = indirim_miktari;
	}

}
