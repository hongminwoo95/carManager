package main;

import java.util.ArrayList;
import java.util.Scanner;

public class CarM {
	//자동차를 관리
	//CarOne 객체를 등록하고 수정하고 삭제 하는 책임
	// private CarOne[] carList = new CarOne[5];
	private ArrayList<CarOne> carList = new ArrayList<>();
	
	public ArrayList<CarOne> carList() {
		return this.carList;
	}
	public void menu() {
		Scanner s = new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println(this.hashCode()+"객체주소");
			System.out.println("1.자동차등록 2.전체보기");
			System.out.println("번호를 선택하세요");
			int a = s.nextInt();
			switch(a) {
			case 1: insertCar(); break;
			case 2: listCar(); break;
			default : flag=false;
			}
		}
	}
	private void insertCar() {
		// 자동차의 정보를 입력받는다
		// CarOne객체를 의존하는데 생성하는 방법이 적당한다.
		// carList 등록한다.
		Scanner s = new Scanner(System.in);
		System.out.println("번호와 소유자를 차례대로 입력하세요");
		String num = s.nextLine();
		String username = s.nextLine();
		CarOne carone = new CarOne();
		carone.setNum(num);
		carone.setUserName(username);
		//for (int i=0; i<carList; i++) {
		//	if(carList[i]==null) {
		//		carList[i]=carone;
		//		break;
		//	}
	//	}  carList에 CarOne 멤버변수를 대입
		carList.add(carone);
	}
	private void listCar() {
		for (CarOne c : carList) {
		//	if(c!=null) {
				c.prt();
		}
	}
	
}
