package accessmodifiers.task1.b;

import accessmodifiers.task1.a.A;

public class C extends A {
    void showInfo() {
//        System.out.println(type); //private
        System.out.println(subType); //protected
//        System.out.println(name); //-
        System.out.println(age); //public
    }

    public static void main(String[] args) {
        C c = new C();
        c.showInfo();
    }
}
