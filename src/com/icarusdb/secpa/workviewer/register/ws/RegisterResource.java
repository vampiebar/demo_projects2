package com.icarusdb.secpa.workviewer.register.ws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;

import com.sun.jersey.spi.resource.Singleton;

@Produces("application/xml")
@Path("register")
@Singleton
public class RegisterResource {

	@POST
	@Path("add")
	@Produces("application/xml")
	@Consumes("application/xml")
	public Register addRegister(Register register) {

		String userName = register.getUser_name();
		String userPass = register.getUser_pass();
		String companyPersonName = register.getCompany_person_name();
		String phone1 = register.getPhone1();
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
				phone1, district, city, state, stateNumberCode, country,
				address1, address2, zipcode, macID, wanIP, lanIP, installType,
				soldDate, installDate, billNo, licenceClientCount,
				licenceGuiCount, diskSerialID, saleType, licenceClientDays,
				licenceGuiDays);

		return register;

		// throw new UnsupportedOperationException("Not yet implemented.");
	}

	@POST
	@Path("addwithurl")
	@Produces("application/xml")
	@Consumes("application/xml")
	public String addRegisterWithUrl(@Context UriInfo info) {

		String userName = info.getQueryParameters().getFirst("user_name");
		String userPass = info.getQueryParameters().getFirst("user_pass");
		String companyPersonName = info.getQueryParameters().getFirst(
				"company_person_name");
		String phone1 = info.getQueryParameters().getFirst("phone1");
		String district = info.getQueryParameters().getFirst("district");
		String city = info.getQueryParameters().getFirst("city");
		String state = info.getQueryParameters().getFirst("city");
		String stateNumberCode = info.getQueryParameters().getFirst(
				"state_number_code");
		String country = info.getQueryParameters().getFirst("country");
		String address1 = info.getQueryParameters().getFirst("address1");
		String address2 = info.getQueryParameters().getFirst("address2");
		String zipcode = info.getQueryParameters().getFirst("zipcode");
		String macID = info.getQueryParameters().getFirst("mac_id");
		String wanIP = info.getQueryParameters().getFirst("wan_ip");
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

		DBUtil.insertRegisteredUsers(userName, userPass, companyPersonName,
				phone1, district, city, state, stateNumberCode, country,
				address1, address2, zipcode, macID, wanIP, lanIP, installType,
				soldDate, installDate, billNo, licenseClientCount,
				licenseGuiCount, diskSerialID, saleType, licenseClientDays,
				licenseGuiDays);

		return "INSERTED";

		// throw new UnsupportedOperationException("Not yet implemented.");
	}

	@GET
	@Path("getRegisterXML")
	@Produces("application/xml")
	public List<Register> getRegisterXML() {
		// throw new UnsupportedOperationException("Not yet implemented.");

		List<Register> lstRegister = new ArrayList<Register>();

		Register register = new Register();

		register.setReg_id("AAA-TR-1234");
		register.setUser_name("bulent@hotmail.com");
		register.setUser_pass("passsssss");

		register.setDate_time(new Date());

		lstRegister.add(register);

		return lstRegister;

	}

	@GET
	@Path("getRegisterJSON")
	@Produces("application/json")
	public List<Register> getRegisterJSON() {
		// throw new UnsupportedOperationException("Not yet implemented.");

		List<Register> lstRegister = new ArrayList<Register>();

		Register register = new Register();

		register.setReg_id("AAA-TR-1234");

		lstRegister.add(register);

		return lstRegister;
	}

	@GET
	@Path("/checkreg/{disk_id}/{reg_id}")
	@Produces("text/plain")
	public String checkReg(@PathParam("disk_id") String diskID,
			@PathParam("reg_id") String regID) {

		// String result = "NOT_REGISTERED";
		//
		// if () {
		//
		// result = "REGISTERED";
		// }

		return DBUtil.getRegType(diskID, regID);

	}

	@POST
	@Path("/systeminfo")
	@Produces("text/plain")
	public String getSystemInfo(@Context UriInfo info) {

		String result = "";

		String clientID = info.getQueryParameters().getFirst("client_id");
		String systemInfo = info.getQueryParameters().getFirst("system_info");

		result = result + clientID + "  " + systemInfo;

		DBUtil.insertSystemInfo(clientID, systemInfo);

		return result;
	}

}