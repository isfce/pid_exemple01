package tp0Sol.modelJavaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp0Sol.model.IExamen;

public class Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
		IExamen exam1 = (IExamen) context.getBean("Exam1");

		System.out.println(exam1.getDescription() + " cours: " + exam1.getCours().getNom());

		context.close();

	}

}
