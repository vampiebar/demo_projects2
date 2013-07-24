package com.icarusdb.secpa.workviewer.register.ws;

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

	public static void insertRegisteredUsers(String userName, String userPass,
			String companyPersonName, String phone1, String district,
			String city, String state, String stateNumberCode, String country,
			String address1, String address2, String zipcode, String macID,
			String wanIP, String lanIP, String installType, String soldDate,
			String installDate, String billNo, String licenceClientCount,
			String licenceGuiCount, String diskSerialID, String saleType,
			String licenceClientDays, String licenceGuiDays) {

		getConnection();

		String strSQL = "SELECT ins_registered_users(?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?,   ?, ?, ?, ?, ?, ?, ? )";

		List<String> lstValues = new ArrayList<String>();

		lstValues.add(userName);
		lstValues.add(userPass);
		lstValues.add(companyPersonName);
		lstValues.add(phone1);
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
		lstValues.add(licenceClientCount);
		lstValues.add(licenceGuiCount);
		lstValues.add(diskSerialID);
		lstValues.add(saleType);
		lstValues.add(licenceClientDays);
		lstValues.add(licenceGuiDays);

		if (booRunSQLWithPreparedStatement(strSQL, lstValues)) {

			System.out.println("REGISTERED_USERS INSERTED SUCCESSFULLY");
		}

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

		String strSQL = "SELECT reg_id, install_type FROM  registered_users  WHERE  disk_serial_id = "
				+ "'" + diskID + "'";

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

		} catch (SQLException e) {

			try {

				restTemp.close();
				stmtTemp.close();

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

		} catch (SQLException ex) {

			try {

				ptmtTemp.close();

			} catch (SQLException e) {

				e.printStackTrace();
			}

			booTemp = false;
			System.err.println("booRunSQL() Exception: " + ex.getMessage());
			System.err.println("booRunSQL() SQL: " + strSQL);
		}

		return booTemp;
	}

	public static Connection getConnection() {

		try {

			Class.forName("org.postgresql.Driver");

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		}

		try {

			_con = DriverManager.getConnection(
					"jdbc:postgresql://localhost/icaosctrl", "postgres",
					"secpa!74!#");

			return _con;

		} catch (SQLException e) {

			e.printStackTrace();

		}

		return null;

	}

}
