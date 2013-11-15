package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PostaKodu {

	private String il;
	private String ilce;
	private String semt_bucak_belde;
	private String mahalle;
	private String posta_kodu;

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getSemt_bucak_belde() {
		return semt_bucak_belde;
	}

	public void setSemt_bucak_belde(String semt_bucak_belde) {
		this.semt_bucak_belde = semt_bucak_belde;
	}

	public String getMahalle() {
		return mahalle;
	}

	public void setMahalle(String mahalle) {
		this.mahalle = mahalle;
	}

	public String getPosta_kodu() {
		return posta_kodu;
	}

	public void setPosta_kodu(String posta_kodu) {
		this.posta_kodu = posta_kodu;
	}

}
