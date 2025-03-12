package com.kh.homework.model.dto;

import java.sql.Date;
import java.util.Objects;

public class TbUserDTO {

	private long userNo;
	private String userId;
	private String userPw;
	private String userName;
	private Date enrollDate;
	
	public TbUserDTO() {
		super();
	}

	public TbUserDTO(long userNo, String userId, String userPw, String userName, Date enrollDate) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.userPw = userPw;
		this.userName = userName;
		this.enrollDate = enrollDate;
	}

	public long getUserNo() {
		return userNo;
	}

	public void setUserNo(long userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enrollDate, userId, userName, userNo, userPw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TbUserDTO other = (TbUserDTO) obj;
		return Objects.equals(enrollDate, other.enrollDate) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName) && userNo == other.userNo
				&& Objects.equals(userPw, other.userPw);
	}

	@Override
	public String toString() {
		return "TbUserDTO [userNo=" + userNo + ", userId=" + userId + ", userPw=" + userPw + ", userName=" + userName
				+ ", enrollDate=" + enrollDate + "]";
	}
	
}
