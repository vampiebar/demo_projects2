package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SinavCevapAnahtari {

	private String id;
	private String sinav_kodu;
	private String sinav_adi;
	private String sablon_kodu;
	private String kitapcik_kodu;
	private String cevaplar;
	private String cevap_secenek_son_harf;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSinav_kodu() {
		return sinav_kodu;
	}

	public void setSinav_kodu(String sinav_kodu) {
		this.sinav_kodu = sinav_kodu;
	}

	public String getSinav_adi() {
		return sinav_adi;
	}

	public void setSinav_adi(String sinav_adi) {
		this.sinav_adi = sinav_adi;
	}

	public String getSablon_kodu() {
		return sablon_kodu;
	}

	public void setSablon_kodu(String sablon_kodu) {
		this.sablon_kodu = sablon_kodu;
	}

	public String getKitapcik_kodu() {
		return kitapcik_kodu;
	}

	public void setKitapcik_kodu(String kitapcik_kodu) {
		this.kitapcik_kodu = kitapcik_kodu;
	}

	public String getCevaplar() {
		return cevaplar;
	}

	public void setCevaplar(String cevaplar) {
		this.cevaplar = cevaplar;
	}

	public String getCevap_secenek_son_harf() {
		return cevap_secenek_son_harf;
	}

	public void setCevap_secenek_son_harf(String cevap_secenek_son_harf) {
		this.cevap_secenek_son_harf = cevap_secenek_son_harf;
	}

}
