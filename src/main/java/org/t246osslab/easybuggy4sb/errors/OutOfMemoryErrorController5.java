package org.t246osslab.easybuggy4sb.errors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javassist.ClassPool;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class OutOfMemoryErrorController5 {

	@RequestMapping(value = Config.APP_ROOT + "/oome5")
	public void process() {
        try {
            for (int i = 0; i < 1000000; i++) {
                ClassPool pool = ClassPool.getDefault();
                pool.makeClass("org.t246osslab.easybuggy.Generated" + i).toClass();
            }
        } catch (Exception e) {
        }
    }
}
