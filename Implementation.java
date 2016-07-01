package com;

import com.epam.spb.lection2.*;
import com.google.EpamDelegate;

import java.util.Scanner;

/**
 * Created by ника1 on 30.06.2016.
 */
public class Implementation {
    public static void main(String[] args) {
        System.out.println("№1 Implementation ArgumentsExample");
        System.out.println("№2 Implementation AutoPack");
        System.out.println("№3 Implementation BigExample");
        System.out.println("№4 Implementation BitOperations");
        System.out.println("№5 Implementation CharsTest");
        System.out.println("№6 Implementation ClassExample");
        System.out.println("№7 Implementation CoverClasses");
        System.out.println("№8 Implementation DataTypes");
        System.out.println("№9 Implementation Import");
        System.out.println("№10 Implementation InstanceOf");
        System.out.println("№11 Implementation LogicOperations");
        System.out.println("№12 Implementation Main");
        System.out.println("№13 Implementation Operators");
        System.out.println("№14 Implementation StringTransformation");
        System.out.println("№15 Implementation UnaryOperators");
        System.out.println("№16 Implementation EpamDelegate");

        Scanner a = new Scanner (System.in);
        System.out.print ("Put in the number of necessary program ");
        String number = a.nextLine();

        switch (number){
            case "1": ArgumentsExample.main(args);
                break;
            case "2": AutoPack.main(null);
                break;
            case "3": BigExample.main(null);
                break;
            case "4": BitOperations.main(null);
                break;
            case "5": CharsTest.main(null);
                break;
            case "6": ClassExample.main(null);
                break;
            case "7": CoverClasses.main(null);
                break;
            case "8": DataTypes.main(null);
                break;
            case "9": Import.main(null);
                break;
            case "10": InstanceOf.main(null);
                break;
            case "11": LogicOperations.main(null);
                break;
            case "12": Main.main(null);
                break;
            case "13": Operators.main(null);
                break;
            case "14": StringTransformation.main(null);
                break;
            case "15": UnaryOperators.main(null);
                break;
            case "16": EpamDelegate.main(null);
                break;
            case "quit": System.exit(0);
                default:
                    System.out.println("You put in the wrong number");
        }
    }
}
