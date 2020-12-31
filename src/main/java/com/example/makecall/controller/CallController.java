package com.example.makecall.controller;

import com.example.makecall.model.Call;
import com.example.makecall.services.CallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.NoSuchElementException;

@RestController
public class CallController {
    @Autowired
    CallService callService;

    @PostMapping("call/v1/")
    public ResponseEntity<String> postAccount(@RequestBody Call call) {
        callService.saveCall(call);
        return new ResponseEntity<>(new CallTypeImpl().getMessage(call), HttpStatus.OK);
    }

    @GetMapping("/calls/v1/")
    public @ResponseBody Iterable<Call> getAllCalls(){
        return callService.getCalls();
    }

    @GetMapping("/call/{id}")
    public ResponseEntity<Call> getCall(@PathVariable String id) throws Exception {
        return new ResponseEntity<>(callService.getCall(id), HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public String handleException(NoSuchElementException ex)
    {
        return "Call not found in the system";
    }
}
