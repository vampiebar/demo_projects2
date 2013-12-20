package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Odemeler {

	private String id;
	private String indirimli_tutar;
	private String hizmetlerin_toplami;
	private String toplam_tutar;
	private String pesinat_odeme_turu;
	private String aciklama;
	private String pesinatin_yatacagi_banka;
	private String pesinat_miktari;
	private String taksitlerin_toplami;
	private String sozlesme_disi_kalan;
	private String taksitin_odeme_turu;
	private String taksit_aciklama;
	private String taksitin_yatacagi_banka;
	private String taksit_sayisi;
	private String takside_baslanacak_gun;
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

	public String getIndirimli_tutar() {
		return indirimli_tutar;
	}

	public void setIndirimli_tutar(String indirimli_tutar) {
		this.indirimli_tutar = indirimli_tutar;
	}

	public String getHizmetlerin_toplami() {
		return hizmetlerin_toplami;
	}

	public void setHizmetlerin_toplami(String hizmetlerin_toplami) {
		this.hizmetlerin_toplami = hizmetlerin_toplami;
	}

	public String getToplam_tutar() {
		return toplam_tutar;
	}

	public void setToplam_tutar(String toplam_tutar) {
		this.toplam_tutar = toplam_tutar;
	}

	public String getPesinat_odeme_turu() {
		return pesinat_odeme_turu;
	}

	public void setPesinat_odeme_turu(String pesinat_odeme_turu) {
		this.pesinat_odeme_turu = pesinat_odeme_turu;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public String getPesinatin_yatacagi_banka() {
		return pesinatin_yatacagi_banka;
	}

	public void setPesinatin_yatacagi_banka(String pesinatin_yatacagi_banka) {
		this.pesinatin_yatacagi_banka = pesinatin_yatacagi_banka;
	}

	public String getPesinat_miktari() {
		return pesinat_miktari;
	}

	public void setPesinat_miktari(String pesinat_miktari) {
		this.pesinat_miktari = pesinat_miktari;
	}

	public String getTaksitlerin_toplami() {
		return taksitlerin_toplami;
	}

	public void setTaksitlerin_toplami(String taksitlerin_toplami) {
		this.taksitlerin_toplami = taksitlerin_toplami;
	}

	public String getSozlesme_disi_kalan() {
		return sozlesme_disi_kalan;
	}

	public void setSozlesme_disi_kalan(String sozlesme_disi_kalan) {
		this.sozlesme_disi_kalan = sozlesme_disi_kalan;
	}

	public String getTaksitin_odeme_turu() {
		return taksitin_odeme_turu;
	}

	public void setTaksitin_odeme_turu(String taksitin_odeme_turu) {
		this.taksitin_odeme_turu = taksitin_odeme_turu;
	}

	public String getTaksit_aciklama() {
		return taksit_aciklama;
	}

	public void setTaksit_aciklama(String taksit_aciklama) {
		this.taksit_aciklama = taksit_aciklama;
	}

	public String getTaksitin_yatacagi_banka() {
		return taksitin_yatacagi_banka;
	}

	public void setTaksitin_yatacagi_banka(String taksitin_yatacagi_banka) {
		this.taksitin_yatacagi_banka = taksitin_yatacagi_banka;
	}

	public String getTaksit_sayisi() {
		return taksit_sayisi;
	}

	public void setTaksit_sayisi(String taksit_sayisi) {
		this.taksit_sayisi = taksit_sayisi;
	}

	public String getTakside_baslanacak_gun() {
		return takside_baslanacak_gun;
	}

	public void setTakside_baslanacak_gun(String takside_baslanacak_gun) {
		this.takside_baslanacak_gun = takside_baslanacak_gun;
	}

}
