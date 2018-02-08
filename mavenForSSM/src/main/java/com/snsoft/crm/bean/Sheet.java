package com.snsoft.crm.bean;

public class Sheet {
	private String sheeticode;
	private String sheetcode;
	private String cuicode;
	
	public Sheet() {
	}

	public String getSheeticode() {
		return sheeticode;
	}
	public void setSheeticode(String sheeticode) {
		this.sheeticode = sheeticode;
	}
	public String getSheetcode() {
		return sheetcode;
	}
	public void setSheetcode(String sheetcode) {
		this.sheetcode = sheetcode;
	}
	public String getCuicode() {
		return cuicode;
	}
	public void setCuicode(String cuicode) {
		this.cuicode = cuicode;
	}

	@Override
	public String toString() {
		return "Sheet [sheeticode=" + sheeticode + ", sheetcode=" + sheetcode + ", cuicode=" + cuicode + "]";
	}
}
