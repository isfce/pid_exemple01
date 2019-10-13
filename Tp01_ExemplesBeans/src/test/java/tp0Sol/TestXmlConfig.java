package tp0Sol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tp0Sol.model.Cours;
import tp0Sol.model.Examen;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration //("classpath:META-INF/spring/tp0.configXML.xml") //("tp0.config.XML")
public class TestXmlConfig {
	@Autowired
	ApplicationContext context;
	@Autowired
	Cours cours;
//	@Autowired
//	@Qualifier("examen1")
//	Examen exam;

	@Test
	public void testCours() {
		assertNotNull(cours);
	}
@Test
	public void testExam() {
	Examen exam=(Examen) context.getBean("examen1");
		assertEquals(exam.getCours(),cours);
	}
}
