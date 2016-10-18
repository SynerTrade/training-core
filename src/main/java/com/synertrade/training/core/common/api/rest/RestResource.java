package com.synertrade.training.core.common.api.rest;

import org.springframework.stereotype.Service;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that the annotated class is a REST service.
 * <p>
 * Typically a REST resource is a REST service.
 *
 * Created by tudorg on 3/18/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Service
public @interface RestResource {
    String value() default "";
}