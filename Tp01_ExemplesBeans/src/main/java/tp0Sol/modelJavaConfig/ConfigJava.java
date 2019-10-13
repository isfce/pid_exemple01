package tp0Sol.modelJavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tp0Sol.model.Cours;
import tp0Sol.model.Examen;
import tp0Sol.model.ICours;
import tp0Sol.model.IExamen;

@Configuration
public class ConfigJava {
	@Bean(name="pid")
	public ICours getPid() {
	return new Cours("Projet d'intégration et de Développement");
	}
	
	@Bean
	public IExamen Exam1(ICours cours){
		return new Examen(cours,"Première session");
	}
}
