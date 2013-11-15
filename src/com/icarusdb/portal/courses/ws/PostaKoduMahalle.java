package com.icarusdb.portal.courses.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class PostaKoduMahalle {

	private String mahalle;
	private String posta_kodu;

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
