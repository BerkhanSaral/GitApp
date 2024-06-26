package TicketReservationApp;

public class Ticket {

    //4-mesafe(KM),yolculuk tipi,koltuk no,fiyat,otobüs


    private double distance;

    private int typeNo;//1-tek yön 2- çift yön

    private String seatNo;

    private double price;

    private Bus bus;//bu bilet hangi otobüse ait

    //paramli const
    public Ticket(double distance, int typeNo, String seatNo, Bus bus) {
        this.distance = distance;
        this.typeNo = typeNo;
        this.seatNo = seatNo;
        this.bus = bus;
    }

    //getter
    public double getDistance() {
        return distance;
    }

    public int getTypeNo() {
        return typeNo;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public double getPrice() {
        return price;
    }

    public Bus getBus() {
        return bus;
    }

    //setter
    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setTypeNo(int typeNo) {
        this.typeNo = typeNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    //5-bilet fiyatını hesaplama ve set etme
    public void setPrice(int age) {

        double total = 0;

        int seat = Integer.valueOf(this.seatNo);

        switch (this.typeNo) {
            case 1:
                if (seat % 3 == 0) {
                    total = this.distance * 1.2;
                } else {
                    total = this.distance * 1;
                }
                //System.out.println("total = " + total);
                break;
            case 2:
                if (seat % 3 == 0) {
                    total = distance * 2.4;
                } else {
                    total = distance * 2;
                }
                //System.out.println("total = " + total);
                total = total - (total * 20 / 100);
                //System.out.println("total-2 = " + total);
                break;
        }
        if (age < 12) {
            total *= 0.5;
            //System.out.println("12 yas indirimli tutar");
        } else if (age > 65) {
            total *= 0.3;
            //System.out.println("65 yas indirimli tutar");
        }
        this.price = total;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public void printTicket(String name) {
        System.out.println("*".repeat(42));
        System.out.println("----- Bilet Detayi");
        System.out.println("Sayin : " + name);
        System.out.println("Otobus Plakasi : " + this.bus.getNumberPlate());
        System.out.println("Mesafe : " + this.distance);
        System.out.println("Yolculuk Tipi : " + (this.typeNo == 1 ? "Tek Yon" : "Cift yon"));
        System.out.println("Koltuk No : " + this.seatNo);
        System.out.println("Fiyat : " + this.price);
        System.out.println("Keyifli yolculuklar dileriz : " + name);
        System.out.println("*".repeat(42));
    }
}