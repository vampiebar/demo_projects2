package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PersonelTanimlari {

	private String adi_soyadi;
	private String gorevi;
	private String ise_giris_tarihi;
	private String ucreti;
	private String telefonu_1;
	private String telefonu_2;

	public String getAdi_soyadi() {
		return adi_soyadi;
	}

	public void setAdi_soyadi(String adi_soyadi) {
		this.adi_soyadi = adi_soyadi;
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public String getIse_giris_tarihi() {
		return ise_giris_tarihi;
	}

	public void setIse_giris_tarihi(String ise_giris_tarihi) {
		this.ise_giris_tarihi = ise_giris_tarihi;
	}

	public String getUcreti() {
		return ucreti;
	}

	public void setUcreti(String ucreti) {
		this.ucreti = ucreti;
	}

	public String getTelefonu_1() {
		return telefonu_1;
	}

	public void setTelefonu_1(String telefonu_1) {
		this.telefonu_1 = telefonu_1;
	}

	public String getTelefonu_2() {
		return telefonu_2;
	}

	public void setTelefonu_2(String telefonu_2) {
		this.telefonu_2 = telefonu_2;
	}

}
