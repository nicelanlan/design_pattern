package com.pattern.facade;

public interface LetterProcess {
    void writeContext(String content);
    void fillEnvelope(String address);
    void letterIntoEnvelope();
    void sendLetter();
}
