package com.nila.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiVersioningController {

    @GetMapping("/api/v1/data")
    public String uriVersioning1(){
        return "version 1: URI Versioning";
    }

    @GetMapping("/api/v2/data")
    public String uriVersioning2(){
        return "version 2: URI Versioning";
    }

    @GetMapping(path = "/api/data", params = "version=1")
    public String paramVersioning1(){
        return "version 1: Param Versioning";
    }

    @GetMapping(path = "/api/data", params = "version=2")
    public String paramVersioning2(){
        return "version 2: Param Versioning";
    }

    @GetMapping(path = "/api/data", headers = "X-API-VERSION=1")
    public String headerVersioning1(){
        return "version 1: Header Versioning";
    }

    @GetMapping(path = "/api/data", headers = "X-API-VERSION=2")
    public String headerVersioning2(){
        return "version 2: Header Versioning";
    }


}
