package tp0Sol;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import tp0Sol.model.ICours;
import tp0Sol.model.IExamen;
import tp0Sol.modelAutoConfig.ConfigAuto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=ConfigAuto.class)
public class TestAutoConfig {
	//@Rule
	// public final StandardOutputStreamLog log = new StandardOutputStreamLog();

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
		assertEquals(exam1.getCours(),cours );
	}

}
