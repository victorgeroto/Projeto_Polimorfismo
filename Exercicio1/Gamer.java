package Exercicio1;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("O compuatdor gamer esta ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O compuatdor gamer esta reiniciando");
		
	}
	
	@Override
	public void desligar() {
		System.out.println("O compuatdor gamer esta desligando");
		
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("O computador gamer esta carregando o sistema");
		
	}
}
