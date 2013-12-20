package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Hizmetler {

	private String id;
	private String hizmet_turu;
	private String hizmet_adi;
	private String miktar;
	private String hizmetler_indirim_turu;
	private String hizmetler_indirim_miktari;
	private String ogrenci_numarasi;

	public String getOgrenci_numarasi() {
		return ogrenci_numarasi;
	}

	public void setOgrenci_numarasi(String ogrenci_numarasi) {
		this.ogrenci_numarasi = ogrenci_numarasi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getHizmet_turu() {
		return hizmet_turu;
	}

	public void setHizmet_turu(String hizmet_turu) {
		this.hizmet_turu = hizmet_turu;
	}

	public String getHizmet_adi() {
		return hizmet_adi;
	}

	public void setHizmet_adi(String hizmet_adi) {
		this.hizmet_adi = hizmet_adi;
	}

	public String getMiktar() {
		return miktar;
	}

	public void setMiktar(String miktar) {
		this.miktar = miktar;
	}

	public String getHizmetler_indirim_turu() {
		return hizmetler_indirim_turu;
	}

	public void setHizmetler_indirim_turu(String hizmetler_indirim_turu) {
		this.hizmetler_indirim_turu = hizmetler_indirim_turu;
	}

	public String getHizmetler_indirim_miktari() {
		return hizmetler_indirim_miktari;
	}

	public void setHizmetler_indirim_miktari(String hizmetler_indirim_miktari) {
		this.hizmetler_indirim_miktari = hizmetler_indirim_miktari;
	}
}
