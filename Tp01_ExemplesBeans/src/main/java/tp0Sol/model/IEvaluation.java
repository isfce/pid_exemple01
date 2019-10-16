package tp0Sol.model;

public interface IEvaluation {

	int getNote();

	void setNote(int note);

	int getPonderation();

	void setPonderation(int ponderation);

	IExamen getExamen();

	Etudiant getEtudiant();

}