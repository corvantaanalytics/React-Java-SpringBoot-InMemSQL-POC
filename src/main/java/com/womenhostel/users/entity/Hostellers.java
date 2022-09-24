package com.womenhostel.users.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


import lombok.Data;

@Entity
@Data
public class Hostellers {
	
	@Id
	@Column
    private long id;

    @Column
    @NotNull(message="{NotNull.Hosteller.firstName}")
    private String firstName;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.mobilenumber}")
    private long mobilenumber;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.email}")
    private String email;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.DateOfBirth}")
    private long dateofbirth;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.AddressForCommunication}")
    private String addressforcommunication;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.PermanentAddress}")
    private String permanentaddress;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.ParentName}")
    private String parentname;

    @Column
    @NotNull(message="{NotNull.Hosteller.ParentContactNumber}")
    private long parentcontactnumber; 

    
    @Column
    @NotNull(message="{NotNull.Hosteller.GuardianName}")
    private String guardianname;

    @Column
    @NotNull(message="{NotNull.Hosteller.GuardianContactNumber}")
    private long guardiancontactnumber; 
    
    @Column
    @NotNull(message="{NotNull.Hosteller.WorkplaceInformation}")
    private String workplaceinformation;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.WorplacePhoneNumber}")
    private long workplacephonenumber;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.RoomDetails}")
    private String roomdetails;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.RentDetails}")
    private String rentdetails;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.AdvanceMoney}")
    private long advancemoney;
    
    @Column
    @NotNull(message="{NotNull.Hosteller.DateOfJoining}")
    private long dateofjoining;
    
}
