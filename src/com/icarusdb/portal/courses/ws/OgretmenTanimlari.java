package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OgretmenTanimlari {

	private String id;
	private String tc_kimlik_no;
	private String adi_soyadi;
	private String girdigi_ders_bilgisi;
	private String egitim_turu;
	private String brans;
	private String girdigi_dersler;
	private String ucreti;
	private String ev_telefonu;
	private String cep_telefonu;
	private String cep_telefonu_2;
	private String email;
	private String sigorta_gun_sayisi;
	private String ders_programini_gorsun;
	private String durum;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTc_kimlik_no() {
		return tc_kimlik_no;
	}

	public void setTc_kimlik_no(String tc_kimlik_no) {
		this.tc_kimlik_no = tc_kimlik_no;
	}

	public String getAdi_soyadi() {
		return adi_soyadi;
	}

	public void setAdi_soyadi(String adi_soyadi) {
		this.adi_soyadi = adi_soyadi;
	}

	public String getGirdigi_ders_bilgisi() {
		return girdigi_ders_bilgisi;
	}

	public void setGirdigi_ders_bilgisi(String girdigi_ders_bilgisi) {
		this.girdigi_ders_bilgisi = girdigi_ders_bilgisi;
	}

	public String getEgitim_turu() {
		return egitim_turu;
	}

	public void setEgitim_turu(String egitim_turu) {
		this.egitim_turu = egitim_turu;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	public String getGirdigi_dersler() {
		return girdigi_dersler;
	}

	public void setGirdigi_dersler(String girdigi_dersler) {
		this.girdigi_dersler = girdigi_dersler;
	}

	public String getUcreti() {
		return ucreti;
	}

	public void setUcreti(String ucreti) {
		this.ucreti = ucreti;
	}

	public String getEv_telefonu() {
		return ev_telefonu;
	}

	public void setEv_telefonu(String ev_telefonu) {
		this.ev_telefonu = ev_telefonu;
	}

	public String getCep_telefonu() {
		return cep_telefonu;
	}

	public void setCep_telefonu(String cep_telefonu) {
		this.cep_telefonu = cep_telefonu;
	}

	public String getCep_telefonu_2() {
		return cep_telefonu_2;
	}

	public void setCep_telefonu_2(String cep_telefonu_2) {
		this.cep_telefonu_2 = cep_telefonu_2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSigorta_gun_sayisi() {
		return sigorta_gun_sayisi;
	}

	public void setSigorta_gun_sayisi(String sigorta_gun_sayisi) {
		this.sigorta_gun_sayisi = sigorta_gun_sayisi;
	}

	public String getDers_programini_gorsun() {
		return ders_programini_gorsun;
	}

	public void setDers_programini_gorsun(String ders_programini_gorsun) {
		this.ders_programini_gorsun = ders_programini_gorsun;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

}
