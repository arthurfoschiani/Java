package poo;

public class Ex60Cliente {
	private int id;
	private String nome;
	private int idade;
	private String email;
	private Ex60ContaBancaria conta;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Ex60ContaBancaria getConta() {
		return conta;
	}

	public void setConta(Ex60ContaBancaria conta) {
		this.conta = conta;
	}

	Ex60Cliente () {
		
	}
	
	Ex60Cliente (int id, String nome, int idade, String email, Ex60ContaBancaria conta) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.email = email;
		this.conta = conta;
	}
	
	public String exibirNomeIdade () {
		return ("Id: " + this.id + "\nNome: " + this.nome + "\nEmail: " + this.email + "\nIdade: " + this.idade + "\n-----------------------------------------------\n");
	}
	
	public String exibirDadosConta () {
		return ("Agência: " + this.conta.getAgencia() + " - Número: " + this.conta.getNumero() + "\n");
	}
}
