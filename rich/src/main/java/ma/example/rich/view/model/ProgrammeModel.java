package ma.example.rich.view.model;

import java.util.Date;

public class ProgrammeModel {

	private Integer idProgramme;
	private String nom;
	private String descreption;
	private Date heureDebut;
	private Date heureFin;
	public Integer getIdProgramme() {
		return idProgramme;
	}
	public void setIdProgramme(Integer idProgramme) {
		this.idProgramme = idProgramme;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescreption() {
		return descreption;
	}
	public void setDescreption(String descreption) {
		this.descreption = descreption;
	}
	public Date getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Date heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Date getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Date heureFin) {
		this.heureFin = heureFin;
	}

}
