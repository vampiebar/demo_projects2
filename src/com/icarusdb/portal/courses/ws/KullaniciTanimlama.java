package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KullaniciTanimlama {

	private String kullanici_kodu;
	private String adi;
	private String soyadi;
	private String sifre;
	private String sifre_tekrar;

	public String getKullanici_kodu() {
		return kullanici_kodu;
	}

	public void setKullanici_kodu(String kullanici_kodu) {
		this.kullanici_kodu = kullanici_kodu;
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

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getSifre_tekrar() {
		return sifre_tekrar;
	}

	public void setSifre_tekrar(String sifre_tekrar) {
		this.sifre_tekrar = sifre_tekrar;
	}

}
