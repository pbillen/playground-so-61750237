package so;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.glassfish.jersey.server.ContainerRequest;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Context;

@Aspect
@Service
public class MyAspect {
    @Context
    private ContainerRequest request;

    @Pointcut("within(so.service..*)")
    public void every() {
    }

    @Before("every()")
    public void test() {
        System.out.println(Thread.currentThread() + ": I need access to the HTTP headers: " + request);
    }
}
