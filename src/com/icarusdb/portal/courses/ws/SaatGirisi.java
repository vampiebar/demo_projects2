package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SaatGirisi {

	private String baslangic_saati;
	private String bitis_saati;
	private String gun;
	private String aciklama;

	public String getBaslangic_saati() {
		return baslangic_saati;
	}

	public void setBaslangic_saati(String baslangic_saati) {
		this.baslangic_saati = baslangic_saati;
	}

	public String getBitis_saati() {
		return bitis_saati;
	}

	public void setBitis_saati(String bitis_saati) {
		this.bitis_saati = bitis_saati;
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
