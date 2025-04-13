package org.romashorodok.spring_oauth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class Controller {

    @GetMapping("/user")
    public String helloUser() {
        return "hello user";
    }

    @GetMapping("/admin")
    public String helloAdmin() {
        return "hello admin";
    }

    @GetMapping("/unknown")
    public String helloUnknown() {
        return "hello unknown";
    }
}
