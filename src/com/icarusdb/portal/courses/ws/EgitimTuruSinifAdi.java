package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EgitimTuruSinifAdi {

	private String id;
	private String sinif_adi;

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

}
