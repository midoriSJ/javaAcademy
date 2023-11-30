package day18;

import java.net.InetAddress;

public class inetAddress_ {

	public static void main(String[] args) {
		
		
		
		try {
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내 컴퓨터 IP 주소 >>> " + local.getHostAddress());
			System.out.println("내 컴퓨터 IP 이름 >>> " + local.getHostName());
		} catch (Exception e) {
			
		}
	}

}
