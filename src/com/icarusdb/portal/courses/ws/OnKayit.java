package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OnKayit {

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
	private String okul_numarasi;
	private String ogrenci_bilgileri_sinif;
	private String gorusme_egitim_turu;
	private String gorusme_alan;
	private String gorusme_kurs_zamani;
	private String gorusme_sinif;
	private String gorusme_kurs_indirim_fiyati;
	private String gorusme_indirim_turu;
	private String gorusme_indirim_sekli;
	private String gorusme_indirim_miktari;
	private String gorusme_referans;
	private String gorusme_tarihi;
	private String gorusme_tipi;
	private String gorusme_sonucu;
	private String gorusme_yuzdesi;
	private String aciklama;
	private String sinif_bilgileri_kurs_indirim_fiyati;
	private String kesin_kayit_mi;

	public String getKesin_kayit_mi() {
		return kesin_kayit_mi;
	}

	public void setKesin_kayit_mi(String kesin_kayit_mi) {
		this.kesin_kayit_mi = kesin_kayit_mi;
	}

	public String getSinif_bilgileri_kurs_indirim_fiyati() {
		return sinif_bilgileri_kurs_indirim_fiyati;
	}

	public void setSinif_bilgileri_kurs_indirim_fiyati(
			String sinif_bilgileri_kurs_indirim_fiyati) {
		this.sinif_bilgileri_kurs_indirim_fiyati = sinif_bilgileri_kurs_indirim_fiyati;
	}

	public String getId() {
		return id;
	}

	public String getGorusme_egitim_turu() {
		return gorusme_egitim_turu;
	}

	public void setGorusme_egitim_turu(String gorusme_egitim_turu) {
		this.gorusme_egitim_turu = gorusme_egitim_turu;
	}

	public String getGorusme_alan() {
		return gorusme_alan;
	}

	public void setGorusme_alan(String gorusme_alan) {
		this.gorusme_alan = gorusme_alan;
	}

	public String getGorusme_kurs_zamani() {
		return gorusme_kurs_zamani;
	}

	public void setGorusme_kurs_zamani(String gorusme_kurs_zamani) {
		this.gorusme_kurs_zamani = gorusme_kurs_zamani;
	}

	public String getGorusme_kurs_indirim_fiyati() {
		return gorusme_kurs_indirim_fiyati;
	}

	public void setGorusme_kurs_indirim_fiyati(
			String gorusme_kurs_indirim_fiyati) {
		this.gorusme_kurs_indirim_fiyati = gorusme_kurs_indirim_fiyati;
	}

	public String getGorusme_indirim_turu() {
		return gorusme_indirim_turu;
	}

	public void setGorusme_indirim_turu(String gorusme_indirim_turu) {
		this.gorusme_indirim_turu = gorusme_indirim_turu;
	}

	public String getGorusme_indirim_sekli() {
		return gorusme_indirim_sekli;
	}

	public void setGorusme_indirim_sekli(String gorusme_indirim_sekli) {
		this.gorusme_indirim_sekli = gorusme_indirim_sekli;
	}

	public String getGorusme_indirim_miktari() {
		return gorusme_indirim_miktari;
	}

	public void setGorusme_indirim_miktari(String gorusme_indirim_miktari) {
		this.gorusme_indirim_miktari = gorusme_indirim_miktari;
	}

	public String getGorusme_referans() {
		return gorusme_referans;
	}

	public void setGorusme_referans(String gorusme_referans) {
		this.gorusme_referans = gorusme_referans;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGorusme_sinif() {
		return gorusme_sinif;
	}

	public void setGorusme_sinif(String gorusme_sinif) {
		this.gorusme_sinif = gorusme_sinif;
	}

	public String getGorusme_tarihi() {
		return gorusme_tarihi;
	}

	public void setGorusme_tarihi(String gorusme_tarihi) {
		this.gorusme_tarihi = gorusme_tarihi;
	}

	public String getGorusme_tipi() {
		return gorusme_tipi;
	}

	public void setGorusme_tipi(String gorusme_tipi) {
		this.gorusme_tipi = gorusme_tipi;
	}

	public String getGorusme_sonucu() {
		return gorusme_sonucu;
	}

	public void setGorusme_sonucu(String gorusme_sonucu) {
		this.gorusme_sonucu = gorusme_sonucu;
	}

	public String getGorusme_yuzdesi() {
		return gorusme_yuzdesi;
	}

	public void setGorusme_yuzdesi(String gorusme_yuzdesi) {
		this.gorusme_yuzdesi = gorusme_yuzdesi;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

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

	public String getOkul_numarasi() {
		return okul_numarasi;
	}

	public void setOkul_numarasi(String okul_numarasi) {
		this.okul_numarasi = okul_numarasi;
	}

	public String getOgrenci_bilgileri_sinif() {
		return ogrenci_bilgileri_sinif;
	}

	public void setOgrenci_bilgileri_sinif(String ogrenci_bilgileri_sinif) {
		this.ogrenci_bilgileri_sinif = ogrenci_bilgileri_sinif;
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

	private String egitim_turu;
	private String alan;
	private String kurs_zamani;
	private String sinif;
	private String ogrenci_numarasi;
	private String kurs_indirim_fiyati;
	private String indirim_turu;
	private String indirim_sekli;
	private String indirim_miktari;
	private String referans;

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

	public String getKurs_zamani() {
		return kurs_zamani;
	}

	public void setKurs_zamani(String kurs_zamani) {
		this.kurs_zamani = kurs_zamani;
	}

	public String getSinif() {
		return sinif;
	}

	public void setSinif(String sinif) {
		this.sinif = sinif;
	}

	public String getOgrenci_numarasi() {
		return ogrenci_numarasi;
	}

	public void setOgrenci_numarasi(String ogrenci_numarasi) {
		this.ogrenci_numarasi = ogrenci_numarasi;
	}

	public String getKurs_indirim_fiyati() {
		return kurs_indirim_fiyati;
	}

	public void setKurs_indirim_fiyati(String kurs_indirim_fiyati) {
		this.kurs_indirim_fiyati = kurs_indirim_fiyati;
	}

	public String getIndirim_turu() {
		return indirim_turu;
	}

	public void setIndirim_turu(String indirim_turu) {
		this.indirim_turu = indirim_turu;
	}

	public String getIndirim_sekli() {
		return indirim_sekli;
	}

	public void setIndirim_sekli(String indirim_sekli) {
		this.indirim_sekli = indirim_sekli;
	}

	public String getIndirim_miktari() {
		return indirim_miktari;
	}

	public void setIndirim_miktari(String indirim_miktari) {
		this.indirim_miktari = indirim_miktari;
	}

	public String getReferans() {
		return referans;
	}

	public void setReferans(String referans) {
		this.referans = referans;
	}

}
