package main;

public class RepairOne {
	//자동차 한 대 책임
	private String repairDate=null;
	private String title=null;
	private String memo=null;
	
	//수리 내역을 저장할 책임 > 수리 내역은 여러개 이므로 배열로
	private RepairOne[] repairList = new RepairOne[5];
	
	public String getRepairDate() {
		return repairDate;
	}

	public void setRepairDate(String repairDate) {
		this.repairDate = repairDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public RepairOne[] getRepairList() {
		return repairList;
	}

	public void setRepairList(RepairOne[] repairList) {
		this.repairList = repairList;
	}

	public void menu() {
		System.out.println("수리등록, 2.전체보기");
	}
	public void prt() {
		System.out.println("제목 : "+this.title);
		System.out.println("날짜 : "+this.repairDate);
		System.out.println("내용 : "+this.memo);
	}
}
