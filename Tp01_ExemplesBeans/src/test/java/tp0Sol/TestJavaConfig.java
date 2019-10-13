package tp0Sol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tp0Sol.model.ICours;
import tp0Sol.model.IExamen;
import tp0Sol.modelJavaConfig.ConfigJava;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConfigJava.class)
public class TestJavaConfig {
	@Autowired
	private IExamen exam1;

	@Autowired
	private ICours cours;

	@Test
	public void examShouldNotBeNull() {
		assertNotNull(exam1);
	}

	@Test
	public void test() {
		assertEquals(exam1.getCours(), cours);
	}

}
