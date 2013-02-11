package ma.example.rich.dao;

import java.util.List;

import ma.example.rich.dao.entity.Programme;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ProgrammeDao {
	@Autowired
	private SessionFactory sessionFactory;

	private org.hibernate.Session getCurrent() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void ajouterProgramme(Programme programme) {
		getCurrent().save(programme);
	}
	@Transactional
	public void modifierProgramme(Programme programme) {
		getCurrent().update(programme);	

	}

	public void supprimer(Programme programme) {

	}

	@Transactional
	public List<Programme> listerProgramme() {
		List list = getCurrent().createQuery("FROM Programme").list();
		return list;

	}

	public Programme detailleProgramme(Programme programme) {
		return null;
	}
	@Transactional
	public void supprimerProgramme(Programme programme) {
		getCurrent().delete(programme);
		
	}

}
