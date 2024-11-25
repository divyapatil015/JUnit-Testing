package validationJunit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class validateUnameandPass {

	Validation validate = new Validation();
	@Test
	public void test() {
		String t = validate.validation("admin", "Admin");
		assertEquals("sucess",t);
		
	}

}
