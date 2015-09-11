
public abstract class Pessoa {
	
	private String nome;
	private String end;
	private int tel;
	
	
	
	public Pessoa(String nome, String end, int tel) {
		this.nome = nome;
		this.end = end;
		this.tel = tel;
	}
	
	public Pessoa(){};
	
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
}
