package Xperimentations;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Rough extends JFrame {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = 100000000 + random.nextInt(900000000) ;
        String number="9"+randomNumber;
        System.out.println(number);
    }

}
