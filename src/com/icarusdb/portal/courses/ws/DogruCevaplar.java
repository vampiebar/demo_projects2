package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DogruCevaplar {

	private String id;
	private String dogru_cevaplar;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDogru_cevaplar() {
		return dogru_cevaplar;
	}

	public void setDogru_cevaplar(String dogru_cevaplar) {
		this.dogru_cevaplar = dogru_cevaplar;
	}

}
