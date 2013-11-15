package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DBSKayit {
	private String id;
	private String adi;
	private String soyadi;
	private String tc_kimlik_no;
	private String cinsiyet;
	private String medeni_hali;
	private String dogum_tarihi;
	private String ev_telefonu;
	private String cep_telefonu;
	private String email;
	private String ogrenci_bilgileri_ulke;
	private String ogrenci_bilgileri_il;
	private String ogrenci_bilgileri_ilce;
	private String okul;
	private String sinif;
	private String seri_no;
	private String cuzdan_no;
	private String ogrenci_kimlik_bilgileri_ulke;
	private String ogrenci_kimlik_bilgileri_il;
	private String ogrenci_kimlik_bilgileri_ilce;
	private String mahalle_koy;
	private String cilt_no;
	private String aile_sira_no;
	private String sira_no;
	private String verildigi_yer;
	private String verilis_nedeni;
	private String kayit_no;
	private String verilis_tarihi;
	private String adres_bilgileri_ulke;
	private String adres_bilgileri_il;
	private String adres_bilgileri_ilce;
	private String semt;
	private String mahalle;
	private String sokak_ve_no;
	private String okul_durumu;
	private String alan_bilgisi;
	private String sinav_tarihi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOkul_durumu() {
		return okul_durumu;
	}

	public void setOkul_durumu(String okul_durumu) {
		this.okul_durumu = okul_durumu;
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

	public String getAdres_bilgileri_ulke() {
		return adres_bilgileri_ulke;
	}

	public void setAdres_bilgileri_ulke(String adres_bilgileri_ulke) {
		this.adres_bilgileri_ulke = adres_bilgileri_ulke;
	}

	public String getAdres_bilgileri_il() {
		return adres_bilgileri_il;
	}

	public void setAdres_bilgileri_il(String adres_bilgileri_il) {
		this.adres_bilgileri_il = adres_bilgileri_il;
	}

	public String getAdres_bilgileri_ilce() {
		return adres_bilgileri_ilce;
	}

	public void setAdres_bilgileri_ilce(String adres_bilgileri_ilce) {
		this.adres_bilgileri_ilce = adres_bilgileri_ilce;
	}

	public String getSemt() {
		return semt;
	}

	public void setSemt(String semt) {
		this.semt = semt;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getSokak_ve_no() {
		return sokak_ve_no;
	}

	public void setSokak_ve_no(String sokak_ve_no) {
		this.sokak_ve_no = sokak_ve_no;
	}

	public String getSeri_no() {
		return seri_no;
	}

	public void setSeri_no(String seri_no) {
		this.seri_no = seri_no;
	}

	public String getCuzdan_no() {
		return cuzdan_no;
	}

	public void setCuzdan_no(String cuzdan_no) {
		this.cuzdan_no = cuzdan_no;
	}

	public String getOgrenci_kimlik_bilgileri_ulke() {
		return ogrenci_kimlik_bilgileri_ulke;
	}

	public void setOgrenci_kimlik_bilgileri_ulke(
			String ogrenci_kimlik_bilgileri_ulke) {
		this.ogrenci_kimlik_bilgileri_ulke = ogrenci_kimlik_bilgileri_ulke;
	}

	public String getOgrenci_kimlik_bilgileri_il() {
		return ogrenci_kimlik_bilgileri_il;
	}

	public void setOgrenci_kimlik_bilgileri_il(
			String ogrenci_kimlik_bilgileri_il) {
		this.ogrenci_kimlik_bilgileri_il = ogrenci_kimlik_bilgileri_il;
	}

	public String getOgrenci_kimlik_bilgileri_ilce() {
		return ogrenci_kimlik_bilgileri_ilce;
	}

	public void setOgrenci_kimlik_bilgileri_ilce(
			String ogrenci_kimlik_bilgileri_ilce) {
		this.ogrenci_kimlik_bilgileri_ilce = ogrenci_kimlik_bilgileri_ilce;
	}

	public String getMahalle_koy() {
		return mahalle_koy;
	}

	public void setMahalle_koy(String mahalle_koy) {
		this.mahalle_koy = mahalle_koy;
	}

	public String getCilt_no() {
		return cilt_no;
	}

	public void setCilt_no(String cilt_no) {
		this.cilt_no = cilt_no;
	}

	public String getAile_sira_no() {
		return aile_sira_no;
	}

	public void setAile_sira_no(String aile_sira_no) {
		this.aile_sira_no = aile_sira_no;
	}

	public String getSira_no() {
		return sira_no;
	}

	public void setSira_no(String sira_no) {
		this.sira_no = sira_no;
	}

	public String getVerildigi_yer() {
		return verildigi_yer;
	}

	public void setVerildigi_yer(String verildigi_yer) {
		this.verildigi_yer = verildigi_yer;
	}

	public String getVerilis_nedeni() {
		return verilis_nedeni;
	}

	public void setVerilis_nedeni(String verilis_nedeni) {
		this.verilis_nedeni = verilis_nedeni;
	}

	public String getKayit_no() {
		return kayit_no;
	}

	public void setKayit_no(String kayit_no) {
		this.kayit_no = kayit_no;
	}

	public String getVerilis_tarihi() {
		return verilis_tarihi;
	}

	public void setVerilis_tarihi(String verilis_tarihi) {
		this.verilis_tarihi = verilis_tarihi;
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

	public String getTc_kimlik_no() {
		return tc_kimlik_no;
	}

	public void setTc_kimlik_no(String tc_kimlik_no) {
		this.tc_kimlik_no = tc_kimlik_no;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getMedeni_hali() {
		return medeni_hali;
	}

	public void setMedeni_hali(String medeni_hali) {
		this.medeni_hali = medeni_hali;
	}

	public String getDogum_tarihi() {
		return dogum_tarihi;
	}

	public void setDogum_tarihi(String dogum_tarihi) {
		this.dogum_tarihi = dogum_tarihi;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getOgrenci_bilgileri_ulke() {
		return ogrenci_bilgileri_ulke;
	}

	public void setOgrenci_bilgileri_ulke(String ogrenci_bilgileri_ulke) {
		this.ogrenci_bilgileri_ulke = ogrenci_bilgileri_ulke;
	}

	public String getOgrenci_bilgileri_il() {
		return ogrenci_bilgileri_il;
	}

	public void setOgrenci_bilgileri_il(String ogrenci_bilgileri_il) {
		this.ogrenci_bilgileri_il = ogrenci_bilgileri_il;
	}

	public String getOgrenci_bilgileri_ilce() {
		return ogrenci_bilgileri_ilce;
	}

	public void setOgrenci_bilgileri_ilce(String ogrenci_bilgileri_ilce) {
		this.ogrenci_bilgileri_ilce = ogrenci_bilgileri_ilce;
	}

	public String getOkul() {
		return okul;
	}

	public void setOkul(String okul) {
		this.okul = okul;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

}
