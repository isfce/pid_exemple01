package tp0Sol.model;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Etudiant {
	// Logger
	private static final Logger logger = LoggerFactory.getLogger(Etudiant.class);

	private Long id;

	private String username;

	private String password;

	private String prenom;

	private String nom;

	private String email;

	// protected Set<Module> modules = new HashSet<Module>();// readOnly



	public static void main(String[] args) {
		Etudiant et1 = new Etudiant(1L, "vo", "password", "Didier", "VO", "voisfce@gmail.com");
		
		logger.debug("Un serveur a été créé:", et1);
		System.out.println(et1 );
	}

}
