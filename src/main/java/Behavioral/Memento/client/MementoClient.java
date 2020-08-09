package Behavioral.Memento.client;

import Behavioral.Memento.example.CareTaker;
import Behavioral.Memento.example.Originator;

public class MementoClient {

    public static void main(String[] args) {
        Originator originator = new Originator("1");
        CareTaker careTaker = new CareTaker (originator);
        careTaker.save();
        System.out.println(originator.getState());//1

        originator.setState("2");
        careTaker.save();
        System.out.println(originator.getState());//2

        originator.setState("3");
        careTaker.save();
        System.out.println(originator.getState());//3
        careTaker.undo();
        System.out.println(originator.getState());//2
    }
}
