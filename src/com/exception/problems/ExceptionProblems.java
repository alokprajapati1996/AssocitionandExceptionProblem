package com.exception.problems;

public class ExceptionProblems {
    public static void main(String[] args) {
        try {
           Class.forName("com.exception.problems.Test");
            System.out.println("class find");
           // Class.forName("Test");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
    class Test {
        static {
            System.out.println("hello");
        }

    }
