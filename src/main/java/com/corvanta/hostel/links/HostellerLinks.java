package com.corvanta.hostel.links;

import org.springframework.stereotype.Component;

@Component
public class HostellerLinks {

	public static final String LIST_HOSTELLERS = "/hostellers";
	public static final String ADD_HOSTELLER = "/hosteller";
	public static final String GET_HOSTELLER = "/hosteller/{id}";
	public static final String UPDATE_HOSTELLER = "/hosteller/{id}";
	public static final String DELETE_HOSTELLER = "/hosteller/delete/{id}";
	public static final String GET_HOSTELLERSBYLOCATION = "/hosteller/location/{locationId}";
	public static final String GET_HOSTELLERBYAPARTMENTS = "/hosteller/apartment/{serviceApartmentId}";
	public static final String GET_HOSTELLERBYLOCATIONANDAPARTMENTS = "/hosteller/{locationId}/{serviceApartmentId}";
	public static final String LIST_ROOMDETAILS = "/roomDetails";
	public static final String ADD_ROOMDETAILS = "/roomDetail";
	public static final String GET_ROOMDETAILS = "/roomDetail/{id}";
	public static final String UPDATE_ROOMDETAILS = "/roomDetail/{id}";
	public static final String LIST_REQUESTS = "/servicerequests";
	public static final String ADD_REQUEST = "/servicerequest";
	public static final String GET_REQUEST = "/servicerequest/{id}";
	public static final String UPDATE_REQUEST = "/servicerequest/{id}";
	public static final String DELETE_REQUEST = "/servicerequest/delete/{id}";
	public static final String LIST_FEEDBACKS = "/feedbacks";
	public static final String ADD_FEEDBACK = "/feedback";
	public static final String GET_FEEDBACK = "/feedback/{id}";
	public static final String UPDATE_FEEDBACK = "/feedback/{id}";
	public static final String DELETE_FEEDBACK = "/feedback/delete/{id}";
	public static final String ADD_PROFILE = "/addprofile";
	public static final String GET_PROFILE = "/addprofile";
	public static final String UPDATE_PROFILE = "/addprofile";
	public static final String LIST_LOCATIONS = "/locations";
	public static final String ADD_LOCATION = "/location";
	public static final String GET_LOCATION = "/location/{id}";
	public static final String UPDATE_LOCATION = "/location/{id}";
	public static final String DELETE_LOCATION = "/location/delete/{id}";
	public static final String LIST_SERVICEAPARTMENTS = "/apartments";
	public static final String ADD_SERVICEAPARTMENT = "/apartment";
	public static final String GET_SERVICEAPARTMENTSBYID = "/apartments/{id}";
	public static final String GET_SERVICEAPARTMENTSBYLOCATIONID = "/apartments/location/{locationId}";
	public static final String UPDATE_SERVICEAPARTMENTS = "/apartment/{id}";
	public static final String DELETE_SERVICEAPARTMENTS = "/apartment/delete/{id}";
	public static final String LIST_ROOMS = "/rooms";
	public static final String ADD_ROOM = "/room";
	public static final String GET_ROOMBYFILTERS = "/room/{locationId}/{serviceApartmentId}";
	public static final String GET_ROOMBYID = "/room/{id}";
	public static final String UPDATE_ROOM = "/room/{id}";
	public static final String DELETE_ROOM = "/room/delete/{id}";
	public static final String LIST_EXPENSETYPES = "/expenseTypes";
	public static final String ADD_EXPENSETYPE = "/expenseType";
	public static final String GET_EXPENSETYPE = "/expenseType/{id}";
	public static final String UPDATE_EXPENSETYPE = "/expenseType/{id}";
	public static final String DELETE_EXPENSETYPE = "/expenseType/delete/{id}";
	public static final String ADD_USEREXPENSE = "/userExpense";
	public static final String GET_USEREXPENSES = "/userExpenses";
	public static final String GET_USEREXPENSEBYLOCATION = "/userExpenses/location/{locationId}";
	public static final String GET_USEREXPENSEBYAPARTMENT = "/userExpenses/serviceApartment/{serviceApartmentId}";
	public static final String GET_USEREXPENSEBYROOM = "/userExpenses/room/{roomId}";
	public static final String GET_USEREXPENSEBYEXPENSE = "/userExpenses/expense/{expenseId}";

}
