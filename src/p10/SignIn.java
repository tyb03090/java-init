package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SignIn {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("ID : ");
		String uiId = scan.nextLine();
		System.out.println("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.println("NAME : ");
		String uiName = scan.nextLine();
		
		String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME) ";
		sql += "VALUES('" + uiId + "','" + uiPwd + "','" + uiName + "')";
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println(uiName + "님 환영합니다~");
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
