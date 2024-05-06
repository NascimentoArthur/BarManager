package application;

import java.util.Locale;
import java.util.Scanner;

import classes.Cliente;

public class BarManager {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		cliente.getCliente();
		cliente.setCliente("Arthur", "arthur@gmail.com", 19);
		cliente.setCliente("Rodrygo");
		
		
		
		
		sc.close();
		
	}
}