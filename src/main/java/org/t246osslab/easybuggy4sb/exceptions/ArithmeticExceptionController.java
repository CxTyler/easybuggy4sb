package org.t246osslab.easybuggy4sb.exceptions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class ArithmeticExceptionController {

	@RequestMapping(value = Config.APP_ROOT + "/ae")
	public void process(ModelAndView mav) {
		mav.addObject(1 / 0);
	}
}