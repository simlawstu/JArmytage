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
public class ExternalProviderResidentialTrip extends Trip {
    
    public ExternalProviderResidentialTrip()
    {
        // Calls consructor for base class,
        // The base class constructor initialises the Bookings collection
        super();
    }
    
    public void AddBooking(Student student, float payment, boolean hasConsent)
    {
        ResidentialBooking booking = new ResidentialBooking();
        booking.student = student;
        booking.payment = payment;
        booking.hasConsent = hasConsent;
        bookings.add(booking);
    }
}
