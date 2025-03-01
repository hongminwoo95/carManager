package main;

import java.util.ArrayList;
import java.util.Scanner;

public class CarOne {
	private String num=null;
	private String UserName=null;
	//private RepairOne[] repairList = new RepairOne[5];
	private ArrayList<RepairOne> repairList = new ArrayList<>();
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	/*public RepairOne[] getRepairList() { // --->배열 대신 컬렉션프레임워크 사용헀기때문에 삭제
		return repairList;
	}
	public void setRepairList(RepairOne[] repairList) {
		this.repairList = repairList;
	}*/
	
	public void prt() {
		System.out.println("차번호 : "+this.num);
		System.out.println("차소유자 : "+this.UserName);
		System.out.println("--- 정비내역 ---");
		listRepair();
	}
	public void menu() {
		Scanner s = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1.수리등록, 2.전체보기");
			System.out.println("번호선택");
			int a = s.nextInt();
			s.nextLine();
			switch(a) {
			case 1: addRepair(); break;
			case 2: listRepair(); break;
			default:
				flag = false;
			}
		}
	}
	private void listRepair() { // 전체보기
		for (RepairOne r : repairList) {
		//	if (r!=null) {
				r.prt();
			}
		}
	private void addRepair() { // 정보입력 > 객체생성 > 배열에 주소 복사
		Scanner s = new Scanner(System.in);
		System.out.println("날짜와 제목과 내용을 차례대로 입력");
		String date=s.nextLine();
		String title=s.nextLine();
		String memo =s.nextLine();
		RepairOne re = new RepairOne();
		re.setRepairDate(date);
		re.setTitle(title);
		re.setMemo(memo);
		/*for(int i=0; i<repairList.length; i++) {
			if(repairList[i]==null) {
				repairList[i]=re;
				break;
			}
		}*/
		repairList.add(re);
	}
}
