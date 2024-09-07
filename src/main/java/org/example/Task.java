package org.example;

//ToDo: Write a method that will return the factorial of the input number

public class Task {
    public int factorial(int input) {
        int result=1;
        for (int i=1;i<=input;i++){
            result*=i;
        }
        return result;
    }
}

