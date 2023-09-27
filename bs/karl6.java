import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class karl6 {

    public static void main(String[] args) {
        String nim = "Karl Robert Masingas";
        String failiNimi = "tulemused.txt";

        try {
            FileWriter failiKirjutaja = new FileWriter(failiNimi);
            failiKirjutaja.write("Autor: " + nim + "\n");
            failiKirjutaja.close();
        } catch (IOException e) {
            System.out.println("Viga faili kirjutamisel: " + e.getMessage());
        }
        ArrayList<Integer> arvudeLoend = new ArrayList<>();
        Scanner skanner = new Scanner(System.in);
        while (true) {
            System.out.print("Sisesta täisarv (tühja rea jaoks lõpetamiseks): ");
            String sisend = skanner.nextLine();

            if (sisend.isEmpty()) {
                break;
            }
            try {
                int arv = Integer.parseInt(sisend);
                arvudeLoend.add(arv);
            } catch (NumberFormatException e) {
                System.out.println("Palun sisesta täisarv.");
            }
        }
        
        skanner.close();

        int summa = 0;
        for (int arv : arvudeLoend) {
            summa += arv;
        }
        double keskmine = (double) summa / arvudeLoend.size();

        try {

            FileWriter failiKirjutaja = new FileWriter(failiNimi, true);
            for (int arv : arvudeLoend) {
                failiKirjutaja.write(arv + "\n");
            }
            failiKirjutaja.write("Summa: " + summa + "\n");
            failiKirjutaja.write("Keskmine: " + keskmine + "\n");
            failiKirjutaja.close();
            
            System.out.println("Tulemused on salvestatud faili " + failiNimi);
        } catch (IOException e) {
            System.out.println("Viga faili kirjutamisel: " + e.getMessage());
        }
    }
}
