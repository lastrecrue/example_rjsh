package ma.example.rich.view;


import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ma.example.rich.metier.ProgrammeMetier;
import ma.example.rich.view.model.ProgrammeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ViewScoped
@ManagedBean
@Component
public class ProgrammePresentation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private ProgrammeModel ProgrammeModel = new ProgrammeModel();

	@Autowired
	private ProgrammeMetier ProgrammeMetier;

	public ProgrammeModel getProgrammeModel() {
		return ProgrammeModel;
	}

	public void setProgrammeModel(ProgrammeModel ProgrammeModel) {
		this.ProgrammeModel = ProgrammeModel;
	}

	public String validerAjout() {
		ProgrammeMetier.ajouterProgramme(ProgrammeModel);
		return "index";
	}
	
	public String validerModification(){
		ProgrammeMetier.modifierProgramme(ProgrammeModel);
		return "index";
	}
	public String annulerSuppression(){
		return "index";
	}
	public String validerSuppression(){
		System.out.println("validersuppression");
		ProgrammeMetier.supprimerProgramme(ProgrammeModel);
		return "index";
	}

}
