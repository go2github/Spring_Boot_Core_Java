package com.learning.validation;

import com.learning.request.Student;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.springframework.http.HttpStatus.BAD_REQUEST;

@RestController
@RequestMapping("/validation")
public class ValidationTestingController {


    //https://www.tabnine.com/code/java/classes/javax.validation.constraints.Pattern

    //https://stackoverflow.com/questions/61992596/spring-boot-valid-on-requestbody-in-controller-method-not-working/65399016#65399016

    //https://www.yawintutor.com/how-to-validate-request-body-in-spring-boot/

//    @PostMapping("/student")
//    private ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student, Errors errors){
//        if(errors.hasErrors()){
//            System.out.println("Errors count : " + errors.getErrorCount());
//            for (ObjectError objectError : errors.getAllErrors()) {
//                System.out.println("errors : " + objectError.getDefaultMessage());
//            }
//        }
//        System.out.println(student);
//        return ResponseEntity.ok(student);
//    }
    @PostMapping("/student")
    private ResponseEntity<Student> saveStudent(@Valid @RequestBody Student student){


        System.out.println(student);
        return ResponseEntity.ok(student);
    }
    @ResponseStatus(BAD_REQUEST)
    @ResponseBody
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Error methodArgumentNotValidException(MethodArgumentNotValidException ex) {
        BindingResult result = ex.getBindingResult();
        List<org.springframework.validation.FieldError> fieldErrors = result.getFieldErrors();
        return processFieldErrors(fieldErrors);
    }
    private Error processFieldErrors(List<FieldError> fieldErrors) {
        Error error = new Error(BAD_REQUEST.value(), "validation error");
        for (org.springframework.validation.FieldError fieldError: fieldErrors) {
            error.addFieldError(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return error;
    }
    static class Error {
        private final int status;
        private final String message;
        private List<FieldError> fieldErrors = new ArrayList<>();

        Error(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        public void addFieldError(String path, String message) {
            FieldError error = new FieldError(path, message,"Validation Exception");
            fieldErrors.add(error);
        }

        public List<FieldError> getFieldErrors() {
            return fieldErrors;
        }
    }
    @PostMapping(value = "/student/",consumes = MediaType.ALL_VALUE)
    ResponseEntity<String> student(@RequestBody String str,@RequestHeader Map<String, String> headers) {
        headers.forEach((key, value) -> {
            System.out.println("Header "+ key+" = "+ value);
        });
        return ResponseEntity.ok("Headers are read successfully ");
    }
}
