package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DBSSinavTanimla {

	private String id;
	private String okul_adi;
	private String alan_bilgisi;
	private String sinav_tarihi;
	private String kota;
	private String bina_sekli;
	private String ulke;
	private String il;
	private String ilce;
	private String semt;
	private String mahalle_koy;
	private String adres;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOkul_adi() {
		return okul_adi;
	}

	public void setOkul_adi(String okul_adi) {
		this.okul_adi = okul_adi;
	}

	public String getAlan_bilgisi() {
		return alan_bilgisi;
	}

	public void setAlan_bilgisi(String alan_bilgisi) {
		this.alan_bilgisi = alan_bilgisi;
	}

	public String getSinav_tarihi() {
		return sinav_tarihi;
	}

	public void setSinav_tarihi(String sinav_tarihi) {
		this.sinav_tarihi = sinav_tarihi;
	}

	public String getKota() {
		return kota;
	}

	public void setKota(String kota) {
		this.kota = kota;
	}

	public String getBina_sekli() {
		return bina_sekli;
	}

	public void setBina_sekli(String bina_sekli) {
		this.bina_sekli = bina_sekli;

	}

	public String getUlke() {
		return ulke;
	}

	public void setUlke(String ulke) {
		this.ulke = ulke;
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

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}
}
