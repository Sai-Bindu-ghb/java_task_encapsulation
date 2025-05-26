package com.school;

public class School {

	private String schoolName;
	private String schoolAddress;
	private String schoolMotto;

	private School(String schoolName, String schoolAddress, String schoolMotto) {

		this.setSchoolName(schoolName);
		this.setSchoolAddress(schoolAddress);
		this.setSchoolMotto(schoolMotto);
	}

	// getters
	public String getSchoolName() {
		return schoolName;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public String getSchoolMotto() {
		return schoolMotto;
	}

	// setters
	public void setSchoolName(String schoolName) {
		if (schoolName == null || schoolName.isEmpty()) {
			this.schoolName = null;
		} else {
			this.schoolName = schoolName;
		}
	}

	public void setSchoolAddress(String schoolAddress) {
		if (schoolAddress == null || schoolAddress.isEmpty()) {
			this.schoolAddress = null;
		} else {
			this.schoolAddress = schoolAddress;
		}

	}

	public void setSchoolMotto(String schoolMotto) {
		if (schoolMotto == null || schoolMotto.isEmpty()) {
			this.schoolMotto = null;
		} else {
			this.schoolMotto = schoolMotto;
		}

	}

	public String toString() {

		return "School Name:" + "[" + schoolName + "]" + " Address:" + "[" + schoolAddress + "]" + " Motto:" + "["
				+ schoolMotto + "]";
	}

	public static School getSchoolObject(String schoolName, String schoolAddress, String schoolMotto) {
		if (schoolName == null || schoolAddress == null || schoolMotto == null || schoolName.isEmpty()
				|| schoolAddress.isEmpty() || schoolMotto.isEmpty()) {
			return null;
			
		}
		return new School(schoolName, schoolAddress, schoolMotto);
	}
}
