/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripbooking.Classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jasmi
 */
public class Trip {
    public float price;  

    public Destination destination;
    
    public ArrayList<Booking> bookings;
    
    public Date startDate;
    
    public Date endDate;
    
    public Trip()
    {
        bookings = new ArrayList<>();
    }
    
    public void RemoveBooking(Booking booking)
    {
        if(bookings.contains(booking))
        {
            bookings.remove(booking);
        }
    }
    
    public ArrayList<Booking> GetIncompleteBookings()
    {
        ArrayList<Booking> incompleteBookings = new ArrayList<>();
        
        // Get all bookings that have not been completed. 
        for(Booking b : bookings)
        {
            if(!b.isValid())
            {
                incompleteBookings.add(b);
            }
        }
        return incompleteBookings;
    }
}
