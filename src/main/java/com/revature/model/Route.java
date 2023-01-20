package com.revature.model;

public class Route {
	private int routeId;
	private String source;
	private String destination;
	//private String busReg;
	public Route() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getBusReg() {
		return busReg;
	}

	public void setBusReg(String busReg) {
		this.busReg = busReg;
	}

	public Route(int routeId, String source, String destination, String busReg) {
		super();
		this.routeId = routeId;
		this.source = source;
		this.destination = destination;
		this.busReg = busReg;
	}

	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", source=" + source + ", destination=" + destination + "]";
	}
	
	

}
