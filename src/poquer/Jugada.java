package poquer;
import java.util.ArrayList;
import java.util.List;

public class Jugada {
	
	
	private List<Carta> cartas;
	private String jugadaActual;

	
	public Jugada(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5, String jugada) {
		
		cartas= new ArrayList<Carta>();
		cartas.add(carta1);
		cartas.add(carta2);
		cartas.add(carta3);
		cartas.add(carta4);
		cartas.add(carta5);
		
		jugadaActual= jugada;
	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public String getJugadaActual() {
		return jugadaActual;
	}
	public void setJugadaActual(String jugada) {
		
		jugadaActual= jugada;
	}
	
	public Integer valorJugada() {
		
		Integer valor=0;
		
		List <Carta> cartas= new ArrayList<Carta>();	
		cartas= this.getCartas();
	//	if (this.getJugadaActual() == "Poker") {
	//		valor += 300;
	//	}
		
		switch (this.getJugadaActual()) {
			
		case "Poker": valor = 300;
		case "Color": valor = 200;
		case "Trio" : valor= 100;
		
		
		}
		
		for (int i=0; i < cartas.size(); i++)  {
			
			
			valor += cartas.get(i).valorReal();
		}
		
		return valor;
	}
	
	
	
}
