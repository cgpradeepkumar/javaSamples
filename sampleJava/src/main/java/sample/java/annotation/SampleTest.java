package sample.java.annotation;

import sample.java.annotation.TestInfo.Priority;

@TestInfo(priority=Priority.HIGH, lastModified="18/10/2016", tags="samples")
public class SampleTest {

	@Test
	public void m1() {
		throw new RuntimeException("Testing..");
	}
	
	public void m2() {}
	
	@Test
	public void m3() {}
}
