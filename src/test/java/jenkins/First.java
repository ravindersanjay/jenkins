package jenkins;

import org.testng.annotations.Test;

import listeners.ExtentListeners;

public class First {

	@Test
	public void show() {
		System.out.println("this is first");
		ExtentListeners.testReport.get().info("this is first test case message");
		ExtentListeners.testReport.get().info("this is first test case message2");
	}
}
