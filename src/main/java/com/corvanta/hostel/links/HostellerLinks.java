package com.corvanta.hostel.links;

import org.springframework.stereotype.Component;

@Component
public class HostellerLinks {
	
	public static final String LIST_HOSTELLERS = "/hostellers";
    public static final String ADD_HOSTELLER = "/hosteller";
    public static final String GET_HOSTELLER = "/hosteller/{id}"; 
    public static final String UPDATE_HOSTELLER = "/hosteller/{id}";
    public static final String LIST_ROOMDETAILS = "/roomDetails";
    public static final String ADD_ROOMDETAILS = "/roomDetail";
    public static final String GET_ROOMDETAILS = "/roomDetail/{id}";
    public static final String UPDATE_ROOMDETAILS = "/roomDetail/{id}";
}
 
