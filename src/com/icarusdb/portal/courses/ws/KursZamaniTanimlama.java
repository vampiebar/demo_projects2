package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KursZamaniTanimlama {

	private String id;
	private String kurs_zamani;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKurs_zamani() {
		return kurs_zamani;
	}

	public void setKurs_zamani(String kurs_zamani) {
		this.kurs_zamani = kurs_zamani;
	}

}
