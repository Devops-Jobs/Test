package com.ex.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "JayantInfo",enableByDefault = true)
public class ActuatorEndpoints {

	@ReadOperation
	public MyEndpointResponse features() {
		
		return  new MyEndpointResponse(123, "Jayant", "Active");
	}
}
class MyEndpointResponse {
	
	private int id;
	private String name;
	private String status;
	
	public MyEndpointResponse() {
		// TODO Auto-generated constructor stub
	}

	public MyEndpointResponse(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MyEndpointResponse [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
}
