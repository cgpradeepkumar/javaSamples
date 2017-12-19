package in.co.samples.webservices.rpcstyle;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class HelloWorldClient {
	
	public static void main(String arg[]) {
		try {
			URL url = new URL("http://localhost:7777/helloworldws/hello?wsdl");
			QName qname = new QName("http://rpcstyle.webservices.samples.co.in/", "HelloWorldImplService");
			Service service = Service.create(url, qname);
			HelloWorld helloWorld = service.getPort(HelloWorld.class);
			System.out.println(helloWorld.getMessage("client"));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
