package tp0Sol.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Examen implements IExamen {
    // Je l'ai injecté ici directement en propriété
	@Autowired
	private ICours cours;

	private String description;
    
	//constructeur vide
	public Examen() {
		this.description = "Examen de première session";
	}

	// @Autowired  //peut être activé si on veut injecter le cours par le constructeur
	public Examen(ICours cours) {
		this();//appel constructeur vide
		this.cours = cours;
	}

	public Examen(ICours cours, String description) {
		super();
		this.cours = cours;
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IExamen#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IExamen#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see model.IExamen#getCours()
	 */
	@Override
	public ICours getCours() {
		return cours;
	}

	@Override
	public String toString() {
		return "Examen de " + (cours != null ? cours.getNom() + " " : " ") + description;
	}

}
