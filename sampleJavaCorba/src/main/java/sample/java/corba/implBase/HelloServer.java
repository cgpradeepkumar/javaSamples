package sample.java.corba.implBase;

import implBaseHelloApp.Hello;
import implBaseHelloApp.HelloHelper;
import org.apache.log4j.Logger;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.*;

import java.util.Properties;

/**
 * @author pkumar on 9/1/18
 * @project javaSamples
 */
public class HelloServer {

    public static Logger logger = Logger.getLogger(HelloServer.class);

    public static void main(String[] args) {
        try {

            Properties properties = new Properties();
            properties.put("org.omg.CORBA.ORBInitialPort","1050");
            properties.put("org.omg.CORBA.ORBInitialHost", "localhost");
            ORB orb = ORB.init(args, properties);

            HelloImpl helloImpl = new HelloImpl();
            helloImpl.setOrb(orb);


            org.omg.CORBA.Object object = orb.resolve_initial_references("NameService");
            NamingContextExt context = NamingContextExtHelper.narrow(object);

            Hello hello = HelloHelper.narrow(helloImpl);

            NameComponent nc = new NameComponent("Hello", "");
            NameComponent path[] = {nc};
            context.rebind(path, hello);

            logger.info("HelloServer ready and waiting............");

            orb.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

        logger.info("HelloServer exiting...........");
    }
}
