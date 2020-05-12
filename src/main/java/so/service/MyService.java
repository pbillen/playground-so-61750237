package so.service;

import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;

@Service
public class MyService {
    public Response get() {
        return Response.ok("You got it!").build();
    }
}
