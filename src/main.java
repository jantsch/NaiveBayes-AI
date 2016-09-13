import java.io.FileNotFoundException;


public class main {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		
		Documento textoTeste = new Documento();
		try {
			textoTeste.extrairVocabulario();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
