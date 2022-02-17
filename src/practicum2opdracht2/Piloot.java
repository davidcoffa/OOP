package practicum2opdracht2;

public class Piloot {
    private String naam;
    private Double salaris;
    private Integer vlieguren;

    public Piloot(String naam){
        this.naam = naam;
        this.salaris = salaris;
        this.vlieguren = vlieguren;
    }
    public Double getSalaris()
    { return salaris; }
    public Integer verhoogVliegurenMet(Integer vlieguren){
        Integer y = vlieguren+getVlieguren();
        return y;
    }
    public Integer getVlieguren()
    {return vlieguren;}
    public void setSalaris(Double salaris){
        this.salaris=salaris;
    }
    public String toString(){
        String x = naam + " heeft" + vlieguren + " gemaakt en verdient " + salaris;
        return x;
    }

}


