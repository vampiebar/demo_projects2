package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DonemTanimlari {

	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private String donem_adi;
	private String baslangic_tarihi;
	private String bitis_tarihi;
	private String varsayilan_donem;

	public String getDonem_adi() {
		return donem_adi;
	}

	public void setDonem_adi(String donem_adi) {
		this.donem_adi = donem_adi;
	}

	public String getBaslangic_tarihi() {
		return baslangic_tarihi;
	}

	public void setBaslangic_tarihi(String baslangic_tarihi) {
		this.baslangic_tarihi = baslangic_tarihi;
	}

	public String getBitis_tarihi() {
		return bitis_tarihi;
	}

	public void setBitis_tarihi(String bitis_tarihi) {
		this.bitis_tarihi = bitis_tarihi;
	}

	public String getVarsayilan_donem() {
		return varsayilan_donem;
	}

	public void setVarsayilan_donem(String varsayilan_donem) {
		this.varsayilan_donem = varsayilan_donem;
	}
}
