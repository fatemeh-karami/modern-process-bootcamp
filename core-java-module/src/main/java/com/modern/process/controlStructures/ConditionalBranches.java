package com.modern.process.controlStructures;

public class ConditionalBranches {
    public static void ifElseStatementExample() {
        int count = 2; // initial count value

        //basic syntax only 1 statement follows . No brace usage
        if (count > 1)
            System.out.println("count is higher than 1");

        //Basic syntax .More than 1 statement can be included . Braces are used
        if (count > 1) {
            System.out.println("counnt is higher than 1");
            System.out.println("Count is equal to " + count);
        }

        //if/else syntax . Two different courses of action can be included
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else {
            System.out.println("Count is lower or equal than 2");
        }

        //if/else/else if syntax three or more courses of action can be included
        if (count > 2) {
            System.out.println("Count is higher than 2");
        } else if (count <= 0) {
            System.out.println("count is less or equal than 0");
        } else {
            System.out.println("count is either equal to one , or two ");
        }

    }

    /**
     * Ternary Operator example
     * @see ConditionalBranches#ifElseStatementExample()
     */
    public static void ternaryExample() {
        int count = 2;
        System.out.println(count>2 ? "count is higher than 2" : "count is lower or equal than 2");

    }

    /**
     * switch structure example . Shows how to replace multiple if/else with one structure
     */
    public static void switchExample(){
        int count = 3;
        switch(count){
            case 0:
                System.out.println("count is equal to 0 ");
                break;
            case 1:
                System.out.println("count is equal to 1");
                break;
            case 2:
                System.out.println("count is equal to 2");
                break;
            default:
                System.out.println("count is either negative or higher than 2");
                break;
        }
    }

}


