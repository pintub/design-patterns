##### Chain of Responsibility Pattern
- **Naming** `A client request goes through chain of objects which serves similar behavior`
- **When To Use**
    - When Client request has to go through multiple validation .Instead of having all validation in one class , Create multiple classes each doing unique validation ('S' in SOLID principle) .
    - Note the phrase `similar behavior` .This is the reason, we are creating interface over all links(i.e. objects) of chain .  
- **Brute Force Programming**
    - All validations in single class
    - Create a list of handlers and invoke `handler.serve()` one by one . Difference is in CoR each object/link calls next link . Let's see detailed(but thin :wink:) difference in last section .
- **Intuitive Example**
    - We Request through lot of validations (Authentication, Authorization, etc)
    - Logger feature LLD implementation, i.e. Logger Level has Ordering, Each level can be one class, Example Debug's getNext() would be Info
- [**UML**](UML.puml)
- [**Code Example**](https://refactoring.guru/design-patterns/chain-of-responsibility/java/example)
    - [Image](https://refactoring.guru/design-patterns/chain-of-responsibility)
- **Pros** 
    - Single Responsibility Principle. You can decouple classes that invoke operations from classes that perform operations.
    - Open/Closed Principle. You can introduce new handlers into the app without breaking the existing client code.
- **Cons**
    - ???
- **Comparison with Other Patterns**
    - vs "List of Validators" (i.e. It is not a pattern)
        - "List of Validators" is like "Composite pattern" in structural pattern which uses iteration, whereas "COR" is like "Decorator Pattern"
        - List of Validators UML is simple to understand , whereas CoR pattern is complex. Use CoR if usecase is complex . Only difference is ,in CoR each link calls the next one ,whereas in list iteration happens in client code .Let's take example, A-B-C-D chain , If A and C obj returns 1 , validation should stop ,else validation should continue through chain (naive example :innocent: , my point is if some custom pre- and post-processing is there for each validator), we have to maintain a if-else clause in Client , but CoR pattern would be neat. I don't see any other difference . Personally prefer list as it's readable, intuitive, simple.       
    - vs Decorator (Because of recursion)
        - The purpose is different ,the way the chain of behaviors recursively called is similar . CoR is a chain or list, the request can fail and stop at any link . Decorator is chain of toppings, it doesn't stop in between. Also, Decorator is a like stack ,where the flow of execution should end at base concrete implementation, whereas no order restriction in CoR. That's why may be only difference in UML is BaseConcreteImplementaion(i.e. BasePizza)
