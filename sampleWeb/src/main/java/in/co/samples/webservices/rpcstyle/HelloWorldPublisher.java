package in.co.samples.webservices.rpcstyle;

import javax.xml.ws.Endpoint;

public class HelloWorldPublisher {

	public static void main(String arg[]) {
		Endpoint.publish("http://localhost:7777/helloworldws/hello", new HelloWorldImpl());
	}
}
