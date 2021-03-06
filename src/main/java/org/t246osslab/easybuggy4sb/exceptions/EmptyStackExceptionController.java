package org.t246osslab.easybuggy4sb.exceptions;

import java.util.Stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class EmptyStackExceptionController {

    private static final Logger log = LoggerFactory.getLogger(EmptyStackExceptionController.class);

	@RequestMapping(value = Config.APP_ROOT + "/ese")
	public void process() {
        Stack<String> stack = new Stack<>();
        String tmp;
        while (null != (tmp = stack.pop())) {
            log.debug("Stack.pop(): {}", tmp);
        }
	}
}