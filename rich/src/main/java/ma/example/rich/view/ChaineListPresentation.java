package ma.example.rich.view;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.persistence.PostLoad;

import ma.example.rich.metier.ChaineMetier;
import ma.example.rich.view.model.ChaineModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@RequestScoped
@ManagedBean
@Component
public class ChaineListPresentation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private ChaineMetier chaineMetier;

	private ChaineModel chaineModel = new ChaineModel();

	private Set selection = new HashSet();
	private List<ChaineModel> chaineModelList;

	@PostConstruct
	public void constructData() {
		System.out.println("costruct");
		chaineModelList = chaineMetier.listerChaine();
	}

	public Set getSelection() {
		return selection;
	}

	public void setSelection(Set selection) {
		this.selection = selection;
	}

	public ChaineModel getChaineModel() {
		return chaineModel;
	}

	public void setChaineModel(ChaineModel chaineModel) {
		this.chaineModel = chaineModel;
	}

	public List<ChaineModel> getChaineModelList() {
		System.out.println("getyLiseChaine");
		return chaineModelList;
	}

	public String ajouter() {
		return "ajouter";
	}

	public String modifier() {

		Iterator<Object> iterator = getSelection().iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			chaineModel = getChaineModelList().get(key);
		}
		return "modifier";

	}

	public String supprimer() {

		Iterator<Object> iterator = getSelection().iterator();
		while (iterator.hasNext()) {
			Integer key = (Integer) iterator.next();
			chaineModel = getChaineModelList().get(key);
		}
		return "supprimer";
	}

	public void changeSelection() {
		System.out.println("changeSelection");
	}
}
