package week1les1opdracht3;

public class Main {
    public static void main(String[]args){
        Student x = new Student("David", "Populierendreef 188", "Voorburg", 12345);
        System.out.println(x.toString());

        Student y = new Student("Jorick", "Doornenburg 7",  "Leidschendam", 54321);
        System.out.println(y.toString());
    }
}
