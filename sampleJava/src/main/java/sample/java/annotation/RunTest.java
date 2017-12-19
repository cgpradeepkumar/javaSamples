package sample.java.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RunTest {

	public static void main(String arg[]) throws Exception {

		int passed = 0, failed = 0;

		Class sampleTest = Class.forName("sample.java.annotation.SampleTest");
		
		System.out.println("Testing........");

		if (sampleTest.isAnnotationPresent(TestInfo.class)) {
			Annotation annotation = sampleTest.getAnnotation(TestInfo.class);

			TestInfo testInfo = (TestInfo) annotation;
			System.out.println("priority - " + testInfo.priority());
			System.out.println("create by - " + testInfo.createdBy());
			System.out.println("last modified - " + testInfo.lastModified());

			String[] tags = testInfo.tags();
			System.out.println("TAGS");
			System.out.println("---------------------------");
			for (String tag : tags) {
				System.out.println(tag);
			}
			System.out.println("---------------------------");
		}

		for (Method m : sampleTest.getMethods()) {
			if (m.isAnnotationPresent(Test.class)) {
				try {
					m.invoke(sampleTest.newInstance());
					passed++;
				} catch (Exception e) {
					System.out.printf("Test %s failed: %s %n", m, e.getCause());
					failed++;
				}
			}
		}
		System.out.printf("Passed %s, Failed %d", passed, failed);
	}
}
