package ma.example.rich.metier;

import java.util.ArrayList;
import java.util.List;

import ma.example.rich.dao.ChaineDao;
import ma.example.rich.dao.entity.Chaine;
import ma.example.rich.view.model.ChaineModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChaineMetier {
	@Autowired
	private ChaineDao chaineDao;

	public void ajouterChaine(ChaineModel chaineModel) {
		/*
		 * TODO transformation data view to data entity
		 */
		Chaine chaine = new Chaine();
		chaine.setDateCreation(chaineModel.getDateCreation());
		chaine.setNom(chaineModel.getNom());
		chaine.setType(chaineModel.getType());

		chaineDao.ajouterChaine(chaine);
	}

	public List<ChaineModel> listerChaine() {

		/*
		 * TODO transformation data entity to data view
		 */
		List<Chaine> listerChaine = chaineDao.listerChaine();
		List<ChaineModel> chaineModels = new ArrayList<ChaineModel>();
		for (Chaine chaine : listerChaine) {
			ChaineModel chaineModel = new ChaineModel();
			chaineModel.setDateCreation(chaine.getDateCreation());
			chaineModel.setNom(chaine.getNom());
			chaineModel.setType(chaine.getType());
			chaineModel.setIdChaine(chaine.getIdChaine());
			chaineModels.add(chaineModel);

		}
		return chaineModels;
	}

	public void modifierChaine(ChaineModel chaineModel) {
		/*
		 * TODO transformation data view to data entity
		 */
		Chaine chaine = new Chaine();
		chaine.setIdChaine(chaineModel.getIdChaine());
		chaine.setDateCreation(chaineModel.getDateCreation());
		chaine.setNom(chaineModel.getNom());
		chaine.setType(chaineModel.getType());

		chaineDao.modifierChaine(chaine);

	}

	public void supprimerChaine(ChaineModel chaineModel) {
		
		Chaine chaine = new Chaine();
		chaine.setIdChaine(chaineModel.getIdChaine());
		chaine.setDateCreation(chaineModel.getDateCreation());
		chaine.setNom(chaineModel.getNom());
		chaine.setType(chaineModel.getType());

		chaineDao.supprimerChaine(chaine);
	}
}
