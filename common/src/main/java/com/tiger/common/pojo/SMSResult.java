package com.tiger.common.pojo;

import com.tiger.common.pojo.SMSResult;

public class SMSResult {

	private boolean status;
	private String message;
	
	public SMSResult(boolean status, String message) {
		this.status = status;
		this.message = message;
	}
	
	public SMSResult() {
		
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public static SMSResult ok(){
		return new SMSResult(true, "发送成功");
	}
	
	public static SMSResult failed(String message){
		return new SMSResult(false, message);
	}

}
