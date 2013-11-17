package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GelirGiderKategorileri {

	private String id;

	private String kategori_adi;

	public String getKategori_adi() {
		return kategori_adi;
	}

	public void setKategori_adi(String kategori_adi) {
		this.kategori_adi = kategori_adi;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
