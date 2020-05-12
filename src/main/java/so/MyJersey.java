package so;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/")
public class MyJersey extends ResourceConfig {
    public MyJersey() {
        packages("so");
    }
}
