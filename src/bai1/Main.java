package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main extends ManagerStudentInfo{
	private static Scanner sc;
	static String inputkey = "";
	static List<ManagerStudentInfo> abc = new ArrayList<>();
	static ListStudent list = new ListStudent();
	public static void main(String[] args) 
	{
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.print(" Please Enter keyboard : ");
			inputkey = sc.nextLine();
			switch (inputkey) {
			case "1": {
				ManagerStudentInfo addman = new ManagerStudentInfo();
				sc = new Scanner(System.in);
				System.out.print(" Please Enter studentCode : ");
				addman.setStudentCode(sc.nextLine().toString());
				addman.setStudentName(sc.nextLine().toString());
				addman.setStudentAge(Integer.parseInt(sc.nextLine()));
				addman.setStudentSex(sc.nextLine().toString());
				list.addmana(addman);
				break;
			}
			case "2": {
				abc = list.show();
				for (ManagerStudentInfo managerStudentInfo : abc) {
					System.out.print(" Code : " +managerStudentInfo.getStudentCode());
					System.out.print(" Name : " +managerStudentInfo.getStudentName());
					System.out.print(" Age : " +managerStudentInfo.getStudentAge());
					System.out.print(" Sex : " +managerStudentInfo.getStudentSex());
				}
				break;
			}
			case "n": {
				System.exit(0); 
			}
			
		}
		}	
		
	}
}
