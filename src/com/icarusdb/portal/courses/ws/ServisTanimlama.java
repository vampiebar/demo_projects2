package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ServisTanimlama {

	private String id;
	private String kodu;
	private String guzergah;
	private String servis_ucreti;
	private String sofor_adi;
	private String soforun_telefonu;
	private String arac_sahibi;
	private String arac_sahibinin_telefonu;
	private String arac_plakasi;
	private String kapasitesi;
	private String yolcu_sayisi;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getKodu() {
		return kodu;
	}

	public void setKodu(String kodu) {
		this.kodu = kodu;
	}

	public String getGuzergah() {
		return guzergah;
	}

	public void setGuzergah(String guzergah) {
		this.guzergah = guzergah;
	}

	public String getServis_ucreti() {
		return servis_ucreti;
	}

	public void setServis_ucreti(String servis_ucreti) {
		this.servis_ucreti = servis_ucreti;
	}

	public String getSofor_adi() {
		return sofor_adi;
	}

	public void setSofor_adi(String sofor_adi) {
		this.sofor_adi = sofor_adi;
	}

	public String getSoforun_telefonu() {
		return soforun_telefonu;
	}

	public void setSoforun_telefonu(String soforun_telefonu) {
		this.soforun_telefonu = soforun_telefonu;
	}

	public String getArac_sahibi() {
		return arac_sahibi;
	}

	public void setArac_sahibi(String arac_sahibi) {
		this.arac_sahibi = arac_sahibi;
	}

	public String getArac_sahibinin_telefonu() {
		return arac_sahibinin_telefonu;
	}

	public void setArac_sahibinin_telefonu(String arac_sahibinin_telefonu) {
		this.arac_sahibinin_telefonu = arac_sahibinin_telefonu;
	}

	public String getArac_plakasi() {
		return arac_plakasi;
	}

	public void setArac_plakasi(String arac_plakasi) {
		this.arac_plakasi = arac_plakasi;
	}

	public String getKapasitesi() {
		return kapasitesi;
	}

	public void setKapasitesi(String kapasitesi) {
		this.kapasitesi = kapasitesi;
	}

	public String getYolcu_sayisi() {
		return yolcu_sayisi;
	}

	public void setYolcu_sayisi(String yolcu_sayisi) {
		this.yolcu_sayisi = yolcu_sayisi;
	}

}
