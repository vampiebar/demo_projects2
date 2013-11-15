package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KesinKayit {

	private String tc_kimlik_no;
	private String tc_kimlik_no_kullanma;
	private String adi;
	private String soyadi;

	public String getTc_kimlik_no() {
		return tc_kimlik_no;
	}

	public void setTc_kimlik_no(String tc_kimlik_no) {
		this.tc_kimlik_no = tc_kimlik_no;
	}

	public String getTc_kimlik_no_kullanma() {
		return tc_kimlik_no_kullanma;
	}

	public void setTc_kimlik_no_kullanma(String tc_kimlik_no_kullanma) {
		this.tc_kimlik_no_kullanma = tc_kimlik_no_kullanma;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}
