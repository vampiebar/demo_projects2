package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class OkulSinifBilgisi {

	private String id;
	private String okul_durumu;

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

}
