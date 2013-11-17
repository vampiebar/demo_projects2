package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class GelirGiderTanimlari {

	private String id;
	private String kategori_adi;
	private String tipi;
	private String gelir_gider_adi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKategori_adi() {
		return kategori_adi;
	}

	public void setKategori_adi(String kategori_adi) {
		this.kategori_adi = kategori_adi;
	}

	public String getTipi() {
		return tipi;
	}

	public void setTipi(String tipi) {
		this.tipi = tipi;
	}

	public String getGelir_gider_adi() {
		return gelir_gider_adi;
	}

	public void setGelir_gider_adi(String gelir_gider_adi) {
		this.gelir_gider_adi = gelir_gider_adi;
	}

}
