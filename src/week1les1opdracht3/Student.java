package week1les1opdracht3;

public class Student {
    private String naam;
    private String adres;                   // de 3 attributen
    private String plaats;
    private Integer studentnummer;

    public Student (String nm, String adr, String pl, Integer sn){
        naam = nm;
        adres = adr;
        plaats = pl;
        studentnummer = sn;
    }
    public String toString(){
        String s = naam + " woont op " + adres + " in " + plaats + " en heeft nummer " + studentnummer + ".";
        return s;
    }
}
