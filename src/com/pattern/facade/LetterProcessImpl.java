package com.pattern.facade;

public class LetterProcessImpl implements LetterProcess {

    @Override
    public void writeContext(String content) {
        System.out.println("content : " + content);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("address : " + address);
    }

    @Override
    public void letterIntoEnvelope() {
        System.out.println("put letter into envelope");
    }

    @Override
    public void sendLetter() {
        System.out.println("send letter");
    }

}
