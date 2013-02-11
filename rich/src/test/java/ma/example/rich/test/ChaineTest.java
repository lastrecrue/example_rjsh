package ma.example.rich.test;

import java.util.Date;

import ma.example.rich.metier.ChaineMetier;
import ma.example.rich.view.model.ChaineModel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class ChaineTest {
	@Autowired
	private ChaineMetier chaineMetier;

	@Test
	public void ajouterChaineTest() {
		try {
			
			ChaineModel chaineModel = new ChaineModel();
			chaineModel.setDateCreation(new Date());
			chaineModel.setNom("nomTest");
			chaineModel.setType("typeTest");
			chaineMetier.ajouterChaine(chaineModel);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
