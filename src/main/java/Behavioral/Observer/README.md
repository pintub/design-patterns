##### Observer Pattern
- **Naming** `Observable-observer` or `Notify subscribers of an Observable`
- **When To Use**
    - When you state of an Observable (some books/posts call it Subject) can change and few concerned objects(let's call them subscribers or observers) need to be notified when this state change happens
    - This pattern uses push mechanism 
- **Brute Force Programming**
    - Polling 
- **Intuitive Example**
    - Java-way of Event handling
- **UML**
    - [UML](UML.puml) [Example](https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/) -> (IObservable-Observer Registration at Observer end) Observer is registered to IObservable using `IObservable.register(IObserver)`
    - [Slight variation](UML.puml) (`Ignore This`) [Example](https://www.tutorialspoint.com/design_pattern/observer_pattern.htm) -> (IObservable-Observer Registration at IObservable end) Observer has a reference to IObservable using `new ConcreteObserver(new ConcreteObservable); ` and calls `concreteObservable.register(concreteObserver)`
    So, bidirectional reference is there.
- [**Code Example**]
    - `TODO`
- **Pros** 
    - Push is better than polling
    - Open-Close principle
- **Cons**
    - Observable does 2 things ,which violates 'S' in SOLID
        - `add(IObservable)`, `remove(IObservable)`, `notify()` These are >1 responsibility handled by Observable/Subject class
        - `setState()`, `getState()` Keeping track of state change
    - This pattern needs tight coupling of Observer and Observable , i.e. Observable needs to know about Observer . Kafka solves this problem <br/>
    Use Thread Pool(which has Task Q similar to Kafka + list of Threads) to achieve Kafka like functionality .
