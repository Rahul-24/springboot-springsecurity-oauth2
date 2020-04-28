package com.example.service.client;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestOperations;
import org.springframework.http.ResponseEntity;


@RestController
@Configuration
public class ServiceController {

@Autowired
public RestOperations template;
	
    @GetMapping("/test")
    public String getShipmentDetails(@RequestParam String name) {
        ResponseEntity<String> result = template.getForEntity("http://localhost:9081/hello?name="+name,String.class);
        return result.getBody();
    }
    

}
