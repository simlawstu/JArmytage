/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripbooking.Classes;

import java.util.ArrayList;

import tripbooking.Classes.Transport;
import tripbooking.Classes.VenueBooking;

/**
 *
 * @author simla
 */
public class InternalProviderResidentialTrip extends Trip {
    
    public ArrayList<SundryCost> sundryCosts; 
    public ArrayList<VenueBooking> venueBookings;
    public ArrayList<Transport> transports;
    public ArrayList<Accomadation> accomadations;

    public InternalProviderResidentialTrip()
    {
        // Calls consructor for base class,
        // The base class constructor initialises the Bookings collection
        super();

        sundryCosts = new ArrayList<>();
        venueBookings = new ArrayList<>();
        transports = new ArrayList<>();
        accomadations = new ArrayList<>();
    }
    
    public void AddBooking(Student student, float payment, boolean hasConsent)
    {
        ResidentialBooking booking = new ResidentialBooking();
        booking.student = student;
        booking.payment = payment;
        booking.hasConsent = hasConsent;
        bookings.add(booking);
    }

    public void AddTransport(Transport transport)
    {
        transports.add(transport);
    }

    public void RemoveTransport(Transport transport)
    {
        if(transports.contains(transport))
        {
            transports.remove(transport);
        }
    }

    public void AddVenueBooking(VenueBooking venueBooking)
    {
        venueBookings.add(venueBooking);
    }

    public void RemoveVenueBooking(VenueBooking venueBooking)
    {
        if(venueBookings.contains(venueBooking))
        {
            venueBookings.remove(venueBooking);
        }
    }

    public void AddSundryCost(SundryCost sundryCost)
    {
        sundryCosts.add(sundryCost);
    }

    public void RemoveSundryCost(SundryCost sundryCost)
    {
        if(sundryCosts.contains(sundryCost))
        {
            sundryCosts.remove(sundryCost);
        }
    }

    public void AddAccomadation(Accommadation accomadation)
    {
        accomadations.add(accomadation);
    }

    public void RemoveAccomadation(Accomadation accomadation)
    {
        if(accomadations.contains(accomadation))
        {
            accomadations.remove(accomadation);
        }
    }
}
