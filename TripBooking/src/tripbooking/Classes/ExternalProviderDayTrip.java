/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripbooking.Classes;

/**
 *
 * @author simla
 */
public class ExternalProviderDayTrip extends Trip {
    
    public ExternalProviderDayTrip()
    {
        // Calls consructor for base class,
        // The base class constructor initialises the Bookings collection
        super();
    }
    
    public void AddBooking(Student student, float payment)
    {
        DayBooking booking = new DayBooking();
        booking.student = student;
        booking.payment = payment;
        bookings.add(booking);
    }
}
