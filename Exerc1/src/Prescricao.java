
public class Prescricao implements Observacao {
	
	private String exames;
	private String medicamentos;
	
	
	public Prescricao(String exames, String medicamentos) {
		this.exames = exames;
		this.medicamentos = medicamentos;
	}
	
	
	@Override
	public void EscreveObs() {
		System.out.println("Foi prescrevido os seguintes medicamento(s) " + getMedicamentos() +  
				" e exame(s): " + getExames());
		
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(String medicamentos) {
		this.medicamentos = medicamentos;
	}



}
