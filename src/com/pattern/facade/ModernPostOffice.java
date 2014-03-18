package com.pattern.facade;

public class ModernPostOffice {
    private LetterProcess letterProcess = new LetterProcessImpl();
    
    //新增一个警察检查信件的过程，只需要增加一个子系统，通过facade pattern的方式调用子系统
    private Police police = new PoliceImpl();
    
    
    public void sendLetter(String content, String address) {
        letterProcess.writeContext(content);
        letterProcess.fillEnvelope(address);
        
        police.checkLetter();
        
        letterProcess.letterIntoEnvelope();
        letterProcess.sendLetter();
    }
}
