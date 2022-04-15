package com.redhat.demo.salesforcedemo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SimpleRouteBuilder extends RouteBuilder{

    @Override
    public void configure() throws Exception {
        from("file:/Users/sumit/input?noop=true").to("file:/Users/sumit/output");
    }
    
}
