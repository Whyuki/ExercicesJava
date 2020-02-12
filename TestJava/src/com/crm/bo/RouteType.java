package com.crm.bo;

public enum RouteType {
	VILLE("ville"), ROUTE("route"), AUTOROUTE("autoroute");

	private final String text;
	
	RouteType(final String text) {
		this.text = text;
	}
	public String toString() {
		return text;
	}
}
