package org.t246osslab.easybuggy4sb.errors;

import java.net.NetworkInterface;
import java.net.SocketException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.t246osslab.easybuggy4sb.Config;

@Controller
public class UnsatisfiedLinkErrorController {

    private static native NetworkInterface getByName0(String name) throws SocketException;

	@RequestMapping(value = Config.APP_ROOT + "/jnicall")
	public void process() throws SocketException {
		getByName0("");
	}
}
