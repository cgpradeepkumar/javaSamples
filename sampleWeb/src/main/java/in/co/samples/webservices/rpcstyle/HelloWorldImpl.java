package in.co.samples.webservices.rpcstyle;

import javax.jws.WebService;

@WebService(endpointInterface = "in.co.samples.webservices.rpcstyle.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getMessage(String name) {
		return "Hello World JAX-WS " + name;
	}

}
