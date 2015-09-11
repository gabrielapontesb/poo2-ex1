
public class Queixa implements Observacao {

	private Paciente paciente;
	private String desc;
	
	
	public Queixa(Paciente paciente, String desc) {
		this.paciente = paciente;
		this.desc = desc;
	}


	@Override
	public void EscreveObs() {
		System.out.println("O Paciente " + paciente.getNome() + " queixa se de " + getDesc() + ".");
	}

	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
