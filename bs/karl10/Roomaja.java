package karl10;

public class Roomaja extends Loom {
	private uss elav;
	public Roomaja(uss elav) {
		this.elav = elav;
	}
	public uss getelav() {
		return elav;
	}
	public void setelav(uss elav) {
		this.elav = elav;
	}
	public void mismaolen(){
		System.out.println("ma olen uss");
	}
}

