package aspects;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import tp0Sol.model.IEvaluation;

@Aspect
public class Notification {

	@Before("execution(** tp0Sol.model.IEvaluation.set*(int)) && bean(eval2) && args(note)")
	public void setNote(int note) {
		System.out.println("On va mettre la note : " + note);
	}

	@After("execution(** tp0Sol.model.IEvaluation.setNote(int)) && args(note) && target(eval)")
	public void setNoteAf(int note, IEvaluation eval) {
		System.out.println("On a modifié la note de : " + eval.getEtudiant() + " par : " + eval.getNote());
	}

	@Before(value="execution(** *(int))",argNames="jp")
	public void test1(JoinPoint jp) {
		System.out.println("UN APPEL de la méthode : "+jp.toShortString()+ "| Args => " + Arrays.asList(jp.getArgs()));
	}
}
