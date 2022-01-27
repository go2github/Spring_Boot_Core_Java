package com.learning.corejava.factoryDesignPattern;

public class CommunicationFactory {

    public Communication getCommunicationInstace(String str){

        if(str.equalsIgnoreCase("mobile")){
            return new MobileCommunication();
        }else{
            return new EmailCommunication();
        }

    }
}
