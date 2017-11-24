package com.lxb.websocket.msg;

public class RequestMessage {
	private String name;
	
    public RequestMessage(String name) {
		super();
		this.name = name;
	}
    
    public RequestMessage() {
  		super();
  	}

	public String getName() {
        return name;
    }

	public void setName(String name) {
		this.name = name;
	}
}
