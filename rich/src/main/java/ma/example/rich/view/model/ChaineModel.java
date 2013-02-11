package ma.example.rich.view.model;

import java.util.Date;

public class ChaineModel {

	private Integer idChaine;

	private String nom;

	private String type;

	private Date dateCreation;

	public Integer getIdChaine() {
		return idChaine;
	}

	public void setIdChaine(Integer idChaine) {
		this.idChaine = idChaine;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

}
