##### Observer Pattern
- **Naming** `Observable-observer` or `Notify subscribers of an Observable`
- **When To Use**
    - When you state of an Observable (some books/posts call it Subject) can change and few concerned objects(let's call them subscribers or observers) need to be notified when this state change happens
    - This pattern uses push mechanism 
- **Brute Force Programming**
    - Polling 
- **UML**
    - [UML](UML.puml) [Example](https://www.geeksforgeeks.org/observer-pattern-set-1-introduction/) -> Observer is registered to IObservable using `IObservable.add(IObserver)`
    - [Slight variation](UML.puml) [Example](https://www.tutorialspoint.com/design_pattern/observer_pattern.htm) -> Observer also has a reference to IObservable using `new ConcreteObserver(new ConcreteObservable); `
    So, bi-directional reference is there ,notice the slight change in `update()`
- [**Code Example**]
    - `TODO`
- **Pros** 
    - Push is better than polling
    - Open-Close principle
- **Cons**
    - Observable does 2 things ,which violates 'S' in SOLID
        - `add(IObservable)`, `remove(IObservable)`, `notify()` These are responsibility wrt pattern
        - `setState()`, `getState()` Keeping track of state change