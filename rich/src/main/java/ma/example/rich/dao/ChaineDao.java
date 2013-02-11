package ma.example.rich.dao;

import java.util.List;

import ma.example.rich.dao.entity.Chaine;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class ChaineDao {
	@Autowired
	private SessionFactory sessionFactory;

	private org.hibernate.Session getCurrent() {
		return sessionFactory.getCurrentSession();
	}

	@Transactional
	public void ajouterChaine(Chaine chaine) {
		getCurrent().save(chaine);
	}
	@Transactional
	public void modifierChaine(Chaine chaine) {
		getCurrent().update(chaine);	

	}

	public void supprimer(Chaine chaine) {

	}

	@Transactional
	public List<Chaine> listerChaine() {
		List list = getCurrent().createQuery("FROM Chaine").list();
		return list;

	}

	public Chaine detailleChaine(Chaine chaine) {
		return null;
	}
	@Transactional
	public void supprimerChaine(Chaine chaine) {
		getCurrent().delete(chaine);
		
	}

}
