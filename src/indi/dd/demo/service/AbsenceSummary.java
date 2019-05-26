package indi.dd.demo.service;

import java.util.Date;

import indi.dd.demo.vo.AbsenceRecord;

public class AbsenceSummary  {
	
	private AbsenceRecord absenceRecord;
	
	public AbsenceSummary(AbsenceRecord absenceRecord) {
		this.absenceRecord = absenceRecord;
	}
	
	
	
	public static void main(String[] args) {
		
		AbsenceRecord absenceRecord = new AbsenceRecord("Daniel", 
				"Annual Leave", 1, "Family Trip", new Date(), new Date());
		
		AbsenceSummary absenceSummary = new AbsenceSummary(absenceRecord);
		absenceSummary.displaySummary();
	}
	
	
	public void displaySummary() {
		
		System.out.println("show absence summary..");
		
		System.out.println(absenceRecord.getUserName());
		System.out.println(absenceRecord.getItemNumber());
		System.out.println(absenceRecord.getAttendanceStart());
		System.out.println(absenceRecord.getAttendanceEnd());
		System.out.println(absenceRecord.getVacationType());
	
		System.out.println("master add a litte change...");
		
	}

}
