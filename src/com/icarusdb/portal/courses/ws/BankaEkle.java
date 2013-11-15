package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BankaEkle {

	private String banka_adi;
	private String banka_sube;
	private String hesap_no;
	private String iban_no;
	private String bankanin_odeme_sekli;
	private String vade_tarihi;

	public String getBanka_adi() {
		return banka_adi;
	}

	public void setBanka_adi(String banka_adi) {
		this.banka_adi = banka_adi;
	}

	public String getBanka_sube() {
		return banka_sube;
	}

	public void setBanka_sube(String banka_sube) {
		this.banka_sube = banka_sube;
	}

	public String getHesap_no() {
		return hesap_no;
	}

	public void setHesap_no(String hesap_no) {
		this.hesap_no = hesap_no;
	}

	public String getIban_no() {
		return iban_no;
	}

	public void setIban_no(String iban_no) {
		this.iban_no = iban_no;
	}

	public String getBankanin_odeme_sekli() {
		return bankanin_odeme_sekli;
	}

	public void setBankanin_odeme_sekli(String bankanin_odeme_sekli) {
		this.bankanin_odeme_sekli = bankanin_odeme_sekli;
	}

	public String getVade_tarihi() {
		return vade_tarihi;
	}

	public void setVade_tarihi(String vade_tarihi) {
		this.vade_tarihi = vade_tarihi;
	}

}
