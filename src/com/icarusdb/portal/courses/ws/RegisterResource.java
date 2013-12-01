package com.icarusdb.portal.courses.ws;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.sun.jersey.spi.resource.Singleton;

@Produces("application/xml")
@Path("genel")
@Singleton
public class RegisterResource {

	@GET
	@Path("getdbskayit")
	@Produces("application/xml")
	public List<DBSKayit> getDBSKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<DBSKayit> listDBSKayit = DBUtil.getDBSKayit(criteria);

		return listDBSKayit;

	}

	@GET
	@Path("putdbskayit")
	@Produces("application/xml")
	public String putDBSKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");

		String adi = info.getQueryParameters().getFirst("adi");
		String soyadi = info.getQueryParameters().getFirst("soyadi");
		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		String cinsiyet = info.getQueryParameters().getFirst("cinsiyet");
		String medeni_hali = info.getQueryParameters().getFirst("medeni_hali");
		String dogum_tarihi = info.getQueryParameters()
				.getFirst("dogum_tarihi");
		String ev_telefonu = info.getQueryParameters().getFirst("ev_telefonu");
		String cep_telefonu = info.getQueryParameters()
				.getFirst("cep_telefonu");
		String email = info.getQueryParameters().getFirst("email");
		String ogrenci_bilgileri_ulke = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_ulke");
		String ogrenci_bilgileri_il = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_il");
		String ogrenci_bilgileri_ilce = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_ilce");
		String okul = info.getQueryParameters().getFirst("okul");
		String sinif = info.getQueryParameters().getFirst("sinif");
		String seri_no = info.getQueryParameters().getFirst("seri_no");
		String cuzdan_no = info.getQueryParameters().getFirst("cuzdan_no");
		String ogrenci_kimlik_bilgileri_ulke = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_ulke");
		String ogrenci_kimlik_bilgileri_il = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_il");
		String ogrenci_kimlik_bilgileri_ilce = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_ilce");
		String mahalle_koy = info.getQueryParameters().getFirst("mahalle_koy");
		String cilt_no = info.getQueryParameters().getFirst("cilt_no");
		String aile_sira_no = info.getQueryParameters()
				.getFirst("aile_sira_no");
		String sira_no = info.getQueryParameters().getFirst("sira_no");
		String verildigi_yer = info.getQueryParameters().getFirst(
				"verildigi_yer");
		String verilis_nedeni = info.getQueryParameters().getFirst(
				"verilis_nedeni");
		String kayit_no = info.getQueryParameters().getFirst("kayit_no");
		String verilis_tarihi = info.getQueryParameters().getFirst(
				"verilis_tarihi");
		String adres_bilgileri_ulke = info.getQueryParameters().getFirst(
				"adres_bilgileri_ulke");
		String adres_bilgileri_il = info.getQueryParameters().getFirst(
				"adres_bilgileri_il");
		String adres_bilgileri_ilce = info.getQueryParameters().getFirst(
				"adres_bilgileri_ilce");
		String mahalle = info.getQueryParameters().getFirst("mahalle");
		String semt = info.getQueryParameters().getFirst("semt");
		String sokak_ve_no = info.getQueryParameters().getFirst("sokak_ve_no");
		String okul_durumu = info.getQueryParameters().getFirst("okul_durumu");
		String alan_bilgisi = info.getQueryParameters()
				.getFirst("alan_bilgisi");
		String sinav_tarihi = info.getQueryParameters()
				.getFirst("sinav_tarihi");

		System.out.println("IDDDDDDDDDDDDDD: " + id);

		return DBUtil.putDBSKayit(id, adi, soyadi, tc_kimlik_no, cinsiyet,
				medeni_hali, dogum_tarihi, ev_telefonu, cep_telefonu, email,
				ogrenci_bilgileri_ulke, ogrenci_bilgileri_il,
				ogrenci_bilgileri_ilce, okul, sinif, seri_no, cuzdan_no,
				ogrenci_kimlik_bilgileri_ulke, ogrenci_kimlik_bilgileri_il,
				ogrenci_kimlik_bilgileri_ilce, mahalle_koy, cilt_no,
				aile_sira_no, sira_no, verildigi_yer, verilis_nedeni, kayit_no,
				verilis_tarihi, adres_bilgileri_ulke, adres_bilgileri_il,
				adres_bilgileri_ilce, semt, mahalle, sokak_ve_no, okul_durumu,
				alan_bilgisi, sinav_tarihi);
	}

	@GET
	@Path("getonkayit")
	@Produces("application/xml")
	public List<OnKayit> getOnKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String kesin_kayit_mi = info.getQueryParameters().getFirst(
				"kesin_kayit_mi");
		if ((kesin_kayit_mi != null) && kesin_kayit_mi.length() > 0) {

			criteria = criteria + " AND kesin_kayit_mi = '"
					+ kesin_kayit_mi.toLowerCase() + "'";
		}

		String adi = info.getQueryParameters().getFirst("adi");
		if ((adi != null) && adi.length() > 0) {

			criteria = criteria + " AND adi ilike " + "'%" + adi + "%'";
		}

		String soyadi = info.getQueryParameters().getFirst("soyadi");
		if ((soyadi != null) && soyadi.length() > 0) {

			criteria = criteria + " AND soyadi ilike " + "'%" + soyadi + "%'";
		}

		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		if ((tc_kimlik_no != null) && tc_kimlik_no.length() > 0) {

			criteria = criteria + " AND tc_kimlik_no ilike " + "'%"
					+ tc_kimlik_no + "%'";
		}

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		if ((egitim_turu != null) && egitim_turu.length() > 0) {

			criteria = criteria + " AND egitim_turu ilike " + "'%"
					+ egitim_turu + "%'";
		}

		String alan = info.getQueryParameters().getFirst("alan");
		if ((alan != null) && alan.length() > 0) {

			criteria = criteria + " AND alan ilike " + "'%" + alan + "%'";
		}

		String kurs_zamani = info.getQueryParameters().getFirst("kurs_zamani");
		if ((kurs_zamani != null) && alan.length() > 0) {

			criteria = criteria + " AND kurs_zamani ilike " + "'%"
					+ kurs_zamani + "%'";
		}

		String sinif = info.getQueryParameters().getFirst("sinif");
		if ((sinif != null) && alan.length() > 0) {

			criteria = criteria + " AND sinif ilike " + "'%" + sinif + "%'";
		}

		List<OnKayit> listOnKayit = DBUtil.getOnKayit(criteria);

		return listOnKayit;
	}

	@GET
	@Path("putonkayit")
	@Produces("application/xml")
	public String putOnKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String adi = info.getQueryParameters().getFirst("adi");
		String soyadi = info.getQueryParameters().getFirst("soyadi");
		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		String cinsiyet = info.getQueryParameters().getFirst("cinsiyet");
		String medeni_hali = info.getQueryParameters().getFirst("medeni_hali");
		String dogum_tarihi = info.getQueryParameters()
				.getFirst("dogum_tarihi");
		String ev_telefonu = info.getQueryParameters().getFirst("ev_telefonu");
		String cep_telefonu = info.getQueryParameters()
				.getFirst("cep_telefonu");
		String email = info.getQueryParameters().getFirst("email");
		String ogrenci_bilgileri_ulke = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_ulke");
		String ogrenci_bilgileri_il = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_il");
		String ogrenci_bilgileri_ilce = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_ilce");
		String okul = info.getQueryParameters().getFirst("okul");
		String ogrenci_bilgileri_sinif = info.getQueryParameters().getFirst(
				"ogrenci_bilgileri_sinif");

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String alan = info.getQueryParameters().getFirst("alan");
		String kurs_zamani = info.getQueryParameters().getFirst("kurs_zamani");
		String gorusme_sinif = info.getQueryParameters().getFirst(
				"gorusme_sinif");
		String kurs_indirim_fiyati = info.getQueryParameters().getFirst(
				"kurs_indirim_fiyati");
		String indirim_turu = info.getQueryParameters()
				.getFirst("indirim_turu");
		String indirim_miktari = info.getQueryParameters().getFirst(
				"indirim_miktari");
		String referans = info.getQueryParameters().getFirst("referans");
		String gorusme_tarihi = info.getQueryParameters().getFirst(
				"gorusme_tarihi");
		String gorusme_tipi = info.getQueryParameters()
				.getFirst("gorusme_tipi");
		String gorusme_sonucu = info.getQueryParameters().getFirst(
				"gorusme_sonucu");
		String gorusme_yuzdesi = info.getQueryParameters().getFirst(
				"gorusme_yuzdesi");
		String aciklama = info.getQueryParameters().getFirst("aciklama");
		String seri_no = info.getQueryParameters().getFirst("seri_no");
		String cuzdan_no = info.getQueryParameters().getFirst("cuzdan_no");
		String ogrenci_kimlik_bilgileri_ulke = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_ulke");
		String ogrenci_kimlik_bilgileri_il = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_il");
		String ogrenci_kimlik_bilgileri_ilce = info.getQueryParameters()
				.getFirst("ogrenci_kimlik_bilgileri_ilce");
		String mahalle_koy = info.getQueryParameters().getFirst("mahalle_koy");
		String cilt_no = info.getQueryParameters().getFirst("cilt_no");
		String aile_sira_no = info.getQueryParameters()
				.getFirst("aile_sira_no");
		String sira_no = info.getQueryParameters().getFirst("sira_no");
		String verildigi_yer = info.getQueryParameters().getFirst(
				"verildigi_yer");
		String verilis_nedeni = info.getQueryParameters().getFirst(
				"verilis_nedeni");
		String kayit_no = info.getQueryParameters().getFirst("kayit_no");
		String verilis_tarihi = info.getQueryParameters().getFirst(
				"verilis_tarihi");
		String adres_bilgileri_ulke = info.getQueryParameters().getFirst(
				"adres_bilgileri_ulke");
		String adres_bilgileri_il = info.getQueryParameters().getFirst(
				"adres_bilgileri_il");
		String adres_bilgileri_ilce = info.getQueryParameters().getFirst(
				"adres_bilgileri_ilce");
		String mahalle = info.getQueryParameters().getFirst("mahalle");
		String semt = info.getQueryParameters().getFirst("semt");
		String sokak_ve_no = info.getQueryParameters().getFirst("sokak_ve_no");

		return DBUtil.putOnKayit(id, adi, soyadi, tc_kimlik_no, cinsiyet,
				medeni_hali, dogum_tarihi, ev_telefonu, cep_telefonu, email,
				ogrenci_bilgileri_ulke, ogrenci_bilgileri_il,
				ogrenci_bilgileri_ilce, okul, ogrenci_bilgileri_sinif,
				egitim_turu, alan, kurs_zamani, gorusme_sinif,
				kurs_indirim_fiyati, indirim_turu, indirim_miktari, referans,
				gorusme_tarihi, gorusme_tipi, gorusme_sonucu, gorusme_yuzdesi,
				aciklama, seri_no, cuzdan_no, ogrenci_kimlik_bilgileri_ulke,
				ogrenci_kimlik_bilgileri_il, ogrenci_kimlik_bilgileri_ilce,
				mahalle, cilt_no, aile_sira_no, sira_no, verildigi_yer,
				verilis_nedeni, kayit_no, verilis_tarihi, adres_bilgileri_ulke,
				adres_bilgileri_il, adres_bilgileri_ilce, semt, mahalle_koy,
				sokak_ve_no);
	}

	@GET
	@Path("getveliler")
	@Produces("application/xml")
	public List<Veliler> getVeliler(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String ogrenci_tc_kimlik_no = info.getQueryParameters().getFirst(
				"ogrenci_tc_kimlik_no");
		if ((ogrenci_tc_kimlik_no != null) && ogrenci_tc_kimlik_no.length() > 0) {

			criteria = criteria + " AND ogrenci_tc_kimlik_no = '"
					+ ogrenci_tc_kimlik_no + "'";
		}

		List<Veliler> listVeliler = DBUtil.getVeliler(criteria);

		return listVeliler;
	}

	@GET
	@Path("putveliler")
	@Produces("application/xml")
	public String putVeliEkle(@Context UriInfo info) {

		// System.out.println("HERE putveliler");
		// throw new UnsupportedOperationException("Not yet implemented.");
		String id = info.getQueryParameters().getFirst("id");
		String veli_bilgileri_adi = info.getQueryParameters().getFirst(
				"veli_bilgileri_adi");
		String veli_bilgileri_soyadi = info.getQueryParameters().getFirst(
				"veli_bilgileri_soyadi");
		String veli_bilgileri_tc_kimlik_no = info.getQueryParameters()
				.getFirst("veli_bilgileri_tc_kimlik_no");
		String yakinlik_durumu = info.getQueryParameters().getFirst(
				"yakinlik_durumu");
		String odeme_sorumlusu = info.getQueryParameters().getFirst(
				"odeme_sorumlusu");
		String cep_tel = info.getQueryParameters().getFirst("cep_tel");
		String ev_tel = info.getQueryParameters().getFirst("ev_tel");
		String is_tel = info.getQueryParameters().getFirst("is_tel");
		String e_mail = info.getQueryParameters().getFirst("e_mail");
		String firma = info.getQueryParameters().getFirst("firma");
		String sektor = info.getQueryParameters().getFirst("sektor");
		String unvani = info.getQueryParameters().getFirst("unvani");
		String gorevi = info.getQueryParameters().getFirst("gorevi");
		String veli_bilgileri_adres = info.getQueryParameters().getFirst(
				"veli_bilgileri_adres");
		String ogrenci_tc_kimlik_no = info.getQueryParameters().getFirst(
				"ogrenci_tc_kimlik_no");

		return DBUtil.putVeliler(id, veli_bilgileri_adi, veli_bilgileri_soyadi,
				veli_bilgileri_tc_kimlik_no, yakinlik_durumu, odeme_sorumlusu,
				cep_tel, ev_tel, is_tel, e_mail, firma, sektor, unvani, gorevi,
				veli_bilgileri_adres, ogrenci_tc_kimlik_no);
	}

	@GET
	@Path("getkesinkayit")
	@Produces("application/xml")
	public KesinKayit getKesinKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		if ((tc_kimlik_no != null) && tc_kimlik_no.length() > 0) {

			criteria = criteria + " AND tc_kimlik_no ilike " + "'%"
					+ tc_kimlik_no + "%'";
		}

		return DBUtil.getKesinKayit(criteria);
	}

	@GET
	@Path("putkesinkayit")
	@Produces("application/xml")
	public String putKesinKayit(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		String tc_kimlik_no_kullanma = info.getQueryParameters().getFirst(
				"tc_kimlik_no_kullanma");
		String adi = info.getQueryParameters().getFirst("adi");
		String soyadi = info.getQueryParameters().getFirst("soyadi");

		return DBUtil.putKesinKayit(tc_kimlik_no, tc_kimlik_no_kullanma, adi,
				soyadi);
	}

	@GET
	@Path("getyetkitanimlama")
	@Produces("application/xml")
	public YetkiTanimlama getYetkiTanimlama() {
		// throw new UnsupportedOperationException("Not yet implemented.");

		return DBUtil.getYetkiTanimlama();
	}

	@GET
	@Path("putyetkitanimlama")
	@Produces("application/xml")
	public String putYetkiTanimlama(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String ders_silme_zamani = info.getQueryParameters().getFirst(
				"ders_silme_zamani");
		String en_erken_rezervasyon = info.getQueryParameters().getFirst(
				"en_erken_rezervasyon");
		String en_gec_rezervasyon = info.getQueryParameters().getFirst(
				"en_gec_rezervasyon");
		String etut_maksimum_kisi_sayisi = info.getQueryParameters().getFirst(
				"etut_maksimum_kisi_sayisi");
		String gunluk_saat_kotasi = info.getQueryParameters().getFirst(
				"gunluk_saat_kotasi");
		String haftalik_saat_kotasi = info.getQueryParameters().getFirst(
				"haftalik_saat_kotasi");
		String aylik_saat_kotasi = info.getQueryParameters().getFirst(
				"aylik_saat_kotasi");

		return DBUtil.putYetkiTanimlama(ders_silme_zamani,
				en_erken_rezervasyon, en_gec_rezervasyon,
				etut_maksimum_kisi_sayisi, gunluk_saat_kotasi,
				haftalik_saat_kotasi, aylik_saat_kotasi);
	}

	@GET
	@Path("getsaatgirisi")
	@Produces("application/xml")
	public List<SaatGirisi> getSaatGirisi(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}
		List<SaatGirisi> listSaatGirisi = DBUtil.getSaatGirisi(criteria);

		return listSaatGirisi;

	}

	@GET
	@Path("putsaatgirisi")
	@Produces("application/xml")
	public String putSaatGirisi(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String baslangic_saati = info.getQueryParameters().getFirst(
				"baslangic_saati");
		String bitis_saati = info.getQueryParameters().getFirst("bitis_saati");
		String gun = info.getQueryParameters().getFirst("gun");
		String aciklama = info.getQueryParameters().getFirst("aciklama");

		return DBUtil.putSaatGirisi(id, baslangic_saati, bitis_saati, gun,
				aciklama);
	}

	@GET
	@Path("getodevolustur")
	@Produces("application/xml")
	public List<OdevOlustur> getOdevOlustur(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		if ((egitim_turu != null) && egitim_turu.length() > 0) {

			criteria = criteria + " AND egitim_turu ilike " + "'%"
					+ egitim_turu + "%'";
		}

		String alan = info.getQueryParameters().getFirst("alan");
		if ((alan != null) && alan.length() > 0) {

			criteria = criteria + " AND alan ilike " + "'%" + alan + "%'";
		}
		String ders = info.getQueryParameters().getFirst("ders");
		if ((ders != null) && ders.length() > 0) {

			criteria = criteria + " AND ders ilike " + "'%" + ders + "%'";
		}

		List<OdevOlustur> listOdevOlustur = DBUtil.getOdevOlustur(criteria);

		return listOdevOlustur;

	}

	@GET
	@Path("putodevolustur")
	@Produces("application/xml")
	public String putOdevOlustur(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String odev_adi = info.getQueryParameters().getFirst("odev_adi");
		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String alan = info.getQueryParameters().getFirst("alan");
		String ders = info.getQueryParameters().getFirst("ders");
		String unite = info.getQueryParameters().getFirst("unite");
		String soru_sayisi = info.getQueryParameters().getFirst("soru_sayisi");

		return DBUtil.putOdevOlustur(odev_adi, egitim_turu, alan, ders, unite,
				soru_sayisi);
	}

	@GET
	@Path("getdevapadedibelirle")
	@Produces("application/xml")
	public CevapAdediBelirle getCevapAdediBelirle() {
		// throw new UnsupportedOperationException("Not yet implemented.");

		return DBUtil.getCevapAdediBelirle();
	}

	@GET
	@Path("putcevapadedibelirle")
	@Produces("application/xml")
	public String putCevapAdediBelirleme(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String cevap_sayisi = info.getQueryParameters()
				.getFirst("cevap_sayisi");

		return DBUtil.putCevapAdediBelirle(egitim_turu, cevap_sayisi);
	}

	@GET
	@Path("getodevtakipunite")
	@Produces("application/xml")
	public List<OdevTakipUnite> getOdevTakipUnite(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = " WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		if ((egitim_turu != null) && egitim_turu.length() > 0) {

			criteria = criteria + " AND egitim_turu ilike " + "'%"
					+ egitim_turu + "%'";
		}

		String alan = info.getQueryParameters().getFirst("alan");
		if ((alan != null) && alan.length() > 0) {

			criteria = criteria + " AND alan ilike " + "'%" + alan + "%'";
		}
		String ders = info.getQueryParameters().getFirst("ders");
		if ((ders != null) && ders.length() > 0) {

			criteria = criteria + " AND ders ilike " + "'%" + ders + "%'";
		}
		List<OdevTakipUnite> listOdevTakipUnite = DBUtil
				.getOdevTakipUnite(criteria);

		return listOdevTakipUnite;
	}

	@GET
	@Path("putodevtakipunite")
	@Produces("application/xml")
	public String putOdevTakipUnite(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String alan = info.getQueryParameters().getFirst("alan");
		String ders = info.getQueryParameters().getFirst("ders");
		String unite = info.getQueryParameters().getFirst("unite");

		return DBUtil.putOdevTakipUnite(egitim_turu, alan, ders, unite);
	}

	@GET
	@Path("getatanmisodevler")
	@Produces("application/xml")
	public List<AtanmisOdevler> getAtanmisOdevler(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String baslangic_tarihi = info.getQueryParameters().getFirst(
				"baslangic_tarihi");
		if ((baslangic_tarihi != null) && baslangic_tarihi.length() > 0) {

			criteria = criteria + " AND baslangic_tarihi ilike " + "'%"
					+ baslangic_tarihi + "%'";
		}

		String bitis_tarihi = info.getQueryParameters()
				.getFirst("bitis_tarihi");
		if ((bitis_tarihi != null) && bitis_tarihi.length() > 0) {

			criteria = criteria + " AND bitis_tarihi ilike " + "'%"
					+ bitis_tarihi + "%'";
		}
		List<AtanmisOdevler> listAtanmisOdevler = DBUtil
				.getAtanmisOdevler(criteria);

		return listAtanmisOdevler;
	}

	@GET
	@Path("putatanmisodevler")
	@Produces("application/xml")
	public String putAtanmisOdevler(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String baslangic_tarihi = info.getQueryParameters().getFirst(
				"baslangic_tarihi");
		String bitis_tarihi = info.getQueryParameters()
				.getFirst("bitis_tarihi");

		return DBUtil.putAtanmisOdevler(baslangic_tarihi, bitis_tarihi);
	}

	@GET
	@Path("getsinavtanimlama")
	@Produces("application/xml")
	public List<SinavTanimlama> getSinavTanimlama(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<SinavTanimlama> listSinavTanimlama = DBUtil
				.getSinavTanimlama(criteria);
		return listSinavTanimlama;
	}

	@GET
	@Path("putsinavtanimlama")
	@Produces("application/xml")
	public String putSinavTanimlama(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String sinav_no = info.getQueryParameters().getFirst("sinav_no");
		String sinav_adi = info.getQueryParameters().getFirst("sinav_adi");
		String tarih = info.getQueryParameters().getFirst("tarih");
		String son_kitapcik_no = info.getQueryParameters().getFirst(
				"son_kitapcik_no");
		String sablon_seciniz = info.getQueryParameters().getFirst(
				"sablon_seciniz");

		return DBUtil.putSinavTanimlari(id, sinav_no, sinav_adi, tarih,
				son_kitapcik_no, sablon_seciniz);
	}

	@GET
	@Path("getsablontanimlari")
	@Produces("application/xml")
	public List<SablonTanimlari> getSablonTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String sablon_adi = info.getQueryParameters().getFirst("sablon_adi");
		if ((sablon_adi != null) && sablon_adi.length() > 0) {

			criteria = criteria + " AND sablon_adi ilike " + "'%" + sablon_adi
					+ "%'";
		}
		List<SablonTanimlari> listSablonTanimlari = DBUtil
				.getSablonTanimlari(criteria);

		return listSablonTanimlari;
	}

	@GET
	@Path("putsablontanimlari")
	@Produces("application/xml")
	public String putSablonTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String sablon_adi = info.getQueryParameters().getFirst("sablon_adi");
		String erkek = info.getQueryParameters().getFirst("erkek");
		String kiz = info.getQueryParameters().getFirst("kiz");
		String sayisal = info.getQueryParameters().getFirst("sayisal");
		String sozel = info.getQueryParameters().getFirst("sozel");
		String esit_a = info.getQueryParameters().getFirst("esit_a");
		String dil = info.getQueryParameters().getFirst("dil");
		String alani_yok = info.getQueryParameters().getFirst("alani_yok");
		String alan = info.getQueryParameters().getFirst("alan");
		String deger = info.getQueryParameters().getFirst("deger");
		String lys_1 = info.getQueryParameters().getFirst("lys_1");
		String lys_2 = info.getQueryParameters().getFirst("lys_2");
		String lys_3 = info.getQueryParameters().getFirst("lys_3");
		String lys_4 = info.getQueryParameters().getFirst("lys_4");
		String lys_5 = info.getQueryParameters().getFirst("lys_5");
		String sinav_turu = info.getQueryParameters().getFirst("sinav_turu");

		return DBUtil.putSablonTanimlari(id, sablon_adi, erkek, kiz, sayisal,
				sozel, esit_a, dil, alani_yok, alan, deger, lys_1, lys_2,
				lys_3, lys_4, lys_5, sinav_turu);

	}

	@GET
	@Path("getgelirlervegiderler")
	@Produces("application/xml")
	public List<GelirlerveGiderler> getGelirlerveGiderler() {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		List<GelirlerveGiderler> listGelirlerveGiderler = DBUtil
				.getGelirlerveGiderler();

		return listGelirlerveGiderler;

	}

	@GET
	@Path("putgelirlervegiderler")
	@Produces("application/xml")
	public String putGelirlerveGiderler(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String id = info.getQueryParameters().getFirst("id");
		String islem_tipi = info.getQueryParameters().getFirst("islem_tipi");
		String kategoriler = info.getQueryParameters().getFirst("kategoriler");
		String gelirler = info.getQueryParameters().getFirst("gelirler");
		String odeme_turu = info.getQueryParameters().getFirst("odeme_turu");
		String banka = info.getQueryParameters().getFirst("banka");
		String cek = info.getQueryParameters().getFirst("cek");
		String vade_tarihi = info.getQueryParameters().getFirst("vade_tarihi");
		String miktar = info.getQueryParameters().getFirst("miktar");
		String tarih = info.getQueryParameters().getFirst("tarih");
		String aciklama = info.getQueryParameters().getFirst("aciklama");

		return DBUtil.putGelirlerveGiderler(id, islem_tipi, kategoriler,
				gelirler, odeme_turu, banka, cek, vade_tarihi, miktar, tarih,
				aciklama);
	}

	@GET
	@Path("getgelirgidertanimlari")
	@Produces("application/xml")
	public List<GelirGiderTanimlari> getGelirGiderTanimlari(
			@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<GelirGiderTanimlari> listGelirGiderTanimlari = DBUtil
				.getGelirGiderTanimlari(criteria);
		return listGelirGiderTanimlari;
	}

	@GET
	@Path("putgelirgidertanimlari")
	@Produces("application/xml")
	public String putGelirGiderTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String kategori_adi = info.getQueryParameters()
				.getFirst("kategori_adi");
		String tipi = info.getQueryParameters().getFirst("tipi");
		String gelir_gider_adi = info.getQueryParameters().getFirst(
				"gelir_gider_adi");

		return DBUtil.putGelirGiderTanimlari(id, kategori_adi, tipi,
				gelir_gider_adi);
	}

	@GET
	@Path("getgelirgiderkategorileri")
	@Produces("application/xml")
	public List<GelirGiderKategorileri> getGelirGiderKategorileri(
			@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<GelirGiderKategorileri> listGelirGiderKategorileri = DBUtil
				.getGelirGiderKategorileri(criteria);
		return listGelirGiderKategorileri;
	}

	@GET
	@Path("putgelirgiderkategorileri")
	@Produces("application/xml")
	public String putGelirGiderKategorileri(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String kategori_adi = info.getQueryParameters()
				.getFirst("kategori_adi");

		return DBUtil.putGelirGiderKategorileri(id, kategori_adi);
	}

	@GET
	@Path("getbankaekle")
	@Produces("application/xml")
	public List<BankaEkle> getBankaEkle(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}
		List<BankaEkle> listBankaEkle = DBUtil.getBankaEkle(criteria);
		return listBankaEkle;
	}

	@GET
	@Path("putbankaekle")
	@Produces("application/xml")
	public String putBankaEkle(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String banka_adi = info.getQueryParameters().getFirst("banka_adi");
		String banka_sube = info.getQueryParameters().getFirst("banka_sube");
		String hesap_no = info.getQueryParameters().getFirst("hesap_no");
		String iban_no = info.getQueryParameters().getFirst("iban_no");
		String bankanin_odeme_sekli = info.getQueryParameters().getFirst(
				"bankanin_odeme_sekli");
		String vade_tarihi = info.getQueryParameters().getFirst("vade_tarihi");

		return DBUtil.putBankaEkle(id, banka_adi, banka_sube, hesap_no,
				iban_no, bankanin_odeme_sekli, vade_tarihi);
	}

	// @GET
	// @Path("getdbssinavtanimla")
	// @Produces("application/xml")
	// public List<DBSSinavTanimla> getDBSSinavTanimla(@Context UriInfo info) {
	// // throw new UnsupportedOperationException("Not yet implemented.");
	// String criteria = "WHERE (1 = 1) ";
	//
	// String id = info.getQueryParameters().getFirst("id");
	// if ((id != null) && id.length() > 0) {
	//
	// criteria = criteria + " AND id = '" + id + "'";
	// }
	//
	// List<DBSSinavTanimla> listDBSSinavTanimla = DBUtil
	// .getDBSSinavTanimla(criteria);
	// return listDBSSinavTanimla;
	// }
	//
	// @GET
	// @Path("putdbssinavtanimla")
	// @Produces("application/xml")
	// public String putDBSSinavTanimla(@Context UriInfo info) {
	// // throw new UnsupportedOperationException("Not yet implemented.");
	//
	// String id = info.getQueryParameters().getFirst("id");
	// String okul_durumu = info.getQueryParameters().getFirst("okul_durumu");
	// String alan = info.getQueryParameters().getFirst("alan");
	// String sinav_tarihi = info.getQueryParameters()
	// .getFirst("sinav_tarihi");
	// String kota = info.getQueryParameters().getFirst("kota");
	// String bina_sekli = info.getQueryParameters().getFirst("bina_sekli");
	//
	// return DBUtil.putDBSSinavTanimla(id, okul_durumu, alan, sinav_tarihi,
	// kota, bina_sekli);
	// }

	@GET
	@Path("getogretmentanimlari")
	@Produces("application/xml")
	public List<OgretmenTanimlari> getOgretmenTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<OgretmenTanimlari> listOgretmenTanimlari = DBUtil
				.getOgretmenTanimlari(criteria);
		return listOgretmenTanimlari;
	}

	@GET
	@Path("putogretmentanimlari")
	@Produces("application/xml")
	public String putOgretmenTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String tc_kimlik_no = info.getQueryParameters()
				.getFirst("tc_kimlik_no");
		String adi_soyadi = info.getQueryParameters().getFirst("adi_soyadi");
		String girdigi_ders_bilgisi = info.getQueryParameters().getFirst(
				"girdigi_ders_bilgisi");
		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String brans = info.getQueryParameters().getFirst("brans");
		String girdigi_dersler = info.getQueryParameters().getFirst(
				"girdigi_dersler");
		String ucreti = info.getQueryParameters().getFirst("ucreti");
		String ev_telefonu = info.getQueryParameters().getFirst("ev_telefonu");
		String cep_telefonu = info.getQueryParameters()
				.getFirst("cep_telefonu");
		String cep_telefonu_2 = info.getQueryParameters().getFirst(
				"cep_telefonu_2");
		String email = info.getQueryParameters().getFirst("email");
		String sigorta_gun_sayisi = info.getQueryParameters().getFirst(
				"sigorta_gun_sayisi");
		String ders_programini_gorsun = info.getQueryParameters().getFirst(
				"ders_programini_gorsun");
		String durum = info.getQueryParameters().getFirst("durum");

		return DBUtil.putOgretmenTanimlari(id, tc_kimlik_no, adi_soyadi,
				girdigi_ders_bilgisi, egitim_turu, brans, girdigi_dersler,
				ucreti, ev_telefonu, cep_telefonu, cep_telefonu_2, email,
				sigorta_gun_sayisi, ders_programini_gorsun, durum);
	}

	@GET
	@Path("getsiniftanimlari")
	@Produces("application/xml")
	public List<SinifTanimlari> getSinifTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<SinifTanimlari> listSinifTanimlari = DBUtil
				.getSinifTanimlari(criteria);
		return listSinifTanimlari;
	}

	@GET
	@Path("putsiniftanimlari")
	@Produces("application/xml")
	public String putSinifTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String sinif_adi = info.getQueryParameters().getFirst("sinif_adi");
		String fiziksel_sinif_adi = info.getQueryParameters().getFirst(
				"fiziksel_sinif_adi");
		String kurs_zamani = info.getQueryParameters().getFirst("kurs_zamani");
		String egitim_turu = info.getQueryParameters().getFirst("egitim_turu");
		String alan = info.getQueryParameters().getFirst("alan");
		String danisman_ogretmen = info.getQueryParameters().getFirst(
				"danisman_ogretmen");
		String sinif_kontenjani = info.getQueryParameters().getFirst(
				"sinif_kontenjani");
		String baslangic_numarasi = info.getQueryParameters().getFirst(
				"baslangic_numarasi");
		String bitis_numarasi = info.getQueryParameters().getFirst(
				"bitis_numarasi");
		String ozel_ders_sayisi = info.getQueryParameters().getFirst(
				"ozel_ders_sayisi");
		String fiyati = info.getQueryParameters().getFirst("fiyati");
		String baslangic_tarihi = info.getQueryParameters().getFirst(
				"baslangic_tarihi");
		String bitis_tarihi = info.getQueryParameters()
				.getFirst("bitis_tarihi");

		return DBUtil.putSinifTanimlari(id, sinif_adi, fiziksel_sinif_adi,
				kurs_zamani, egitim_turu, alan, danisman_ogretmen,
				sinif_kontenjani, baslangic_numarasi, bitis_numarasi,
				ozel_ders_sayisi, fiyati, baslangic_tarihi, bitis_tarihi);
	}

	@GET
	@Path("getindirimturu")
	@Produces("application/xml")
	public List<IndirimTuru> getIndirimTuru(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<IndirimTuru> listIndirimTuru = DBUtil.getIndirimTuru(criteria);
		return listIndirimTuru;
	}

	@GET
	@Path("putindirimturu")
	@Produces("application/xml")
	public String putIndirimTuru(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String indirim_turu = info.getQueryParameters()
				.getFirst("indirim_turu");
		String indirim_sekli = info.getQueryParameters().getFirst(
				"indirim_sekli");
		String indirim_miktari = info.getQueryParameters().getFirst(
				"indirim_miktari");

		return DBUtil.putIndirimTuru(id, indirim_turu, indirim_sekli,
				indirim_miktari);

	}

	@GET
	@Path("gethizmettanimla")
	@Produces("application/xml")
	public List<HizmetTanimla> getHizmetTanimla(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<HizmetTanimla> listHizmetTanimla = DBUtil
				.getHizmetTanimla(criteria);

		return listHizmetTanimla;
	}

	@GET
	@Path("puthizmettanimla")
	@Produces("application/xml")
	public String putHizmetTanimla(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String hizmet_adi = info.getQueryParameters().getFirst("hizmet_adi");
		String hizmet_turu = info.getQueryParameters().getFirst("hizmet_turu");
		String birim_fiyati = info.getQueryParameters()
				.getFirst("birim_fiyati");

		return DBUtil.putHizmetTanimla(id, hizmet_adi, hizmet_turu,
				birim_fiyati);

	}

	@GET
	@Path("getreferanslar")
	@Produces("application/xml")
	public List<Referanslar> getReferanslar(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<Referanslar> listReferanslar = DBUtil.getReferanslar(criteria);
		return listReferanslar;
	}

	@GET
	@Path("putreferanslar")
	@Produces("application/xml")
	public String putReferanslar(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String referans_adi_soyadi = info.getQueryParameters().getFirst(
				"referans_adi_soyadi");

		return DBUtil.putReferanslar(id, referans_adi_soyadi);

	}

	@GET
	@Path("getpersoneltanimlari")
	@Produces("application/xml")
	public List<PersonelTanimlari> getPersonelTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<PersonelTanimlari> listPersonelTanimlari = DBUtil
				.getPersonelTanimlari(criteria);
		return listPersonelTanimlari;
	}

	@GET
	@Path("putpersoneltanimlari")
	@Produces("application/xml")
	public String putPersonelTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String adi_soyadi = info.getQueryParameters().getFirst("adi_soyadi");
		String gorevi = info.getQueryParameters().getFirst("gorevi");
		String ise_giris_tarihi = info.getQueryParameters().getFirst(
				"ise_giris_tarihi");
		String ucreti = info.getQueryParameters().getFirst("ucreti");
		String telefonu_1 = info.getQueryParameters().getFirst("telefonu_1");
		String telefonu_2 = info.getQueryParameters().getFirst("telefonu_2");

		return DBUtil.putPersonelTanimlari(id, adi_soyadi, gorevi,
				ise_giris_tarihi, ucreti, telefonu_1, telefonu_2);
	}

	@GET
	@Path("getkurumsalbilgiler")
	@Produces("application/xml")
	public KurumsalBilgiler getKurumsalBilgiler(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		return DBUtil.getKurumsalBilgiler(criteria);
	}

	@GET
	@Path("putkurumsalbilgiler")
	@Produces("application/xml")
	public String putKurumsalBilgiler(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String sube_kisa_adi = info.getQueryParameters().getFirst(
				"sube_kisa_adi");
		String sube_resmi_adi = info.getQueryParameters().getFirst(
				"sube_resmi_adi");
		String sirket_adi = info.getQueryParameters().getFirst("sirket_adi");
		String vergi_dairesi = info.getQueryParameters().getFirst(
				"vergi_dairesi");
		String vergi_no = info.getQueryParameters().getFirst("vergi_no");
		String yonetici_adi = info.getQueryParameters()
				.getFirst("yonetici_adi");
		String yonetici_tel = info.getQueryParameters()
				.getFirst("yonetici_tel");
		String mudur = info.getQueryParameters().getFirst("mudur");
		String mudur_yardimcisi = info.getQueryParameters().getFirst(
				"mudur_yardimcisi");
		String logo = info.getQueryParameters().getFirst("logo");
		String ulke = info.getQueryParameters().getFirst("ulke");
		String il = info.getQueryParameters().getFirst("il");
		String ilce = info.getQueryParameters().getFirst("ilce");
		String semt = info.getQueryParameters().getFirst("semt");
		String mahalle_koy = info.getQueryParameters().getFirst("mahalle_koy");
		String telefon = info.getQueryParameters().getFirst("telefon");
		String faks = info.getQueryParameters().getFirst("faks");
		String email = info.getQueryParameters().getFirst("email");
		String adres = info.getQueryParameters().getFirst("adres");

		return DBUtil.putKurumsalBilgiler(id, sube_kisa_adi, sube_resmi_adi,
				sirket_adi, vergi_dairesi, vergi_no, yonetici_adi,
				yonetici_tel, mudur, mudur_yardimcisi, logo, ulke, il, ilce,
				semt, mahalle_koy, telefon, faks, email, adres);
	}

	@GET
	@Path("getdonemtanimlari")
	@Produces("application/xml")
	public List<DonemTanimlari> getDonemTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<DonemTanimlari> listDonemTanimlari = DBUtil
				.getDonemTanimlari(criteria);
		return listDonemTanimlari;
	}

	@GET
	@Path("putdonemtanimlari")
	@Produces("application/xml")
	public String putDonemTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String donem_adi = info.getQueryParameters().getFirst("donem_adi");
		String baslangic_tarihi = info.getQueryParameters().getFirst(
				"baslangic_tarihi");
		String bitis_tarihi = info.getQueryParameters()
				.getFirst("bitis_tarihi");
		String varsayilan_donem = info.getQueryParameters().getFirst(
				"varsayilan_donem");

		return DBUtil.putDonemTanimlari(id, donem_adi, baslangic_tarihi,
				bitis_tarihi, varsayilan_donem);
	}

	@GET
	@Path("getderstanimlari")
	@Produces("application/xml")
	public List<DersTanimlari> getDersTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<DersTanimlari> listDersTanimlari = DBUtil
				.getDersTanimlari(criteria);
		return listDersTanimlari;
	}

	@GET
	@Path("putderstanimlari")
	@Produces("application/xml")
	public String putDersTanimlari(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");
		String ders_adi = info.getQueryParameters().getFirst("ders_adi");

		return DBUtil.putDersTanimlari(id, egitim_turu_adi, alan_adi, ders_adi);
	}

	@GET
	@Path("getunitetanimlari")
	@Produces("application/xml")
	public List<UniteTanimlari> getUniteTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<UniteTanimlari> listUniteTanimlari = DBUtil
				.getUniteTanimlari(criteria);
		return listUniteTanimlari;
	}

	@GET
	@Path("putunitetanimlari")
	@Produces("application/xml")
	public String putUniteTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");
		String ders_adi = info.getQueryParameters().getFirst("ders_adi");
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");

		return DBUtil.putUniteTanimlari(id, egitim_turu_adi, alan_adi,
				ders_adi, unite_adi);
	}

	@GET
	@Path("getkonutanimlari")
	@Produces("application/xml")
	public List<KonuTanimlari> getKonuTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<KonuTanimlari> listKonuTanimlari = DBUtil
				.getKonuTanimlari(criteria);
		return listKonuTanimlari;
	}

	@GET
	@Path("putkonutanimlari")
	@Produces("application/xml")
	public String putKonuTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");
		String ders_adi = info.getQueryParameters().getFirst("ders_adi");
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");
		String konu_adi = info.getQueryParameters().getFirst("konu_adi");

		return DBUtil.putKonuTanimlari(id, egitim_turu_adi, alan_adi, ders_adi,
				unite_adi, konu_adi);
	}

	@GET
	@Path("getfizikselsiniftanimlari")
	@Produces("application/xml")
	public List<FizikselSinifTanimlari> getFizikselSinifTanimlari(
			@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<FizikselSinifTanimlari> listFizikselSinifTanimlari = DBUtil
				.getFizikselSinifTanimlari(criteria);
		return listFizikselSinifTanimlari;
	}

	@GET
	@Path("putfizikselsiniftanimlari")
	@Produces("application/xml")
	public String putFizikselSinifTanimlari(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String id = info.getQueryParameters().getFirst("id");
		String fiziksel_sinif_adi = info.getQueryParameters().getFirst(
				"fiziksel_sinif_adi");

		return DBUtil.putFizikselSinifTanimlari(id, fiziksel_sinif_adi);
	}

	@GET
	@Path("getkurszamanitanimlama")
	@Produces("application/xml")
	public List<KursZamaniTanimlama> getKursZamaniTanimlama(
			@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<KursZamaniTanimlama> listKursZamaniTanimlama = DBUtil
				.getKursZamaniTanimlama(criteria);
		return listKursZamaniTanimlama;
	}

	@GET
	@Path("putkurszamanitanimlama")
	@Produces("application/xml")
	public String putKursZamaniTanimlama(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String kurs_zamani = info.getQueryParameters().getFirst("kurs_zamani");

		return DBUtil.putKursZamaniTanimlama(id, kurs_zamani);
	}

	@GET
	@Path("getsifredegistirme")
	@Produces("application/xml")
	public SifreDegistirme getSifreDegistirme() {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		return DBUtil.getSifreDegistirme();
	}

	@GET
	@Path("putsifredegistirme")
	@Produces("application/xml")
	public String putSifreDegistirme(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String eski_sifre = info.getQueryParameters().getFirst("eski_sifre");
		String yeni_sifre = info.getQueryParameters().getFirst("yeni_sfire");
		String tekrar_yeni_sifre = info.getQueryParameters().getFirst(
				"tekrar_yeni_sifre");

		return DBUtil.putSifreDegistirme(eski_sifre, yeni_sifre,
				tekrar_yeni_sifre);
	}

	@GET
	@Path("getdestekalmakistiyorum")
	@Produces("application/xml")
	public DestekAlmakIstiyorum getDestekAlmakIstiyorum() {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		return DBUtil.getDestekAlmakIstiyorum();
	}

	@GET
	@Path("putdestekalmakistiyorum")
	@Produces("application/xml")
	public String putDestekAlmakIstiyorum(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String konu = info.getQueryParameters().getFirst("konu");
		String bolum = info.getQueryParameters().getFirst("bolum");
		String mesajiniz = info.getQueryParameters().getFirst("mesajiniz");

		return DBUtil.putDestekAlmakIstiyorum(konu, bolum, mesajiniz);
	}

	@GET
	@Path("getkullanicitanimlama")
	@Produces("application/xml")
	public List<KullaniciTanimlama> getKullaniciTanimlama(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		List<KullaniciTanimlama> listKullaniciTanimlama = DBUtil
				.getKullaniciTanimlama(criteria);
		return listKullaniciTanimlama;
	}

	@GET
	@Path("putkullanicitanimlama")
	@Produces("application/xml")
	public String putKullaniciTanimlama(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String id = info.getQueryParameters().getFirst("id");
		String kullanici_kodu = info.getQueryParameters().getFirst(
				"kullanici_kodu");
		String adi = info.getQueryParameters().getFirst("adi");
		String soyadi = info.getQueryParameters().getFirst("soyadi");
		String sifre = info.getQueryParameters().getFirst("sifre");
		String sifre_tekrar = info.getQueryParameters()
				.getFirst("sifre_tekrar");

		return DBUtil.putKullaniciTanimlama(id, kullanici_kodu, adi, soyadi,
				sifre, sifre_tekrar);
	}

	@GET
	@Path("getil")
	@Produces("application/xml")
	public List<Il> getIl() {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		List<Il> listIl = DBUtil.getIl();
		return listIl;
	}

	@GET
	@Path("putil")
	@Produces("application/xml")
	public String putIl(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String il_id = info.getQueryParameters().getFirst("il_id");
		String il_adi = info.getQueryParameters().getFirst("il_adi");

		return DBUtil.putIl(il_id, il_adi);
	}

	@GET
	@Path("getilce")
	@Produces("application/xml")
	public List<Ilce> getIlce(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String il_id = info.getQueryParameters().getFirst("il_id");
		if ((il_id != null) && il_id.length() > 0) {

			criteria = criteria + " AND il_id = '" + il_id + "'";
		}

		List<Ilce> listIlce = DBUtil.getIlce(criteria);
		return listIlce;
	}

	@GET
	@Path("putilce")
	@Produces("application/xml")
	public String putIlce(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String il_id = info.getQueryParameters().getFirst("il_id");
		String ilce_id = info.getQueryParameters().getFirst("ilce_id");
		String ilce_adi = info.getQueryParameters().getFirst("ilce_adi");

		return DBUtil.putIlce(il_id, ilce_id, ilce_adi);
	}

	@GET
	@Path("getokul")
	@Produces("application/xml")
	public List<Okul> getOkul(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String il_id = info.getQueryParameters().getFirst("il_id");
		if ((il_id != null) && il_id.length() > 0) {

			criteria = criteria + " AND il_id = '" + il_id + "'";
		}

		String ilce_id = info.getQueryParameters().getFirst("ilce_id");
		if ((ilce_id != null) && ilce_id.length() > 0) {

			criteria = criteria + " AND ilce_id = '" + ilce_id + "'";
		}

		String okul_adi = info.getQueryParameters().getFirst("okul_adi");
		if ((okul_adi != null) && okul_adi.length() > 0) {

			criteria = criteria + " AND okul_adi = '" + okul_adi + "'";
		}

		List<Okul> listOkul = DBUtil.getOkul(criteria);
		return listOkul;
	}

	@GET
	@Path("putokul")
	@Produces("application/xml")
	public String putOkul(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String il_id = info.getQueryParameters().getFirst("il_id");
		String ilce_id = info.getQueryParameters().getFirst("ilce_id");
		String okul_id = info.getQueryParameters().getFirst("okul_id");
		String okul_adi = info.getQueryParameters().getFirst("okul_adi");

		return DBUtil.putOkul(il_id, ilce_id, okul_id, okul_adi);
	}

	@GET
	@Path("getpostakodu")
	@Produces("application/xml")
	public List<PostaKodu> getPostaKodu(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");
		String criteria = "WHERE (1 = 1) ";

		String il = info.getQueryParameters().getFirst("il");
		if ((il != null) && il.length() > 0) {

			criteria = criteria + " AND il = '" + il + "'";
		}

		String ilce = info.getQueryParameters().getFirst("ilce");
		if ((ilce != null) && ilce.length() > 0) {

			criteria = criteria + " AND ilce = '" + ilce + "'";
		}

		String semt_bucak_belde = info.getQueryParameters().getFirst(
				"semt_bucak_belde");
		if ((semt_bucak_belde != null) && semt_bucak_belde.length() > 0) {

			criteria = criteria + " AND semt_bucak_belde = '"
					+ semt_bucak_belde + "'";
		}

		String mahalle = info.getQueryParameters().getFirst("mahalle");
		if ((mahalle != null) && mahalle.length() > 0) {

			criteria = criteria + " AND mahalle = '" + mahalle + "'";
		}

		List<PostaKodu> listPostaKodu = DBUtil.getPostaKodu(criteria);

		return listPostaKodu;
	}

	@GET
	@Path("putpostakodu")
	@Produces("application/xml")
	public String putPostaKodu(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String il = info.getQueryParameters().getFirst("il");
		String ilce = info.getQueryParameters().getFirst("ilce");
		String semt_bucak_belde = info.getQueryParameters().getFirst(
				"semt_bucak_belde");
		String mahalle = info.getQueryParameters().getFirst("mahalle");
		String posta_kodu = info.getQueryParameters().getFirst("posta_kodu");

		return DBUtil.putPostaKodu(il, ilce, semt_bucak_belde, mahalle,
				posta_kodu);
	}

	@GET
	@Path("getpostakodumahalle")
	@Produces("application/xml")
	public List<PostaKoduMahalle> getPostaKoduMahalle(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String il = info.getQueryParameters().getFirst("il");
		if ((il != null) && il.length() > 0) {

			criteria = criteria + " AND il = '" + il + "'";
		}

		String ilce = info.getQueryParameters().getFirst("ilce");
		if ((ilce != null) && ilce.length() > 0) {

			criteria = criteria + " AND ilce = '" + ilce + "'";
		}

		String semt_bucak_belde = info.getQueryParameters().getFirst(
				"semt_bucak_belde");
		if ((semt_bucak_belde != null) && semt_bucak_belde.length() > 0) {

			criteria = criteria + " AND semt_bucak_belde = '"
					+ semt_bucak_belde + "'";
		}

		List<PostaKoduMahalle> listPostaKoduMahalle = DBUtil
				.getPostaKoduMahalle(criteria);
		return listPostaKoduMahalle;
	}

	@GET
	@Path("putpostakodumahalle")
	@Produces("application/xml")
	public String putPostaKoduMahalle(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String mahalle = info.getQueryParameters().getFirst("mahalle");
		String posta_kodu = info.getQueryParameters().getFirst("posta_kodu");

		return DBUtil.putPostaKoduMahalle(mahalle, posta_kodu);
	}

	@GET
	@Path("getegitimturu")
	@Produces("application/xml")
	public List<EgitimTuru> getEgitimTuru(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		if ((egitim_turu_adi != null) && egitim_turu_adi.length() > 0) {

			criteria = criteria + " AND egitim_turu_adi = '" + egitim_turu_adi
					+ "'";
		}

		List<EgitimTuru> listEgitimTuru = DBUtil.getEgitimTuru(criteria);

		return listEgitimTuru;
	}

	@GET
	@Path("putegitimturu")
	@Produces("application/xml")
	public String putEgitimTuru(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");

		return DBUtil.putEgitimTuru(egitim_turu_adi);

	}

	@GET
	@Path("getegitimturualan")
	@Produces("application/xml")
	public List<EgitimTuruAlan> getEgitimTuruAlan(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		if ((egitim_turu_adi != null) && egitim_turu_adi.length() > 0) {

			criteria = criteria + " AND egitim_turu_adi = '" + egitim_turu_adi
					+ "'";
		}

		String alan_adi = info.getQueryParameters().getFirst("alan_adi");

		if ((alan_adi != null) && alan_adi.length() > 0) {

			criteria = criteria + " AND alan_adi = '" + alan_adi + "'";
		}

		List<EgitimTuruAlan> listEgitimTuruAlan = DBUtil
				.getEgitimTuruAlan(criteria);

		return listEgitimTuruAlan;
	}

	@GET
	@Path("putegitimturualan")
	@Produces("application/xml")
	public String putEgitimTuruAlan(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");

		return DBUtil.putEgitimTuruAlan(egitim_turu_adi, alan_adi);

	}

	@GET
	@Path("getegitimturuunite")
	@Produces("application/xml")
	public List<EgitimTuruUnite> getEgitimTuruUnite(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		if ((egitim_turu_adi != null) && egitim_turu_adi.length() > 0) {

			criteria = criteria + " AND egitim_turu_adi = '" + egitim_turu_adi
					+ "'";
		}

		String alan_adi = info.getQueryParameters().getFirst("alan_adi");

		if ((alan_adi != null) && alan_adi.length() > 0) {

			criteria = criteria + " AND alan_adi = '" + alan_adi + "'";
		}
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");

		if ((unite_adi != null) && unite_adi.length() > 0) {

			criteria = criteria + " AND unite_adi = '" + unite_adi + "'";
		}

		List<EgitimTuruUnite> listEgitimTuruUnite = DBUtil
				.getEgitimTuruUnite(criteria);

		return listEgitimTuruUnite;
	}

	@GET
	@Path("putegitimturuunite")
	@Produces("application/xml")
	public String putEgitimTuruUnite(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");

		return DBUtil.putEgitimTuruUnite(egitim_turu_adi, alan_adi, unite_adi);
	}

	@GET
	@Path("getegitimturukonu")
	@Produces("application/xml")
	public List<EgitimTuruKonu> getEgitimTuruKonu(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String criteria = "WHERE (1 = 1) ";

		String id = info.getQueryParameters().getFirst("id");
		if ((id != null) && id.length() > 0) {

			criteria = criteria + " AND id = '" + id + "'";
		}

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		if ((egitim_turu_adi != null) && egitim_turu_adi.length() > 0) {

			criteria = criteria + " AND egitim_turu_adi = '" + egitim_turu_adi
					+ "'";
		}

		String alan_adi = info.getQueryParameters().getFirst("alan_adi");

		if ((alan_adi != null) && alan_adi.length() > 0) {

			criteria = criteria + " AND alan_adi = '" + alan_adi + "'";
		}
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");

		if ((unite_adi != null) && unite_adi.length() > 0) {

			criteria = criteria + " AND unite_adi = '" + unite_adi + "'";
		}
		String konu_adi = info.getQueryParameters().getFirst("konu_adi");

		if ((unite_adi != null) && konu_adi.length() > 0) {

			criteria = criteria + " AND konu_adi = '" + konu_adi + "'";
		}

		List<EgitimTuruKonu> listEgitimTuruKonu = DBUtil
				.getEgitimTuruKonu(criteria);

		return listEgitimTuruKonu;
	}

	@GET
	@Path("putegitimturukonu")
	@Produces("application/xml")
	public String putEgitimTuruKonu(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String egitim_turu_adi = info.getQueryParameters().getFirst(
				"egitim_turu_adi");
		String alan_adi = info.getQueryParameters().getFirst("alan_adi");
		String unite_adi = info.getQueryParameters().getFirst("unite_adi");
		String konu_adi = info.getQueryParameters().getFirst("konu_adi");

		return DBUtil.putEgitimTuruKonu(egitim_turu_adi, alan_adi, unite_adi,
				konu_adi);
	}

	@POST
	@Path("add")
	@Produces("application/xml")
	@Consumes("application/xml")
	public Register addRegister(Register register) {

		String userName = register.getUser_name();
		String userPass = register.getUser_pass();
		String companyPersonName = register.getCompany_person_name();
		String phone1 = register.getPhone1();
		String phone2 = register.getPhone2();
		String district = register.getDistrict();
		String city = register.getCity();
		String state = register.getState();
		String stateNumberCode = register.getState_number_code();
		String country = register.getCountry();
		String address1 = register.getAddress1();
		String address2 = register.getAddress2();
		String zipcode = register.getZipcode();
		String macID = register.getMac_id();
		String wanIP = register.getWan_ip();
		String lanIP = register.getLan_ip();
		String installType = register.getInstall_type();
		String soldDate = register.getSold_date();
		String installDate = register.getInstall_date();
		String billNo = register.getBill_no();
		String licenceClientCount = register.getLicence_client_count();
		String licenceGuiCount = register.getLicence_gui_count();
		String diskSerialID = register.getDisk_serial_id();
		String saleType = register.getSale_type();
		String licenceClientDays = register.getLicence_client_days();
		String licenceGuiDays = register.getLicence_gui_days();

		DBUtil.insertRegisteredUsers(userName, userPass, companyPersonName,
				phone1, phone2, district, city, state, stateNumberCode,
				country, address1, address2, zipcode, macID, wanIP, lanIP,
				installType, soldDate, installDate, billNo, licenceClientCount,
				licenceGuiCount, diskSerialID, saleType, licenceClientDays,
				licenceGuiDays);

		return register;

		// throw new
		// UnsupportedOperationException("Not yet implemented.");
	}

	@GET
	@Path("addwithurl")
	@Produces("text/plain")
	public String addRegisterWithUrl(@Context UriInfo info) {

		String userName = info.getQueryParameters().getFirst("user_name");
		String userPass = info.getQueryParameters().getFirst("user_pass");
		String companyPersonName = info.getQueryParameters().getFirst(
				"company_person_name");
		String phone1 = info.getQueryParameters().getFirst("phone1");
		String phone2 = info.getQueryParameters().getFirst("phone2");

		String district = info.getQueryParameters().getFirst("district");
		String city = info.getQueryParameters().getFirst("city");
		String state = info.getQueryParameters().getFirst("state");
		String stateNumberCode = info.getQueryParameters().getFirst(
				"state_number_code");
		String country = info.getQueryParameters().getFirst("country");
		String address1 = info.getQueryParameters().getFirst("address1");
		String address2 = info.getQueryParameters().getFirst("address2");
		String zipcode = info.getQueryParameters().getFirst("zipcode");
		String macID = info.getQueryParameters().getFirst("mac_id");

		// THIS PART SPECIAL

		// System.out.println("Client IP = " + hsr.getRemoteAddr());

		String wanIP = "123"; // hsr.getRemoteAddr();

		String lanIP = info.getQueryParameters().getFirst("lan_ip");
		String installType = info.getQueryParameters().getFirst("install_type");
		String soldDate = info.getQueryParameters().getFirst("sold_date");
		String installDate = info.getQueryParameters().getFirst("install_date");
		String billNo = info.getQueryParameters().getFirst("bill_no");
		String licenseClientCount = info.getQueryParameters().getFirst(
				"license_client_count");
		String licenseGuiCount = info.getQueryParameters().getFirst(
				"license_gui_count");
		String diskSerialID = info.getQueryParameters().getFirst(
				"disk_serial_id");
		String saleType = info.getQueryParameters().getFirst("sale_type");
		String licenseClientDays = info.getQueryParameters().getFirst(
				"license_client_days");
		String licenseGuiDays = info.getQueryParameters().getFirst(
				"license_gui_days");

		return DBUtil.insertRegisteredUsers(userName, userPass,
				companyPersonName, phone1, phone2, district, city, state,
				stateNumberCode, country, address1, address2, zipcode, macID,
				wanIP, lanIP, installType, soldDate, installDate, billNo,
				licenseClientCount, licenseGuiCount, diskSerialID, saleType,
				licenseClientDays, licenseGuiDays);

		// throw new
		// UnsupportedOperationException("Not yet implemented.");
	}

	@GET
	@Path("checkreg")
	@Produces("application/xml")
	public String checkReg(@Context UriInfo info) {

		// String result = "NOT_REGISTERED";
		//
		// if () {
		//
		// result = "REGISTERED";
		// }

		String diskID = info.getQueryParameters().getFirst("did");
		String regID = info.getQueryParameters().getFirst("regid");

		System.err.println("NEW COMER: " + diskID + " --- " + diskID);
		return DBUtil.getRegType(diskID, regID);

	}

	@POST
	@Path("systeminfo")
	@Produces("text/plain")
	public String getSystemInfo(@Context UriInfo info) {

		String result = "";

		String clientID = info.getQueryParameters().getFirst("client_id");
		String systemInfo = info.getQueryParameters().getFirst("system_info");

		result = result + clientID + "  " + systemInfo;

		DBUtil.insertSystemInfo(clientID, systemInfo);

		return result;
	}

	// GET REGISTER INFO AND SERVE AS XML
	@GET
	@Path("getregistereduserinfo")
	@Produces("text/plain")
	public String getRegisteredUserInfo(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String diskid = info.getQueryParameters().getFirst("did");

		String query = "SELECT  *  FROM  registered_users  WHERE disk_serial_id = ''%1'' "
				.replace("%1", diskid);

		return DBUtil.exportQueryToXml(query);
	}

	@GET
	@Path("getregistereduserinfofromregid")
	@Produces("text/plain")
	public String getRegisteredUserInfoFromRegID(@Context UriInfo info) {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		String diskid = info.getQueryParameters().getFirst("regid");

		String query = "SELECT  *  FROM  registered_users  WHERE reg_id = ''%1'' "
				.replace("%1", diskid);

		return DBUtil.exportQueryToXml(query);
	}

	@GET
	@Path("getdatetime")
	@Produces("text/plain")
	public String getRegisteredUserInfoFromRegID() {
		// throw new
		// UnsupportedOperationException("Not yet implemented.");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	@GET
	@Path("getreachperiod")
	// @Produces("text/plain")
	@Produces("application/xml")
	public String getReachPeriod() {

		// TODO Later read from database
		return "180";
	}

}
