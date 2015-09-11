import java.util.ArrayList;
import java.util.HashMap;


public class Medico extends Pessoa {



	private int crm;
	private ArrayList<String> lstHorario;
	private String dia;
	private HashMap<String,ArrayList<String>> mapDiaHora;
	
	public Medico(String nome, String end, int tel, int crm, ArrayList<String> lstHorario, HashMap<String,ArrayList<String>> diaHora) {
		super(nome, end, tel);
		this.crm = crm;
		this.lstHorario = lstHorario;
		this.mapDiaHora = new HashMap<String,ArrayList<String>>();
		
	}
	
	public Medico(){};
	
	public int getCrm() {
		return crm;
	}

	public void setCrm(int crm) {
		this.crm = crm;
	}

	public ArrayList<String> getLstHorario() {
		return lstHorario;
	}

	public void setLstHorario(ArrayList<String> lstHorario) {
		this.lstHorario = lstHorario;
	}

	public HashMap<String, ArrayList<String>> getMapDiaHora() {
		return mapDiaHora;
	}

	public void setMapDiaHora(HashMap<String, ArrayList<String>> mapDiaHora) {
		this.mapDiaHora = mapDiaHora;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}


	
	
}
