package com.crm.bo;

public enum RouteType {
	ville("ville"), route("route"), autoroute("autoroute");

	private final String text;
	
	RouteType(final String text) {
		this.text = text;
	}
	public String toString() {
		return text;
	}
}
