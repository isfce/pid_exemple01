package tp0Sol.model;

import lombok.Data;

@Data
public class Evaluation implements IEvaluation {
	private int note;
	private int ponderation;
	private final IExamen examen;
	private final Etudiant etudiant;
//	public Evaluation(IExamen examen, Etudiant etudiant) {
//		super();
//		this.examen = examen;
//		this.etudiant = etudiant;
//	}
//	public int getNote() {
//		return note;
//	}
//	public void setNote(int note) {
//		this.note = note;
//	}
//	public int getPonderation() {
//		return ponderation;
//	}
//	public void setPonderation(int ponderation) {
//		this.ponderation = ponderation;
//	}
//	public IExamen getExamen() {
//		return examen;
//	}
//	public Etudiant getEtudiant() {
//		return etudiant;
//	}
	
}
