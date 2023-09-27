package karl10;

public class App {

	public static void main(String[] args) {
		
		//objekt
		haug haug = new haug();
		imetaja koer = new imetaja("muki");
		Roomaja roomaja = new Roomaja(true);
		Kala kala = new Kala("sarg");
		Lind lind = new Lind(5);
		
		System.out.println(haug.uju(5));

		koer.setSugu("M");
		System.out.println("imetaja Sugu: "+koer.sugu);
		koer.toit();
		koer.temp();

		koer.setNimi("muki");
		System.out.println("Nimi: "+koer.getNimi());
		koer.haugu();	
		
		System.out.println("//////////////////////////////////////////");
		
		roomaja.setSugu("M");
		System.out.println("roomaja Sugu: "+roomaja.sugu);
		roomaja.toit();
		roomaja.temp();

		roomaja.setelav(true);
		System.out.println("Elav: "+roomaja.getelav());
		roomaja.mismaolen();
		
		System.out.println("//////////////////////////////////////////");

		kala.setSugu("M");
		System.out.println("kala Sugu: "+kala.sugu);
		kala.toit();
		kala.temp();

		kala.setliik("sarg");
		System.out.println("Liik: "+kala.getliik());
		kala.uju();
		
		System.out.println("//////////////////////////////////////////");

		lind.setSugu("M");
		System.out.println("linnu Sugu: "+lind.sugu);
		lind.toit();
		lind.temp();

		lind.setjalaarv(5);
		System.out.println("jalaarv: "+lind.getjalaarv());
		lind.lenda();

		System.out.println("//////////////////////////////////////////");

		
		
	}
}
