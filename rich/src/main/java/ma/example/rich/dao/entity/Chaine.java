package ma.example.rich.dao.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "chaine")
public class Chaine implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_chaine")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ID_CHAINE")
	@SequenceGenerator(name = "SQ_ID_CHAINE", sequenceName = "SQ_ID_CHAINE")
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idChaine;
	@Column(name = "nom")
	private String nom;
	@Column(name = "type")
	private String type;
	@Column(name = "date_creation")
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
