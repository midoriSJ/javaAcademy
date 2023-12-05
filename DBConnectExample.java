package dbconn;

import java.sql.*;
import java.util.Scanner;

public class DBConnectExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dbDriver = "org.mariadb.jdbc.Driver";
		String dbUrl = "jdbc:mariadb://localhost:23306:jdbc";
		String id = "root";
		String pw = "1234";
		Connection conn = null;
		
		PreparedStatement ps = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			Class.forName(dbDriver);
			conn = DriverManager.getConnection(dbUrl, id, pw);
			
			if(conn != null) {
				System.out.println("DB 연결 완료");
				
				String query = "select * from jdbc.student_info";
				
				Statement st = conn.createStatement();
				
				ResultSet rs = st.executeQuery(query);
				
				while(rs.next()) {
					System.out.println("학생 번호 : " + rs.getString("std_id"));
					System.out.println("학생 이름 : " + rs.getString("std_name"));
					System.out.println("학생 나이 : " + rs.getInt("std_age"));
					System.out.println("학생 학년 : " + rs.getInt("std_grade"));
					System.out.println("학생 성별 : " + rs.getString("std_gender"));
					System.out.println("학생 전화번호 : " + rs.getString("std_phone"));
					System.out.println();
				}

			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				if (sc != null) {
					sc.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
				
				
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
