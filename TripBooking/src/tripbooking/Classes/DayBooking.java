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
public class DayBooking extends Booking{    
    
    public Boolean isValid(){
        if (trip.price == payment){
            return true;
        }
        return false;
    } 
    
    
}
