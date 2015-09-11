
public class Paciente extends Pessoa {
	

	private String dtNasc;
	private String prof;
	
	public Paciente(String nome, String end, int tel, String dtNasc, String prof) {
		super(nome, end, tel);
		this.dtNasc = dtNasc;
		this.prof = prof;
	}
	
	public Paciente(){};

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}
	public String getProf() {
		return prof;
	}
	public void setProf(String prof) {
		this.prof = prof;
	}
	
}
