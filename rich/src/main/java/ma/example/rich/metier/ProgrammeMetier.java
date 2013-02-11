package ma.example.rich.metier;

import java.util.ArrayList;
import java.util.List;

import ma.example.rich.dao.ProgrammeDao;
import ma.example.rich.dao.entity.Programme;
import ma.example.rich.view.model.ProgrammeModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgrammeMetier {
	@Autowired
	private ProgrammeDao programmeDao;

	public void ajouterProgramme(ProgrammeModel programmeModel) {
		/*
		 * TODO transformation data view to data entity
		 */
		Programme programme = new Programme();
		programme.setHeureDebut(programmeModel.getHeureDebut());
		programme.setNom(programmeModel.getNom());
		programme.setDescreption(programmeModel.getDescreption());
		programme.setHeureFin(programmeModel.getHeureFin());

		programmeDao.ajouterProgramme(programme);
	}

	public List<ProgrammeModel> listerProgramme() {

		/*
		 * TODO transformation data entity to data view
		 */
		List<Programme> listerProgramme = programmeDao.listerProgramme();
		List<ProgrammeModel> programmeModels = new ArrayList<ProgrammeModel>();
		for (Programme programme : listerProgramme) {
			ProgrammeModel programmeModel = new ProgrammeModel();
			programmeModel.setHeureDebut(programme.getHeureDebut());
			programmeModel.setNom(programme.getNom());
			programmeModel.setDescreption(programme.getDescreption());
			programmeModel.setIdProgramme(programme.getIdProgramme());
			programmeModel.setHeureFin(programme.getHeureFin());
			programmeModels.add(programmeModel);

		}
		return programmeModels;
	}

	public void modifierProgramme(ProgrammeModel programmeModel) {
		/*
		 * TODO transformation data view to data entity
		 */
		Programme programme = new Programme();
		programme.setIdProgramme(programmeModel.getIdProgramme());
		programme.setHeureDebut(programmeModel.getHeureDebut());
		programme.setNom(programmeModel.getNom());
		programme.setDescreption(programmeModel.getDescreption());
		programme.setHeureFin(programmeModel.getHeureFin());

		programmeDao.modifierProgramme(programme);

	}

	public void supprimerProgramme(ProgrammeModel programmeModel) {
		
		Programme programme = new Programme();
		programme.setIdProgramme(programmeModel.getIdProgramme());
		programme.setHeureDebut(programmeModel.getHeureDebut());
		programme.setNom(programmeModel.getNom());
		programme.setDescreption(programmeModel.getDescreption());
		programme.setHeureFin(programmeModel.getHeureFin());

		programmeDao.supprimerProgramme(programme);
	}
}
