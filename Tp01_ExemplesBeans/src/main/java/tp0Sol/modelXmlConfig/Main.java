package tp0Sol.modelXmlConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import tp0Sol.model.Cours;
import tp0Sol.model.IExamen;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("META-INF/spring/tp0Sol/tp0ConfigXML.xml");

		IExamen exam1 = (IExamen) context.getBean("examen1");
		IExamen exam2 = (IExamen) context.getBean("examen2");
		System.out.println(exam1.getDescription() + " cours: " + exam1.getCours().getNom());
		System.out.println(exam2.getDescription() + " cours: " + exam2.getCours().getNom());
		Cours cours=(Cours) context.getBean(Cours.class);
		System.out.println("Nom du bean : "+cours.getMonNom());
		context.close();
	}

}
