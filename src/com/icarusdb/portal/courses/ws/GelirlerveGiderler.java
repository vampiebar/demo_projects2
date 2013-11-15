package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GelirlerveGiderler {

	private String islem_tipi;
	private String kategoriler;
	private String gelirler;
	private String odeme_turu;
	private String banka;
	private String cek;
	private String vade_tarihi;
	private String miktar;
	private String tarih;
	private String aciklama;

	public String getIslem_tipi() {
		return islem_tipi;
	}

	public void setIslem_tipi(String islem_tipi) {
		this.islem_tipi = islem_tipi;
	}

	public String getKategoriler() {
		return kategoriler;
	}

	public void setKategoriler(String kategoriler) {
		this.kategoriler = kategoriler;
	}

	public String getGelirler() {
		return gelirler;
	}

	public void setGelirler(String gelirler) {
		this.gelirler = gelirler;
	}

	public String getOdeme_turu() {
		return odeme_turu;
	}

	public void setOdeme_turu(String odeme_turu) {
		this.odeme_turu = odeme_turu;
	}

	public String getBanka() {
		return banka;
	}

	public void setBanka(String banka) {
		this.banka = banka;
	}

	public String getCek() {
		return cek;
	}

	public void setCek(String cek) {
		this.cek = cek;
	}

	public String getVade_tarihi() {
		return vade_tarihi;
	}

	public void setVade_tarihi(String vade_tarihi) {
		this.vade_tarihi = vade_tarihi;
	}

	public String getMiktar() {
		return miktar;
	}

	public void setMiktar(String miktar) {
		this.miktar = miktar;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}
