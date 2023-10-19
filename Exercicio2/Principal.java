package Exercicio2;

public class Principal {

	public static void main(String[] args) {
		Jornada jornada = new Jornada(1,"victor","15996479456",2500, "Rua Pedro Bandeira");
		System.out.println("\nJornada: ");
		System.out.println("Id: "+jornada.getId());
		System.out.println("Nome: "+jornada.getNome());
		System.out.println("Preco:" +jornada.getTelefone());
		System.out.println("Preco:" +jornada.getMatricula());
		System.out.println("Preco:" +jornada.getEndereco());
		System.out.println (jornada.calculaSalario(20, 8));
		
		
		Horista horista = new Horista(1,"Pedro","15996479456",2400, "Av dr orsi bernardes");
		System.out.println("\nHorista: ");
		System.out.println("Id: "+horista.getId());
		System.out.println("Nome: "+horista.getNome());
		System.out.println("Telefone:" +horista.getTelefone());
		System.out.println("Matricula:" +horista.getMatricula());
		System.out.println("Endereco:" +horista.getEndereco());
		System.out.println(horista.calculaSalario(25, 9));
		
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica(1,"Pedro","15996479456",2700, "Av dr orsi bernardes");
		System.out.println("\nPessoaJuridica: ");
		System.out.println("Id: "+pessoaJuridica.getId());
		System.out.println("Nome: "+pessoaJuridica.getNome());
		System.out.println("Telefone:" +pessoaJuridica.getTelefone());
		System.out.println("Matricula:" +pessoaJuridica.getMatricula());
		System.out.println("Endereco:" +pessoaJuridica.getEndereco());
		System.out.println(pessoaJuridica.calculaSalario(3000, 500));
	}

}