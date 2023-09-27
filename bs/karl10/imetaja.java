package karl10;

public class imetaja extends Loom{
	private String nimi;
	public imetaja(String nimi) {
		this.nimi = nimi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public void haugu(){
		System.out.println("waf waf waf waf waf waf");
	}
	@Override
	public void temp() {
		System.out.println("koigusoojane");
	}

}
