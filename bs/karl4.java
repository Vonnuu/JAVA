import java.util.Scanner;

public class karl4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("kirjuta lause: ");
        String sona = scan.nextLine();
        System.out.println(sona.toUpperCase());
        System.out.println(sona.length());
        String[] sonad = sona.split(" ");
        System.out.println(sonad.length);
        System.out.printf("Esimene sona on '%s'", sonad[0]);
        scan.close();
        
    }
}
