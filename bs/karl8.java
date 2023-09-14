import java.util.Scanner;

public class karl8 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.print("Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala (3)\nVali tegevus: "); 
		String valik = scanner.next();
		System.out.print("Sisesta alus: ");
		String alus = scanner.next();
		System.out.print("Sisesta kõrgus: ");
		String korgus = scanner.next();
		
		double s;
		switch (Integer.parseInt(valik)) {
		case 1:
			s = Pindalad.roopkylikS(alus, korgus);
			System.out.printf("Rööpküliku pindala on %.2f ",s);
			break;
		case 2:
			s = Pindalad.ristkylikS(alus, korgus);
			System.out.printf("Ristküliku pindala on %.2f ",s);
			break;
		case 3:
			s = Pindalad.kolmnurkS(alus, korgus);
			System.out.printf("Kolmnurga pindala on %.2f ",s);
			break;

		default:
			System.out.print("Valikust arusaamine ebaõnnestus!");
			break;
		}

	}

}