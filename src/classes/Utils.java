package classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings ("unused")
public class Utils {
	
	// Acessa arquivo do banco de dados
	public static File getArquivo() {
		Scanner sc = new Scanner(System.in);
		String arquivo;
		
		System.out.println("Informe qual tabela você quer acessar");
		arquivo = sc.nextLine();
		
		File file = new File("C:\\Users\\arthu\\Desktop\\UFRPE - LC\\3_Periodo\\Lab 2\\Projeto\\BarManager\\dbase\\", arquivo + ".txt");
		
		sc.close();
		return file;
	}
	
	// Acessa diretamente a tabela informada por parâmetro
	public static File getArquivo(String tabela) {
		File file;
		if(tabela == "clientes")
		{
			file = new File("C:\\Users\\arthu\\Desktop\\UFRPE - LC\\3_Periodo\\Lab 2\\Projeto\\BarManager\\dbase\\clientes.txt");
			
		}
		else
		{
			file = null;
			System.out.println("ERR_LOG getArquivo: Tabela recebida não encontrada. retornará arquivo nulo");
		}
		
		return file;
	}
	
	
	// Método para obter o próximo ID disponível
    public static int novoId(File arquivo) {
    	int novoId = 1; // Valor padrão caso não haja nenhum cliente ainda
    	int id = 0;
    	
    	String id_str;
    	

        // Verificar se o arquivo existe e não está vazio
        if (arquivo.exists() && arquivo.length() > 0) {
            try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
                String linha;
                // Ler o arquivo linha por linha para encontrar o último ID
                while ((linha = reader.readLine()) != null) {
                    // Verificar se a linha começa com "Id:"
                    if (linha.startsWith("Id:")) 
                    {
                        // Extrair o ID da linha
                        String[] partes = linha.split(": ");
                        id_str = partes[1].split(",")[0].trim(); // Extrair o ID e remover espaços em branco
                        id = Integer.parseInt(id_str);
                        
                        // Atualizar o novoId se o ID atual for maior
                        if (id >= novoId)
                        	{
                                novoId = id + 1; // Incrementar o ID
                            }
                    }
                    else
                    {
                    	System.out.println("ERR_LOG novoId: Não foi possível localizar o id no arquivo inserido");
                    }
                }
                System.out.printf("\nDEB_LOG novoId: Ultimo id encontrado %d. será incrementado novo id = %d\n", id, novoId);
                
            } 
            catch (IOException | NumberFormatException ebuf) {
                System.err.println("ERR_LOG novoId: erro ao ler o arquivo" + ebuf.getMessage());
            }
        }
        return novoId;
    }
    
    
    
}

