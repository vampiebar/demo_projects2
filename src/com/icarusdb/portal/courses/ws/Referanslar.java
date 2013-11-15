package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Referanslar {

	private String referans_adi_soyadi;

	public String getReferans_adi_soyadi() {
		return referans_adi_soyadi;
	}

	public void setReferans_adi_soyadi(String referans_adi_soyadi) {
		this.referans_adi_soyadi = referans_adi_soyadi;
	}

}
