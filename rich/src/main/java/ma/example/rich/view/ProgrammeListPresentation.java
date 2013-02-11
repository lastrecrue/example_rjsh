package ma.example.rich.view;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ma.example.rich.metier.ProgrammeMetier;
import ma.example.rich.view.model.ProgrammeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequestScoped
@ManagedBean
@Component
public class ProgrammeListPresentation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ProgrammeMetier programmeMetier;

	private ProgrammeModel programmeModel = new ProgrammeModel();

	private Set selection = new HashSet();
	private List<ProgrammeModel> programmeModelList;

	@PostConstruct
	public void constructData() {
		System.out.println("costruct");
		programmeModelList = programmeMetier.listerProgramme();
	}

	public Set getSelection() {
		return selection;
	}

	public void setSelection(Set selection) {
		this.selection = selection;
	}

	public ProgrammeModel getProgrammeModel() {
		return programmeModel;
	}

	public void setProgrammeModel(ProgrammeModel programmeModel) {
		this.programmeModel = programmeModel;
	}

	public List<ProgrammeModel> getProgrammeModelList() {
		System.out.println("getyLiseProgramme");
		return programmeModelList;
	}

	public String ajouter() {
		return "ajouter";
	}

	public String modifier() {

		Iterator<Object> iterator = getSelection().iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			programmeModel = getProgrammeModelList().get(key);
		}
		return "modifier";

	}

	public String supprimer() {

		Iterator<Object> iterator = getSelection().iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			programmeModel = getProgrammeModelList().get(key);
		}
		return "supprimer";
	}

	public void changeSelection() {
		System.out.println("changeSelection");
	}
}
