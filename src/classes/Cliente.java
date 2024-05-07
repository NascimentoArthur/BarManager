package classes;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cliente{
	private static int nextID = 1;
	private String nome;
	private String email;
	private int idade;
	private int id;
	
	public Cliente(String nome, String email, int idade) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
	}
	
	public Cliente() {
		this.id = nextID;
	}
	
	public int getId() {
		return id;
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
	
	
	
	// Cria novo cliente
	public static void criaCliente() {
		Scanner sc = new Scanner(System.in);
		
		File clientes_f;
		
		String nome;
		String email;
		int idade;
		int id;
		
		System.out.println("Informe os dados do cliente: ");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Email: ");
		email = sc.nextLine();
		System.out.print("Idade: ");
		idade = sc.nextInt();

		clientes_f = Utils.getArquivo("clientes");
		id = Utils.novoId(clientes_f);
		
	    try (BufferedWriter writer = new BufferedWriter(new FileWriter(clientes_f, true))) {
	    	writer.write("Id: " + id + ", Cliente: " + nome + ", Email: " + email + ", Idade: " + idade);
	    	writer.newLine();
	           
	    sc.close();
	    } catch (IOException ebuf) {
	    	System.err.println("ERR_LOG getArquivo Erro ao escrever no arquivo: " + ebuf.getMessage());
	    }
	   }
	
	
	// Mostra lista de clientes
	public static void lerClientes() {
		File arquivo = Utils.getArquivo("clientes");
		
        try {	
        	Scanner sc = new Scanner(arquivo);
        	System.out.println("Lista de clientes no banco:");
        	while(sc.hasNextLine())
        		{
        		String line = sc.nextLine();
        		System.out.println(line);
        		}
        	
        	sc.close();
        }
        catch(FileNotFoundException ebuf) {
        	System.out.println("ERR_LOG Arquivo nao pode ser aberto "+ ebuf.getMessage());
        	ebuf.printStackTrace();
        }
    }
	
	
	
	
}