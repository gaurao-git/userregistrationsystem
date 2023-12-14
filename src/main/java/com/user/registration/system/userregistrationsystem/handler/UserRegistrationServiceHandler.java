package com.user.registration.system.userregistrationsystem.handler;

import com.user.registration.system.userregistrationsystem.dtos.RegistrationResponseModel;
import com.user.registration.system.userregistrationsystem.exceptions.RegistrationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

@RestControllerAdvice
public class UserRegistrationServiceHandler {


    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public ResponseEntity SQLIntegrityConstraintViolationException(SQLIntegrityConstraintViolationException sqlException){
        return new ResponseEntity<String>(sqlException.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
//    @ExceptionHandler(RuntimeException.class)
//    public ResponseEntity<String> sQLIntegrityConstraintViolationException(RuntimeException
//                                                                                   sqlException){
//        return new ResponseEntity<String>(sqlException.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
//    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<FieldError>> methodArgumentExceptionHandler(MethodArgumentNotValidException
                                                                                   methodArgumentNotValidException){
        List<FieldError> errors = methodArgumentNotValidException.getBindingResult().getFieldErrors();
        return new ResponseEntity<List<FieldError>>(errors, HttpStatus.BAD_REQUEST);
    }

//    @ExceptionHandler(RegistrationException.class)
//    public ResponseEntity<RegistrationResponseModel> registrationExceptionHandler(RegistrationException registrationException){
//        RegistrationResponseModel registrationResponseModel = RegistrationResponseModel.builder()
//                .devErrorMsg(registrationException.getMessage())
//                .build();
//
//        return new ResponseEntity<RegistrationResponseModel>(registrationResponseModel, HttpStatus.OK);
//    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity SQLIntegrityConstraintViolationException(Exception exception){
        return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
