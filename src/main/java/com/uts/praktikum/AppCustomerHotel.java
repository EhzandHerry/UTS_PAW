package com.uts.praktikum;

public class AppCustomerHotel {

    public static void main(String[] args) {
        var customer = new CustomerHotel(); 
        customer.name = "Ehzand Herry";
        customer.address = "Timika";

        customer.infoTamu();
        customer.waktuCheckin("10:00 AM");
        customer.waktuCheckout("12:00 PM");
        customer.informasiPembayaran(200);
        customer.pesananMakanan("Steak dan Kentang");
       
    }
}
