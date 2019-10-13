package tp0Sol.model;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

@Component
public class Cours implements ICours,BeanNameAware {
	private final String nom;
	private String monNom;

	public Cours() {
		this.nom = "Projet d'intégration et de Développement";
	}

	public Cours(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public String getNom() {
		return nom;
	}

	@Override
	public void setBeanName(String name) {
		monNom=name;
	}

	public String getMonNom() {
		return monNom;
	}
	

}
