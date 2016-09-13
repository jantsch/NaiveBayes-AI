import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;


public class Documento {
	public ArrayList<Termo> vocabulario;
	public int condPrior;
	public int numArquivo = 0;
	public FileReader arquivosPos;
	//public FileReader arquivosNeg = new FileReader("../negativo/"+numArquivo+".txt");
	
	public Documento() {
		// TODO Auto-generated constructor stub
		vocabulario = new ArrayList<Termo>();
	}
	
	public void extrairVocabulario() throws FileNotFoundException{
		this.arquivosPos = new FileReader("positivo/"+numArquivo+".txt");
		String scanner = new Scanner(arquivosPos).useDelimiter("\\Z").next();
		scanner = scanner.replaceAll("[^A-Za-zÀ-Úà-ú ]","").toLowerCase();
		String[] documento = scanner.split("\\s+");
		
		compararTermo(documento);
		
		for(int i = 0;i<vocabulario.size();i++){
			System.out.println(vocabulario.get(i).getPalavra()+"\n"+vocabulario.get(i).getNumOcorrencias()+"\n");
		}
	}
	
	public void compararTermo(String[] termos){
		for(int i = 0;i<termos.length;i++){
			boolean contemTermo = false;
			Termo palavra = new Termo(termos[i]);
			for(int j = 0;j<vocabulario.size();j++){
				if(vocabulario.isEmpty()!=true){
					if(termos[i].compareTo(vocabulario.get(j).getPalavra())==0){
						vocabulario.get(j).incNumOcorrencias();
						contemTermo = true;
					}
				}
				else
					vocabulario.add(palavra);
			}
			if(contemTermo!=true)
				vocabulario.add(palavra);
		}
	}

}
