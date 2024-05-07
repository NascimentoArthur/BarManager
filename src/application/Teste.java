package application;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes.Cliente;
import classes.Utils;


@SuppressWarnings("unused")
public class Teste {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		File teste;
		
		Cliente.lerClientes();
		
		
		sc.close();
		
	}
}