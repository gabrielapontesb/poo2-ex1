
public class Resultado implements Observacao {
	
	private String resultado;
	private String resposta;
	
	public Resultado(String resultado, String resposta) {
		this.resultado = resultado;
		this.resposta = resposta;
	}
	
	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}


	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	@Override
	public void EscreveObs() {
		System.out.println("O resultado foi " + getResultado() + " e a resposta ao tratamento é " 
				+ getResposta());
	}
	
}
