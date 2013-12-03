package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SinifTanimlari {

	private String id;
	private String sinif_adi;
	private String fiziksel_sinif_adi;
	private String kurs_zamani;
	private String egitim_turu;
	private String alan;

	private String dan_ogretmen; // danisman_ogretmen

	private String sinif_kontenjani;
	private String baslangic_numarasi;
	private String bitis_numarasi;
	private String ozel_ders_sayisi;
	private String fiyati;
	private String baslangic_tarihi;
	private String bitis_tarihi;

	private String test;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSinif_adi() {
		return sinif_adi;
	}

	public void setSinif_adi(String sinif_adi) {
		this.sinif_adi = sinif_adi;
	}

	public String getFiziksel_sinif_adi() {
		return fiziksel_sinif_adi;
	}

	public void setFiziksel_sinif_adi(String fiziksel_sinif_adi) {
		this.fiziksel_sinif_adi = fiziksel_sinif_adi;
	}

	public String getKurs_zamani() {
		return kurs_zamani;
	}

	public void setKurs_zamani(String kurs_zamani) {
		this.kurs_zamani = kurs_zamani;
	}

	public String getEgitim_turu() {
		return egitim_turu;
	}

	public void setEgitim_turu(String egitim_turu) {
		this.egitim_turu = egitim_turu;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public String getSinif_kontenjani() {
		return sinif_kontenjani;
	}

	public void setSinif_kontenjani(String sinif_kontenjani) {
		this.sinif_kontenjani = sinif_kontenjani;
	}

	public String getBaslangic_numarasi() {
		return baslangic_numarasi;
	}

	public void setBaslangic_numarasi(String baslangic_numarasi) {
		this.baslangic_numarasi = baslangic_numarasi;
	}

	public String getBitis_numarasi() {
		return bitis_numarasi;
	}

	public void setBitis_numarasi(String bitis_numarasi) {
		this.bitis_numarasi = bitis_numarasi;
	}

	public String getOzel_ders_sayisi() {
		return ozel_ders_sayisi;
	}

	public void setOzel_ders_sayisi(String ozel_ders_sayisi) {
		this.ozel_ders_sayisi = ozel_ders_sayisi;
	}

	public String getFiyati() {
		return fiyati;
	}

	public void setFiyati(String fiyati) {
		this.fiyati = fiyati;
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

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getDan_ogretmen() {
		return dan_ogretmen;
	}

	public void setDan_ogretmen(String dan_ogretmen) {
		this.dan_ogretmen = dan_ogretmen;
	}

}
