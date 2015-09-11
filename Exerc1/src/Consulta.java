
public class Consulta {
	
	private Paciente paciente;
	private Medico medico;
	private String data;
	private String hora;
	private PlanoSaude planoSaude;
	
	public Consulta(Paciente paciente, Medico medico, String data, String hora,
			PlanoSaude planoSaude) {
		this.paciente = paciente;
		this.medico = medico;
		this.data = data;
		this.hora = hora;
		this.planoSaude = planoSaude;
	}
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public PlanoSaude getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(PlanoSaude planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	
}
