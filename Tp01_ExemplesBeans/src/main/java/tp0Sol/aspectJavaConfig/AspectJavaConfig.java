package tp0Sol.aspectJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import aspects.Notification;
import tp0Sol.model.Cours;
import tp0Sol.model.Etudiant;
import tp0Sol.model.Evaluation;
import tp0Sol.model.Examen;
import tp0Sol.model.ICours;
import tp0Sol.model.IEvaluation;
import tp0Sol.model.IExamen;

/**
 * Classe pour tester le fonctionnement des aspects
 * 
 * @author Didier
 *
 */
@EnableAspectJAutoProxy
@Configuration
public class AspectJavaConfig {

	@Bean // déclaration de l'aspect
	public Notification notification() {
		return new Notification();
	}

	@Bean
	ICours cours() {
		return new Cours("pid");
	}

	@Bean
	IExamen examen(ICours cours) {
		return new Examen(cours);
	}

	@Bean
	Etudiant etudiant() {
		return new Etudiant(1L, "JB007", "PW007", "Bond", "James", "james.bond@isfce.org");
	}

	@Bean(name="eval1") // on ciblera cet objet
	IEvaluation evaluation1(IExamen examen, Etudiant etudiant) {
		return new Evaluation(examen,etudiant);
	}
	
	@Bean(name="eval2") // on ciblera cet objet
	IEvaluation evaluation2(IExamen examen, Etudiant etudiant) {
		return new Evaluation(examen,etudiant);
	}
}
