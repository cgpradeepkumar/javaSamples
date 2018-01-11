package sample.java.corba.implBase;

import implBaseHelloApp.Hello;
import implBaseHelloApp.HelloHelper;
import org.apache.log4j.Logger;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import java.util.Properties;

/**
 * @author pkumar on 9/1/18
 * @project javaSamples
 */
public class HelloClient {

    private static Logger logger = Logger.getLogger(HelloClient.class);

    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.put("org.omg.CORBA.ORBInitialPort","1050");
            properties.put("org.omg.CORBA.ORBInitialHost", "localhost");
            ORB orb = ORB.init(args, properties);
            org.omg.CORBA.Object object = orb.resolve_initial_references("NameService");

            NamingContextExt context = NamingContextExtHelper.narrow(object);
            NameComponent nc = new NameComponent("Hello", "");
            NameComponent path[] = {nc};

            Hello helloImpl  = HelloHelper.narrow(context.resolve(path));

            logger.info("got a handle on server object "+ helloImpl);

            logger.info(helloImpl.sayHello());

//            helloImpl.shutdown();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
