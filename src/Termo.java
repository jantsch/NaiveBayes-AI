
public class Termo {
	
	private String palavra;
	private int numOcorrencias;
	
	public Termo(String palavra) {
		// TODO Auto-generated constructor stub
		this.palavra = palavra;
		this.numOcorrencias = 1;
	}

	public String getPalavra() {
		return palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public int getNumOcorrencias() {
		return numOcorrencias;
	}

	public void incNumOcorrencias() {
		this.numOcorrencias++;
	}

}
