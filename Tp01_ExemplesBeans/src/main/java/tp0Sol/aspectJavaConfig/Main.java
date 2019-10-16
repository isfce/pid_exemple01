package tp0Sol.aspectJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp0Sol.model.Etudiant;
import tp0Sol.model.IEvaluation;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AspectJavaConfig.class);
		IEvaluation eval1 = (IEvaluation) context.getBean("eval1");
		IEvaluation eval2 = (IEvaluation) context.getBean("eval2");
		System.out.println("Etudiant: " + eval1.getEtudiant() + " cours: " + eval1.getExamen().getCours());

		eval1.setNote(10);// Activation coupe 1(Avant) et 2(Après)
		eval1.setNote(8);// Activation coupe 1 (Avant) et 2(Après)
		eval1.setPonderation(20);// Activation coupe2

		eval2.setNote(3);
		eval2.setPonderation(30);

		Etudiant e = eval1.getEtudiant();
		e.getNom();
		context.close();
	}

}
