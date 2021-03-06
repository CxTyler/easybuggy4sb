package org.t246osslab.easybuggy4sb.errors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class OutOfMemoryErrorController3 {

	@RequestMapping(value = Config.APP_ROOT + "/oome3")
	public void process() {
		while (true) {
			new Thread() {
				@Override
				public void run() {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e) {
					}
				}
			}.start();
		}
	}
}
