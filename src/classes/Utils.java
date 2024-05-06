package classes;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Utils {
	
	public static File getArquivo(String arquivo) {
		File file = new File("C:\\Users\\arthu\\Desktop\\UFRPE - LC\\3_Periodo\\Lab 2\\Projeto\\BarManager\\dbase\\", arquivo);
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();
			}
		}
		return file;
	}
}

