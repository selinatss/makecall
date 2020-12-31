package com.example.makecall.services;

import com.example.makecall.model.Call;
import com.example.makecall.repository.CallRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CallService {
    @Autowired
    CallRepository callRepository;

    public Call saveCall(Call call) {
        return callRepository.save(call);
    }

    public Iterable<Call> getCalls(){
        return  callRepository.findAll();
    }

    public Call getCall(String id) {
        return callRepository.findById(id).get();
    }


}
