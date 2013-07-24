package com.icarusdb.secpa.workviewer.register.ws;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

/*
 * 
 * CREATE TABLE public.registered_users (
 id BIGSERIAL NOT NULL
 , reg_id VARCHAR(64) NOT NULL
 , user_name VARCHAR(2048) NOT NULL
 , user_pass VARCHAR(2048) NOT NULL
 , title VARCHAR(2048)
 , company_person_name VARCHAR(2048)
 , phone1 VARCHAR(30)
 , phone2 VARCHAR(30)
 , district VARCHAR(100)
 , city VARCHAR(100)
 , state VARCHAR(100)
 , country VARCHAR(50) DEFAULT 'TURKIYE'
 , address1 TEXT
 , address2 TEXT
 , zipcode VARCHAR(12)
 , date_time TIMESTAMP
 , update_date_time TIMESTAMP
 , mac_id VARCHAR(30)
 , wan_ip VARCHAR(30)
 , lan_ip VARCHAR(30)
 , install_type INT4
 , last_access_date_time TIMESTAMP
 , prg_version VARCHAR(10)
 , reseller VARCHAR(20)
 , reseller_type INT4
 , sold_date TIMESTAMP
 , install_date TIMESTAMP
 , bill_no VARCHAR(20)
 , license_client_count INT4
 , license_gui_count INT4
 , disk_serial_id VARCHAR(75)
 , sale_type INT4
 , licence_client_days INT4 DEFAULT 15
 , licence_gui_days INT4 DEFAULT 15
 );
 COMMENT ON COLUMN public.registered_users.reg_id IS 'EXAMPLE: TR#00034#1234-1234-1234-1234';
 COMMENT ON COLUMN public.registered_users.user_name IS 'MAIL';
 COMMENT ON COLUMN public.registered_users.sale_type IS 'CC - credit card, PAY - PAYPAL, CASH';

 ALTER TABLE public.registered_users
 ADD CONSTRAINT PK_REGISTERED_USERS
 PRIMARY KEY (id);

 ALTER TABLE public.registered_users
 ADD CONSTRAINT UQ_registered_users_reg_id
 UNIQUE (reg_id);

 ALTER TABLE public.registered_users
 ADD CONSTRAINT UQ_registered_users_reg_id_user_name
 UNIQUE (reg_id, user_name);
 * 
 */

// ins_registered_users(IN par_user_name character varying, IN par_user_pass character varying, IN par_company_person_name character varying, 
//    IN par_phone1 character varying, IN par_district character varying, IN par_city character varying, IN par_state character varying, 
//    IN par_state_number_code character varying, IN par_country character varying, IN par_address1 character varying, IN par_address2 character varying, 
//    IN par_zipcode character varying, IN par_mac_id character varying, IN par_wan_ip character varying, IN par_lan_ip character varying, 
//    IN par_install_type character varying, IN par_sold_date character varying, IN par_install_date character varying, IN par_bill_no character varying, 
//    IN par_licence_client_count character varying, IN par_licence_gui_count character varying, IN par_disk_serial_id character varying, 
//    IN par_licence_client_days character varying, IN par_licence_gui_days character varying) RETURNS character varying AS

@XmlRootElement
public class Register {

	private String user_name;
	private String user_pass;
	private String company_person_name;

	private String phone1;
	private String district;
	private String city;
	private String state;

	private String state_number_code;
	private String country;
	private String address1;
	private String address2;

	private String zipcode;
	private String mac_id;
	private String wan_ip;
	private String lan_ip;

	private String install_type;
	private String sold_date;
	private String install_date;
	private String bill_no;

	private String licence_client_count;
	private String licence_gui_count;
	private String disk_serial_id;
	private String sale_type;

	private String licence_client_days;
	private String licence_gui_days;

	// Generated values
	private String reg_id;
	private Date date_time;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_pass() {
		return user_pass;
	}

	public void setUser_pass(String user_pass) {
		this.user_pass = user_pass;
	}

	public String getCompany_person_name() {
		return company_person_name;
	}

	public void setCompany_person_name(String company_person_name) {
		this.company_person_name = company_person_name;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState_number_code() {
		return state_number_code;
	}

	public void setState_number_code(String state_number_code) {
		this.state_number_code = state_number_code;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getMac_id() {
		return mac_id;
	}

	public void setMac_id(String mac_id) {
		this.mac_id = mac_id;
	}

	public String getWan_ip() {
		return wan_ip;
	}

	public void setWan_ip(String wan_ip) {
		this.wan_ip = wan_ip;
	}

	public String getLan_ip() {
		return lan_ip;
	}

	public void setLan_ip(String lan_ip) {
		this.lan_ip = lan_ip;
	}

	public String getInstall_type() {
		return install_type;
	}

	public void setInstall_type(String install_type) {
		this.install_type = install_type;
	}

	public String getSold_date() {
		return sold_date;
	}

	public void setSold_date(String sold_date) {
		this.sold_date = sold_date;
	}

	public String getInstall_date() {
		return install_date;
	}

	public void setInstall_date(String install_date) {
		this.install_date = install_date;
	}

	public String getBill_no() {
		return bill_no;
	}

	public void setBill_no(String bill_no) {
		this.bill_no = bill_no;
	}

	public String getLicence_client_count() {
		return licence_client_count;
	}

	public void setLicence_client_count(String licence_client_count) {
		this.licence_client_count = licence_client_count;
	}

	public String getLicence_gui_count() {
		return licence_gui_count;
	}

	public void setLicence_gui_count(String licence_gui_count) {
		this.licence_gui_count = licence_gui_count;
	}

	public String getDisk_serial_id() {
		return disk_serial_id;
	}

	public void setDisk_serial_id(String disk_serial_id) {
		this.disk_serial_id = disk_serial_id;
	}

	public String getLicence_client_days() {
		return licence_client_days;
	}

	public void setLicence_client_days(String licence_client_days) {
		this.licence_client_days = licence_client_days;
	}

	public String getLicence_gui_days() {
		return licence_gui_days;
	}

	public void setLicence_gui_days(String licence_gui_days) {
		this.licence_gui_days = licence_gui_days;
	}

	public String getReg_id() {
		return reg_id;
	}

	public void setReg_id(String reg_id) {
		this.reg_id = reg_id;
	}

	public Date getDate_time() {
		return date_time;
	}

	public void setDate_time(Date date_time) {
		this.date_time = date_time;
	}

	public String getSale_type() {
		return sale_type;
	}

	public void setSale_type(String sale_type) {
		this.sale_type = sale_type;
	}

}