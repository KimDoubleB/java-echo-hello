package com.test.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Slf4j
public class HelloController {

    @GetMapping
    public String helloGet(@RequestHeader Map<String, Object> headers,
                           @RequestBody(required = false) String body) {
        log.info("[Get] Request Header {}", headers);
        log.info("[Get] Request Body {}", body);
        return "[Get] Hello";
    }

    @PostMapping
    public String helloPost(@RequestHeader Map<String, Object> headers,
                            @RequestBody(required = false) String body) {
        log.info("[Post] Request Header {}", headers);
        log.info("[Post] Request Body {}", body);
        return "[Post] Hello";
    }

    @PutMapping
    public String helloPut(@RequestHeader Map<String, Object> headers,
                           @RequestBody(required = false) String body) {
        log.info("[Put] Request Header {}", headers);
        log.info("[Put] Request Body {}", body);
        return "[Put] Hello";
    }

    @DeleteMapping
    public String helloDelete(@RequestHeader Map<String, Object> headers,
                              @RequestBody(required = false) String body) {
        log.info("[Delete] Request Header {}", headers);
        log.info("[Delete] Request Body {}", body);
        return "[Delete] Hello";
    }

}
