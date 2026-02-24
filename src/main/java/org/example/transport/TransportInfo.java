package org.example.transport;
public class TransportInfo {
    static void main(String[] args) {
        Transpots transpot = new Transpots();

        Transpots car = new Car();
        car.transpotAction();

        Transpots boat = new Boat();
        boat.transpotAction();

        Transpots plane = new Plane();
        plane.transpotAction();


    }
}
