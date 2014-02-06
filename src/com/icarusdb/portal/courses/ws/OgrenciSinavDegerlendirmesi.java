package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OgrenciSinavDegerlendirmesi {

	private String id;
	private String tc_kimlik_no;
	private String adi_soyadi;
	private String ogrenci_numarasi;
	private String sinav_kodu;
	private String sinav_adi;
	private String sablon_kodu;
	private String kitapcik_kodu;
	private String dogru_cevaplar;
	private String ogrencinin_cevaplari;
	private String sinav_sonucu;
	private String cevap_secenek_son_harf;

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

	public String getOgrenci_numarasi() {
		return ogrenci_numarasi;
	}

	public void setOgrenci_numarasi(String ogrenci_numarasi) {
		this.ogrenci_numarasi = ogrenci_numarasi;
	}

	public String getSinav_kodu() {
		return sinav_kodu;
	}

	public void setSinav_kodu(String sinav_kodu) {
		this.sinav_kodu = sinav_kodu;
	}

	public String getSinav_adi() {
		return sinav_adi;
	}

	public void setSinav_adi(String sinav_adi) {
		this.sinav_adi = sinav_adi;
	}

	public String getSablon_kodu() {
		return sablon_kodu;
	}

	public void setSablon_kodu(String sablon_kodu) {
		this.sablon_kodu = sablon_kodu;
	}

	public String getKitapcik_kodu() {
		return kitapcik_kodu;
	}

	public void setKitapcik_kodu(String kitapcik_kodu) {
		this.kitapcik_kodu = kitapcik_kodu;
	}

	public String getDogru_cevaplar() {
		return dogru_cevaplar;
	}

	public void setDogru_cevaplar(String dogru_cevaplar) {
		this.dogru_cevaplar = dogru_cevaplar;
	}

	public String getOgrencinin_cevaplari() {
		return ogrencinin_cevaplari;
	}

	public void setOgrencinin_cevaplari(String ogrencinin_cevaplari) {
		this.ogrencinin_cevaplari = ogrencinin_cevaplari;
	}

	public String getSinav_sonucu() {
		return sinav_sonucu;
	}

	public void setSinav_sonucu(String sinav_sonucu) {
		this.sinav_sonucu = sinav_sonucu;
	}

	public String getCevap_secenek_son_harf() {
		return cevap_secenek_son_harf;
	}

	public void setCevap_secenek_son_harf(String cevap_secenek_son_harf) {
		this.cevap_secenek_son_harf = cevap_secenek_son_harf;
	}

}
