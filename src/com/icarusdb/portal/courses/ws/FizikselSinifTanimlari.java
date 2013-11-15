package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class FizikselSinifTanimlari {

	private String fiziksel_sinif_adi;

	public String getFiziksel_sinif_adi() {
		return fiziksel_sinif_adi;
	}

	public void setFiziksel_sinif_adi(String fiziksel_sinif_adi) {
		this.fiziksel_sinif_adi = fiziksel_sinif_adi;
	}
}
