package indi.dd.demo.vo;

import java.io.Serializable;
import java.util.Date;

public class AbsenceRecord implements Serializable {

	private static final long serialVersionUID = -8572610715178975789L;
	
	public AbsenceRecord(String userName, String vacationType, int itemNumber,
			String reason, Date attendanceStart, Date attendanceEnd) {
		
		this.userName = userName;
		this.vacationType = vacationType;
		this.itemNumber = itemNumber;
		this.reason = reason;
		this.attendanceStart = attendanceStart;
		this.attendanceEnd = attendanceEnd;
		
	}

	private String userName;
	
	private int itemNumber;
	
	private String vacationType;
	
	private String reason;
	
	private Date attendanceStart;
	
	private Date attendanceEnd;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getVacationType() {
		return vacationType;
	}

	public void setVacationType(String vacationType) {
		this.vacationType = vacationType;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public Date getAttendanceStart() {
		return attendanceStart;
	}

	public void setAttendanceStart(Date attendanceStart) {
		this.attendanceStart = attendanceStart;
	}

	public Date getAttendanceEnd() {
		return attendanceEnd;
	}

	public void setAttendanceEnd(Date attendanceEnd) {
		this.attendanceEnd = attendanceEnd;
	}
	
	
	
	
}
