package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class YetkiTanimlama {

	private String ders_silme_zamani;
	private String en_erken_rezervasyon;
	private String en_gec_rezervasyon;
	private String etut_maksimum_kisi_sayisi;
	private String gunluk_saat_kotasi;
	private String haftalik_saat_kotasi;
	private String aylik_saat_kotasi;

	public String getDers_silme_zamani() {
		return ders_silme_zamani;
	}

	public void setDers_silme_zamani(String ders_silme_zamani) {
		this.ders_silme_zamani = ders_silme_zamani;
	}

	public String getEn_erken_rezervasyon() {
		return en_erken_rezervasyon;
	}

	public void setEn_erken_rezervasyon(String en_erken_rezervasyon) {
		this.en_erken_rezervasyon = en_erken_rezervasyon;
	}

	public String getEn_gec_rezervasyon() {
		return en_gec_rezervasyon;
	}

	public void setEn_gec_rezervasyon(String en_gec_rezervasyon) {
		this.en_gec_rezervasyon = en_gec_rezervasyon;
	}

	public String getEtut_maksimum_kisi_sayisi() {
		return etut_maksimum_kisi_sayisi;
	}

	public void setEtut_maksimum_kisi_sayisi(String etut_maksimum_kisi_sayisi) {
		this.etut_maksimum_kisi_sayisi = etut_maksimum_kisi_sayisi;
	}

	public String getGunluk_saat_kotasi() {
		return gunluk_saat_kotasi;
	}

	public void setGunluk_saat_kotasi(String gunluk_saat_kotasi) {
		this.gunluk_saat_kotasi = gunluk_saat_kotasi;
	}

	public String getHaftalik_saat_kotasi() {
		return haftalik_saat_kotasi;
	}

	public void setHaftalik_saat_kotasi(String haftalik_saat_kotasi) {
		this.haftalik_saat_kotasi = haftalik_saat_kotasi;
	}

	public String getAylik_saat_kotasi() {
		return aylik_saat_kotasi;
	}

	public void setAylik_saat_kotasi(String aylik_saat_kotasi) {
		this.aylik_saat_kotasi = aylik_saat_kotasi;
	}

}
