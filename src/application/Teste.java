package application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

import classes.Cliente;
import classes.Utils;

@SuppressWarnings("unused")
public class Teste {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		File clientes = Utils.getArquivo("teste.txt");
		
		System.out.println(clientes.listFiles());
		
		clientes.delete();
		
		System.out.println(clientes.listFiles());
		
		sc.close();
		
	}
}