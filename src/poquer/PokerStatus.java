package poquer;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class PokerStatus {
	



	public Jugada verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4,
			Carta carta5) {

		List<Carta> mano=new ArrayList<Carta>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
		
		Jugada jugada= new Jugada(carta1, carta2, carta3, carta4, carta5,"Nada");
		
		if (esPoker(mano)) {
			jugada=new Jugada(carta1, carta2, carta3, carta4, carta5,"Poker");
		}
		else if (esColor(mano)){
			
			jugada=new Jugada(carta1, carta2, carta3, carta4, carta5,"Color");
		}
		else if(esTrio(mano)) {
			
			jugada=new Jugada(carta1, carta2, carta3, carta4, carta5,"Trio");
		}
		return jugada;
		
	}



public Integer vecesRepetidos(Carta carta1, List<Carta> mano) {
	
	Integer acumulador=0;			
			for (int i=0;i<mano.size();i++) {
				if(carta1.getValor() == mano.get(i).getValor()) {
					acumulador++;
				}
			}
			return acumulador;
	}


public Boolean esPoker(List<Carta>  mano) {
	
	Integer valorViejo=0;
	
	/* List<Carta> mano=new ArrayList<Carta>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
*/

		for (int i=0;i<mano.size();i++) {
			
			Integer valor= vecesRepetidos(mano.get(i), mano);
			if (valor>valorViejo) {
				valorViejo=valor;
			}
		}
	return valorViejo==4;
}


public Boolean esColor(List<Carta>  mano) {
	Integer valorViejo=0;
	
/*	List<Carta> mano=new ArrayList<Carta>();
		mano.add(carta1);
		mano.add(carta2);
		mano.add(carta3);
		mano.add(carta4);
		mano.add(carta5);
*/

		for (int i=0;i<mano.size();i++) {
			
			Integer valor= vecesRepetidosColor(mano.get(i), mano);
			if (valor>valorViejo) {
				valorViejo=valor;
			}
		}
	return valorViejo==5;
}


private Integer vecesRepetidosColor(Carta carta1, List<Carta> mano) {
	// TODO Auto-generated method stub
	Integer acumulador=0;			
	for (int i=0;i<mano.size();i++) {
		if(carta1.getColor() == mano.get(i).getColor()) {
			acumulador++;
		}
	}
	return acumulador;
}


  public Boolean esTrio(List<Carta>  mano) {

		Integer valorViejo=0;
		
	/*	List<Carta> mano=new ArrayList<Carta>();
			mano.add(carta1);
			mano.add(carta2);
			mano.add(carta3);
			mano.add(carta4);
			mano.add(carta5);

*/
			for (int i=0;i<mano.size();i++) {
				
				Integer valor= vecesRepetidos(mano.get(i), mano);
				if (valor>valorViejo) {
					valorViejo=valor;
				}
			}
		return valorViejo==3;
}



public Carta cualEsMayor(Carta carta1, Carta carta2) {

	
	Integer valorRealCartaA=  valorReal(carta1);
	Integer valorRealCartaB= valorReal(carta2);
	
	Carta cartaMasValor=carta1;
	
	if (valorRealCartaA < valorRealCartaB) {
		
		cartaMasValor= carta2;
	} 
	return cartaMasValor; ////HAYQ UE MODIFICAR ESTE
}



public Integer valorReal(Carta carta1) {

	String valorRealCartaA = carta1.getValor();
	
	if (carta1.getValor() == "J") {
		valorRealCartaA="11";
	}
	if (carta1.getValor()== "Q") {
		valorRealCartaA="12";
	}
	if(carta1.getValor()== "K") {
		
		valorRealCartaA="13";
	}
	if(carta1.getValor()=="A") {
		valorRealCartaA="14";
	}
	

	
	return Integer.parseInt(valorRealCartaA); ///ESTE HAY QUE BORRARLO
}



public Boolean poseenElMismoPalo(Carta reyDeCorazones, Carta reinaDeCorazones) {
	// TODO Auto-generated method stub
	return (reyDeCorazones.getPalo() == reinaDeCorazones.getPalo());
}



public Jugada manoGanadora(Jugada mano1, Jugada mano2) {
	
	Jugada manoGanadora= mano1;
	
	if (mano1.valorJugada() < mano2.valorJugada()) {
		
		manoGanadora= mano2;
	}
	
	return manoGanadora;
	
}








}
