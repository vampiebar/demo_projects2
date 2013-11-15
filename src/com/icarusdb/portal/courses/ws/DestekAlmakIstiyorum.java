package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DestekAlmakIstiyorum {

	private String konu;
	private String bolum;
	private String mesajiniz;

	public String getKonu() {
		return konu;
	}

	public void setKonu(String konu) {
		this.konu = konu;
	}

	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getMesajiniz() {
		return mesajiniz;
	}

	public void setMesajiniz(String mesajiniz) {
		this.mesajiniz = mesajiniz;
	}

}
