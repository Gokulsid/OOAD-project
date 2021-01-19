package com.upgrad;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Address a = new Address("Tatia nagar","Chennai","TN");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("Shaktinagar@chennai@TN");
        System.out.println(a.getAddressDetails());
        a.updateAddressDetails("Nolambur","chennai","TN");
        System.out.println(a.getAddressDetails());

        Contact c = new Contact("Gokul","9361190712","ssgokul22@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("Gokul@7010081995@ssgokul22@gmail.com");
        System.out.println(c.getContactDetails());
        c.setContactDetails("Gokul","9962111331","ssgokul22@gmail.com");
        System.out.println(c.getContactDetails());

        Flight f = new Flight(92,"Air India",250,3);
        System.out.println(f.getFlightDetails());
        System.out.println(f.checkAvailability());
        f.updateBookedSeats(250);
        System.out.println(f.checkAvailability());

        Passenger p = new Passenger(1,"gokul","9962111331",
                "ssg@gmail.com","tatia nagar", "chennai","TN");
        System.out.println(p.getAddress().getAddressDetails());
        System.out.println(p.getContact().getContactDetails());
        System.out.println(p.getId());

        String arrivalTime = "21/01/30 23:23:34";
        String departureTime ="21/01/15 5:23:32";
        RegularTicket rt = new RegularTicket("12225","chennai",
                "madurai",f,
                departureTime,arrivalTime,p,195,4000,false,null);
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getFlightDuration());
        rt.setStatusCancelled();
        System.out.println(rt.checkStatusCancelled());
        System.out.println(rt.getSpecialService());
        rt.updateSpecialService(null);

        String[] touristLocations = {"Goa","Ladakh","Leh"};
        TouristTicket tt = new TouristTicket("12225","chennai",
                "madurai",f,
                departureTime,arrivalTime,p,195,4000,false,a,touristLocations);
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getFlightDuration());
        tt.setStatusCancelled();
        System.out.println(tt.checkStatusCancelled());
        System.out.println(tt.getHotelAddress().getAddressDetails());
        for (String s: tt.touristLocations){
            System.out.println(s);
        }

    }
}
