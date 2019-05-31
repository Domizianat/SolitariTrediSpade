
public class Carta {

	private int seme;
	private int valore;
	

	public Carta()	{
		setCarta(valore,seme);
	}
	
	public void setCarta(int valore, int seme) {
		this.valore=valore;
		this.seme=seme;
	}
	public String getSeme() {
		switch (this.seme) {
		case 1:
		return "Denari";
		case 2:
		return "Coppe";
		case 3:
		return "Spade";
		case 4:
		return "Bastoni";
		default: return "";
		}
	}

	public int getValore() {
		return this.valore;
	}
	
	public int getIntSeme() {
		switch (getSeme()) {
		case  "Denari":
		return seme=1;
		case  "Coppe":
		return seme=2;
		case  "Spade":
		return seme=3;
		case "Bastoni":
		return seme=4;
	}
		return seme;
}}
	
