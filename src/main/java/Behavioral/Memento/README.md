##### Memento Pattern
- **Naming** `Save object State snapshot(`Movie Memento`) and undo at will`
- **When To Use**
    - When you want to keep track of state transition of an object and perform save/restore(undo) at will
    - Encapsulate the state Snapshot into `memento` class , It is strongly dependent on `Original` class , not outside access to getState() of memento object , Only Original class save and restore the memento.
    Memento to have same set of fields as that of Original class .
    - Encapsulate the state Snapshot list into `MementoCareTaker` class, It maintains the container of memento objects
- **Brute Force Programming**
    - ???
- **Intuitive Example**
    - Undo/Redo Editor State (Notice the difference between [Command pattern Undo example](../Command/README.md))
    - `Undo/Redo` Which DS ?
        - One Doubly LL which stores order of state chagnges & a index maintaining which is the next element which is ready for undone
          State1->state2-state3->state4 & index at the beginning at last = 3 (4 Undo possible, No Redo possible)
          User did undo
          State1->state2-state3->state4 & index = 2 (3 Undo possible, 1 Redo possible now)
          User did undo
          State1->state2-state3->state4 & index = 1 (2 Undo possible, 2 Redo possible now)
          User did redo
          State1->state2-state3->state4 & index = 2 (3 Undo possible, 1 Redo possible now)
          User introduced State5
          State1->state2-state3->state4->state5 & index s rest to last= 4 (5 Undo possible, No Redo possible now)        
- **UML**
    - [UML](UML.puml)
- [**Code Example**](./example)
- **Pros**
    - Undo operation
- **Cons**
    - ???
- **Comparison with Other Patterns**
    - vs Command (Because of Undo a feature )
        -  Command Pattern can undo series of commands, Memento can undo states
- **Additional Note**
    - Memento class can be public(non private,cause CareTaker needs reference of Memento) static inner class of Originator class 
