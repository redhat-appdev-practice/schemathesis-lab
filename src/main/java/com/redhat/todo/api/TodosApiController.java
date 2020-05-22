package com.redhat.todo.api;

import com.sun.org.apache.xpath.internal.operations.Bool;
import io.swagger.annotations.ApiParam;
import javassist.bytecode.stackmap.TypeData;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.redhat.todo.model.Todo;
import java.time.OffsetDateTime;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-05-19T09:31:42.042-07:00[America/Los_Angeles]")

@Controller
@RequestMapping("${openapi.todo.base-path:/v1}")
public class TodosApiController implements TodosApi {

    private static final Logger LOGGER = Logger.getLogger( TodosApiController.class.getName() );


    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TodosApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Todo> getTodo(String todoId) {
        Todo response = new Todo();
        response.setName("Stubbed Todo Item");
        response.setDescription("Stubbed Todo Description");
        response.setCompleted(false);
        response.setDate(OffsetDateTime.now().plusDays(1));
        return ResponseEntity.ok(response);
    }



}
