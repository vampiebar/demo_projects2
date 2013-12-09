package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SozlesmeMaddeleri {

	private String id;
	private String sozlesme;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSozlesme() {
		return sozlesme;
	}

	public void setSozlesme(String sozlesme) {
		this.sozlesme = sozlesme;
	}

}
