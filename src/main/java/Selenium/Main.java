package Selenium;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Main {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //String formatDateTime = currentDateTime.format(formatter);
        
        System.out.println("Formatted current time and date: " + currentDateTime );
    }
}
