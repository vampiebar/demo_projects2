package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SifreDegistirme {
	private String eski_sifre;
	private String yeni_sifre;
	private String tekrar_yeni_sifre;

	public String getEski_sifre() {
		return eski_sifre;
	}

	public void setEski_sifre(String eski_sifre) {
		this.eski_sifre = eski_sifre;
	}

	public String getYeni_sifre() {
		return yeni_sifre;
	}

	public void setYeni_sifre(String yeni_sifre) {
		this.yeni_sifre = yeni_sifre;
	}

	public String getTekrar_yeni_sifre() {
		return tekrar_yeni_sifre;
	}

	public void setTekrar_yeni_sifre(String tekrar_yeni_sifre) {
		this.tekrar_yeni_sifre = tekrar_yeni_sifre;
	}

}
