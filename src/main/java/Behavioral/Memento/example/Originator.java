package Behavioral.Memento.example;

/**
 * Originator Class
 */
public class Originator {

    private String state;

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    public OriginatorMemento saveMemento(){
        return new OriginatorMemento(this.state);
    }

    public Originator restoreMemento(OriginatorMemento memento){//Going back to a previous state
        this.state = memento.state;
        return this;
    }

    /**
     * Memento Class
     */
    public static class OriginatorMemento { // Static inner class doesn't hold reference to object of Parent Class,thus Preferred
        private String state;

        private OriginatorMemento(String state) {
            this.state = state;
        }
    }
}
