import cricket.ABD;
import cricket.Dhoni;
import cricket.Hardik;
import cricket.Virat;

public class Main {
    public static void main(String[] args) {

        // using cricket package
        System.out.println("Hardik: " + Hardik.getStats());
        System.out.println();
        System.out.println("Virat: " + Virat.getStats());
        System.out.println();
        System.out.println("ABD: " + ABD.getStats());
        System.out.println();
        System.out.println("Dhoni: " + Dhoni.getStats());
    }
}
