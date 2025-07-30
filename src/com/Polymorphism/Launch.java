package com.Polymorphism;

public class Launch {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Thar thar = new Thar();
        garage.permit(thar);
        Audi audi = new Audi();
        garage.permit(audi);
        Alto alto= new Alto();
        garage.permit(alto);
    }
}
