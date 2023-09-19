import java.util.Scanner;

public class karl8 {
	public static void main(String[] args) {

		String laius = "";
		String alus = "";
		String korgus = "";
		String ppindala = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print(
				"Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala (3) \nRööptahukas ruumala (4) \n Risttahuka ruumala (5) \nKuubi ruumala (6)\nVali tegevus: ");
		String valik = scanner.next();

		if (valik.equals("5")) {
			System.out.print("Sisesta laius: ");
			laius = scanner.next();
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();

		} else if (valik.equals("6")) {
			System.out.print("Sisesta alus: ");
			alus = scanner.next();

		} else if (valik.equals("1")) {
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			System.out.print("Sisesta alus: ");
			alus = scanner.next();

		} else if (valik.equals("4")) {
			System.out.print("Sisesta põhja pindala: ");
			ppindala = scanner.next();
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();

		} else if (valik.equals("2")) {
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			System.out.print("Sisesta alus: ");
			alus = scanner.next();

		} else if (valik.equals("3")) {
			System.out.print("Sisesta kõrgus: ");
			korgus = scanner.next();
			System.out.print("Sisesta alus: ");
			alus = scanner.next();
		}

		// System.out.print("Sisesta alus: ");
		// String alus = scanner.next();

		// System.out.print("Sisesta kõrgus: ");
		// String korgus = scanner.next();

		double s;
		switch (Integer.parseInt(valik)) {
			case 1:
				s = Pindalad.roopkylikS(alus, korgus);
				System.out.printf("Rööpküliku pindala on %.2f ", s);
				break;
			case 2:
				s = Pindalad.ristkylikS(alus, korgus);
				System.out.printf("Ristküliku pindala on %.2f ", s);
				break;
			case 3:
				s = Pindalad.kolmnurkS(alus, korgus);
				System.out.printf("Kolmnurga pindala on %.2f ", s);
				break;
			case 4:
				s = ruumalad.roopkylk(ppindala, korgus);
				System.out.printf("Rööptahuka ruumala on %.2f m kuubis", s);
				break;
			case 5:
				s = ruumalad.risttah(alus, korgus, laius);
				System.out.printf("Risttahuka ruumala on %.2f m kuubis", s);
				break;
			case 6:
				s = ruumalad.kuup(alus);
				System.out.printf("Kuubi ruumala on %.2f  m kuubis ", s);
				break;

			default:
				System.out.print("Valikust arusaamine ebaõnnestus!");
				break;
		}

		scanner.close();
	}

}
