package in.co.samples.webservices.rpcstyle;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloWorld {

	@WebMethod
	public String getMessage(String name);
}
