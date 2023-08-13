package com.uts.praktikum;

public class CustomerHotel {
    String name;
    String address;
    final int noktp = 1281231203;
    final int nokmr = 01;

    public void infoTamu() {
        System.out.println("Info Tamu:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("No KTP: " + noktp);
        System.out.println("No Kamar: " + nokmr);
    }

    public void waktuCheckin(String checkinTime) {
        System.out.println("Waktu Check-in: " + checkinTime);
    }

    public void waktuCheckout(String checkoutTime) {
        System.out.println("Waktu Check-out: " + checkoutTime);
    }

    public void informasiPembayaran(double amount) {
        System.out.println("Informasi Pembayaran:");
        System.out.println("Total Amount: Rp." + amount);
        
    }

    public void pesananMakanan(String foodOrder) {
        System.out.println("Pesanan Makanan: " + foodOrder);
    
    }

   
}
