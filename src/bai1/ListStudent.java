package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListStudent {
	private static Scanner sc;
	//list ds thong tin sinh vien
	List<ManagerStudentInfo> abc= new ArrayList<ManagerStudentInfo>();


	public ListStudent() {
		List<ManagerStudentInfo> abc = new ArrayList<ManagerStudentInfo>() ;
		
	}
	public void addmana(ManagerStudentInfo mana) {
		
		 ManagerStudentInfo cba = new ManagerStudentInfo();
		 cba.setStudentCode(mana.getStudentCode());
		 cba.setStudentName(mana.getStudentName());
		 cba.setStudentAge(mana.getStudentAge());
		 cba.setStudentSex(mana.getStudentSex());
//		 Scanner(System.in); System.out.print(" Please Enter studentCode : ");
		 
//		cba.setStudentCode(sc.nextLine().toString());
//		cba.setStudentName(sc.nextLine().toString());
//		cba.setStudentAge(sc.nextInt());
//		cba.setStudentSex(sc.nextLine().toString());
		abc.add(cba);
		
	}
	public List<ManagerStudentInfo> show() {
		return abc;
	}

}
