package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scan.nextLine();
		
		Connection con = DBCon.getCon();
		try {
			System.out.println("NAME INTO : ");
			String uiName = scan.nextLine();
			String sql = "UPDATE user_info ";
			sql += "SET UI_NAME = '" + uiName + "' WHERE UI_ID = '" + uiId + "'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			System.out.println(uiName + "으로 변경되었습니다!");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
