package com.driver;

public class Main {
  
}class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {

    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // creating an object of class B
        B obj = new B();
        obj.meth();

        B obj1 = new B();
        obj.meth();
    }
}
