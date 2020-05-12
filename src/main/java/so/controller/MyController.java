package so.controller;

import org.springframework.beans.factory.annotation.Autowired;
import so.service.MyService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class MyController {
    @Autowired
    private MyService service;

    @GET
    public Response get() {
        return service.get();
    }
}
