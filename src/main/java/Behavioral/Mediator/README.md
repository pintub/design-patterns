##### Mediator Pattern
- **Naming** `Interacting via a Mediator/UI-Controller`
- **When To Use**    
    - Note `Decoupling` is major benefit .
    - Actual Classes/components interact with Mediator and upon notification Mediator interacts with other components.
    - Mediator is aware of all components and each component is aware of mediator , thus one component can interact with other 
- **Brute Force Programming**
    - Classes interacting directly
- **Intuitive Example**
    - Air Traffic Controller (Flight doesn't have to know about the flights which may land during a time in a particular airport , rather it talks to traffic controller) . 
    - UI javascript Controller(Button doesn't have to know what will happen if it is pressed, It just notifies it's pressed, Controller invokes other logic like pop-up alert or make another element visible) .
    - It's like `Scheduler` pattern, All components register events to central event bus and schedule/mediator maintains a queue of tasks & list of workers. <br/>
    Scheduler picks event from Q . Then orders other components <br/>
    Example TheadPool Impl / Elevator Request Handling
    
- **UML**
    - [UML](UML.puml)
- [**Explanation**](https://stackoverflow.com/a/9226745/2653389)
- **Pros**
    - Code Decoupling
- **Cons**
    - ???
- **Comparison with Other Patterns**
