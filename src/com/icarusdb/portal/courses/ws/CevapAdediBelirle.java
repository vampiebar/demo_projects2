package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CevapAdediBelirle {

	private String egitim_turu;
	private String cevap_sayisi;

	public String getEgitim_turu() {
		return egitim_turu;
	}

	public void setEgitim_turu(String egitim_turu) {
		this.egitim_turu = egitim_turu;
	}

	public String getCevap_sayisi() {
		return cevap_sayisi;
	}

	public void setCevap_sayisi(String cevap_sayisi) {
		this.cevap_sayisi = cevap_sayisi;
	}

}
