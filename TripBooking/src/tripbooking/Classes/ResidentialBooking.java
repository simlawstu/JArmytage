/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tripbooking.Classes;

/**
 *
 * @author jasmi
 */
public class ResidentialBooking extends Booking{
    public Boolean hasConsent;
    public Boolean isValid(){
        if ((trip.price == payment) && hasConsent){
            return true;
        }
        return false;
    }
}
