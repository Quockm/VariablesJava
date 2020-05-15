package com.company;

import javax.sound.midi.Soundbank;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("1- Kieu du lieu Byte");
        System.out.println("Size in bit: " +Byte.SIZE);
        System.out.println("Min value: " +Byte.MIN_VALUE);
        System.out.println("Max value: " +Byte.MAX_VALUE);

        System.out.println("2- Kieu du lieu Short"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Short.SIZE);
        System.out.println("Min value: " +Short.MIN_VALUE);
        System.out.println("Max value: " +Short.MAX_VALUE);

        System.out.println("3- Kieu du lieu Integer"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Integer.SIZE);
        System.out.println("Min value: " +Integer.MIN_VALUE);
        System.out.println("Max value: " +Integer.MAX_VALUE);

        System.out.println("4- Kieu du lieu Long"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Long.SIZE);
        System.out.println("Min value: " +Long.MIN_VALUE);
        System.out.println("Max value: " +Long.MAX_VALUE);

        System.out.println("5- Kieu du lieu Float"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Float.SIZE);
        System.out.println("Min value: " +Float.MIN_VALUE);
        System.out.println("Max value: " +Float.MAX_VALUE);

        System.out.println("6- Kieu du lieu Double"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Double.SIZE);
        System.out.println("Min value: " +Double.MIN_VALUE);
        System.out.println("Max value: " +Double.MAX_VALUE);

        System.out.println("7- Kieu du lieu Char"); // 2 mu bit = Max-value
        System.out.println("Size in bit: " +Character.SIZE);
        //System.out.println("Min value: " +Character.MIN_VALUE); // ko hien thi
        //System.out.println("Max value: " +Character.MAX_VALUE); // ko hien thi

        System.out.println("True or Flase ? "+(2>3));
    }
}
