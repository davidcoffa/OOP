package practicum2b;

public class Voetbalclub {
    private String naam;
    private int aantalPunten;
    private int aantalGespeeld;
    private int aantalGewonnen;
    private int aantalVerloren;
    private int aantalGelijk;

    public Voetbalclub(String naam){
        this.naam=naam;
    }
    public int aantalPunten(){
        int totaalPunten = aantalGewonnen * 3;
        int totaalGelijk = aantalGelijk * 1;
        return totaalPunten + totaalGelijk;
    }
    public int aantalGespeeld(){
        int x = aantalGewonnen + aantalVerloren + aantalGelijk;
        return x;
    }
    public String getNaam(){
        return naam;
    }
    public int getAantalGespeeld() {
        return aantalGespeeld;
    }
    public int getAantalGewonnen() {
        return aantalGewonnen;
    }
    public int getAantalVerloren() {
        return aantalVerloren;
    }
    public int getAantalGelijk() {
        return aantalGelijk;
    }
    public void verwerkResultaat(char ch) {
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }
    public String toString(){
        String x = naam + " "+aantalGespeeld() + " "+ aantalGewonnen +" "+aantalGelijk + " "+aantalVerloren + " "+aantalPunten();
        return x;
    }

}


