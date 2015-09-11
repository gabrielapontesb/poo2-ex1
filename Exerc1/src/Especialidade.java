
public class Especialidade {
	private String nome;
	private int codcrm;
	
	public Especialidade(String nome, int codcrm) {
		this.nome = nome;
		this.codcrm = codcrm;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCodcrm() {
		return codcrm;
	}
	public void setCodcrm(int codcrm) {
		this.codcrm = codcrm;
	}
	
}
