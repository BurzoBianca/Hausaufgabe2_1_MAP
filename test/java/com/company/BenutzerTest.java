package com.company;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class BenutzerTest {

    @Test
    void kalkuliereZeit() {

        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("Bianca", "Burzo", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));
        assertEquals(benutzer.kalkuliereZeit(), benutzer.kalkuliereZeit1(basketball) + benutzer.kalkuliereZeit1(fussball) + benutzer.kalkuliereZeit1(hindernislauf) + benutzer.kalkuliereZeit1(hochsprung));
    }

    @Test
    void kalkuliereZeit1() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();
        Benutzer benutzer = new Benutzer("Bianca", "Burzo", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));

        assertEquals(benutzer.kalkuliereZeit1(basketball), 55);
        assertEquals(benutzer.kalkuliereZeit1(fussball), 65);
        assertEquals(benutzer.kalkuliereZeit1(hindernislauf), 30);
        assertEquals(benutzer.kalkuliereZeit1(hochsprung), 20);
    }

    @Test
    void kalkuliereDurschnittszeit() {
        Sport basketball = new Basketball();
        Sport fussball = new Fussball();
        Sport hindernislauf = new Hindernislauf();
        Sport hochsprung = new Hochsprung();

        Benutzer benutzer = new Benutzer("Smith", "Bob", Arrays.asList(basketball, fussball, hindernislauf, hochsprung));
        assertEquals(benutzer.kalkuliereDurschnittszeit(), benutzer.kalkuliereZeit() / 4);
    }
}