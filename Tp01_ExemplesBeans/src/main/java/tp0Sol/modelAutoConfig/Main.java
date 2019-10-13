package tp0Sol.modelAutoConfig;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp0Sol.model.Cours;
import tp0Sol.model.Examen;
import tp0Sol.model.IExamen;

public class Main {
		
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ConfigAuto.class);
		
		IExamen exam1 = (IExamen) context.getBean(Examen.class);

		System.out.println(exam1.getDescription() + " cours: " + exam1.getCours().getNom());
       
		Cours cours=(Cours) context.getBean(Cours.class);
		System.out.println("Nom du bean : "+cours.getMonNom());
		context.close();
		//permet d'afficher la liste des beans
		System.out.println(Arrays.asList(context.getBeanDefinitionNames()));
	    System.out.println(context.getBeanDefinitionCount());
		
		

	}

}
