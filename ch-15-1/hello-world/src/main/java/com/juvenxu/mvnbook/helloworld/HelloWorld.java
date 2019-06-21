package com.juvenxu.mvnbook.helloworld;

public class HelloWorld {

    public String sayHello() {
        return "Hello Maven";
    }

    public static void main(String[] args) {
        String abc = null;
        if (args[0] == "123") {
            abc = "123";
        }
        System.out.println(abc.toString());
        System.out.print(new HelloWorld().sayHello());
    }
}
