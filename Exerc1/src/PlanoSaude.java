
public class PlanoSaude {
	private String razao;
	private int cnpj;
	private String end;
	private int tel;
	public PlanoSaude(String razao, int cnpj, String end, int tel) {
		this.razao = razao;
		this.cnpj = cnpj;
		this.end = end;
		this.tel = tel;
	}
	public String getRazao() {
		return razao;
	}
	public void setRazao(String razao) {
		this.razao = razao;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
}
