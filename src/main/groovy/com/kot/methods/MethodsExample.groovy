package com.kot.methods

class MethodsExample {
    static def someMethod() {
        println("method run");
    }

    static def methodParameters(parameter1, parameter2, parameter3) {
        println("method with params");
        println(parameter1);
        println(parameter2);
        println(parameter3);
    }

    static def methodDefaulParameters(parameter1, parameter2 = 0, parameter3 = 0) {
        println("method with default params");
        println(parameter1);
        println(parameter2);
        println(parameter3);
    }

    static void main(String[] args) {
        someMethod();
        methodParameters(1,2,3)
        methodDefaulParameters(1)
        methodDefaulParameters(1,2,3)
    }
}
