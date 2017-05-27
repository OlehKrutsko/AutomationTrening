package homeTask1;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;


public class TestString {
	private static StringClass str = new StringClass();
	private static final Logger LOG = Logger.getLogger(TestString.class);
	
	@Test
	public void testConcatenation() {
		LOG.info("Test Concatenation method");
		Assert.assertEquals("Concatenation doesn't work", str.concatenation("I'm right "),"I'm right all the time");
	}
	
	@Test
	public void testReplacement() {
		LOG.info("Test Replacement method");
		Assert.assertEquals("Replacement doesn't work", str.replacement("test"),"hoho");
	}
	
}
