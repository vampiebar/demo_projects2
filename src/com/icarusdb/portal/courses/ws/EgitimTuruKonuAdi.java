package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EgitimTuruKonuAdi {

	private String id;
	private String sinif_adi;
	private String ders_adi;
	private String unite_adi;
	private String konu_adi;

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

	public String getDers_adi() {
		return ders_adi;
	}

	public void setDers_adi(String ders_adi) {
		this.ders_adi = ders_adi;
	}

	public String getUnite_adi() {
		return unite_adi;
	}

	public void setUnite_adi(String unite_adi) {
		this.unite_adi = unite_adi;
	}

	public String getKonu_adi() {
		return konu_adi;
	}

	public void setKonu_adi(String konu_adi) {
		this.konu_adi = konu_adi;
	}

}
