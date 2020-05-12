package so.service;

import org.springframework.stereotype.Service;
import so.MyTransactional;

import javax.ws.rs.core.Response;

@Service
public class MyService {
    @MyTransactional
    public Response get() {
        return Response.ok("You got it!").build();
    }
}
