#### Design-Patterns `23 Patterns from Gang of Four`
- **Definition:** Design patterns are typical solutions to commonly occurring problems in software design. They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.
- Resources
    - https://www.youtube.com/playlist?list=PLrhzvIcii6GNjpARdnO4ueTUAVR9eMBpc
    - https://refactoring.guru/design-patterns
- Types
    - [Creational](#creational)  `5 Patterns including 2 factory Patterns`
    - [Structural](#structural)  `7 Patterns`
    - [Behavioral](#behavioral)  `11 Patterns`
    
##### Creational
###### Creational patterns "abstracts" various object creation mechanisms, which increase flexibility and reuse of existing code.
- [SingleTon](./src/main/java/Creational/SingleTon)
- [Factory Method](./src/main/java/Creational/Factory)
- [Abstract Factory Pattern](./src/main/java/Creational/AbstractFactory)
- [Builder](./src/main/java/Creational/Builder)
- [Prototype](./src/main/java/Creational/Prototype)

##### Structural
###### How classes/objects are structured/defined, mostly around inheritance & composition. How to assemble classes into larger structures while keeping these structures flexible and efficient.
- [Facade   ](./src/main/java/Structural/Facade)	
- [Composite](./src/main/java/Structural/Composite)	
- [Decorator](./src/main/java/Structural/Decorator)	
- [Proxy    ](./src/main/java/Structural/Proxy)	
- [Adapter  ](./src/main/java/Structural/Adapter)	          
- [Bridge   ](./src/main/java/Structural/Bridge)	
- [Flyweight](./src/main/java/Structural/Flyweight)

##### Behavioral
###### Talks about specific problems & How >1 objects communicate which each other and solve the problem, which single object can not solve. Example observer, COR etc.
- [Chain of Responsibility Pattern  ](./src/main/java/Behavioral/ChainofResponsibility)
- [Observer Pattern                 ](./src/main/java/Behavioral/Observer)
- [Interpreter Pattern              ](./src/main/java/Behavioral/Interpreter)
- [Command Pattern                  ](./src/main/java/Behavioral/Command)
- [Iterator Pattern                 ](./src/main/java/Behavioral/Iterator)
- [Mediator Pattern                 ](./src/main/java/Behavioral/Mediator)
- [Memento Pattern                  ](./src/main/java/Behavioral/Memento)
- [State Pattern                    ](./src/main/java/Behavioral/State)
- [Template Method                  ](./src/main/java/Behavioral/TemplateMethod)
- [Strategy Pattern                 ](./src/main/java/Behavioral/Strategy)
- [Visitor Pattern					](./src/main/java/Behavioral/Visitor)

##### UML Diagrams
- UMLs' are drawn using [Plant UML plugin](https://plugins.jetbrains.com/plugin/7017-plantuml-integration)
https://plantuml.com/class-diagram
- Use online [Plain UML Editor](https://plantuml-editor.kkeisuke.com/) to see the Class diagam using .puml content.

##### Which DP you have used
- SingleTon/Factory/Builder/Command(SF Code)/Strategy/Iterator(java iterator)/COR(In Http filter chain)/Mediator(java Thread pool) etc
 
##### Additional Patterns
- [Null Object Pattern](./src/main/java/NullObject)
- Enum + If-Else vs Polymorphism
- MVC

##### SOLID Design Principles
- [Details](./src/main/java/DesignPrinciples)

##### [The Principles of Good Programming](https://java-design-patterns.com/principles/)
- `TODO`
- [Law of Demeter](./src/main/java/GoodProgrammingPrinciples/LawOfDemeter)
- [Robustness Principle](./src/main/java/GoodProgrammingPrinciples/Robustness)
- Speculative Generality/YAGNI/Just in Time Design `Don't generalize or create interfaces if you don't need it know . But I am yet to find, any logical reasoning or disadvantages of having these interfaces  beforehand`

##### [Code Smell/Anti-Pattern](https://sourcemaking.com/refactoring)
- `TODO`
- [Primitive Obsession](./src/main/java/NullObject)
- Switch Statements/If-Else Branching

##### [Discussion on inheritance vs composition, Refer Strategy Pattern additional Note](https://github.com/pintub/design-patterns/tree/master/src/main/java/Behavioral/Strategy)
