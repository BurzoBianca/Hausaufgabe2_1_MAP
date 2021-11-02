package com.company;
import java.util.ArrayList;
import java.util.List;

public class Benutzer {
    private String vorName;
    private String nachName;
    private List<Sport> sports;

    public Benutzer(String vorName, String nachName, List<Sport> sports){
        this.vorName = vorName;
        this.nachName = nachName;
        this.sports = sports;
    }

    public String getVorName() {
        return vorName;
    }

    public void setVorName(String vorName) {
        this.vorName = vorName;
    }

    public String getNachName() {
        return nachName;
    }

    public void setNachName(String nachName) {
        this.nachName = nachName;
    }

    public List<Sport> getSports() {
        return sports;
    }

    public void setSports(List<Sport> sports) {
        this.sports = sports;
    }

    public double kalkuliereZeit(){
        double time = 0;
        for (Sport i : sports){
            time += i.kalkuliereZeit();
        }
        return time;
    }

    public double kalkuliereZeit1(Sport sports){ //metoda care calculeaza timpul pentru un tip de sport
        return sports.kalkuliereZeit();
    }

    public double kalkuliereDurschnittszeit(){ //metoda care calculeaza media in care face sporturile
        double Durchschnitt = kalkuliereZeit() / sports.size();
        return Durchschnitt;
    }

}


