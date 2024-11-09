##### Memento Pattern
- **Naming** `Save object State snapshot(`Movie Memento`) and undo at will`
- **When To Use**
    - When you want to keep track of state transition of an object and perform save/restore(undo) at will    
- **Brute Force Programming**
    - ???
- **Intuitive Example**
    - Undo/Redo Editor State (Notice the difference between [Command pattern Undo example](../Command/README.md))
    - `Undo/Redo` Which DS ?
      <pre>
          One Doubly LL which stores order of state chagnges & a index maintaining which is the next element which is ready for undone
          State1->state2-state3->state4 & undoIndex = 3 (4 Undo possible, No Redo possible)
          User did undo
          State1->state2-state3->state4 & undoIndex = 2 (3 Undo possible, 1 Redo possible now)
          User did undo
          State1->state2-state3->state4 & undoIndex = 1 (2 Undo possible, 2 Redo possible now)
          User did redo
          State1->state2-state3->state4 & undoIndex = 2 (3 Undo possible, 1 Redo possible now)
          User introduced State5
          State1->state2-state3->state4->state5 & undoIndex is reset to last= 4 (5 Undo possible, No Redo possible now)  
        </pre>
- **UML**
    - [UML](UML.puml) (`Ignore This`)
- ~[**Code Example**](./example)Ignore this Code, It's Messy~<br>    
      <pre>
      class OriginalClass {
          - state
          - mememotoContainer
  
          + OriginalClass clone() //this.deepCopy()
          + setState //mememotoContainer.ddl.add(clone(this))
          + undo() //mememotoContainer.undo
          + redo()
      }

      class MememotoContainer {
          - Double Linked List Of OriginalClass
          - DLLNode toBeUndoneNode

          + undo() //
          + redo()
      }
      </pre>
- **Pros**
    - Undo/redo operation
- **Cons**
    - ???
- **Comparison with Other Patterns**
    - vs Command (Because of Undo a feature )
        -  Command Pattern can undo series of commands, Memento can undo states
- **Additional Note**
    - Memento class can be public(non private,cause CareTaker needs reference of Memento) static inner class of Originator class 
