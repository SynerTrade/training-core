package com.synertrade.training.core.common.api.rest;

/**
 * Created by tudorg on 3/18/2016.
 */

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * The super class for all REST resources.
 */
@RestResource
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public abstract class RestBaseResource {

    @Context
    protected HttpServletRequest request;


}
