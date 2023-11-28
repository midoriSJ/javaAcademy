import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class DisplayInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strFn = "src/twograde.csv";
		
		try {
			Reader rd = new InputStreamReader(new FileInputStream(strFn), "euc-kr");
			BufferedReader bf = new BufferedReader(rd);
			try {
				String strTemp;
				
				int nLine = 0;
				
				while((strTemp = bf.readLine()) != null) {
					nLine++;
				}
				
				System.out.println(nLine);
				bf.close();
				rd.close();
				
				int nSt = nLine - 1;
				
				GIS[] oneSt = new GIS[nSt];
				
				FileInputStream fis = new FileInputStream(strFn);
				
				Scanner sc = new Scanner(strFn);
				
				strTemp = sc.nextLine();
				
				String csvSpby = ",";
				String[] strLineArr;
				
				for(int i = 0; i <= 28; i++) {
					if(sc.hasNextLine()) {
						strTemp = sc.nextLine();
						strLineArr = strTemp.split(csvSpby);
						String strDepartment = strLineArr[0];
						String nGrade = strLineArr[1];
						String strId = strLineArr[2];
						String strName = strLineArr[3];
						String strAdd = strLineArr[4];
						String strEmail = strLineArr[5];
						
						System.out.println(strDepartment);
						System.out.println(nGrade);
						System.out.println(strId);
						System.out.println(strName);
						System.out.println(strAdd);
						System.out.println(strEmail);
						
						oneSt[i] = new GIS(nGrade, strId, strName, strAdd, strEmail);
						oneSt[i].setDepartment(strDepartment);
						
						
					}
				}
				
				sc.close();
				
				
				
			} catch(Exception e) {
				
				
				
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
