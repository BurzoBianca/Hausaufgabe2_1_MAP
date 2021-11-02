package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Sport> s1 = new ArrayList<Sport>();
        Mannschaftssport bas1 = new Basketball();
        Mannschaftssport bas2 = new Basketball();
        Leichtathletik h2 = new Hochsprung();
        s1.add(bas1);
        s1.add(bas2);
        s1.add(h2);
        ArrayList<Sport> s2 = new ArrayList<Sport>();
        Leichtathletik h1 = new Hochsprung();
        Mannschaftssport bas3 = new Basketball();
        s2.add(h1);
        s2.add(bas3);
        Benutzer b1 = new Benutzer("Bianca","Burzo", s1);
        Benutzer b2 = new Benutzer("Delia","Burzo", s2);
        System.out.println(b1.kalkuliereZeit());
        System.out.println(b1.kalkuliereZeit1(bas1));
        System.out.println( b1.kalkuliereDurschnittszeit());
        System.out.println(b2.kalkuliereZeit());
        System.out.println(b2.kalkuliereZeit1(h1));
        System.out.println(b2.kalkuliereDurschnittszeit());

    }
}
