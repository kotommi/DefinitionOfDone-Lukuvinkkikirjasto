package main;

import ReadMe.classes.UI;
import ReadMe.io.ConsoleIO;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Toimii");
        System.out.println("Niinpä!");
        System.out.println("branch test!");
        
        ConsoleIO io = new ConsoleIO();
        UI ui = new UI(io);
        ui.run();


    }
}
