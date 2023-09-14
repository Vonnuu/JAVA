import java.util.InputMismatchException;
import java.util.Scanner;

public class karl7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Sisesta esimene arv: ");
                double arv1 = scanner.nextDouble();
                
                System.out.print("Sisesta teine arv: ");
                double arv2 = scanner.nextDouble();

                double tulemus = arv1 + arv2;

                System.out.println("vastus: " + tulemus);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Kirjuta õigesti see polnud number, tee uuesti");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
