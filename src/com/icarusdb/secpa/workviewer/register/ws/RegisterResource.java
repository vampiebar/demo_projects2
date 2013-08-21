package com.icarusdb.secpa.workviewer.register.ws;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

		// throw new UnsupportedOperationException("Not yet implemented.");
	}

	@GET
	@Path("addwithurl")
	@Produces("text/plain")
	public String addRegisterWithUrl(@Context UriInfo info,
			@Context HttpServletRequest hsr) {

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

		System.out.println("Client IP = " + hsr.getRemoteAddr());

		String wanIP = hsr.getRemoteAddr();

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

		// throw new UnsupportedOperationException("Not yet implemented.");
	}

	@GET
	@Path("/checkreg")
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
		// throw new UnsupportedOperationException("Not yet implemented.");

		String diskid = info.getQueryParameters().getFirst("did");

		String query = "SELECT  *  FROM  registered_users  WHERE disk_serial_id = ''%1'' "
				.replace("%1", diskid);

		return DBUtil.exportQueryToXml(query);
	}

	@GET
	@Path("getregistereduserinfofromregid")
	@Produces("text/plain")
	public String getRegisteredUserInfoFromRegID(@Context UriInfo info) {
		// throw new UnsupportedOperationException("Not yet implemented.");

		String diskid = info.getQueryParameters().getFirst("regid");

		String query = "SELECT  *  FROM  registered_users  WHERE reg_id = ''%1'' "
				.replace("%1", diskid);

		return DBUtil.exportQueryToXml(query);
	}

	@GET
	@Path("getdatetime")
	@Produces("text/plain")
	public String getRegisteredUserInfoFromRegID() {
		// throw new UnsupportedOperationException("Not yet implemented.");

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date());
	}

	@GET
	@Path("getreachperiod")
	@Produces("text/plain")
	public String getReachPeriod() {

		// TODO Later read from database
		return "180";
	}

}