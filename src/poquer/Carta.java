package poquer;

public class Carta {
	
	private String valor;
	private String color;
	private String palo;
	
	public Carta(String valor, String color, String palo) {
		
		setValor(valor);
		setColor(color);
		setPalo(palo);
		
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public Integer valorReal() {
		
		String valorRealCarta = this.getValor();
		
		switch(valorRealCarta) {
		
		case "J" : valorRealCarta= "11";
		case "Q" : valorRealCarta= "12";
		case "K" : valorRealCarta= "13";
		case "A" : valorRealCarta= "14";
		}
	
		
		return Integer.parseInt(valorRealCarta);
	}
	

}
