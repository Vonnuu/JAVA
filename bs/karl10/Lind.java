package karl10;

public class Lind extends Loom{
	private int jalaarv;
	public Lind(int jalaarv) {
		this.jalaarv = jalaarv;
	}
	public int getjalaarv() {
		return jalaarv;
	}
	public void setjalaarv(int jalaarv) {
		this.jalaarv = jalaarv;
	}
	public void lenda(){
		System.out.println("lap lap lap lap lap");
	}
    @Override
    public void toit(){
        System.out.println("Lind sööb saaski");
    }
}
