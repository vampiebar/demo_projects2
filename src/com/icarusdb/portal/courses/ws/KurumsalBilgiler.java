package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KurumsalBilgiler {

	private String sube_resmi_adi;
	private String sube_kisa_adi;
	private String sirket_adi;
	private String vergi_dairesi;
	private String vergi_no;
	private String yonetici_adi;
	private String yonetici_tel;
	private String mudur;
	private String mudur_yardimcisi;
	private String logo;
	private String ulke;
	private String il;
	private String ilce;
	private String semt;
	private String mahalle_koy;
	private String telefon;
	private String faks;
	private String email;
	private String adres;

	public String getSube_kisa_adi() {
		return sube_kisa_adi;
	}

	public void setSube_kisa_adi(String sube_kisa_adi) {
		this.sube_kisa_adi = sube_kisa_adi;
	}

	public String getSube_resmi_adi() {
		return sube_resmi_adi;
	}

	public void setSube_resmi_adi(String sube_resmi_adi) {
		this.sube_resmi_adi = sube_resmi_adi;
	}

	public String getSirket_adi() {
		return sirket_adi;
	}

	public void setSirket_adi(String sirket_adi) {
		this.sirket_adi = sirket_adi;
	}

	public String getVergi_dairesi() {
		return vergi_dairesi;
	}

	public void setVergi_dairesi(String vergi_dairesi) {
		this.vergi_dairesi = vergi_dairesi;
	}

	public String getUlke() {
		return ulke;
	}

	public void setUlke(String ulke) {
		this.ulke = ulke;
	}

	public String getVergi_no() {
		return vergi_no;
	}

	public void setVergi_no(String vergi_no) {
		this.vergi_no = vergi_no;
	}

	public String getYonetici_tel() {
		return yonetici_tel;
	}

	public void setYonetici_tel(String yonetici_tel) {
		this.yonetici_tel = yonetici_tel;
	}

	public String getMudur() {
		return mudur;
	}

	public void setMudur(String mudur) {
		this.mudur = mudur;
	}

	public String getMudur_yardimcisi() {
		return mudur_yardimcisi;
	}

	public void setMudur_yardimcisi(String mudur_yardimcisi) {
		this.mudur_yardimcisi = mudur_yardimcisi;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public String getMahalle_koy() {
		return mahalle_koy;
	}

	public void setMahalle_koy(String mahalle_koy) {
		this.mahalle_koy = mahalle_koy;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public String getFaks() {
		return faks;
	}

	public void setFaks(String faks) {
		this.faks = faks;
	}

	public String getEmail() {
		return email;
	}

	public String getYonetici_adi() {
		return yonetici_adi;
	}

	public void setYonetici_adi(String yonetici_adi) {
		this.yonetici_adi = yonetici_adi;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
}
