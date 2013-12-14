package com.icarusdb.portal.courses.ws;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtil {

	public static Connection _con;

	// DBS KAYIT
	// GET
	public static List<DBSKayit> getDBSKayit(String criteria) {

		List<DBSKayit> listDBSKayit = new ArrayList<DBSKayit>();

		getConnection();

		String strSQL = "SELECT * FROM dbs_kayit ";

		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				DBSKayit DBSKayit = new DBSKayit();

				DBSKayit.setId(restTemp.getString("id"));
				DBSKayit.setAdi(restTemp.getString("adi"));
				DBSKayit.setSoyadi(restTemp.getString("soyadi"));
				DBSKayit.setTc_kimlik_no(restTemp.getString("tc_kimlik_no"));
				DBSKayit.setCinsiyet(restTemp.getString("cinsiyet"));
				DBSKayit.setMedeni_hali(restTemp.getString("medeni_hali"));
				DBSKayit.setDogum_tarihi(restTemp.getString("dogum_tarihi"));
				DBSKayit.setEv_telefonu(restTemp.getString("ev_telefonu"));
				DBSKayit.setCep_telefonu(restTemp.getString("cep_telefonu"));
				DBSKayit.setEmail(restTemp.getString("email"));
				DBSKayit.setOgrenci_bilgileri_ulke(restTemp
						.getString("ogrenci_bilgileri_ulke"));
				DBSKayit.setOgrenci_bilgileri_il(restTemp
						.getString("ogrenci_bilgileri_il"));
				DBSKayit.setOgrenci_bilgileri_ilce(restTemp
						.getString("ogrenci_bilgileri_ilce"));
				DBSKayit.setOkul(restTemp.getString("okul"));
				DBSKayit.setSinif(restTemp.getString("sinif"));
				DBSKayit.setSeri_no(restTemp.getString("seri_no"));
				DBSKayit.setCuzdan_no(restTemp.getString("cuzdan_no"));
				DBSKayit.setOgrenci_kimlik_bilgileri_ulke(restTemp
						.getString("ogrenci_kimlik_bilgileri_ulke"));
				DBSKayit.setOgrenci_kimlik_bilgileri_il(restTemp
						.getString("ogrenci_kimlik_bilgileri_il"));
				DBSKayit.setOgrenci_kimlik_bilgileri_ilce(restTemp
						.getString("ogrenci_kimlik_bilgileri_ilce"));
				DBSKayit.setMahalle_koy(restTemp.getString("mahalle_koy"));
				DBSKayit.setCilt_no(restTemp.getString("cilt_no"));
				DBSKayit.setAile_sira_no(restTemp.getString("aile_sira_no"));
				DBSKayit.setSira_no(restTemp.getString("sira_no"));
				DBSKayit.setVerildigi_yer(restTemp.getString("verildigi_yer"));
				DBSKayit.setVerilis_nedeni(restTemp.getString("verilis_nedeni"));
				DBSKayit.setKayit_no(restTemp.getString("kayit_no"));
				DBSKayit.setVerilis_tarihi(restTemp.getString("verilis_tarihi"));
				DBSKayit.setAdres_bilgileri_ulke(restTemp
						.getString("adres_bilgileri_ulke"));
				DBSKayit.setAdres_bilgileri_il(restTemp
						.getString("adres_bilgileri_il"));
				DBSKayit.setAdres_bilgileri_ilce(restTemp
						.getString("adres_bilgileri_ilce"));
				DBSKayit.setSemt(restTemp.getString("semt"));
				DBSKayit.setMahalle(restTemp.getString("mahalle"));
				DBSKayit.setSokak_ve_no(restTemp.getString("Sokak_ve_no"));
				DBSKayit.setOkul_durumu(restTemp.getString("okul_durumu"));
				DBSKayit.setAlan_bilgisi(restTemp.getString("alan_bilgisi"));
				DBSKayit.setSinav_tarihi(restTemp.getString("sinav_tarihi"));

				listDBSKayit.add(DBSKayit);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getdbskayit Error: " + e.getMessage());

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				System.err.println("getdbskayit Error: " + e1.getMessage());

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listDBSKayit;

	}

	// INSERT
	public static String putDBSKayit(String id, String adi, String soyadi,
			String tc_kimlik_no, String cinsiyet, String medeni_hali,
			String dogum_tarihi, String ev_telefonu, String cep_telefonu,
			String email, String ogrenci_bilgileri_ulke,
			String ogrenci_bilgileri_il, String ogrenci_bilgileri_ilce,
			String okul, String sinif, String seri_no, String cuzdan_no,
			String ogrenci_kimlik_bilgileri_ulke,
			String ogrenci_kimlik_bilgileri_il,
			String ogrenci_kimlik_bilgileri_ilce, String mahalle_koy,
			String cilt_no, String aile_sira_no, String sira_no,
			String verildigi_yer, String verilis_nedeni, String kayit_no,
			String verilis_tarihi, String adres_bilgileri_ulke,
			String adres_bilgileri_il, String adres_bilgileri_ilce,
			String semt, String mahalle, String sokak_ve_no,
			String okul_durumu, String alan_bilgisi, String sinav_tarihi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		// System.out.println("dbs put id: " + id);
		String strSQL = "";

		if ((id == null)) {

			strSQL = "INSERT INTO dbs_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,sinif,seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no,okul_durumu,alan_bilgisi,sinav_tarihi)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO dbs_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,sinif,seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no,okul_durumu,alan_bilgisi,sinav_tarihi)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO dbs_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,sinif,seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no,okul_durumu,alan_bilgisi,sinav_tarihi)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE dbs_kayit SET adi = ?, soyadi = ?, tc_kimlik_no = ?, cinsiyet = ?, medeni_hali = ?, dogum_tarihi = ?::date, ev_telefonu = ? , cep_telefonu = ? ,	email = ? , ogrenci_bilgileri_ulke = ? ,ogrenci_bilgileri_il = ?, ogrenci_bilgileri_ilce = ?, okul = ?, sinif = ?, seri_no = ? ,cuzdan_no = ? ,	ogrenci_kimlik_bilgileri_ulke = ? ,ogrenci_kimlik_bilgileri_il = ? ,ogrenci_kimlik_bilgileri_ilce = ? ,mahalle_koy = ? ,cilt_no = ? ,aile_sira_no = ? ,sira_no = ? ,verildigi_yer = ? ,verilis_nedeni = ? ,kayit_no = ? ,verilis_tarihi = ?::date ,adres_bilgileri_ulke = ? ,adres_bilgileri_il = ? , adres_bilgileri_ilce = ? ,semt = ? ,mahalle = ? , sokak_ve_no = ? ,okul_durumu = ? ,alan_bilgisi = ? ,sinav_tarihi = ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		System.out.println("SQLLLL: " + strSQL);

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(adi);
		lstValues.add(soyadi);
		lstValues.add(tc_kimlik_no);
		lstValues.add(cinsiyet);
		lstValues.add(medeni_hali);
		lstValues.add(dogum_tarihi);
		lstValues.add(ev_telefonu);
		lstValues.add(cep_telefonu);
		lstValues.add(email);
		lstValues.add(ogrenci_bilgileri_ulke);
		lstValues.add(ogrenci_bilgileri_il);
		lstValues.add(ogrenci_bilgileri_ilce);
		lstValues.add(okul);
		lstValues.add(sinif);
		lstValues.add(seri_no);
		lstValues.add(cuzdan_no);
		lstValues.add(ogrenci_kimlik_bilgileri_ulke);
		lstValues.add(ogrenci_kimlik_bilgileri_il);
		lstValues.add(ogrenci_kimlik_bilgileri_ilce);
		lstValues.add(mahalle_koy);
		lstValues.add(cilt_no);
		lstValues.add(aile_sira_no);
		lstValues.add(sira_no);
		lstValues.add(verildigi_yer);
		lstValues.add(verilis_nedeni);
		lstValues.add(kayit_no);
		lstValues.add(verilis_tarihi);
		lstValues.add(adres_bilgileri_ulke);
		lstValues.add(adres_bilgileri_il);
		lstValues.add(adres_bilgileri_ilce);
		lstValues.add(semt);
		lstValues.add(mahalle);
		lstValues.add(sokak_ve_no);
		lstValues.add(okul_durumu);
		lstValues.add(alan_bilgisi);
		lstValues.add(sinav_tarihi);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);
			result = "OK";

		} else {
			result = "ERROR";
		}

		return result;

	}

	// ÖN KAYIT
	// GET
	public static List<OnKayit> getOnKayit(String criteria) {

		List<OnKayit> listOnKayit = new ArrayList<OnKayit>();

		getConnection();

		String strSQL = "SELECT * FROM on_kayit ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL222222222222222: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				OnKayit onKayit = new OnKayit();
				onKayit.setId(restTemp.getString("id"));
				onKayit.setAdi(restTemp.getString("adi"));
				onKayit.setSoyadi(restTemp.getString("soyadi"));
				onKayit.setTc_kimlik_no(restTemp.getString("tc_kimlik_no"));
				onKayit.setCinsiyet(restTemp.getString("cinsiyet"));
				onKayit.setMedeni_hali(restTemp.getString("medeni_hali"));
				onKayit.setDogum_tarihi(restTemp.getString("dogum_tarihi"));
				onKayit.setEv_telefonu(restTemp.getString("ev_telefonu"));
				onKayit.setCep_telefonu(restTemp.getString("cep_telefonu"));
				onKayit.setEmail(restTemp.getString("email"));
				onKayit.setOgrenci_bilgileri_ulke(restTemp
						.getString("ogrenci_bilgileri_ulke"));
				onKayit.setOgrenci_bilgileri_il(restTemp
						.getString("ogrenci_bilgileri_il"));
				onKayit.setOgrenci_bilgileri_ilce(restTemp
						.getString("ogrenci_bilgileri_ilce"));
				onKayit.setOkul(restTemp.getString("okul"));
				onKayit.setOgrenci_bilgileri_sinif(restTemp
						.getString("ogrenci_bilgileri_sinif"));
				onKayit.setEgitim_turu(restTemp.getString("egitim_turu"));
				onKayit.setAlan(restTemp.getString("alan"));
				onKayit.setKurs_zamani(restTemp.getString("kurs_zamani"));
				onKayit.setGorusme_sinif(restTemp.getString("gorusme_sinif"));
				onKayit.setKurs_indirim_fiyati(restTemp
						.getString("kurs_indirim_fiyati"));
				onKayit.setIndirim_turu(restTemp.getString("indirim_turu"));
				onKayit.setIndirim_miktari(restTemp
						.getString("indirim_miktari"));
				onKayit.setReferans(restTemp.getString("referans"));
				onKayit.setGorusme_tarihi(restTemp.getString("gorusme_tarihi"));
				onKayit.setGorusme_tipi(restTemp.getString("gorusme_tipi"));
				onKayit.setGorusme_sonucu(restTemp.getString("gorusme_sonucu"));
				onKayit.setGorusme_yuzdesi(restTemp
						.getString("gorusme_yuzdesi"));
				onKayit.setAciklama(restTemp.getString("aciklama"));
				onKayit.setSeri_no(restTemp.getString("seri_no"));
				onKayit.setCuzdan_no(restTemp.getString("cuzdan_no"));
				onKayit.setOgrenci_kimlik_bilgileri_ulke(restTemp
						.getString("ogrenci_kimlik_bilgileri_ulke"));
				onKayit.setOgrenci_kimlik_bilgileri_il(restTemp
						.getString("ogrenci_kimlik_bilgileri_il"));
				onKayit.setOgrenci_kimlik_bilgileri_ilce(restTemp
						.getString("ogrenci_kimlik_bilgileri_ilce"));
				onKayit.setMahalle_koy(restTemp.getString("mahalle_koy"));
				onKayit.setCilt_no(restTemp.getString("cilt_no"));
				onKayit.setAile_sira_no(restTemp.getString("aile_sira_no"));
				onKayit.setSira_no(restTemp.getString("sira_no"));
				onKayit.setVerildigi_yer(restTemp.getString("verildigi_yer"));
				onKayit.setVerilis_nedeni(restTemp.getString("verilis_nedeni"));
				onKayit.setKayit_no(restTemp.getString("kayit_no"));
				onKayit.setVerilis_tarihi(restTemp.getString("verilis_tarihi"));
				onKayit.setAdres_bilgileri_ulke(restTemp
						.getString("adres_bilgileri_ulke"));
				onKayit.setAdres_bilgileri_il(restTemp
						.getString("adres_bilgileri_il"));
				onKayit.setAdres_bilgileri_ilce(restTemp
						.getString("adres_bilgileri_ilce"));
				onKayit.setSemt(restTemp.getString("semt"));
				onKayit.setMahalle(restTemp.getString("mahalle"));
				onKayit.setSokak_ve_no(restTemp.getString("sokak_ve_no"));

				listOnKayit.add(onKayit);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getOnKayit Error: " + e.getMessage());

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				System.err.println("getOnKayit Error: " + e1.getMessage());

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		// System.out.print("COUNT: " + listOnKayit.size());

		return listOnKayit;

	}

	// INSERT
	public static String putOnKayit(String id, String adi, String soyadi,
			String tc_kimlik_no, String cinsiyet, String medeni_hali,
			String dogum_tarihi, String ev_telefonu, String cep_telefonu,
			String email, String ogrenci_bilgileri_ulke,
			String ogrenci_bilgileri_il, String ogrenci_bilgileri_ilce,
			String okul, String ogrenci_bilgileri_sinif, String egitim_turu,
			String alan, String kurs_zamani, String gorusme_sinif,
			String kurs_indirim_fiyati, String indirim_turu,
			String indirim_miktari, String referans, String gorusme_tarihi,
			String gorusme_tipi, String gorusme_sonucu, String gorusme_yuzdesi,
			String aciklama, String seri_no, String cuzdan_no,
			String ogrenci_kimlik_bilgileri_ulke,
			String ogrenci_kimlik_bilgileri_il,
			String ogrenci_kimlik_bilgileri_ilce, String mahalle_koy,
			String cilt_no, String aile_sira_no, String sira_no,
			String verildigi_yer, String verilis_nedeni, String kayit_no,
			String verilis_tarihi, String adres_bilgileri_ulke,
			String adres_bilgileri_il, String adres_bilgileri_ilce,
			String semt, String mahalle, String sokak_ve_no) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO on_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,ogrenci_bilgileri_sinif,egitim_turu,alan,"
					+ "kurs_zamani,gorusme_sinif,kurs_indirim_fiyati, indirim_turu, indirim_miktari,referans, gorusme_tarihi,gorusme_tipi,  gorusme_sonucu , gorusme_yuzdesi,aciklama  , seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO on_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,ogrenci_bilgileri_sinif,egitim_turu,alan,"
					+ "kurs_zamani,gorusme_sinif,kurs_indirim_fiyati, indirim_turu, indirim_miktari,referans, gorusme_tarihi,gorusme_tipi,  gorusme_sonucu , gorusme_yuzdesi,aciklama  , seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO on_kayit(adi,soyadi,tc_kimlik_no,cinsiyet,medeni_hali,dogum_tarihi,ev_telefonu,cep_telefonu,email, ogrenci_bilgileri_ulke , ogrenci_bilgileri_il , ogrenci_bilgileri_ilce ,okul ,ogrenci_bilgileri_sinif,egitim_turu,alan,"
					+ "kurs_zamani,gorusme_sinif,kurs_indirim_fiyati, indirim_turu, indirim_miktari,referans, gorusme_tarihi,gorusme_tipi,  gorusme_sonucu , gorusme_yuzdesi,aciklama  , seri_no,cuzdan_no,ogrenci_kimlik_bilgileri_ulke,ogrenci_kimlik_bilgileri_il,ogrenci_kimlik_bilgileri_ilce,mahalle_koy,cilt_no,aile_sira_no,sira_no,verildigi_yer,verilis_nedeni,kayit_no,verilis_tarihi,adres_bilgileri_ulke,adres_bilgileri_il, adres_bilgileri_ilce,semt,mahalle,sokak_ve_no)  VALUES (?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?::date,?,?,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE on_kayit SET adi = ?,soyadi = ?,tc_kimlik_no = ? ,cinsiyet = ? ,medeni_hali = ? ,dogum_tarihi = ?::date ,ev_telefonu = ? ,cep_telefonu = ? ,email = ? , ogrenci_bilgileri_ulke  = ? , ogrenci_bilgileri_il  = ? , ogrenci_bilgileri_ilce  = ? ,okul  = ? ,ogrenci_bilgileri_sinif = ? ,egitim_turu = ? ,alan = ? ,"
					+ "kurs_zamani = ? ,gorusme_sinif = ? ,kurs_indirim_fiyati = ? , indirim_turu = ? , indirim_miktari = ? ,referans = ? , gorusme_tarihi = ?::date ,gorusme_tipi = ? ,  gorusme_sonucu  = ? , gorusme_yuzdesi = ? ,aciklama   = ? , seri_no = ? ,cuzdan_no = ? ,ogrenci_kimlik_bilgileri_ulke = ? ,ogrenci_kimlik_bilgileri_il = ? ,ogrenci_kimlik_bilgileri_ilce = ? ,mahalle_koy = ? ,cilt_no = ? ,aile_sira_no = ? ,sira_no = ? ,verildigi_yer = ? ,verilis_nedeni = ? ,kayit_no = ? ,verilis_tarihi = ?::date ,adres_bilgileri_ulke = ? ,adres_bilgileri_il = ? , adres_bilgileri_ilce = ? ,semt = ? ,mahalle = ? ,sokak_ve_no = ?  WHERE id = ?::bigint ";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();
		lstValues.add(adi);
		lstValues.add(soyadi);
		lstValues.add(tc_kimlik_no);
		lstValues.add(cinsiyet);
		lstValues.add(medeni_hali);
		lstValues.add(dogum_tarihi);
		lstValues.add(ev_telefonu);
		lstValues.add(cep_telefonu);
		lstValues.add(email);
		lstValues.add(ogrenci_bilgileri_ulke);
		lstValues.add(ogrenci_bilgileri_il);
		lstValues.add(ogrenci_bilgileri_ilce);
		lstValues.add(okul);
		lstValues.add(ogrenci_bilgileri_sinif);
		lstValues.add(egitim_turu);
		lstValues.add(alan);
		lstValues.add(kurs_zamani);
		lstValues.add(gorusme_sinif);
		lstValues.add(kurs_indirim_fiyati);
		lstValues.add(indirim_turu);
		lstValues.add(indirim_miktari);
		lstValues.add(referans);
		lstValues.add(gorusme_tarihi);
		lstValues.add(gorusme_tipi);
		lstValues.add(gorusme_sonucu);
		lstValues.add(gorusme_yuzdesi);
		lstValues.add(aciklama);
		lstValues.add(seri_no);
		lstValues.add(cuzdan_no);
		lstValues.add(ogrenci_kimlik_bilgileri_ulke);
		lstValues.add(ogrenci_kimlik_bilgileri_il);
		lstValues.add(ogrenci_kimlik_bilgileri_ilce);
		lstValues.add(mahalle_koy);
		lstValues.add(cilt_no);
		lstValues.add(aile_sira_no);
		lstValues.add(sira_no);
		lstValues.add(verildigi_yer);
		lstValues.add(verilis_nedeni);
		lstValues.add(kayit_no);
		lstValues.add(verilis_tarihi);
		lstValues.add(adres_bilgileri_ulke);
		lstValues.add(adres_bilgileri_il);
		lstValues.add(adres_bilgileri_ilce);
		lstValues.add(semt);
		lstValues.add(mahalle);
		lstValues.add(sokak_ve_no);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// VELİLER
	// GET
	public static List<Veliler> getVeliler(String criteria) {

		List<Veliler> listVeliler = new ArrayList<Veliler>();

		getConnection();

		String strSQL = "SELECT * FROM veliler ";

		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				Veliler Veliler = new Veliler();

				Veliler.setId(restTemp.getString("id"));
				Veliler.setVeli_bilgileri_adi(restTemp
						.getString("veli_bilgileri_adi"));
				Veliler.setVeli_bilgileri_soyadi(restTemp
						.getString("veli_bilgileri_soyadi"));
				Veliler.setVeli_bilgileri_tc_kimlik_no(restTemp
						.getString("veli_bilgileri_tc_kimlik_no"));
				Veliler.setYakinlik_durumu(restTemp
						.getString("yakinlik_durumu"));
				Veliler.setOdeme_sorumlusu(restTemp
						.getString("odeme_sorumlusu"));
				Veliler.setCep_tel(restTemp.getString("cep_tel"));
				Veliler.setEv_tel(restTemp.getString("ev_tel"));
				Veliler.setIs_tel(restTemp.getString("is_tel"));
				Veliler.setE_mail(restTemp.getString("e_mail"));
				Veliler.setFirma(restTemp.getString("firma"));
				Veliler.setSektor(restTemp.getString("sektor"));
				Veliler.setUnvani(restTemp.getString("unvani"));
				Veliler.setGorevi(restTemp.getString("gorevi"));
				Veliler.setVeli_bilgileri_adres(restTemp
						.getString("veli_bilgileri_adres"));
				Veliler.setOgrenci_tc_kimlik_no(restTemp
						.getString("ogrenci_tc_kimlik_no"));

				listVeliler.add(Veliler);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getveliler Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getveliler Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listVeliler;

	}

	// INSERT
	public static String putVeliler(String id, String veli_bilgileri_adi,
			String veli_bilgileri_soyadi, String veli_bilgileri_tc_kimlik_no,
			String yakinlik_durumu, String odeme_sorumlusu, String cep_tel,
			String ev_tel, String is_tel, String e_mail, String firma,
			String sektor, String unvani, String gorevi,
			String veli_bilgileri_adres, String ogrenci_tc_kimlik_no) {

		String result = "";
		boolean isInsert = true;

		getConnection();
		String strSQL = "";
		// String strSQL =
		// "INSERT INTO veliler(veli_bilgileri_adi,veli_bilgileri_soyadi,veli_bilgileri_tc_kimlik_no,yakinlik_durumu,odeme_sorumlusu,cep_tel,ev_tel,is_tel,e_mail,firma,sektor,unvani,gorevi,veli_bilgileri_adres,ogrenci_tc_kimlik_no)  VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";

		if (id == null) {

			strSQL = "INSERT INTO veliler(veli_bilgileri_adi,veli_bilgileri_soyadi,veli_bilgileri_tc_kimlik_no,yakinlik_durumu,odeme_sorumlusu,cep_tel,ev_tel,is_tel,e_mail,firma,sektor,unvani,gorevi,veli_bilgileri_adres,ogrenci_tc_kimlik_no)  VALUES (?,?,?,?,?::boolean,?,?,?,?,?,?,?,?,?,?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO veliler(veli_bilgileri_adi,veli_bilgileri_soyadi,veli_bilgileri_tc_kimlik_no,yakinlik_durumu,odeme_sorumlusu,cep_tel,ev_tel,is_tel,e_mail,firma,sektor,unvani,gorevi,veli_bilgileri_adres,ogrenci_tc_kimlik_no)  VALUES (?,?,?,?,?::boolean,?,?,?,?,?,?,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO veliler(veli_bilgileri_adi,veli_bilgileri_soyadi,veli_bilgileri_tc_kimlik_no,yakinlik_durumu,odeme_sorumlusu,cep_tel,ev_tel,is_tel,e_mail,firma,sektor,unvani,gorevi,veli_bilgileri_adres,ogrenci_tc_kimlik_no)  VALUES (?,?,?,?,?::boolean,?,?,?,?,?,?,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE veliler SET veli_bilgileri_adi=?,veli_bilgileri_soyadi= ?,veli_bilgileri_tc_kimlik_no= ?,yakinlik_durumu= ?,odeme_sorumlusu = ?::boolean,cep_tel= ?,ev_tel= ?,is_tel = ?,e_mail = ?,firma = ?,sektor= ?,unvani= ?,gorevi= ?,veli_bilgileri_adres= ?,ogrenci_tc_kimlik_no= ?  WHERE id = ?::bigint ";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(veli_bilgileri_adi);
		lstValues.add(veli_bilgileri_soyadi);
		lstValues.add(veli_bilgileri_tc_kimlik_no);
		lstValues.add(yakinlik_durumu);
		lstValues.add(odeme_sorumlusu);
		lstValues.add(cep_tel);
		lstValues.add(ev_tel);
		lstValues.add(is_tel);
		lstValues.add(e_mail);
		lstValues.add(firma);
		lstValues.add(sektor);
		lstValues.add(unvani);
		lstValues.add(gorevi);
		lstValues.add(veli_bilgileri_adres);
		lstValues.add(ogrenci_tc_kimlik_no);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// Ödemeler
	// GET
	public static List<Odemeler> getOdemeler(String criteria) {

		List<Odemeler> listOdemeler = new ArrayList<Odemeler>();

		getConnection();

		String strSQL = "SELECT * FROM odemeler ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				Odemeler Odemeler = new Odemeler();

				Odemeler.setId(restTemp.getString("id"));
				Odemeler.setIndirimli_tutar(restTemp
						.getString("indirimli_tutar"));
				Odemeler.setHizmetlerin_toplami(restTemp
						.getString("hizmetlerin_toplami"));
				Odemeler.setToplam_tutar(restTemp.getString("toplam_tutar"));
				Odemeler.setPesinat_odeme_turu(restTemp
						.getString("pesinat_odeme_turu"));
				Odemeler.setAciklama(restTemp.getString("aciklama"));
				Odemeler.setPesinatin_yatacagi_banka(restTemp
						.getString("pesinatin_yatacagi_banka"));
				Odemeler.setPesinat_miktari(restTemp
						.getString("pesinat_miktari"));
				Odemeler.setTaksitlerin_toplami(restTemp
						.getString("taksitlerin_toplami"));
				Odemeler.setSozlesme_disi_kalan(restTemp
						.getString("sozlesme_disi_kalan"));
				Odemeler.setTaksitin_odeme_turu(restTemp
						.getString("taksitin_odeme_turu"));
				Odemeler.setTaksit_aciklama(restTemp
						.getString("taksit_aciklama"));
				Odemeler.setTaksitin_yatacagi_banka(restTemp
						.getString("taksitin_yatacagi_banka"));
				Odemeler.setTaksit_sayisi(restTemp.getString("taksit_sayisi"));
				Odemeler.setTakside_baslanacak_gun(restTemp
						.getString("takside_baslanacak_gun"));

				listOdemeler.add(Odemeler);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getodemeler Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getodemeler Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listOdemeler;

	}

	// INSERT
	public static String putOdemeler(String id, String indirimli_tutar,
			String hizmetlerin_toplami, String toplam_tutar,
			String pesinat_odeme_turu, String aciklama,
			String pesinatin_yatacagi_banka, String pesinat_miktari,
			String taksitlerin_toplami, String sozlesme_disi_kalan,
			String taksitin_odeme_turu, String taksit_aciklama,
			String taksitin_yatacagi_banka, String taksit_sayisi,
			String takside_baslanacak_gun) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO odemeler(indirimli_tutar,hizmetlerin_toplami,toplam_tutar, pesinat_odeme_turu, aciklama,pesinatin_yatacagi_banka,pesinat_miktari,taksitlerin_toplami,sozlesme_disi_kalan,taksitin_odeme_turu,taksit_aciklama,taksitin_yatacagi_banka,taksit_sayisi,takside_baslanacak_gun)  VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?,?,?::date) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO odemeler(indirimli_tutar,hizmetlerin_toplami,toplam_tutar, pesinat_odeme_turu, aciklama,pesinatin_yatacagi_banka,pesinat_miktari,taksitlerin_toplami,sozlesme_disi_kalan,taksitin_odeme_turu,taksit_aciklama,taksitin_yatacagi_banka,taksit_sayisi,takside_baslanacak_gun)  VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?,?,?::date) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO odemeler(indirimli_tutar,hizmetlerin_toplami,toplam_tutar, pesinat_odeme_turu, aciklama,pesinatin_yatacagi_banka,pesinat_miktari,taksitlerin_toplami,sozlesme_disi_kalan,taksitin_odeme_turu,taksit_aciklama,taksitin_yatacagi_banka,taksit_sayisi,takside_baslanacak_gun)  VALUES (?, ?, ?,?,?,?,?,?,?,?,?,?,?,?::date) ";

		}

		else {

			strSQL = "UPDATE odemeler SET indirimli_tutar = ?,hizmetlerin_toplami = ?,toplam_tutar= ?, pesinat_odeme_turu= ?, aciklama= ?, pesinatin_yatacagi_banka=?,pesinat_miktari=?,taksitlerin_toplami=?,sozlesme_disi_kalan=?,taksitin_odeme_turu=?,taksit_aciklama=?,taksitin_yatacagi_banka=?,taksit_sayisi=?,takside_baslanacak_gun=?::date	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(indirimli_tutar);
		lstValues.add(hizmetlerin_toplami);
		lstValues.add(toplam_tutar);
		lstValues.add(pesinat_odeme_turu);
		lstValues.add(aciklama);
		lstValues.add(pesinatin_yatacagi_banka);
		lstValues.add(pesinat_miktari);
		lstValues.add(taksitlerin_toplami);
		lstValues.add(sozlesme_disi_kalan);
		lstValues.add(taksitin_odeme_turu);
		lstValues.add(taksitin_yatacagi_banka);
		lstValues.add(taksit_sayisi);
		lstValues.add(taksit_aciklama);
		lstValues.add(takside_baslanacak_gun);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// DBS SINAV TANIMLA
	// GET
	public static List<DBSSinavTanimla> getDBSSinavTanimla(String criteria) {

		List<DBSSinavTanimla> listDBSSinavTanimla = new ArrayList<DBSSinavTanimla>();

		getConnection();

		String strSQL = "SELECT * FROM dbs_sinav_tanimla ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				DBSSinavTanimla DBSSinavTanimla = new DBSSinavTanimla();

				DBSSinavTanimla.setId(restTemp.getString("id"));
				DBSSinavTanimla.setOkul_adi(restTemp.getString("okul_adi"));
				DBSSinavTanimla.setAlan_bilgisi(restTemp
						.getString("alan_bilgisi"));
				DBSSinavTanimla.setSinav_tarihi(restTemp
						.getString("sinav_tarihi"));
				DBSSinavTanimla.setKota(restTemp.getString("kota"));
				DBSSinavTanimla.setSinav_yeri(restTemp.getString("sinav_yeri"));
				DBSSinavTanimla.setUlke(restTemp.getString("ulke"));
				DBSSinavTanimla.setIl(restTemp.getString("il"));
				DBSSinavTanimla.setIlce(restTemp.getString("ilce"));
				DBSSinavTanimla.setSemt(restTemp.getString("semt"));
				DBSSinavTanimla.setMahalle_koy(restTemp
						.getString("mahalle_koy"));
				DBSSinavTanimla.setAdres(restTemp.getString("adres"));
				DBSSinavTanimla.setSaat(restTemp.getString("saat"));
				DBSSinavTanimla.setDakika(restTemp.getString("dakika"));

				listDBSSinavTanimla.add(DBSSinavTanimla);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getdbssinavtanimla Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getdbssinavtanimla Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listDBSSinavTanimla;

	}

	// INSERT
	public static String putDBSSinavTanimla(String id, String okul_adi,
			String alan_bilgisi, String sinav_tarihi, String kota,
			String sinav_yeri, String ulke, String il, String ilce,
			String semt, String mahalle_koy, String adres, String saat,
			String dakika) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO dbs_sinav_tanimla(okul_adi,alan_bilgisi,sinav_tarihi, kota, sinav_yeri,ulke,il,ilce,semt,mahalle_koy,adres,saat,dakika)  VALUES (?, ?, ?::date,?,?,?,?,?,?,?,?,?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO dbs_sinav_tanimla(okul_adi,alan_bilgisi,sinav_tarihi, kota, sinav_yeri,ulke,il,ilce,semt,mahalle_koy,adres,saat,dakika)  VALUES (?, ?, ?::date,?,?,?,?,?,?,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO dbs_sinav_tanimla(okul_adi,alan_bilgisi,sinav_tarihi, kota, sinav_yeri,ulke,il,ilce,semt,mahalle_koy,adres,saat,dakika)  VALUES (?, ?, ?::date,?,?,?,?,?,?,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE dbs_sinav_tanimla SET okul_adi = ?,alan_bilgisi = ?,sinav_tarihi= ?::date, kota= ?, sinav_yeri= ?,ulke=?,il = ?,ilce= ?,semt= ?,mahalle_koy= ?,adres = ?,saat=?,dakika = ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(okul_adi);
		lstValues.add(alan_bilgisi);
		lstValues.add(sinav_tarihi);
		lstValues.add(kota);
		lstValues.add(sinav_yeri);
		lstValues.add(ulke);
		lstValues.add(il);
		lstValues.add(ilce);
		lstValues.add(semt);
		lstValues.add(mahalle_koy);
		lstValues.add(adres);
		lstValues.add(saat);
		lstValues.add(dakika);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// KESÝN KAYIT
	// GET
	public static KesinKayit getKesinKayit(String criteria) {

		KesinKayit result = new KesinKayit();

		getConnection();

		String strSQL = "SELECT * FROM kesin_kayit ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result.setTc_kimlik_no(restTemp.getString("tc_kimlik_no"));
				result.setTc_kimlik_no_kullanma(restTemp
						.getString("tc_kimlik_no_kullanma"));
				result.setAdi(restTemp.getString("adi"));
				result.setSoyadi(restTemp.getString("soyadi"));

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	// INSERT
	public static String putKesinKayit(String tc_kimlik_no,
			String tc_kimlik_no_kullanma, String adi, String soyadi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO kesin_kayit(tc_kimlik_no,tc_kimlik_no_kullanma,adi,soyadi)  VALUES (?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(tc_kimlik_no);
		lstValues.add(tc_kimlik_no_kullanma);
		lstValues.add(adi);
		lstValues.add(soyadi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// YETKÝ TANIMLAMA
	// GET
	public static YetkiTanimlama getYetkiTanimlama() {

		YetkiTanimlama result = new YetkiTanimlama();

		getConnection();

		String strSQL = "SELECT * FROM yetki_tanimlama ";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result.setDers_silme_zamani(restTemp
						.getString("ders_silme_zamani"));
				result.setEn_erken_rezervasyon(restTemp
						.getString("en_erken_rezervasyon"));
				result.setEn_gec_rezervasyon(restTemp
						.getString("en_gec_rezervasyon"));
				result.setEtut_maksimum_kisi_sayisi(restTemp
						.getString("etut_maksimum_kisi_sayisi"));
				result.setGunluk_saat_kotasi(restTemp
						.getString("gunluk_saat_kotasi"));
				result.setHaftalik_saat_kotasi(restTemp
						.getString("haftalik_saat_kotasi"));
				result.setAylik_saat_kotasi(restTemp
						.getString("aylik_saat_kotasi"));
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	// INSERT
	public static String putYetkiTanimlama(String ders_silme_zamani,
			String en_erken_rezervasyon, String en_gec_rezervasyon,
			String etut_maksimum_kisi_sayisi, String gunluk_saat_kotasi,
			String haftalik_saat_kotasi, String aylik_saat_kotasi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO yetki_tanimlama(ders_silme_zamani,en_erken_rezervasyon,en_gec_rezervasyon,etut_maksimum_kisi_sayisi,gunluk_saat_kotasi,haftalik_saat_kotasi,aylik_saat_kotasi)  VALUES (?,?,?,?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(ders_silme_zamani);
		lstValues.add(en_erken_rezervasyon);
		lstValues.add(en_gec_rezervasyon);
		lstValues.add(etut_maksimum_kisi_sayisi);
		lstValues.add(gunluk_saat_kotasi);
		lstValues.add(haftalik_saat_kotasi);
		lstValues.add(aylik_saat_kotasi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// SAAT GÝRÝÞÝ
	// GET
	public static List<SaatGirisi> getSaatGirisi(String criteria) {

		List<SaatGirisi> listSaatGirisi = new ArrayList<SaatGirisi>();

		getConnection();

		String strSQL = "SELECT * FROM saat_girisi ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				SaatGirisi SaatGirisi = new SaatGirisi();

				SaatGirisi.setId(restTemp.getString("id"));
				SaatGirisi.setBaslangic_saati(restTemp
						.getString("baslangic_saati"));
				SaatGirisi.setBitis_saati(restTemp.getString("bitis_saati"));
				SaatGirisi.setGun(restTemp.getString("gun"));
				SaatGirisi.setAciklama(restTemp.getString("aciklama"));

				listSaatGirisi.add(SaatGirisi);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getsaatgirisi Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getsaatgirisi Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listSaatGirisi;

	}

	// INSERT
	public static String putSaatGirisi(String id, String baslangic_saati,
			String bitis_saati, String gun, String aciklama) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO saat_girisi(baslangic_saati,bitis_saati,gun,aciklama)  VALUES (?::time,?::time,?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO saat_girisi(baslangic_saati,bitis_saati,gun,aciklama)  VALUES (?::time,?::time,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO saat_girisi(baslangic_saati,bitis_saati,gun,aciklama)  VALUES (?::time,?::time,?,?) ";

		}

		else {

			strSQL = "UPDATE saat_girisi SET baslangic_saati= ?::time,bitis_saati= ?::time,gun= ?,aciklama= ?  	WHERE id = ?  ::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(baslangic_saati);
		lstValues.add(bitis_saati);
		lstValues.add(gun);
		lstValues.add(aciklama);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// ODEV OLUÞTUR
	// GET
	public static List<OdevOlustur> getOdevOlustur(String criteria) {
		List<OdevOlustur> listOdevOlustur = new ArrayList<OdevOlustur>();

		getConnection();

		String strSQL = "SELECT * FROM odev_olustur ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;

			System.out.println("SQL: " + strSQL);

			// NOW PROCESS
			Connection connTemp = _con;
			Statement stmtTemp = null;
			ResultSet restTemp = null;

			try {

				if (connTemp.isClosed()) {

				}

				stmtTemp = connTemp
						.createStatement(ResultSet.TYPE_FORWARD_ONLY,
								ResultSet.CONCUR_READ_ONLY);
				restTemp = stmtTemp.executeQuery(strSQL);

				while (restTemp.next()) {
					OdevOlustur OdevOlustur = new OdevOlustur();

					OdevOlustur.setOdev_adi(restTemp.getString("odev_adi"));
					OdevOlustur.setEgitim_turu(restTemp
							.getString("egitim_turu"));
					OdevOlustur.setAlan(restTemp.getString("alan"));
					OdevOlustur.setDers(restTemp.getString("ders"));
					OdevOlustur.setUnite(restTemp.getString("unite"));
					OdevOlustur.setSoru_sayisi(restTemp
							.getString("soru_sayisi"));

					listOdevOlustur.add(OdevOlustur);

				}

				// Close
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e) {

				try {

					System.err.println("getodevolustur Error: "
							+ e.getMessage());

					restTemp.close();
					stmtTemp.close();
					_con.close();

				} catch (SQLException e1) {
					System.err.println("getodevolustur Error: "
							+ e1.getMessage());

					e1.printStackTrace();
				}

				e.printStackTrace();

			}

		}
		return listOdevOlustur;
	}

	// INSERT
	public static String putOdevOlustur(String odev_adi, String egitim_turu,
			String alan, String ders, String unite, String soru_sayisi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO odev_olustur(odev_adi,egitim_turu,alan, ders, unite,soru_sayisi)  VALUES (?, ?, ?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(odev_adi);
		lstValues.add(egitim_turu);
		lstValues.add(alan);
		lstValues.add(ders);
		lstValues.add(unite);
		lstValues.add(soru_sayisi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// CEVAP ADEDÝ BELÝRLEME
	// GET
	public static CevapAdediBelirle getCevapAdediBelirle() {

		CevapAdediBelirle result = new CevapAdediBelirle();

		getConnection();

		String strSQL = "SELECT * FROM cevap_adedi_belirle ";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result.setEgitim_turu(restTemp.getString("egitim_turu"));
				result.setCevap_sayisi(restTemp.getString("cevap_sayisi"));
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	// INSERT
	public static String putCevapAdediBelirle(String egitim_turu,
			String cevap_sayisi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO cevap_adedi_belirle(egitim_turu,cevap_sayisi)  VALUES (?, ?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu);
		lstValues.add(cevap_sayisi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// ÖDEV TAKÝP ÜNÝTE
	// GET
	public static List<OdevTakipUnite> getOdevTakipUnite(String criteria) {

		List<OdevTakipUnite> listOdevTakipUnite = new ArrayList<OdevTakipUnite>();

		getConnection();

		String strSQL = "SELECT * FROM odev_takip_unite ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}
		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				OdevTakipUnite OdevTakipUnite = new OdevTakipUnite();

				OdevTakipUnite.setId(restTemp.getString("id"));
				OdevTakipUnite
						.setEgitim_turu(restTemp.getString("egitim_turu"));
				OdevTakipUnite.setAlan(restTemp.getString("alan"));
				OdevTakipUnite.setDers(restTemp.getString("ders"));
				OdevTakipUnite.setUnite(restTemp.getString("unite"));

				listOdevTakipUnite.add(OdevTakipUnite);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getOdevTakipUnite Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getOdevTakipUnite Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listOdevTakipUnite;

	}

	// INSERT
	public static String putOdevTakipUnite(String egitim_turu, String alan,
			String ders, String unite) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO odev_takip_unite(egitim_turu,alan, ders, unite)  VALUES (?, ?, ?, ?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu);
		lstValues.add(alan);
		lstValues.add(ders);
		lstValues.add(unite);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// ATANMIÞ ÖDEVLER
	// GET
	public static List<AtanmisOdevler> getAtanmisOdevler(String criteria) {
		List<AtanmisOdevler> listAtanmisOdevler = new ArrayList<AtanmisOdevler>();

		getConnection();

		String strSQL = "SELECT * FROM atanmis_odevler ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;

			System.out.println("SQL: " + strSQL);

			// NOW PROCESS
			Connection connTemp = _con;
			Statement stmtTemp = null;
			ResultSet restTemp = null;

			try {

				if (connTemp.isClosed()) {

				}

				stmtTemp = connTemp
						.createStatement(ResultSet.TYPE_FORWARD_ONLY,
								ResultSet.CONCUR_READ_ONLY);
				restTemp = stmtTemp.executeQuery(strSQL);

				while (restTemp.next()) {
					AtanmisOdevler AtanmisOdevler = new AtanmisOdevler();

					AtanmisOdevler.setId(restTemp.getString("id"));
					AtanmisOdevler.setBaslangic_tarihi(restTemp
							.getString("baslangic_tarihi"));
					AtanmisOdevler.setBitis_tarihi(restTemp
							.getString("bitis_tarihi"));

					listAtanmisOdevler.add(AtanmisOdevler);

				}

				// Close
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e) {

				try {

					System.err.println("getatanmisodevler Error: "
							+ e.getMessage());
					restTemp.close();
					stmtTemp.close();
					_con.close();

				} catch (SQLException e1) {
					System.err.println("getatanmisodevler Error: "
							+ e1.getMessage());
					e1.printStackTrace();
				}

				e.printStackTrace();

			}
		}
		return listAtanmisOdevler;

	}

	// INSERT
	public static String putAtanmisOdevler(String baslangic_tarihi,
			String bitis_tarihi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO atanmis_odevler(baslangic_tarihi,bitis_tarihi)  VALUES (?, ?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(baslangic_tarihi);
		lstValues.add(bitis_tarihi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// SINAV TANIMLAMA
	// GET
	public static List<SinavTanimlama> getSinavTanimlama(String criteria) {
		List<SinavTanimlama> listSinavTanimlama = new ArrayList<SinavTanimlama>();

		getConnection();

		String strSQL = "SELECT * FROM sinav_tanimlama ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				SinavTanimlama SinavTanimlama = new SinavTanimlama();

				SinavTanimlama.setId(restTemp.getString("id"));
				SinavTanimlama.setSinav_no(restTemp.getString("sinav_no"));
				SinavTanimlama.setSinav_adi(restTemp.getString("sinav_adi"));
				SinavTanimlama.setTarih(restTemp.getString("tarih"));
				SinavTanimlama.setSon_kitapcik_no(restTemp
						.getString("son_kitapcik_no"));
				SinavTanimlama.setSablon_seciniz(restTemp
						.getString("sablon_seciniz"));
				SinavTanimlama.setSaat(restTemp.getString("saat"));
				SinavTanimlama.setDakika(restTemp.getString("dakika"));

				listSinavTanimlama.add(SinavTanimlama);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getsinavtanimlama Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getsinavtanimlama Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listSinavTanimlama;

	}

	// INSERT
	public static String putSinavTanimlari(String id, String sinav_no,
			String sinav_adi, String tarih, String son_kitapcik_no,
			String sablon_seciniz, String saat, String dakika) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO sinav_tanimlama(sinav_no,sinav_adi,tarih,son_kitapcik_no,sablon_seciniz,saat,dakika)  VALUES (?, ?, ?::timestamp,?,?,?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO sinav_tanimlama(sinav_no,sinav_adi,tarih,son_kitapcik_no,sablon_seciniz,saat,dakika)  VALUES (?, ?, ?::timestamp,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO sinav_tanimlama(sinav_no,sinav_adi,tarih,son_kitapcik_no,sablon_seciniz,saat,dakika)  VALUES (?, ?, ?::timestamp,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE sinav_tanimlama SET sinav_no= ?,sinav_adi= ?,tarih= ?::date,son_kitapcik_no= ?,sablon_seciniz= ?,saat= ?,dakika=?  	WHERE id = ?::bigint";
			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(sinav_no);
		lstValues.add(sinav_adi);
		lstValues.add(tarih);
		lstValues.add(son_kitapcik_no);
		lstValues.add(sablon_seciniz);
		lstValues.add(saat);
		lstValues.add(dakika);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// ŞABLON TANIMLARI
	// GET
	public static List<SablonTanimlari> getSablonTanimlari(String criteria) {

		List<SablonTanimlari> listSablonTanimlari = new ArrayList<SablonTanimlari>();

		getConnection();
		String strSQL = "SELECT * FROM sablon_tanimlari ";

		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}
		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				SablonTanimlari SablonTanimlari = new SablonTanimlari();

				SablonTanimlari.setId(restTemp.getString("id"));
				SablonTanimlari.setSablon_adi(restTemp.getString("sablon_adi"));
				SablonTanimlari.setSinav_turu(restTemp.getString("sinav_turu"));

				listSablonTanimlari.add(SablonTanimlari);

			}
			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getsablontanimlari Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getsablontanimlari Error: "
						+ e1.getMessage());

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listSablonTanimlari;

	}

	// INSERT
	public static String putSablonTanimlari(String id, String sablon_adi,
			String sinav_turu) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO sablon_tanimlari(sablon_adi,sinav_turu)  VALUES (?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO sablon_tanimlari(sablon_adi,sinav_turu)  VALUES (?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO sablon_tanimlari(sablon_adi,sinav_turu)  VALUES (?,?) ";

		}

		else {

			strSQL = "UPDATE sablon_tanimlari SET sablon_adi= ?,sinav_turu= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}
		List<String> lstValues = new ArrayList<String>();

		lstValues.add(sablon_adi);
		lstValues.add(sinav_turu);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// GELÝRLER ve GÝDERLER
	// GET
	public static List<GelirlerveGiderler> getGelirlerveGiderler() {
		List<GelirlerveGiderler> listGelirlerveGiderler = new ArrayList<GelirlerveGiderler>();

		getConnection();

		String strSQL = "SELECT * FROM gelirler_ve_giderler ";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				GelirlerveGiderler GelirlerveGiderler = new GelirlerveGiderler();

				GelirlerveGiderler.setId(restTemp.getString("id"));
				GelirlerveGiderler.setIslem_tipi(restTemp
						.getString("islem_tipi"));
				GelirlerveGiderler.setKategoriler(restTemp
						.getString("kategoriler"));
				GelirlerveGiderler.setGelirler(restTemp.getString("gelirler"));
				GelirlerveGiderler.setOdeme_turu(restTemp
						.getString("odeme_turu"));
				GelirlerveGiderler.setBanka(restTemp.getString("banka"));
				GelirlerveGiderler.setCek(restTemp.getString("cek"));
				GelirlerveGiderler.setVade_tarihi(restTemp
						.getString("vade_tarihi"));
				GelirlerveGiderler.setMiktar(restTemp.getString("miktar"));
				GelirlerveGiderler.setTarih(restTemp.getString("tarih"));
				GelirlerveGiderler.setAciklama(restTemp.getString("aciklama"));

				listGelirlerveGiderler.add(GelirlerveGiderler);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getgelirlervegiderler Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				System.err.println("getgelirlervegiderler Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listGelirlerveGiderler;

	}

	// INSERT
	public static String putGelirlerveGiderler(String id, String islem_tipi,
			String kategoriler, String gelirler, String odeme_turu,
			String banka, String cek, String vade_tarihi, String miktar,
			String tarih, String aciklama) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO gelirler_ve_giderler(islem_tipi,kategoriler,gelirler,odeme_turu,banka,cek,vade_tarihi,miktar,tarih,aciklama)  VALUES (?, ?, ?,?,?,?,?::date,?,?::timestamp,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO gelirler_ve_giderler(islem_tipi,kategoriler,gelirler,odeme_turu,banka,cek,vade_tarihi,miktar,tarih,aciklama)  VALUES (?, ?, ?,?,?,?,?::date,?,?,::timestamp?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO gelirler_ve_giderler(islem_tipi,kategoriler,gelirler,odeme_turu,banka,cek,vade_tarihi,miktar,tarih,aciklama)  VALUES (?, ?, ?,?,?,?,?::date,?,?::timestamp,?) ";

		} else {

			strSQL = "UPDATE gelirler_ve_giderler SET islem_tipi= ?,kategoriler= ?,gelirler= ?,odeme_turu= ?,banka= ?,cek= ?,vade_tarihi= ?::date,miktar= ?,tarih= ?::timestamp,aciklama = ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(islem_tipi);
		lstValues.add(kategoriler);
		lstValues.add(gelirler);
		lstValues.add(odeme_turu);
		lstValues.add(banka);
		lstValues.add(cek);
		lstValues.add(vade_tarihi);
		lstValues.add(miktar);
		lstValues.add(tarih);
		lstValues.add(aciklama);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// GELÝR GÝDER TANIMLARI
	// GET
	public static List<GelirGiderTanimlari> getGelirGiderTanimlari(
			String criteria) {

		List<GelirGiderTanimlari> listGelirGiderTanimlari = new ArrayList<GelirGiderTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM gelir_gider_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				GelirGiderTanimlari GelirGiderTanimlari = new GelirGiderTanimlari();

				GelirGiderTanimlari.setId(restTemp.getString("id"));
				GelirGiderTanimlari.setKategori_adi(restTemp
						.getString("kategori_adi"));
				GelirGiderTanimlari.setTipi(restTemp.getString("tipi"));
				GelirGiderTanimlari.setGelir_gider_adi(restTemp
						.getString("gelir_gider_adi"));

				listGelirGiderTanimlari.add(GelirGiderTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getgelirgidertanimlari Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getgelirgidertanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listGelirGiderTanimlari;

	}

	// INSERT
	public static String putGelirGiderTanimlari(String id, String kategori_adi,
			String tipi, String gelir_gider_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO gelir_gider_tanimlari(kategori_adi,tipi,gelir_gider_adi)  VALUES (?, ?, ?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO gelir_gider_tanimlari(kategori_adi,tipi,gelir_gider_adi)  VALUES (?, ?, ?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO gelir_gider_tanimlari(kategori_adi,tipi,gelir_gider_adi)  VALUES (?, ?, ?) ";

		}

		else {

			strSQL = "UPDATE gelir_gider_tanimlari SET kategori_adi= ?,tipi= ?, gelir_gider_adi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(kategori_adi);
		lstValues.add(tipi);
		lstValues.add(gelir_gider_adi);
		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// GERLÝ/GÝDER KATEGORÝLERÝ
	// GET
	public static List<GelirGiderKategorileri> getGelirGiderKategorileri(
			String criteria) {
		List<GelirGiderKategorileri> listGelirGiderKategorileri = new ArrayList<GelirGiderKategorileri>();

		getConnection();

		String strSQL = "SELECT * FROM gelir_gider_kategorileri ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				GelirGiderKategorileri GelirGiderKategorileri = new GelirGiderKategorileri();

				GelirGiderKategorileri.setId(restTemp.getString("id"));
				GelirGiderKategorileri.setKategori_adi(restTemp
						.getString("kategori_adi"));

				listGelirGiderKategorileri.add(GelirGiderKategorileri);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getgelirgiderkategorileri Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getgelirgiderkategorileri Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listGelirGiderKategorileri;

	}

	// INSERT
	public static String putGelirGiderKategorileri(String id,
			String kategori_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO gelir_gider_kategorileri(kategori_adi)  VALUES (?)";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO gelir_gider_kategorileri(kategori_adi)  VALUES (?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO gelir_gider_kategorileri(kategori_adi)  VALUES (?)";

		}

		else {

			strSQL = "UPDATE gelir_gider_kategorileri SET kategori_adi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(kategori_adi);
		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// BANKA EKLE
	// GET
	public static List<BankaEkle> getBankaEkle(String criteria) {
		List<BankaEkle> listBankaEkle = new ArrayList<BankaEkle>();

		getConnection();

		String strSQL = "SELECT * FROM banka_ekle ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				BankaEkle BankaEkle = new BankaEkle();

				BankaEkle.setId(restTemp.getString("id"));
				BankaEkle.setBanka_adi(restTemp.getString("banka_adi"));
				BankaEkle.setBanka_sube(restTemp.getString("banka_sube"));
				BankaEkle.setHesap_no(restTemp.getString("hesap_no"));
				BankaEkle.setIban_no(restTemp.getString("iban_no"));
				BankaEkle.setBankanin_odeme_sekli(restTemp
						.getString("bankanin_odeme_sekli"));
				BankaEkle.setVade_tarihi(restTemp.getString("vade_tarihi"));

				listBankaEkle.add(BankaEkle);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getbankaekle Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getbankaekle Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listBankaEkle;

	}

	// INSERT
	public static String putBankaEkle(String id, String banka_adi,
			String banka_sube, String hesap_no, String iban_no,
			String bankanin_odeme_sekli, String vade_tarihi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO banka_ekle(banka_adi,banka_sube,hesap_no, iban_no, bankanin_odeme_sekli,vade_tarihi)  VALUES (?, ?, ?,?,?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO banka_ekle(banka_adi,banka_sube,hesap_no, iban_no, bankanin_odeme_sekli,vade_tarihi)  VALUES (?, ?, ?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO banka_ekle(banka_adi,banka_sube,hesap_no, iban_no, bankanin_odeme_sekli,vade_tarihi)  VALUES (?, ?, ?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE banka_ekle SET banka_adi= ?,banka_sube= ?,hesap_no= ?, iban_no = ?, bankanin_odeme_sekli = ?,vade_tarihi = ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(banka_adi);
		lstValues.add(banka_sube);
		lstValues.add(hesap_no);
		lstValues.add(iban_no);
		lstValues.add(bankanin_odeme_sekli);
		lstValues.add(vade_tarihi);
		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// ÖÐRETMEN TANIMLARI
	// GET
	public static List<OgretmenTanimlari> getOgretmenTanimlari(String criteria) {

		List<OgretmenTanimlari> listOgretmenTanimlari = new ArrayList<OgretmenTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM ogretmen_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				OgretmenTanimlari OgretmenTanimlari = new OgretmenTanimlari();

				OgretmenTanimlari.setId(restTemp.getString("id"));
				OgretmenTanimlari.setTc_kimlik_no(restTemp
						.getString("tc_kimlik_no"));
				OgretmenTanimlari.setAdi_soyadi(restTemp
						.getString("adi_soyadi"));
				OgretmenTanimlari.setGirdigi_ders_bilgisi(restTemp
						.getString("girdigi_ders_bilgisi"));
				OgretmenTanimlari.setEgitim_turu(restTemp
						.getString("egitim_turu"));
				OgretmenTanimlari.setBrans(restTemp.getString("brans"));
				OgretmenTanimlari.setGirdigi_dersler(restTemp
						.getString("girdigi_dersler"));
				OgretmenTanimlari.setUcreti(restTemp.getString("ucreti"));
				OgretmenTanimlari.setEv_telefonu(restTemp
						.getString("ev_telefonu"));
				OgretmenTanimlari.setCep_telefonu(restTemp
						.getString("cep_telefonu"));
				OgretmenTanimlari.setCep_telefonu_2(restTemp
						.getString("cep_telefonu_2"));
				OgretmenTanimlari.setEmail(restTemp.getString("email"));
				OgretmenTanimlari.setSigorta_gun_sayisi(restTemp
						.getString("sigorta_gun_sayisi"));
				OgretmenTanimlari.setDers_programini_gorsun(restTemp
						.getString("ders_programini_gorsun"));
				OgretmenTanimlari.setDurum(restTemp.getString("durum"));
				OgretmenTanimlari.setPazartesi(restTemp.getString("pazartesi"));
				OgretmenTanimlari.setSali(restTemp.getString("sali"));
				OgretmenTanimlari.setCarsamba(restTemp.getString("carsamba"));
				OgretmenTanimlari.setPersembe(restTemp.getString("persembe"));
				OgretmenTanimlari.setCuma(restTemp.getString("cuma"));
				OgretmenTanimlari.setCumartesi(restTemp.getString("cumartesi"));
				OgretmenTanimlari.setPazar(restTemp.getString("pazar"));

				listOgretmenTanimlari.add(OgretmenTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				System.err.println("getogretmentanimlari Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getogretmentanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listOgretmenTanimlari;

	}

	// INSERT
	public static String putOgretmenTanimlari(String id, String tc_kimlik_no,
			String adi_soyadi, String girdigi_ders_bilgisi, String egitim_turu,
			String brans, String girdigi_dersler, String ucreti,
			String ev_telefonu, String cep_telefonu, String cep_telefonu_2,
			String email, String sigorta_gun_sayisi,
			String ders_programini_gorsun, String durum, String pazartesi,
			String sali, String carsamba, String persembe, String cuma,
			String cumartesi, String pazar) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO ogretmen_tanimlari(tc_kimlik_no, adi_soyadi, girdigi_ders_bilgisi, egitim_turu, brans, girdigi_dersler, ucreti, ev_telefonu, cep_telefonu, cep_telefonu_2, email, sigorta_gun_sayisi, ders_programini_gorsun, durum, pazartesi, sali, carsamba, persembe ,cuma, cumartesi, pazar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::boolean, ?::boolean ,?::boolean ,?::boolean ,?::boolean ,?::boolean,?::boolean,?::boolean,?::boolean)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO ogretmen_tanimlari(tc_kimlik_no, adi_soyadi, girdigi_ders_bilgisi, egitim_turu, brans, girdigi_dersler, ucreti, ev_telefonu, cep_telefonu, cep_telefonu_2, email, sigorta_gun_sayisi, ders_programini_gorsun, durum, pazartesi, sali, carsamba, persembe ,cuma, cumartesi, pazar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::boolean, ?::boolean ,?::boolean ,?::boolean ,?::boolean ,?::boolean,?::boolean,?::boolean,?::boolean)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO ogretmen_tanimlari(tc_kimlik_no, adi_soyadi, girdigi_ders_bilgisi, egitim_turu, brans, girdigi_dersler, ucreti, ev_telefonu, cep_telefonu, cep_telefonu_2, email, sigorta_gun_sayisi, ders_programini_gorsun, durum, pazartesi, sali, carsamba, persembe ,cuma, cumartesi, pazar) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::boolean, ?::boolean ,?::boolean ,?::boolean ,?::boolean ,?::boolean,?::boolean,?::boolean,?::boolean)";

		}

		else {

			strSQL = "UPDATE ogretmen_tanimlari SET tc_kimlik_no= ?, adi_soyadi= ?, girdigi_ders_bilgisi= ?, egitim_turu= ?, brans = ?, girdigi_dersler = ?, ucreti= ?, ev_telefonu= ?, cep_telefonu= ?, cep_telefonu_2= ?, email = ?, sigorta_gun_sayisi = ? , ders_programini_gorsun= ?::boolean, durum= ?::boolean, pazartesi= ?::boolean ,sali = ?::boolean, carsamba = ?::boolean,persembe = ?::boolean,cuma = ?::boolean,cumartesi= ?::boolean, pazar=?::boolean 	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(tc_kimlik_no);
		lstValues.add(adi_soyadi);
		lstValues.add(girdigi_ders_bilgisi);
		lstValues.add(egitim_turu);
		lstValues.add(brans);
		lstValues.add(girdigi_dersler);
		lstValues.add(ucreti);
		lstValues.add(ev_telefonu);
		lstValues.add(cep_telefonu);
		lstValues.add(cep_telefonu_2);
		lstValues.add(email);
		lstValues.add(sigorta_gun_sayisi);
		lstValues.add(ders_programini_gorsun);
		lstValues.add(durum);
		lstValues.add(pazartesi);
		lstValues.add(sali);
		lstValues.add(carsamba);
		lstValues.add(persembe);
		lstValues.add(cuma);
		lstValues.add(cumartesi);
		lstValues.add(pazar);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// SINIF TANIMLARI
	// GET
	public static List<SinifTanimlari> getSinifTanimlari(String criteria) {

		List<SinifTanimlari> listSinifTanimlari = new ArrayList<SinifTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM sinif_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				SinifTanimlari sinifTanimlari = new SinifTanimlari();

				sinifTanimlari.setId(restTemp.getString("id"));
				sinifTanimlari.setSinif_adi(restTemp.getString("sinif_adi"));
				sinifTanimlari.setFiziksel_sinif_adi(restTemp
						.getString("fiziksel_sinif_adi"));
				sinifTanimlari
						.setKurs_zamani(restTemp.getString("kurs_zamani"));
				sinifTanimlari
						.setEgitim_turu(restTemp.getString("egitim_turu"));
				sinifTanimlari.setAlan(restTemp.getString("alan"));

				// sinifTanimlari.setDanisman_ogretmen(restTemp
				// .getString("danisman_ogretmen"));

				sinifTanimlari.setDan_ogretmen(restTemp
						.getString("danisman_ogretmen"));

				sinifTanimlari.setSinif_kontenjani(restTemp
						.getString("sinif_kontenjani"));
				sinifTanimlari.setBaslangic_numarasi(restTemp
						.getString("baslangic_numarasi"));
				sinifTanimlari.setBitis_numarasi(restTemp
						.getString("bitis_numarasi"));
				sinifTanimlari.setOzel_ders_sayisi(restTemp
						.getString("ozel_ders_sayisi"));

				sinifTanimlari.setFiyati(restTemp.getString("fiyati"));
				// sinifTanimlari.setFiyati("99999999");

				sinifTanimlari.setBaslangic_tarihi(restTemp
						.getString("baslangic_tarihi"));
				sinifTanimlari.setBitis_tarihi(restTemp
						.getString("bitis_tarihi"));

				listSinifTanimlari.add(sinifTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getsiniftanimlari Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getsiniftanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listSinifTanimlari;

	}

	// INSERT
	public static String putSinifTanimlari(String id, String sinif_adi,
			String fiziksel_sinif_adi, String kurs_zamani, String egitim_turu,
			String alan, String danisman_ogretmen, String sinif_kontenjani,
			String baslangic_numarasi, String bitis_numarasi,
			String ozel_ders_sayisi, String fiyati, String baslangic_tarihi,
			String bitis_tarihi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO sinif_tanimlari(sinif_adi, fiziksel_sinif_adi, kurs_zamani, egitim_turu, alan, danisman_ogretmen, sinif_kontenjani, baslangic_numarasi, bitis_numarasi, ozel_ders_sayisi, fiyati, baslangic_tarihi, bitis_tarihi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::date, ?::date)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO sinif_tanimlari(sinif_adi, fiziksel_sinif_adi, kurs_zamani, egitim_turu, alan, danisman_ogretmen, sinif_kontenjani, baslangic_numarasi, bitis_numarasi, ozel_ders_sayisi, fiyati, baslangic_tarihi, bitis_tarihi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::date, ?::date)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO sinif_tanimlari(sinif_adi, fiziksel_sinif_adi, kurs_zamani, egitim_turu, alan, danisman_ogretmen, sinif_kontenjani, baslangic_numarasi, bitis_numarasi, ozel_ders_sayisi, fiyati, baslangic_tarihi, bitis_tarihi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?::date, ?::date)";

		}

		else {

			strSQL = "UPDATE sinif_tanimlari SET sinif_adi = ?, fiziksel_sinif_adi= ?, kurs_zamani= ?, egitim_turu= ?, alan= ?, danisman_ogretmen= ?, sinif_kontenjani= ?, baslangic_numarasi= ?, bitis_numarasi= ?, ozel_ders_sayisi= ?, fiyati= ?, baslangic_tarihi= ?::date, bitis_tarihi= ?::date  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(sinif_adi);
		lstValues.add(fiziksel_sinif_adi);
		lstValues.add(kurs_zamani);
		lstValues.add(egitim_turu);
		lstValues.add(alan);
		lstValues.add(danisman_ogretmen);
		lstValues.add(sinif_kontenjani);
		lstValues.add(baslangic_numarasi);
		lstValues.add(bitis_numarasi);
		lstValues.add(ozel_ders_sayisi);
		lstValues.add(fiyati);
		lstValues.add(baslangic_tarihi);
		lstValues.add(bitis_tarihi);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;
	}

	// ÝNDÝRÝM TÜRÜ
	// GET
	public static List<IndirimTuru> getIndirimTuru(String criteria) {

		List<IndirimTuru> listIndirimTuru = new ArrayList<IndirimTuru>();

		getConnection();

		String strSQL = "SELECT * FROM indirim_turu ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				IndirimTuru IndirimTuru = new IndirimTuru();

				IndirimTuru.setId(restTemp.getString("id"));
				IndirimTuru.setIndirim_turu(restTemp.getString("indirim_turu"));
				IndirimTuru.setIndirim_sekli(restTemp
						.getString("indirim_sekli"));
				IndirimTuru.setIndirim_miktari(restTemp
						.getString("indirim_miktari"));

				listIndirimTuru.add(IndirimTuru);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getindirimturu Error: " + e.getMessage());

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getindirimturu Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listIndirimTuru;

	}

	// INSERT
	public static String putIndirimTuru(String id, String indirim_turu,
			String indirim_sekli, String indirim_miktari) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO indirim_turu(indirim_turu,indirim_sekli,indirim_miktari)  VALUES (?, ?,?)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO indirim_turu(indirim_turu,indirim_sekli,indirim_miktari)  VALUES (?, ?,?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO indirim_turu(indirim_turu,indirim_sekli,indirim_miktari)  VALUES (?, ?,?)";

		}

		else {

			strSQL = "UPDATE indirim_turu SET indirim_turu = ?,indirim_sekli= ?,indirim_miktari= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(indirim_turu);
		lstValues.add(indirim_sekli);
		lstValues.add(indirim_miktari);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// HÝZMET TANIMLA
	// GET
	public static List<HizmetTanimla> getHizmetTanimla(String criteria) {

		List<HizmetTanimla> listHizmetTanimla = new ArrayList<HizmetTanimla>();

		getConnection();

		String strSQL = "SELECT * FROM hizmet_tanimla ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				HizmetTanimla HizmetTanimla = new HizmetTanimla();

				HizmetTanimla.setId(restTemp.getString("id"));
				HizmetTanimla.setHizmet_adi(restTemp.getString("hizmet_adi"));
				HizmetTanimla.setHizmet_turu(restTemp.getString("hizmet_turu"));
				HizmetTanimla.setBirim_fiyati(restTemp
						.getString("birim_fiyati"));

				listHizmetTanimla.add(HizmetTanimla);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("gethizmettanimla Error: " + e.getMessage());

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err
						.println("gethizmettanimla Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listHizmetTanimla;

	}

	// INSERT
	public static String putHizmetTanimla(String id, String hizmet_adi,
			String hizmet_turu, String birim_fiyati) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO hizmet_tanimla(hizmet_adi,hizmet_turu,birim_fiyati)  VALUES (?, ?,?)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO hizmet_tanimla(hizmet_adi,hizmet_turu,birim_fiyati)  VALUES (?, ?,?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO hizmet_tanimla(hizmet_adi,hizmet_turu,birim_fiyati)  VALUES (?, ?,?)";

		}

		else {

			strSQL = "UPDATE hizmet_tanimla SET hizmet_adi= ?,hizmet_turu = ?,birim_fiyati= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(hizmet_adi);
		lstValues.add(hizmet_turu);
		lstValues.add(birim_fiyati);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// REFERANSLAR
	// GET
	public static List<Referanslar> getReferanslar(String criteria) {
		List<Referanslar> listReferanslar = new ArrayList<Referanslar>();

		getConnection();

		String strSQL = "SELECT * FROM referanslar ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				Referanslar Referanslar = new Referanslar();

				Referanslar.setId(restTemp.getString("id"));
				Referanslar.setReferans_adi_soyadi(restTemp
						.getString("referans_adi_soyadi"));
				listReferanslar.add(Referanslar);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getreferanslar Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getreferanslar Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listReferanslar;

	}

	// INSERT
	public static String putReferanslar(String id, String referans_adi_soyadi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO referanslar(referans_adi_soyadi)  VALUES (?)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO referanslar(referans_adi_soyadi)  VALUES (?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO referanslar(referans_adi_soyadi)  VALUES (?)";

		}

		else {

			strSQL = "UPDATE referanslar SET referans_adi_soyadi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(referans_adi_soyadi);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// PERSONEL TANIMLARI
	// GET
	public static List<PersonelTanimlari> getPersonelTanimlari(String criteria) {
		List<PersonelTanimlari> listPersonelTanimlari = new ArrayList<PersonelTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM personel_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				PersonelTanimlari PersonelTanimlari = new PersonelTanimlari();

				PersonelTanimlari.setId(restTemp.getString("id"));
				PersonelTanimlari.setAdi_soyadi(restTemp
						.getString("adi_soyadi"));
				PersonelTanimlari.setGorevi(restTemp.getString("gorevi"));
				PersonelTanimlari.setIse_giris_tarihi(restTemp
						.getString("Ise_giris_tarihi"));
				PersonelTanimlari.setUcreti(restTemp.getString("ucreti"));
				PersonelTanimlari.setTelefonu_1(restTemp
						.getString("telefonu_1"));
				PersonelTanimlari.setTelefonu_2(restTemp
						.getString("telefonu_2"));

				listPersonelTanimlari.add(PersonelTanimlari);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getpersoneltanimlari Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getpersoneltanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listPersonelTanimlari;

	}

	// INSERT
	public static String putPersonelTanimlari(String id, String adi_soyadi,
			String gorevi, String ise_giris_tarihi, String ucreti,
			String telefonu_1, String telefonu_2) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO personel_tanimlari(adi_soyadi,gorevi,ise_giris_tarihi, ucreti, telefonu_1,telefonu_2)  VALUES (?, ?, ?::date,?,?,?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO personel_tanimlari(adi_soyadi,gorevi,ise_giris_tarihi, ucreti, telefonu_1,telefonu_2)  VALUES (?, ?, ?::date,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO personel_tanimlari(adi_soyadi,gorevi,ise_giris_tarihi, ucreti, telefonu_1,telefonu_2)  VALUES (?, ?, ?::date,?,?,?) ";

		}

		else {

			strSQL = "UPDATE personel_tanimlari SET adi_soyadi= ?,gorevi= ?,ise_giris_tarihi = ?::date, ucreti = ?, telefonu_1=?,telefonu_2= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(adi_soyadi);
		lstValues.add(gorevi);
		lstValues.add(ise_giris_tarihi);
		lstValues.add(ucreti);
		lstValues.add(telefonu_1);
		lstValues.add(telefonu_2);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// KURUMSAL BILGILER
	// GET
	public static List<KurumsalBilgiler> getKurumsalBilgiler(String criteria) {
		List<KurumsalBilgiler> listKurumsalBilgiler = new ArrayList<KurumsalBilgiler>();

		getConnection();

		String strSQL = "SELECT * FROM kurumsal_bilgiler ";
		// ORDER BY id DESC limit 1
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				KurumsalBilgiler kurumsalBilgiler = new KurumsalBilgiler();

				kurumsalBilgiler.setId(restTemp.getString("id"));
				kurumsalBilgiler.setSube_kisa_adi(restTemp
						.getString("sube_kisa_adi"));
				kurumsalBilgiler.setSube_resmi_adi(restTemp
						.getString("sube_resmi_adi"));
				kurumsalBilgiler
						.setSirket_adi(restTemp.getString("sirket_adi"));
				kurumsalBilgiler.setVergi_dairesi(restTemp
						.getString("vergi_dairesi"));
				kurumsalBilgiler.setVergi_no(restTemp.getString("vergi_no"));
				kurumsalBilgiler.setYonetici_adi(restTemp
						.getString("yonetici_adi"));
				kurumsalBilgiler.setYonetici_tel(restTemp
						.getString("yonetici_tel"));
				kurumsalBilgiler.setMudur(restTemp.getString("mudur"));
				kurumsalBilgiler.setMudur_yardimcisi(restTemp
						.getString("mudur_yardimcisi"));
				kurumsalBilgiler.setLogo(restTemp.getString("logo"));
				kurumsalBilgiler.setUlke(restTemp.getString("ulke"));
				kurumsalBilgiler.setIl(restTemp.getString("il"));
				kurumsalBilgiler.setIlce(restTemp.getString("ilce"));
				kurumsalBilgiler.setSemt(restTemp.getString("semt"));
				kurumsalBilgiler.setMahalle_koy(restTemp
						.getString("mahalle_koy"));
				kurumsalBilgiler.setTelefon(restTemp.getString("telefon"));
				kurumsalBilgiler.setFaks(restTemp.getString("faks"));
				kurumsalBilgiler.setEmail(restTemp.getString("email"));
				kurumsalBilgiler.setAdres(restTemp.getString("adres"));

				listKurumsalBilgiler.add(kurumsalBilgiler);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listKurumsalBilgiler;

	}

	// INSERT
	public static String putKurumsalBilgiler(String id, String sube_kisa_adi,
			String sube_resmi_adi, String sirket_adi, String vergi_dairesi,
			String vergi_no, String yonetici_adi, String yonetici_tel,
			String mudur, String mudur_yardimcisi, String logo, String ulke,
			String il, String ilce, String semt, String mahalle_koy,
			String telefon, String faks, String email, String adres) {

		String result = "";
		boolean isInsert = true;

		String strSQL = "";
		getConnection();
		System.out.println("1111111:" + id);
		// strSQL =
		// "INSERT INTO kurumsal_bilgiler(sube_kisa_adi, sube_resmi_adi, sirket_adi, vergi_dairesi, vergi_no, yonetici_adi, yonetici_tel, mudur, mudur_yardimcisi, logo, ulke, il, ilce, semt, mahalle_koy, telefon, faks, email, adres)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		if (id == null) {

			strSQL = "INSERT INTO kurumsal_bilgiler(sube_kisa_adi, sube_resmi_adi, sirket_adi, vergi_dairesi, vergi_no, yonetici_adi, yonetici_tel, mudur, mudur_yardimcisi, logo, ulke, il, ilce, semt, mahalle_koy, telefon, faks, email, adres)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO kurumsal_bilgiler(sube_kisa_adi, sube_resmi_adi, sirket_adi, vergi_dairesi, vergi_no, yonetici_adi, yonetici_tel, mudur, mudur_yardimcisi, logo, ulke, il, ilce, semt, mahalle_koy, telefon, faks, email, adres)  VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "UPDATE kurumsal_bilgiler SET sube_kisa_adi=?, sube_resmi_adi= ?, sirket_adi = ?, vergi_dairesi= ?, vergi_no= ?, yonetici_adi= ?, yonetici_tel= ?, mudur= ?, mudur_yardimcisi= ?, logo= ?, ulke= ?, il= ?, ilce= ?, semt= ?, mahalle_koy= ?, telefon= ?, faks= ?, email= ?, adres=? WHERE id =1::bigint ";

		}

		else {

			strSQL = "UPDATE kurumsal_bilgiler SET sube_kisa_adi=?, sube_resmi_adi= ?, sirket_adi = ?, vergi_dairesi= ?, vergi_no= ?, yonetici_adi= ?, yonetici_tel= ?, mudur= ?, mudur_yardimcisi= ?, logo= ?, ulke= ?, il= ?, ilce= ?, semt= ?, mahalle_koy= ?, telefon= ?, faks= ?, email= ?, adres=? WHERE id = 1::bigint ";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(sube_kisa_adi);
		lstValues.add(sube_resmi_adi);
		lstValues.add(sirket_adi);
		lstValues.add(vergi_dairesi);
		lstValues.add(vergi_no);
		lstValues.add(yonetici_adi);
		lstValues.add(yonetici_tel);
		lstValues.add(mudur);
		lstValues.add(mudur_yardimcisi);
		lstValues.add(logo);
		lstValues.add(ulke);
		lstValues.add(il);
		lstValues.add(ilce);
		lstValues.add(semt);
		lstValues.add(mahalle_koy);
		lstValues.add(telefon);
		lstValues.add(faks);
		lstValues.add(email);
		lstValues.add(adres);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// DONEM TANIMLARI
	// GET
	public static List<DonemTanimlari> getDonemTanimlari(String criteria) {
		List<DonemTanimlari> listDonemTanimlari = new ArrayList<DonemTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM donem_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				DonemTanimlari DonemTanimlari = new DonemTanimlari();

				DonemTanimlari.setId(restTemp.getString("id"));
				DonemTanimlari.setDonem_adi(restTemp.getString("donem_adi"));
				DonemTanimlari.setBaslangic_tarihi(restTemp
						.getString("baslangic_tarihi"));
				DonemTanimlari.setBitis_tarihi(restTemp
						.getString("bitis_tarihi"));
				DonemTanimlari.setVarsayilan_donem(restTemp
						.getString("varsayilan_donem"));

				listDonemTanimlari.add(DonemTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getdonemtanimlari Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getdonemtanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listDonemTanimlari;

	}

	// INSERT
	public static String putDonemTanimlari(String id, String donem_adi,
			String baslangic_tarihi, String bitis_tarihi,
			String varsayilan_donem) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO donem_tanimlari(donem_adi, baslangic_tarihi, bitis_tarihi, varsayilan_donem)  VALUES (?, ?::date,?::date, ?)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO donem_tanimlari(donem_adi, baslangic_tarihi, bitis_tarihi, varsayilan_donem)  VALUES (?, ?::date,?::date, ?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO donem_tanimlari(donem_adi, baslangic_tarihi, bitis_tarihi, varsayilan_donem)  VALUES (?, ?::date,?::date, ?)";

		}

		else {

			strSQL = "UPDATE donem_tanimlari SET donem_adi= ?, baslangic_tarihi = ?::date, bitis_tarihi = ?::date, varsayilan_donem= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(donem_adi);
		lstValues.add(baslangic_tarihi);
		lstValues.add(bitis_tarihi);
		lstValues.add(varsayilan_donem);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// DERS TANIMLARI
	// GET
	public static List<DersTanimlari> getDersTanimlari(String criteria) {
		List<DersTanimlari> listDersTanimlari = new ArrayList<DersTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM ders_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				DersTanimlari DersTanimlari = new DersTanimlari();

				DersTanimlari.setId(restTemp.getString("id"));
				DersTanimlari.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				DersTanimlari.setAlan_adi(restTemp.getString("alan_adi"));
				DersTanimlari.setDers_adi(restTemp.getString("ders_adi"));

				listDersTanimlari.add(DersTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getderstanimlari Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err
						.println("getderstanimlari Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listDersTanimlari;

	}

	// INSERT
	public static String putDersTanimlari(String id, String egitim_turu_adi,
			String alan_adi, String ders_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO ders_tanimlari(egitim_turu_adi, alan_adi , ders_adi)  VALUES (?, ?, ?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO ders_tanimlari(egitim_turu_adi, alan_adi , ders_adi)  VALUES (?, ?, ?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO ders_tanimlari(egitim_turu_adi, alan_adi , ders_adi)  VALUES (?, ?, ?) ";

		}

		else {

			strSQL = "UPDATE ders_tanimlari SET egitim_turu_adi = ?, alan_adi= ?, ders_adi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);
		lstValues.add(ders_adi);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// ÜNÝTE TANIMLARI
	// GET
	public static List<UniteTanimlari> getUniteTanimlari(String criteria) {
		List<UniteTanimlari> listUniteTanimlari = new ArrayList<UniteTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM unite_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				UniteTanimlari UniteTanimlari = new UniteTanimlari();

				UniteTanimlari.setId(restTemp.getString("id"));
				UniteTanimlari.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				UniteTanimlari.setAlan_adi(restTemp.getString("alan_adi"));
				UniteTanimlari.setDers_adi(restTemp.getString("ders_adi"));
				UniteTanimlari.setUnite_adi(restTemp.getString("unite_adi"));

				listUniteTanimlari.add(UniteTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getunitetanimlari Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getunitetanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listUniteTanimlari;

	}

	// INSERT
	public static String putUniteTanimlari(String id, String egitim_turu_adi,
			String alan_adi, String ders_adi, String unite_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO unite_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi)  VALUES (?, ?, ?, ?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO unite_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi)  VALUES (?, ?, ?, ?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO unite_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi)  VALUES (?, ?, ?, ?) ";

		}

		else {

			strSQL = "UPDATE unite_tanimlari SET egitim_turu_adi= ?, alan_adi= ?, ders_adi= ?, unite_adi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);
		lstValues.add(ders_adi);
		lstValues.add(unite_adi);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// KONU TANIMLARI
	// GET
	public static List<KonuTanimlari> getKonuTanimlari(String criteria) {
		List<KonuTanimlari> listKonuTanimlari = new ArrayList<KonuTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM konu_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				KonuTanimlari KonuTanimlari = new KonuTanimlari();

				KonuTanimlari.setId(restTemp.getString("id"));
				KonuTanimlari.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				KonuTanimlari.setAlan_adi(restTemp.getString("alan_adi"));
				KonuTanimlari.setDers_adi(restTemp.getString("ders_adi"));
				KonuTanimlari.setUnite_adi(restTemp.getString("unite_adi"));
				KonuTanimlari.setKonu_adi(restTemp.getString("konu_adi"));

				listKonuTanimlari.add(KonuTanimlari);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getkonutanimlari Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err
						.println("getkonutanimlari Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listKonuTanimlari;

	}

	// INSERT
	public static String putKonuTanimlari(String id, String egitim_turu_adi,
			String alan_adi, String ders_adi, String unite_adi, String konu_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";
		if (id == null) {

			strSQL = "INSERT INTO konu_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi, konu_adi)  VALUES (?, ?, ?, ?, ?) ";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO konu_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi, konu_adi)  VALUES (?, ?, ?, ?, ?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO konu_tanimlari(egitim_turu_adi, alan_adi , ders_adi, unite_adi, konu_adi)  VALUES (?, ?, ?, ?, ?) ";

		}

		else {

			strSQL = "UPDATE konu_tanimlari SET egitim_turu_adi= ?, alan_adi= ?, ders_adi= ?, unite_adi= ?, konu_adi= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);
		lstValues.add(ders_adi);
		lstValues.add(unite_adi);
		lstValues.add(konu_adi);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// FÝZÝKSEL SINIF TANIMLARI
	// GET
	public static List<FizikselSinifTanimlari> getFizikselSinifTanimlari(
			String criteria) {

		List<FizikselSinifTanimlari> listFizikselSinifTanimlari = new ArrayList<FizikselSinifTanimlari>();

		getConnection();

		String strSQL = "SELECT * FROM fiziksel_sinif_tanimlari ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				FizikselSinifTanimlari FizikselSinifTanimlari = new FizikselSinifTanimlari();

				FizikselSinifTanimlari.setId(restTemp.getString("id"));
				FizikselSinifTanimlari.setFiziksel_sinif_adi(restTemp
						.getString("fiziksel_sinif_adi"));

				listFizikselSinifTanimlari.add(FizikselSinifTanimlari);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getfizikselsiniftanimlari Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getfizikselsiniftanimlari Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listFizikselSinifTanimlari;

	}

	// INSERT
	public static String putFizikselSinifTanimlari(String id,
			String fiziksel_sinif_adi) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO fiziksel_sinif_tanimlari(fiziksel_sinif_adi)  VALUES (?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO fiziksel_sinif_tanimlari(fiziksel_sinif_adi)  VALUES (?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO fiziksel_sinif_tanimlari(fiziksel_sinif_adi)  VALUES (?) ";

		}

		else {

			strSQL = "UPDATE fiziksel_sinif_tanimlari SET fiziksel_sinif_adi = ? 	WHERE id = ?::bigint ";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(fiziksel_sinif_adi);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// KURS ZAMANI TANIMLAMA
	// GET
	public static List<KursZamaniTanimlama> getKursZamaniTanimlama(
			String criteria) {
		List<KursZamaniTanimlama> listKursZamaniTanimlama = new ArrayList<KursZamaniTanimlama>();

		getConnection();

		String strSQL = "SELECT * FROM kurs_zamani_tanimlama ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				KursZamaniTanimlama KursZamaniTanimlama = new KursZamaniTanimlama();

				KursZamaniTanimlama.setId(restTemp.getString("id"));
				KursZamaniTanimlama.setKurs_zamani(restTemp
						.getString("kurs_zamani"));

				listKursZamaniTanimlama.add(KursZamaniTanimlama);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getkurszamanitanimlama Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getkurszamanitanimlama Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listKursZamaniTanimlama;

	}

	// INSERT
	public static String putKursZamaniTanimlama(String id, String kurs_zamani) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO kurs_zamani_tanimlama(kurs_zamani)  VALUES (?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO kurs_zamani_tanimlama(kurs_zamani)  VALUES (?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO kurs_zamani_tanimlama(kurs_zamani)  VALUES (?) ";

		}

		else {

			strSQL = "UPDATE kurs_zamani_tanimlama SET kurs_zamani= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(kurs_zamani);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// SÖZLEŞME MADDELERİ
	// GET
	public static List<SozlesmeMaddeleri> getSozlesmeMaddeleri(String criteria) {
		List<SozlesmeMaddeleri> listSozlesmeMaddeleri = new ArrayList<SozlesmeMaddeleri>();

		getConnection();

		String strSQL = "SELECT * FROM sozlesme_maddeleri ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				SozlesmeMaddeleri sozlesmeMaddeleri = new SozlesmeMaddeleri();

				sozlesmeMaddeleri.setId(restTemp.getString("id"));
				sozlesmeMaddeleri.setSozlesme(restTemp.getString("sozlesme"));

				listSozlesmeMaddeleri.add(sozlesmeMaddeleri);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getsozlesmemaddeleri Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getsozlesmemaddeleri Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listSozlesmeMaddeleri;

	}

	// INSERT
	public static String putSozlesmeMaddeleri(String id, String sozlesme) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		System.out.println(" wqeqweqwqw: " + id);

		if (id == null) {

			strSQL = "INSERT INTO sozlesme_maddeleri(sozlesme)  VALUES (?)";
		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO sozlesme_maddeleri(sozlesme)  VALUES (?)";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "UPDATE  sozlesme_maddeleri SET sozlesme=? WHERE id = 1::bigint";

		}

		else {

			strSQL = "UPDATE  sozlesme_maddeleri SET sozlesme=? WHERE id = 1::bigint";

			isInsert = false;
		}

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(sozlesme);

		if (!isInsert) {

			lstValues.add(id);
		}
		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// ŞİFRE DEĞİŞTİRME
	// GET
	public static SifreDegistirme getSifreDegistirme() {

		SifreDegistirme result = new SifreDegistirme();

		getConnection();

		String strSQL = "SELECT * FROM sifre_degistirme ";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result.setEski_sifre(restTemp.getString("eski_sifre"));
				result.setYeni_sifre(restTemp.getString("yeni_sifre"));
				result.setTekrar_yeni_sifre(restTemp
						.getString("tekrar_yeni_sifre"));

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	// INSERT
	public static String putSifreDegistirme(String eski_sifre,
			String yeni_sifre, String tekrar_yeni_sifre) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO sifre_degistirme(eski_sifre, yeni_sifre, tekrar_yeni_sifre)  VALUES (?, ?, ?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(eski_sifre);
		lstValues.add(yeni_sifre);
		lstValues.add(tekrar_yeni_sifre);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// DESTEK ALMAK ÝSTÝYORUM
	// GET
	public static DestekAlmakIstiyorum getDestekAlmakIstiyorum() {

		DestekAlmakIstiyorum result = new DestekAlmakIstiyorum();

		getConnection();

		String strSQL = "SELECT * FROM destek_almak_istiyorum ";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result.setKonu(restTemp.getString("konu"));
				result.setBolum(restTemp.getString("bolum"));
				result.setMesajiniz(restTemp.getString("mesajiniz"));

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	// INSERT
	public static String putDestekAlmakIstiyorum(String konu, String bolum,
			String mesajiniz) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO destek_almak_istiyorum(konu,bolum,mesajiniz)  VALUES (?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(konu);
		lstValues.add(bolum);
		lstValues.add(mesajiniz);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// KULLANICI TANIMLAMA
	// GET
	public static List<KullaniciTanimlama> getKullaniciTanimlama(String criteria) {
		List<KullaniciTanimlama> listKullaniciTanimlama = new ArrayList<KullaniciTanimlama>();

		getConnection();

		String strSQL = "SELECT * FROM kullanici_tanimlama ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				KullaniciTanimlama KullaniciTanimlama = new KullaniciTanimlama();

				KullaniciTanimlama.setId(restTemp.getString("id"));
				KullaniciTanimlama.setKullanici_kodu(restTemp
						.getString("kullanici_kodu"));
				KullaniciTanimlama.setAdi(restTemp.getString("adi"));
				KullaniciTanimlama.setSoyadi(restTemp.getString("soyadi"));
				KullaniciTanimlama.setSifre(restTemp.getString("sifre"));
				KullaniciTanimlama.setSifre_tekrar(restTemp
						.getString("sifre_tekrar"));

				listKullaniciTanimlama.add(KullaniciTanimlama);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getkullanicitanimlama Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getkullanicitanimlama Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listKullaniciTanimlama;

	}

	// INSERT
	public static String putKullaniciTanimlama(String id,
			String kullanici_kodu, String adi, String soyadi, String sifre,
			String sifre_tekrar) {

		String result = "";
		boolean isInsert = true;

		getConnection();

		String strSQL = "";

		if (id == null) {

			strSQL = "INSERT INTO kullanici_tanimlama(kullanici_kodu,adi,soyadi,sifre,sifre_tekrar)  VALUES (?,?,?,?,?) ";

		} else if (id.length() <= 0) {

			strSQL = "INSERT INTO kullanici_tanimlama(kullanici_kodu,adi,soyadi,sifre,sifre_tekrar)  VALUES (?,?,?,?,?) ";

		} else if (new Long(id).longValue() < 0) {

			strSQL = "INSERT INTO kullanici_tanimlama(kullanici_kodu,adi,soyadi,sifre,sifre_tekrar)  VALUES (?,?,?,?,?) ";

		}

		else {

			strSQL = "UPDATE kullanici_tanimlama SET kullanici_kodu= ?,adi=?,soyadi= ?,sifre= ?,sifre_tekrar= ?  	WHERE id = ?::bigint";

			isInsert = false;
		}
		List<String> lstValues = new ArrayList<String>();

		lstValues.add(kullanici_kodu);
		lstValues.add(adi);
		lstValues.add(soyadi);
		lstValues.add(sifre);
		lstValues.add(sifre_tekrar);

		if (!isInsert) {

			lstValues.add(id);
		}

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// İL
	// GET
	public static List<Il> getIl(String criteria) {
		List<Il> listIl = new ArrayList<Il>();

		getConnection();

		String strSQL = "SELECT * FROM il ";

		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {

				Il Il = new Il();

				Il.setIl_id(restTemp.getString("il_id"));
				Il.setIl_adi(restTemp.getString("il_adi"));

				listIl.add(Il);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getil Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getil Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listIl;

	}

	// INSERT
	public static String putIl(String il_id, String il_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO il(il_id,il_adi)  VALUES (?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(il_id);
		lstValues.add(il_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// İLÇE
	// GET
	public static List<Ilce> getIlce(String criteria) {
		List<Ilce> listIlce = new ArrayList<Ilce>();

		getConnection();

		String strSQL = "SELECT * FROM ilce ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				Ilce Ilce = new Ilce();

				Ilce.setIl_id(restTemp.getString("il_id"));
				Ilce.setIlce_id(restTemp.getString("ilce_id"));
				Ilce.setIlce_adi(restTemp.getString("ilce_adi"));

				listIlce.add(Ilce);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getilce Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getilce Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listIlce;

	}

	// INSERT
	public static String putIlce(String il_id, String ilce_id, String ilce_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO ilce(il_id,ilce_id,ilce_adi)  VALUES (?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(il_id);
		lstValues.add(ilce_id);
		lstValues.add(ilce_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// OKUL
	// GET
	public static List<Okul> getOkul(String criteria) {
		List<Okul> listOkul = new ArrayList<Okul>();

		getConnection();

		String strSQL = "SELECT * FROM okul ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				Okul Okul = new Okul();

				Okul.setIl_id(restTemp.getString("il_id"));
				Okul.setIlce_id(restTemp.getString("ilce_id"));
				Okul.setOkul_id(restTemp.getString("okul_id"));
				Okul.setOkul_adi(restTemp.getString("okul_adi"));

				listOkul.add(Okul);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getokul Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getokul Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listOkul;

	}

	// INSERT
	public static String putOkul(String il_id, String ilce_id, String okul_id,
			String okul_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO posta_kodu(il_id,ilce_id,okul_id,okul_adi)  VALUES (?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(il_id);
		lstValues.add(ilce_id);
		lstValues.add(okul_id);
		lstValues.add(okul_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// POSTA KODU
	// GET
	public static List<PostaKodu> getPostaKodu(String criteria) {
		List<PostaKodu> listPostaKodu = new ArrayList<PostaKodu>();

		getConnection();

		String strSQL = "SELECT DISTINCT il, ilce, semt_bucak_belde FROM posta_kodu  ";

		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}
		System.out.println("SQL: " + strSQL);

		strSQL = strSQL + " ORDER BY il, ilce, semt_bucak_belde";

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				PostaKodu PostaKodu = new PostaKodu();

				PostaKodu.setIl(restTemp.getString("il"));
				PostaKodu.setIlce(restTemp.getString("ilce"));
				PostaKodu.setSemt_bucak_belde(restTemp
						.getString("semt_bucak_belde"));

				listPostaKodu.add(PostaKodu);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getpostakodu Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getpostakodu Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listPostaKodu;
	}

	// INSERT
	public static String putPostaKodu(String il, String ilce,
			String semt_bucak_belde, String mahalle, String posta_kodu) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO posta_kodu(il,ilce,semt_bucak_belde,mahalle,posta_kodu)  VALUES (?,?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(il);
		lstValues.add(ilce);
		lstValues.add(semt_bucak_belde);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// MAHALLE-POSTAKODU
	// GET
	public static List<PostaKoduMahalle> getPostaKoduMahalle(String criteria) {
		List<PostaKoduMahalle> listPostaKoduMahalle = new ArrayList<PostaKoduMahalle>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT DISTINCT mahalle, posta_kodu FROM posta_kodu  ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		strSQL = strSQL + " ORDER BY mahalle, posta_kodu";
		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				PostaKoduMahalle PostaKoduMahalle = new PostaKoduMahalle();

				PostaKoduMahalle.setMahalle(restTemp.getString("mahalle"));
				PostaKoduMahalle
						.setPosta_kodu(restTemp.getString("posta_kodu"));

				listPostaKoduMahalle.add(PostaKoduMahalle);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getpostakodumahalle Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getpostakodumahalle Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listPostaKoduMahalle;

	}

	// INSERT
	public static String putPostaKoduMahalle(String mahalle, String posta_kodu) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO posta_kodu(il,ilce,semt_bucak_belde,mahalle,posta_kodu)  VALUES (?,?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(mahalle);
		lstValues.add(posta_kodu);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// EĞİTİM TÜRÜ ADI
	// GET
	public static List<EgitimTuru> getEgitimTuru(String criteria) {
		List<EgitimTuru> listEgitimTuru = new ArrayList<EgitimTuru>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT * FROM egitim_turu ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuru EgitimTuru = new EgitimTuru();

				EgitimTuru.setId(restTemp.getString("id"));
				EgitimTuru.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));

				listEgitimTuru.add(EgitimTuru);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getegitimturu Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getegitimturu Error: " + e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuru;

	}

	// INSERT
	public static String putEgitimTuru(String egitim_turu_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO egitim_turu(egitim_turu_adi)  VALUES (?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// EĞİTİM TÜRÜ ALAN
	// GET
	public static List<EgitimTuruAlan> getEgitimTuruAlan(String criteria) {
		List<EgitimTuruAlan> listEgitimTuruAlan = new ArrayList<EgitimTuruAlan>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT * FROM egitim_turu_alan ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuruAlan EgitimTuruAlan = new EgitimTuruAlan();

				EgitimTuruAlan.setId(restTemp.getString("id"));
				EgitimTuruAlan.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				EgitimTuruAlan.setAlan_adi(restTemp.getString("alan_adi"));

				listEgitimTuruAlan.add(EgitimTuruAlan);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getegitimturualansinif Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getegitimturualansinif Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruAlan;

	}

	// INSERT
	public static String putEgitimTuruAlan(String egitim_turu_adi,
			String alan_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO egitim_turu_alan_sinif(egitim_turu_adi,alan_adi)  VALUES (?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// EĞİTİM TÜRÜ KONU
	// GET
	public static List<EgitimTuruKonu> getEgitimTuruKonu(String criteria) {
		List<EgitimTuruKonu> listEgitimTuruKonu = new ArrayList<EgitimTuruKonu>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT * FROM egitim_turu_konu ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuruKonu EgitimTuruKonu = new EgitimTuruKonu();

				EgitimTuruKonu.setId(restTemp.getString("id"));
				EgitimTuruKonu.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				EgitimTuruKonu.setAlan_adi(restTemp.getString("alan_adi"));
				EgitimTuruKonu.setUnite_adi(restTemp.getString("unite_adi"));
				EgitimTuruKonu.setKonu_adi(restTemp.getString("konu_adi"));

				listEgitimTuruKonu.add(EgitimTuruKonu);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getegitimturukonu Error: " + e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getegitimturukonu Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruKonu;

	}

	// INSERT
	public static String putEgitimTuruKonu(String egitim_turu_adi,
			String alan_adi, String unite_adi, String konu_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO egitim_turu_konu(egitim_turu_adi,alan_adi,unite_adi,konu_adi)  VALUES (?,?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);
		lstValues.add(unite_adi);
		lstValues.add(konu_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// EĞİTİM TÜRÜ ÜNİTE
	// GET
	public static List<EgitimTuruUnite> getEgitimTuruUnite(String criteria) {
		List<EgitimTuruUnite> listEgitimTuruUnite = new ArrayList<EgitimTuruUnite>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT * FROM egitim_turu_unite ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuruUnite EgitimTuruUnite = new EgitimTuruUnite();

				EgitimTuruUnite.setId(restTemp.getString("id"));
				EgitimTuruUnite.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				EgitimTuruUnite.setAlan_adi(restTemp.getString("alan_adi"));
				EgitimTuruUnite.setUnite_adi(restTemp.getString("unite_adi"));

				listEgitimTuruUnite.add(EgitimTuruUnite);
			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getegitimturuunite Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getegitimturuunite Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruUnite;

	}

	// INSERT
	public static String putEgitimTuruUnite(String egitim_turu_adi,
			String alan_adi, String unite_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO egitim_turu_unite(egitim_turu_adi,alan_adi,unite_adi)  VALUES (?,?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);
		lstValues.add(unite_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// // EĞİTİM TÜRÜ ALAN Kategorileri
	// // GET
	// public static List<EgitimTuruAlanKategorileri>
	// getEgitimTuruAlanKategorileri(
	// String criteria) {
	// List<EgitimTuruAlanKategorileri> listEgitimTuruAlanKategorileri = new
	// ArrayList<EgitimTuruAlanKategorileri>();
	//
	// getConnection();
	//
	// System.out.println("CRITERIA: " + criteria);
	//
	// String strSQL = "SELECT * FROM egitim_turu_alan_kategorileri ";
	// if (criteria.length() > 15) {
	//
	// strSQL = strSQL + criteria;
	// }
	//
	// System.out.println("SQL33333333: " + strSQL);
	//
	// // NOW PROCESS
	// Connection connTemp = _con;
	// Statement stmtTemp = null;
	// ResultSet restTemp = null;
	//
	// try {
	//
	// if (connTemp.isClosed()) {
	//
	// }
	//
	// stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
	// ResultSet.CONCUR_READ_ONLY);
	// restTemp = stmtTemp.executeQuery(strSQL);
	//
	// while (restTemp.next()) {
	// EgitimTuruAlanKategorileri EgitimTuruAlanKategorileri = new
	// EgitimTuruAlanKategorileri();
	//
	// EgitimTuruAlanKategorileri.setId(restTemp.getString("id"));
	// EgitimTuruAlanKategorileri.setEgitim_turu_adi(restTemp
	// .getString("egitim_turu_adi"));
	// EgitimTuruAlanKategorileri.setAlan_adi(restTemp
	// .getString("alan_adi"));
	//
	// listEgitimTuruAlanKategorileri.add(EgitimTuruAlanKategorileri);
	// }
	//
	// // Close
	// restTemp.close();
	// stmtTemp.close();
	// _con.close();
	//
	// } catch (SQLException e) {
	//
	// try {
	// System.err.println("getegitimturualankategorileri Error: "
	// + e.getMessage());
	// restTemp.close();
	// stmtTemp.close();
	// _con.close();
	//
	// } catch (SQLException e1) {
	// System.err.println("getegitimturualankategorileri Error: "
	// + e1.getMessage());
	// e1.printStackTrace();
	// }
	//
	// e.printStackTrace();
	//
	// }
	//
	// return listEgitimTuruAlanKategorileri;
	//
	// }

	// EĞİTİM TÜRÜ Alan KATEGORİLERİ
	// GET
	public static List<EgitimTuruAlanKategorileri> getEgitimTuruAlanKategorileri(
			String criteria) {
		List<EgitimTuruAlanKategorileri> listEgitimTuruAlanKategorileri = new ArrayList<EgitimTuruAlanKategorileri>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT * FROM egitim_turu_alan_kategorileri ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuruAlanKategorileri EgitimTuruAlanKategorileri = new EgitimTuruAlanKategorileri();

				EgitimTuruAlanKategorileri.setId(restTemp.getString("id"));
				EgitimTuruAlanKategorileri.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				EgitimTuruAlanKategorileri.setAlan_adi(restTemp
						.getString("alan_adi"));

				listEgitimTuruAlanKategorileri.add(EgitimTuruAlanKategorileri);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err.println("getegitimturualankategorileri Error: "
						+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err.println("getegitimturualankategorileri Error: "
						+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruAlanKategorileri;

	}

	// INSERT
	public static String putEgitimTuruAlanKategorileri(String egitim_turu_adi,
			String alan_adi) {

		String result = "";

		getConnection();

		String strSQL = "INSERT INTO egitim_turu_alan_kategorileri(egitim_turu_adi,alan_adi)  VALUES (?,?) ";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(egitim_turu_adi);
		lstValues.add(alan_adi);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	// EĞİTİM TÜRÜ Alan KATEGORİLERİ
	// GET
	public static List<EgitimTuru> getEgitimTuruAlanKategorileriGetEgitimTuru(
			String criteria) {

		List<EgitimTuru> listEgitimTuruAlanKategorileri = new ArrayList<EgitimTuru>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT DISTINCT egitim_turu_adi FROM egitim_turu_alan_kategorileri ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuru egitimTuru = new EgitimTuru();

				egitimTuru.setId(restTemp.getString("id"));
				egitimTuru.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));

				listEgitimTuruAlanKategorileri.add(egitimTuru);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getEgitimTuruAlanKategorileriGetEgitimTuru Error: "
								+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err
						.println("getEgitimTuruAlanKategorileriGetEgitimTuru Error: "
								+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruAlanKategorileri;

	}

	// EĞİTİM TÜRÜ Alan KATEGORİLERİ
	// GET
	public static List<EgitimTuruAlanKategorileri> getEgitimTuruAlanKategorileriGetAlanAdi(
			String criteria) {

		List<EgitimTuruAlanKategorileri> listEgitimTuruAlanKategorileri = new ArrayList<EgitimTuruAlanKategorileri>();

		getConnection();

		System.out.println("CRITERIA: " + criteria);

		String strSQL = "SELECT DISTINCT  alan_adi FROM egitim_turu_alan_kategorileri ";
		if (criteria.length() > 15) {

			strSQL = strSQL + criteria;
		}

		System.out.println("SQL33333333: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			while (restTemp.next()) {
				EgitimTuruAlanKategorileri egitimTuruAlanKategorileri = new EgitimTuruAlanKategorileri();

				egitimTuruAlanKategorileri.setId(restTemp.getString("id"));
				egitimTuruAlanKategorileri.setEgitim_turu_adi(restTemp
						.getString("egitim_turu_adi"));
				egitimTuruAlanKategorileri.setAlan_adi(restTemp
						.getString("alan_adi"));

				listEgitimTuruAlanKategorileri.add(egitimTuruAlanKategorileri);

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {
				System.err
						.println("getEgitimTuruAlanKategorileriGetAlanAdi Error: "
								+ e.getMessage());
				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {
				System.err
						.println("getEgitimTuruAlanKategorileriGetAlanAdi Error: "
								+ e1.getMessage());
				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return listEgitimTuruAlanKategorileri;

	}

	// // INSERT
	// public static String putEgitimTuruAlanKategorileri(String
	// egitim_turu_adi,
	// String alan_adi) {
	//
	// String result = "";
	//
	// getConnection();
	//
	// String strSQL =
	// "INSERT INTO egitim_turu_alan_kategorileri(egitim_turu_adi,alan_adi)  VALUES (?,?) ";
	//
	// List<String> lstValues = new ArrayList<String>();
	//
	// lstValues.add(egitim_turu_adi);
	// lstValues.add(alan_adi);
	//
	// result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);
	//
	// if (result.length() > 1) {
	//
	// System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
	// + result);
	//
	// }
	//
	// return result;
	//
	// }

	//
	//
	//
	//
	//

	public static String insertRegisteredUsers(String userName,
			String userPass, String companyPersonName, String phone1,
			String phone2, String district, String city, String state,
			String stateNumberCode, String country, String address1,
			String address2, String zipcode, String macID, String wanIP,
			String lanIP, String installType, String soldDate,
			String installDate, String billNo, String licenseClientCount,
			String licenseGuiCount, String diskSerialID, String saleType,
			String licenseClientDays, String licenseGuiDays) {

		String result = "";

		getConnection();

		String strSQL = "SELECT ins_registered_users(?, ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?, ? )";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(userName);
		lstValues.add(userPass);
		lstValues.add(companyPersonName);
		lstValues.add(phone1);
		lstValues.add(phone2);
		lstValues.add(district);
		lstValues.add(city);

		lstValues.add(state);
		lstValues.add(stateNumberCode);
		lstValues.add(country);
		lstValues.add(address1);
		lstValues.add(address2);
		lstValues.add(zipcode);

		lstValues.add(macID);
		lstValues.add(wanIP);
		lstValues.add(lanIP);
		lstValues.add(installType);
		lstValues.add(soldDate);
		lstValues.add(installDate);

		lstValues.add(billNo);
		lstValues.add(licenseClientCount);
		lstValues.add(licenseGuiCount);
		lstValues.add(diskSerialID);
		lstValues.add(saleType);
		lstValues.add(licenseClientDays);
		lstValues.add(licenseGuiDays);

		result = strRunSelectSQLWithPreparedStatement(strSQL, lstValues);

		if (result.length() > 1) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY --- "
					+ result);

		}

		return result;

	}

	public static void insertSystemInfo(String clientID, String systemInfo) {

		getConnection();

		String strSQL = "INSERT INTO clients_info (client_id, client_id_all_info) VALUES (?, ?)";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(clientID);
		lstValues.add(systemInfo);

		if (booRunSQLWithPreparedStatement(strSQL, lstValues)) {

			System.out.println("CLIENTS_INFO INSERTED SUCCESSFULLY");
		}

	}

	public static List<String> lstGetFieldValues(String sql, String fieldToGet) {

		List<String> lstResult = new ArrayList<String>();

		return lstResult;
	}

	public static String getRegType(String diskID, String regID) {

		String result = "NOT_REGISTERED";

		getConnection();

		// if(regID.equalsIgnoreCase(""))

		String strSQL = "SELECT reg_id, install_type FROM  registered_users  WHERE  lower(disk_serial_id) = "
				+ "'" + diskID.toLowerCase() + "'  ORDER BY id DESC";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				System.out.println("REG VALUE 1 : "
						+ restTemp.getString("reg_id"));

				System.out.println("REG VALUE 2 : " + regID);

				if (restTemp.getString("reg_id").equalsIgnoreCase(regID)) {

					result = "REGISTERED" + "."
							+ restTemp.getInt("install_type");

				}

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}

	public static boolean booRunSQLWithPreparedStatement(String strSQL,
			List<String> lstValues) {

		boolean booTemp = false;

		Connection connTemp = _con;
		PreparedStatement ptmtTemp = null;

		System.out.println("sql " + strSQL);

		try {

			if (connTemp.isClosed()) {

				return booTemp;
			}

			ptmtTemp = connTemp.prepareStatement(strSQL);

			for (int i = 0; i < lstValues.size(); i++) {

				ptmtTemp.setObject(i + 1, lstValues.get(i));
			}

			System.out.println("booRunSQLWithPreparedStatement() " + strSQL);

			ptmtTemp.execute();
			booTemp = true;

			ptmtTemp.close();
			_con.close();

		} catch (SQLException ex) {

			try {

				ptmtTemp.close();
				_con.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}

			booTemp = false;
			System.err.println("booRunSQL() Exception: " + ex.getMessage());
			System.err.println("booRunSQL() SQL: " + strSQL);
		}

		return booTemp;
	}

	public static String strRunSelectSQLWithPreparedStatement(String strSQL,
			List<String> lstValues) {

		String strTemp = "";

		Connection connTemp = _con;
		PreparedStatement ptmtTemp = null;

		System.out.println("sql " + strSQL);

		try {

			if (connTemp.isClosed()) {

				return "";
			}

			ptmtTemp = connTemp.prepareStatement(strSQL);

			for (int i = 0; i < lstValues.size(); i++) {

				ptmtTemp.setObject(i + 1, lstValues.get(i));
			}

			System.out.println("strRunSelectSQLWithPreparedStatement() "
					+ strSQL);

			ResultSet restTemp = ptmtTemp.executeQuery();

			if (restTemp.next()) {

				strTemp = restTemp.getString(1);
			}

			ptmtTemp.close();
			_con.close();

		} catch (SQLException ex) {

			try {

				ptmtTemp.close();
				_con.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}

			strTemp = "";
			System.err
					.println("strRunSelectSQLWithPreparedStatement() Exception: "
							+ ex.getMessage());
			System.err.println("strRunSelectSQLWithPreparedStatement() SQL: "
					+ strSQL);
		}

		return strTemp;
	}

	public static Connection getConnection() {

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		try {

			_con = DriverManager.getConnection(
					"jdbc:postgresql://localhost/icacourses:5432", "postgres",
					"akay");
			// "pbhbar");

			return _con;

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return null;

	}

	public static String exportQueryToXml(String query) {

		String result = "";

		getConnection();

		// if(regID.equalsIgnoreCase(""))

		String strSQL = "select query_to_xml('" + query
				+ "', false, false, '')";

		System.out.println("SQL: " + strSQL);

		// NOW PROCESS
		Connection connTemp = _con;
		Statement stmtTemp = null;
		ResultSet restTemp = null;

		try {

			if (connTemp.isClosed()) {

			}

			stmtTemp = connTemp.createStatement(ResultSet.TYPE_FORWARD_ONLY,
					ResultSet.CONCUR_READ_ONLY);
			restTemp = stmtTemp.executeQuery(strSQL);

			if (restTemp.next()) {

				result = restTemp.getString("query_to_xml");

			}

			// Close
			restTemp.close();
			stmtTemp.close();
			_con.close();

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();
				_con.close();

			} catch (SQLException e1) {

				e1.printStackTrace();
			}

			e.printStackTrace();

		}

		return result;

	}
}
