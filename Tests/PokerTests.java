import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import poquer.Carta;
import poquer.Jugada;
import poquer.PokerStatus;

class PokerTests {
	
	
	

	private PokerStatus poker;
	private PokerStatus poker1;
	
	//Para que sea color
	private Carta cincoDePicas;
	private Carta cincoDeCorazones;
	private Carta tresDePicas;
	private Carta cuatroDeCorazones;
	private Carta sieteDePicas;
	
	//Para que sea poker
	private Carta dosDeTreboles;
	private Carta dosDeDiamantes;
	private Carta dosDePicas;
	private Carta dosDeCorazones;
	private Carta tresDeTreboles;
	
	//Para que sea trio
	private Carta seisDeCorazones;
	private Carta seisDePicas;
	private Carta seisDeDiamantes;
	private Carta azDePicas;
	private Carta azDeTreboles;
	
	private Carta reinaDeCorazones;
	private Carta reyDeCorazones;
	
	//Mock
	public Carta carta1;
	public Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	public Carta carta6;
	public Carta carta7;
	private Carta carta8;
	private Carta carta9;
	private Carta carta10;
	
	private Jugada mano1;
	private Jugada mano2;
	private Jugada mano3;
	private Jugada mano4;
	
	private List<Carta> cartas= new ArrayList<Carta>();
	private List<Carta> cartas2= new ArrayList<Carta>();


	@BeforeEach
	void setUp() {
		///1.SetUp
		
		poker= new PokerStatus();
		
		//Color
			
			cincoDePicas= new Carta("5","Rojo","Picas");
			cincoDeCorazones = new Carta ("5", "Rojo", "Corazones");
			tresDePicas= new Carta ("3", "Rojo", "Picas");
			cuatroDeCorazones= new Carta ("4", "Rojo", "Corazones");
			sieteDePicas= new Carta ("7", "Rojo", "Picas");

		//Poker
			
			dosDeTreboles= new Carta("2","Negro","Treboles");
			dosDeDiamantes = new Carta ("2", "Negro", "Diamantes");
			dosDePicas= new Carta ("2", "Rojo", "Picas");
			dosDeCorazones= new Carta ("2", "Rojo", "Corazones");
			tresDeTreboles= new Carta ("3", "Negro", "Treboles");
			
		//Trio
			
			seisDeCorazones= new Carta("6","Rojo","Corazones");
			seisDePicas = new Carta ("6", "Rojo", "Picas");
			seisDeDiamantes= new Carta ("6", "Negro", "Diamantes");
			azDePicas= new Carta ("1", "Rojo", "Picas");
			azDeTreboles= new Carta ("1", "Negro", "Treboles");
		
		
			reinaDeCorazones= new Carta("Q", "Rojo", "Corazones"); 
			reyDeCorazones= new Carta("K", "Rojo", "Corazones"); 
		
			
			//Mock
			
			carta1= mock(Carta.class);
			carta2= mock(Carta.class);
			carta3=mock(Carta.class);
			carta4=mock(Carta.class);
			carta5=mock(Carta.class);
			
			carta6= mock(Carta.class);
			carta7= mock(Carta.class);
			carta8=mock(Carta.class);
			carta9=mock(Carta.class);
			carta10=mock(Carta.class);
			
			
			poker1= mock(PokerStatus.class);
			
			mano1= mock(Jugada.class);
			mano2= mock(Jugada.class);
			
	}
/*
	@Test
 	void testPoker() {

		///2.Exercise
		String verificacion= poker.verificar(dosDeTreboles, dosDeDiamantes, dosDePicas, dosDeCorazones, tresDeTreboles);
		
	//	Boolean esPoker=poker.esPoker(dosDePicas, reinaDeDiamantes, diezDeDiamantes, seisDeCorazones, tresDeTreboles);
	//	Boolean esColor= poker.esColor(dosDePicas, reinaDeDiamantes, diezDeDiamantes, seisDeCorazones, tresDeTreboles);
	//	Boolean esTrio=poker.esTrio(dosDePicas, reinaDeDiamantes, diezDeDiamantes, seisDeCorazones, tresDeTreboles);


		
		///3.Verify

			assertEquals(verificacion, "Poker");
	}
	
	
	@Test
	void testColor() {
		
		//Exercise
		String verificacion= poker.verificar(cincoDePicas, cincoDeCorazones, tresDePicas, cuatroDeCorazones, sieteDePicas);
		
		//Verify
		assertEquals(verificacion, "Color");
	}
	
	
	@Test
	void testTrio() {
		
		//Exercise
		String verificacion= poker.verificar(seisDeCorazones, seisDePicas, seisDeDiamantes, azDePicas, azDeTreboles);
		
		//Verify
		assertEquals(verificacion, "Trio");
	}
	
	@Test
	void testNada(){
		
		//Exercise
		String verificacion= poker.verificar(seisDeCorazones, seisDePicas, azDeTreboles, azDePicas, tresDePicas);
		
		//Verify
		assertEquals(verificacion, "Nada");
		
		
	}
	*/
	
	@Test
	void cualEsMayor() {
		
		//Exercise
		Carta verificacion= poker.cualEsMayor(reyDeCorazones, reinaDeCorazones);
	
	
	//Verify
	assertEquals(verificacion, reyDeCorazones);

}
	
	@Test
	void poseenElMismoPalo() {
		
		//Exercise
		Boolean verificacion= poker.poseenElMismoPalo(reyDeCorazones, reinaDeCorazones);
		
		
		//Verify
		assertEquals(verificacion, true);
	}
	
	@Test
	void mockito() {
	
		
		when(carta2.getValor()).thenReturn("K");
		when(carta1.getValor()).thenReturn("K");
		when(carta3.getValor()).thenReturn("K");
		when(carta4.getValor()).thenReturn("K");
		when(carta5.getValor()).thenReturn("3");
		

		
		assertEquals(poker.verificar(carta1, carta2, carta3, carta4, carta5), "Poker");
		
	}
	
	@Test
	void mockJugada() {
		
		when(mano1.getJugadaActual()).thenReturn("Poker");
		when(mano2.getJugadaActual()).thenReturn("Color");
		
		when(carta2.getValor()).thenReturn("10");
		when(carta1.getValor()).thenReturn("10");
		when(carta3.getValor()).thenReturn("10");
		when(carta4.getValor()).thenReturn("3");
		when(carta5.getValor()).thenReturn("3");
		
		when(carta6.getValor()).thenReturn("K");
		when(carta7.getValor()).thenReturn("K");
		when(carta8.getValor()).thenReturn("K");
		when(carta9.getValor()).thenReturn("K");
		when(carta10.getValor()).thenReturn("10");
		
		when(carta1.valorReal()).thenReturn(10);
		
		mano3= poker.verificar(carta1, carta2, carta3, carta4, carta5);
		mano4= poker.verificar(carta6, carta7, carta8, carta9, carta10);

		assertEquals(mano3.valorJugada(), 33);
		assertEquals(mano3.getJugadaActual(), "Color" );
		assertEquals(mano4.getJugadaActual(), "Poker");		

		
		assertEquals(poker.manoGanadora(mano3, mano4), mano4);
		
		
		
		
	}
}


///