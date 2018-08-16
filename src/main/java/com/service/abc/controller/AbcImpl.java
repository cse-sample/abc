package com.service.abc.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-08-16T02:10:00.540Z")

@RestSchema(schemaId = "abc")
@RequestMapping(path = "/abc", produces = MediaType.APPLICATION_JSON)
public class AbcImpl {

    @Autowired
    private AbcDelegate userAbcDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userAbcDelegate.helloworld(name);
    }

}
