package org.example.innerClass;
public class OutterMain {
    static void main(String[] args) {
        OutterClass outterObject = new OutterClass();
        OutterClass.InnerClass innerObj = outterObject.new InnerClass();
        System.out.println(outterObject.x*innerObj.y);
    }
}
