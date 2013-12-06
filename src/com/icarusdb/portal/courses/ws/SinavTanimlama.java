package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SinavTanimlama {

	private String id;
	private String sinav_no;
	private String sinav_adi;
	private String tarih;
	private String son_kitapcik_no;
	private String sablon_seciniz;
	private String saat;
	private String dakika;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSinav_no() {
		return sinav_no;
	}

	public void setSinav_no(String sinav_no) {
		this.sinav_no = sinav_no;
	}

	public String getSinav_adi() {
		return sinav_adi;
	}

	public void setSinav_adi(String sinav_adi) {
		this.sinav_adi = sinav_adi;
	}

	public String getTarih() {
		return tarih;
	}

	public void setTarih(String tarih) {
		this.tarih = tarih;
	}

	public String getSon_kitapcik_no() {
		return son_kitapcik_no;
	}

	public void setSon_kitapcik_no(String son_kitapcik_no) {
		this.son_kitapcik_no = son_kitapcik_no;
	}

	public String getSablon_seciniz() {
		return sablon_seciniz;
	}

	public void setSablon_seciniz(String sablon_seciniz) {
		this.sablon_seciniz = sablon_seciniz;
	}

	public String getSaat() {
		return saat;
	}

	public void setSaat(String saat) {
		this.saat = saat;
	}

	public String getDakika() {
		return dakika;
	}

	public void setDakika(String dakika) {
		this.dakika = dakika;
	}

}
