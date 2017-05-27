package homeTask1;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import homeTask1.ArrayClass;

public class TestArrayClass {

	private static ArrayClass ar = new ArrayClass();
	private static final Logger LOG = Logger.getLogger(TestArrayClass.class);

	@Test(timeout = 1000)
	public void testSumArray() {
		LOG.info("Test Sum method");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			LOG.error(e);
		}

		Assert.assertEquals("SUM not equel", ar.sumArray(5, 5, 5), 15);
	}

	@Test
	public void testAverArray() {
		LOG.info("Test Average method");
		Assert.assertEquals("Average  not equel", ar.averArray(5, 5, 5, 3), 5);
	}

	@Test
	public void TestIncrArray() {
		LOG.info("Test incrise method");
		Assert.assertEquals("SUM nor equel", ar.incrArray(5, 5, 5), 30);
	}
}
