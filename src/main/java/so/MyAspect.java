package so;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.glassfish.jersey.server.ContainerRequest;
import org.springframework.stereotype.Component;

import javax.ws.rs.core.Context;

@Aspect
@Component
public class MyAspect {
    @Context
    private ContainerRequest request;

    @Pointcut("@annotation(so.MyAnnotation)")
    public void annotated() {
    }

    @Before("annotated()")
    public void test() {
        System.out.println(Thread.currentThread() + ": I need access to the HTTP headers: " + request);
    }
}
