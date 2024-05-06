package classes;

public class Cliente{
	private String nome;
	private String email;
	private int idade;
	
	public Cliente(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public Cliente() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void getCliente() {
		System.out.printf("Dados do cliente atualizados\nNome:  %s\nEmail: %s\nIdade: %d\n", this.nome, this.email, this.idade);
	}
	
	public void setCliente(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		System.out.printf("Dados do cliente atualizados\nNome:  %s\nEmail: %s\nIdade: %d\n", this.nome, this.email, this.idade);
	}
	
	public void setCliente(String nome) {
		this.nome = nome;
		System.out.printf("Dados do cliente atualizados\nNome:  %s\nEmail: %s\nIdade: %d\n", this.nome, this.email, this.idade);
	}
}