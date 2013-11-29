package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Veliler {

	private String id;
	private String veli_bilgileri_adi;
	private String veli_bilgileri_soyadi;
	private String veli_bilgileri_tc_kimlik_no;
	private String yakinlik_durumu;
	private String odeme_sorumlusu;
	private String cep_tel;
	private String ev_tel;
	private String is_tel;
	private String e_mail;
	private String firma;
	private String sektor;
	private String unvani;
	private String gorevi;
	private String veli_bilgileri_adres;
	private String ogrenci_tc_kimlik_no;

	public String getOgrenci_tc_kimlik_no() {
		return ogrenci_tc_kimlik_no;
	}

	public void setOgrenci_tc_kimlik_no(String ogrenci_tc_kimlik_no) {
		this.ogrenci_tc_kimlik_no = ogrenci_tc_kimlik_no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getVeli_bilgileri_adi() {
		return veli_bilgileri_adi;
	}

	public void setVeli_bilgileri_adi(String veli_bilgileri_adi) {
		this.veli_bilgileri_adi = veli_bilgileri_adi;
	}

	public String getVeli_bilgileri_soyadi() {
		return veli_bilgileri_soyadi;
	}

	public void setVeli_bilgileri_soyadi(String veli_bilgileri_soyadi) {
		this.veli_bilgileri_soyadi = veli_bilgileri_soyadi;
	}

	public String getVeli_bilgileri_tc_kimlik_no() {
		return veli_bilgileri_tc_kimlik_no;
	}

	public void setVeli_bilgileri_tc_kimlik_no(
			String veli_bilgileri_tc_kimlik_no) {
		this.veli_bilgileri_tc_kimlik_no = veli_bilgileri_tc_kimlik_no;
	}

	public String getYakinlik_durumu() {
		return yakinlik_durumu;
	}

	public void setYakinlik_durumu(String yakinlik_durumu) {
		this.yakinlik_durumu = yakinlik_durumu;
	}

	public String getOdeme_sorumlusu() {
		return odeme_sorumlusu;
	}

	public void setOdeme_sorumlusu(String odeme_sorumlusu) {
		this.odeme_sorumlusu = odeme_sorumlusu;
	}

	public String getCep_tel() {
		return cep_tel;
	}

	public void setCep_tel(String cep_tel) {
		this.cep_tel = cep_tel;
	}

	public String getEv_tel() {
		return ev_tel;
	}

	public void setEv_tel(String ev_tel) {
		this.ev_tel = ev_tel;
	}

	public String getIs_tel() {
		return is_tel;
	}

	public void setIs_tel(String is_tel) {
		this.is_tel = is_tel;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getSektor() {
		return sektor;
	}

	public void setSektor(String sektor) {
		this.sektor = sektor;
	}

	public String getUnvani() {
		return unvani;
	}

	public void setUnvani(String unvani) {
		this.unvani = unvani;
	}

	public String getGorevi() {
		return gorevi;
	}

	public void setGorevi(String gorevi) {
		this.gorevi = gorevi;
	}

	public String getVeli_bilgileri_adres() {
		return veli_bilgileri_adres;
	}

	public void setVeli_bilgileri_adres(String veli_bilgileri_adres) {
		this.veli_bilgileri_adres = veli_bilgileri_adres;
	}

}
