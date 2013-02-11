package ma.example.rich.view;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ma.example.rich.metier.ChaineMetier;
import ma.example.rich.view.model.ChaineModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ViewScoped
@ManagedBean
@Component
public class ChainePresentation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ChaineModel chaineModel = new ChaineModel();

	@Autowired
	private ChaineMetier chaineMetier;

	public ChaineModel getChaineModel() {
		return chaineModel;
	}

	public void setChaineModel(ChaineModel chaineModel) {
		this.chaineModel = chaineModel;
	}

	public String validerAjout() {
		chaineMetier.ajouterChaine(chaineModel);
		return "index";
	}
	
	public String validerModification(){
		chaineMetier.modifierChaine(chaineModel);
		return "index";
	}
	public String annulerSuppression(){
		return "index";
	}
	public String validerSuppression(){
		System.out.println("validersuppression");
		chaineMetier.supprimerChaine(chaineModel);
		return "index";
	}

}
