package com.sec.sscp.idm.idmbiz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello World Controller
 *
 * @author andy
 * @since 2015. 7. 6
 * @version 1.0
 */
@Controller
public class HelloWorldController {

    /** The logger. */
    private final Logger logger = LoggerFactory.getLogger(HelloWorldController.class);

    /**
     * @param request
     * @param response
     * @param name
     * @return Response Message
     */
    @RequestMapping(value = "/v1/helloworld/{Name}", method = RequestMethod.GET, produces = "application/json; charset=utf-8")
    @ResponseBody
    public String helloWorld(HttpServletRequest request, HttpServletResponse response, @PathVariable("Name") String name) {

        String responseString = "{\"greeting\": \"Hello World " + name + "\"}";
        logger.debug("responseString : " + responseString);
        logger.debug("responseString : " + responseString);
        logger.debug("responseString : " + responseString);

        return responseString;
    }

}
