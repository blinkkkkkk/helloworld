package com.tfl.billing;


public class EntryPoint {
    public static void main(String[] args){
        //TravelTracker tracker = new TravelTracker();
        JourneyPrinter printer = new JourneyPrinter();
        printer.chargeAccounts();
    }
}
