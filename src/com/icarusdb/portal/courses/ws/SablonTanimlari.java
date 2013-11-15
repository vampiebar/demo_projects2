package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SablonTanimlari {

	private String sablon_adi;
	private String erkek;
	private String kiz;
	private String sayisal;
	private String sozel;
	private String esit_a;
	private String dil;
	private String alani_yok;
	private String alan;
	private String deger;
	private String lys_1;
	private String lys_2;
	private String lys_3;
	private String lys_4;
	private String lys_5;
	private String sinav_turu;

	public String getSablon_adi() {
		return sablon_adi;
	}

	public String getErkek() {
		return erkek;
	}

	public void setErkek(String erkek) {
		this.erkek = erkek;
	}

	public String getKiz() {
		return kiz;
	}

	public void setKiz(String kiz) {
		this.kiz = kiz;

	}

	public void setSablon_adi(String sablon_adi) {
		this.sablon_adi = sablon_adi;

	}

	public String getSayisal() {
		return sayisal;
	}

	public void setSayisal(String sayisal) {
		this.sayisal = sayisal;
	}

	public String getSozel() {
		return sozel;
	}

	public void setSozel(String sozel) {
		this.sozel = sozel;
	}

	public String getEsit_a() {
		return esit_a;
	}

	public void setEsit_a(String esit_a) {
		this.esit_a = esit_a;
	}

	public String getDil() {
		return dil;
	}

	public void setDil(String dil) {
		this.dil = dil;
	}

	public String getAlani_yok() {
		return alani_yok;
	}

	public void setAlani_yok(String alani_yok) {
		this.alani_yok = alani_yok;
	}

	public String getAlan() {
		return alan;
	}

	public void setAlan(String alan) {
		this.alan = alan;
	}

	public String getDeger() {
		return deger;
	}

	public void setDeger(String deger) {
		this.deger = deger;
	}

	public String getLys_1() {
		return lys_1;
	}

	public void setLys_1(String lys_1) {
		this.lys_1 = lys_1;
	}

	public String getLys_2() {
		return lys_2;
	}

	public void setLys_2(String lys_2) {
		this.lys_2 = lys_2;
	}

	public String getLys_3() {
		return lys_3;
	}

	public void setLys_3(String lys_3) {
		this.lys_3 = lys_3;
	}

	public String getLys_4() {
		return lys_4;
	}

	public void setLys_4(String lys_4) {
		this.lys_4 = lys_4;
	}

	public String getLys_5() {
		return lys_5;
	}

	public void setLys_5(String lys_5) {
		this.lys_5 = lys_5;
	}

	public String getSinav_turu() {
		return sinav_turu;
	}

	public void setSinav_turu(String sinav_turu) {
		this.sinav_turu = sinav_turu;
	}

}
