package Exercicio1;

public class Principal {

	public static void main(String[] args) {
		
	Gamer gamer = new Gamer();
		
		gamer.carregandoSistema();
		gamer.desligar();
		gamer.ligar();
		gamer.reiniciar();
		
	Home home = new Home();
		
	System.out.println("--------------------------------------------");
		home.carregandoSistema();
		home.desligar();
		home.ligar();
		home.reiniciar();
	}

}
