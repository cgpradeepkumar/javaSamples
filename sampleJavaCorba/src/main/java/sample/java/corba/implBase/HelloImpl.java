package sample.java.corba.implBase;

import implBaseHelloApp._HelloImplBase;
import org.omg.CORBA.ORB;

/**
 * @author pkumar on 9/1/18
 * @project javaSamples
 */
public class HelloImpl extends _HelloImplBase {
    private ORB orb;

    public void setOrb(ORB orb) {
        this.orb = orb;
    }

    public String sayHello() {
        return "Hello World!";
    }

    public void shutdown() {
        orb.shutdown(false);
    }
}
