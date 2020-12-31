package com.example.makecall.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Call {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;

    public String calle;
    public String caller;
    public String callType;

    public Call() {
    }

    public Call(String calle, String caller, String callType) {
        this.calle = calle;
        this.caller = caller;
        this.callType = callType;
    }

    public String getId() {
        return id;
    }

    public void setApprovalCode(String id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    @Override
    public String toString() {
        return "Call{" +
                "id='" + id + '\'' +
                ", calle='" + calle + '\'' +
                ", caller='" + caller + '\'' +
                ", callType='" + callType + '\'' +
                '}';
    }
}
