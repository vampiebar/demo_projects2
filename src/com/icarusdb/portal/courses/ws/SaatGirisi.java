package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaatGirisi {

	private String id;
	private String baslangic_saat;
	private String bitis_saat;
	private String baslangic_dakika;
	private String bitis_dakika;
	private String gun;
	private String aciklama;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBaslangic_saat() {
		return baslangic_saat;
	}

	public void setBaslangic_saat(String baslangic_saat) {
		this.baslangic_saat = baslangic_saat;
	}

	public String getBitis_saat() {
		return bitis_saat;
	}

	public void setBitis_saat(String bitis_saat) {
		this.bitis_saat = bitis_saat;
	}

	public String getBaslangic_dakika() {
		return baslangic_dakika;
	}

	public void setBaslangic_dakika(String baslangic_dakika) {
		this.baslangic_dakika = baslangic_dakika;
	}

	public String getBitis_dakika() {
		return bitis_dakika;
	}

	public void setBitis_dakika(String bitis_dakika) {
		this.bitis_dakika = bitis_dakika;
	}

	public String getGun() {
		return gun;
	}

	public void setGun(String gun) {
		this.gun = gun;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

}
