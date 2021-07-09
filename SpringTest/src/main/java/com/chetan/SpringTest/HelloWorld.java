package com.chetan.SpringTest;

public class HelloWorld {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		System.out.println("Your message is:" + msg);
	}

	@Override
	public String toString() {
		return "To String HelloWord [msg=" + msg + "]";
	}

}
