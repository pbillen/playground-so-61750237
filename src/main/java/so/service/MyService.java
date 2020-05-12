package so.service;

import org.springframework.stereotype.Service;
import so.MyAnnotation;

import javax.ws.rs.core.Response;

@Service
public class MyService {
    @MyAnnotation
    public Response get() {
        return Response.ok("You got it!").build();
    }
}
