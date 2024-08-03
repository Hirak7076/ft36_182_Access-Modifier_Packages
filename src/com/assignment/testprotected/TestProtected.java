package com.assignment.testprotected;

public class TestProtected {

	public static void main(String[] args) {
        // Create an instance of ProtectedClass
        ProtectedClass protectedClassInstance = new ProtectedClass();

        // Attempt to call the protected method
        // This will cause a compile-time error
        protectedClassInstance.protectedMethod();
    }
}
