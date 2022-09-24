package com.corvanta.hostel.links;

import org.springframework.stereotype.Component;

@Component
public class HostellerLinks {
	
	public static final String LIST_HOSTELLERS = "/hostellers";
    public static final String ADD_HOSTELLER = "/hosteller";
    public static final String GET_HOSTELLER = "/hosteller/{id}"; 

}
