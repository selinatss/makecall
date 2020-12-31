package com.example.makecall.controller;

import com.example.makecall.model.Call;
import com.example.makecall.util.Constans;

public class CallTypeImpl implements CallType{

    @Override
    public String getMessage(Call call) {
        if(call.getCallType().equals(Constans.REGULAR)){
            return Constans.REGULAR_MESSAGE;
        }else if(call.getCallType().equals(Constans.ANONYMOUS)){
            return Constans.ANONYMOUS_MESSAGE;
        }else{
            return "Hello, this is a " + call.getCallType() + "call";
        }
    }
}
