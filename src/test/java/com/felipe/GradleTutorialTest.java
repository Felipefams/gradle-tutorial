package com.felipe;

//junit doesn't come with java by default, so we must add it as a dependency
import org.junit.Test;

public class GradleTutorialTest {

	@Test
	public void verifyNoExceptionThrown() {
		GradleTutorial.main(new String[]{});
	}
}
