package com.assignment.privateaccess;

public class TestPrivate {
    public static void main(String[] args) {
        // Create an instance of PrivateClass
        PrivateClass privateClassInstance = new PrivateClass();

        // Attempt to call the private method
        // This will cause a compile-time error
        privateClassInstance.privateMethod();
    }
}