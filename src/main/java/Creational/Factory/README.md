##### Factory Pattern
- **Naming** `A Factory of objects`
- **When To Use**
    - When a client want to create an object(Example Animal object) , but type object creation depends on some logic i.e., logic can be random object creation(Suppose there are 3 animal types , client picks the object type randomly) or based on some parameter(if parameter=parameter1, create animal1, if parameter=parameter2, create animal2) 
- **Brute Force Programming**
    - Having if else clause in Client class(if parameter=parameter1, create animal1, if parameter=parameter2, create animal2)
- **Types**
    - ~~Simple Factory~~ `it is not denoted as a design Pattern` [UML](./SimpleFactoryUML.puml)
    - Factory method `We are discussing this one, Only difference is that, this pattern has abstraction over simple Factory class to support different types of factory. So Extensible factory of objects, whereas Simple factory is Simple factory of objects` [UML](./FactoryMethodUML.puml)
- [**Code Example**](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)
- **Pros**
    - Decouples and encapsulates the creation logic to separate class
    - if such creation logic needed for multiple clients, good to have factory object for code reuse.
    - Open/Closed Principle. You can introduce new type of products into the program without breaking existing client code <br/>
    Also you can introduce new type of Factory
    - You avoid tight coupling between the creator and the concrete products.
- **Cons**
    - ???
