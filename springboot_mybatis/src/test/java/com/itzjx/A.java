package com.itzjx;

public class A {
    public void show(A obj) {
        System.out.println("A.show(A)");
    }
    public void show(C obj) {
        System.out.println("A.show(C)");
    }

    public static void main(String[] args) {
        A ba = new B();
        C c = new C();
        D d = new D();
        ba.show(c); // A.show(C)
        ba.show(d); // A.show(C)
    }
}
class B extends A {
    @Override
    public void show(A obj) {
        System.out.println("B.show(A)");
    }

    public void show(D obj) {
        System.out.println("B.show(D)");
    }


}
class C extends B { }
class D extends C { }

