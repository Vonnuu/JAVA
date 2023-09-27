
import java.util.Scanner;

public class karl5 {
    public static void main(String[] args){
        calc();
    }
    public static void calc(){
        for (int i = 0; i < 3; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sisesta esimene arv: ");
            double arv1 = scan.nextInt();
            System.out.println("Sisesta teine arv: ");
            double arv2 = scan.nextInt();

            
            if (arv1 <= 0 || arv2 <= 0) {
                System.out.println("Arvud ei jagu");
                System.exit(0); 
            }
            System.out.println("Vastus on: " + arv1/arv2);
            scan.close();
        }
    }
}
