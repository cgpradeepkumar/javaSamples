package in.co.samples.rest;

import in.co.samples.rest.resources.HelloResource;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class SampleWinkApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(HelloResource.class);
		return classes;
	}
}
