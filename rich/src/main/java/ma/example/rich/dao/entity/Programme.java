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
@Table(name = "programme")
public class Programme implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id_programme")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_ID_PROGRAMME")
	@SequenceGenerator(name = "SQ_ID_PROGRAMME", sequenceName = "SQ_ID_PROGRAMME")
	// @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idProgramme;
	@Column(name = "nom")
	private String nom;
	@Column(name = "descreption")
	private String descreption;
	@Column(name = "heure_debut")
	private Date heureDebut;
	@Column(name = "heure_fin")
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
