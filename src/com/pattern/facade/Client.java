package com.pattern.facade;

public class Client {
    
    public static void main(String args[]) {
        ModernPostOffice postOffice = new ModernPostOffice();
        String content = "dear, long time no see, I miss you very much~";
        String address = "1st Road No 2, 3rd Province";
        postOffice.sendLetter(content, address);
    }
}
