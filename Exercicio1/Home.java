package Exercicio1;

public class Home implements Computador{
	
	@Override
	public void ligar() {
		System.out.println("O compuatdor home esta ligando");
	}
	
	@Override
	public void reiniciar() {
		System.out.println("O compuatdor home esta reiniciando");
		
	}
	
	@Override
	public void desligar() {
		System.out.println("O compuatdor home esta desligando");
		
	}
	
	@Override
	public void carregandoSistema() {
		System.out.println("O computador da casa esta carregando o sistema");
		
	}
}
