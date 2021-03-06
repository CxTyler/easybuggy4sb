package org.t246osslab.easybuggy4sb.errors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class GenericSignatureFormatErrorController {

	@RequestMapping(value = Config.APP_ROOT + "/gsfe")
	public void process() {
		final TestClass<String> testClass1 = new TestClass<>();
		TestClass<?> testClass2 = testClass1;
		testClass2.new TestInnerClass() {
		}.getClass().getGenericSuperclass();
	}

	class TestClass<T> {
		public class TestInnerClass {
		}
	}
}
