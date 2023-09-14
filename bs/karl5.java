
import java.util.Scanner;

public class karl5 {
    public static void main(String[] args){
        arvutaja();
        
    }
    public static void arvutaja(){
        for (int i = 0; i < 3; i++){
            Scanner scan = new Scanner(System.in);
            System.out.println("Sisesta esimene arv: ");
            double arv1 = scan.nextInt();
            System.out.println("Sisesta teine arv: ");
            double arv2 = scan.nextInt();
            
            if (arv1 <= 0 || arv2 <= 0) {
                System.out.println("Arv ei jagu");
                System.exit(0); 
            }
            System.out.println("Vastus: " + arv1/arv2);
            scan.close();
        }
    }
}
