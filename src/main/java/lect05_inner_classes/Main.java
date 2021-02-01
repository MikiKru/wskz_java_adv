package lect05_inner_classes;

public class Main {
    public static void main(String[] args) {
//        Inner inner = new Inner();  --> brak dostępu
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.Inner inner1 = outer.getInnerObject();
        outer.setOuterValue(10);
        System.out.println(outer.getOuterValue());
        inner1.setInnerValue(5);
        System.out.println(inner1);
    }
}
