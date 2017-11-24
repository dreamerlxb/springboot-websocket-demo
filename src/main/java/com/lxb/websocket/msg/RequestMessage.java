package com.lxb.websocket.msg;

public class RequestMessage {
	
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public RequestMessage(String msg) {
		super();
		this.msg = msg;
	}
	
	public RequestMessage() {
		super();
	}
}
