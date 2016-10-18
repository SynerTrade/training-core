package com.synertrade.training.core.student.api.rest;

import com.synertrade.training.core.common.api.rest.RestBaseResource;
import com.synertrade.training.core.common.api.rest.RestResource;
import com.synertrade.training.core.student.StudentEntity;
import com.synertrade.training.core.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.List;

/**
 * Created by tudorg on 10/18/2016.
 */
@RestResource
@Path("/student")
public class StudentResource extends RestBaseResource {
    @Autowired
    private StudentService studentService;

    @GET
    @Path("/list")
    public List<StudentEntity> getAllStudents(){
        return studentService.getAllStudents();
    }
}
