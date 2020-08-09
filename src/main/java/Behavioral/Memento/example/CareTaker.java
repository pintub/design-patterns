package Behavioral.Memento.example;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

    private Originator originator;
    private List<Originator.OriginatorMemento> mementoList;

    public CareTaker(Originator originator){
        this.mementoList = new ArrayList();
        this.originator = originator;
    }

    public void save(){
        Originator.OriginatorMemento memento = this.originator.saveMemento();
        mementoList.add(memento);
    }

    public void undo(){
        if(mementoList.size() == 0){
            System.out.println("NOTHING TO UNDO");
            return;
        }
        Originator.OriginatorMemento memento = mementoList.get(mementoList.size() - 2);
        originator.restoreMemento(memento);
    }

    //TODO
    public void redo() {
    }
}
