package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HizmetTanimla {

	private String hizmet_adi;
	private String hizmet_turu;
	private String birim_fiyati;

	public String getHizmet_adi() {
		return hizmet_adi;
	}

	public void setHizmet_adi(String hizmet_adi) {
		this.hizmet_adi = hizmet_adi;
	}

	public String getHizmet_turu() {
		return hizmet_turu;
	}

	public void setHizmet_turu(String hizmet_turu) {
		this.hizmet_turu = hizmet_turu;
	}

	public String getBirim_fiyati() {
		return birim_fiyati;
	}

	public void setBirim_fiyati(String birim_fiyati) {
		this.birim_fiyati = birim_fiyati;
	}

}
