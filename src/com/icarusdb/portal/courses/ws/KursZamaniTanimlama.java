package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class KursZamaniTanimlama {

	private String kurs_zamani;

	public String getKurs_zamani() {
		return kurs_zamani;
	}

	public void setKurs_zamani(String kurs_zamani) {
		this.kurs_zamani = kurs_zamani;
	}

}
