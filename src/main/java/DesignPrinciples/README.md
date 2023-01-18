##### SOLID Design Principles
- SINGLE responsibility
    - A class should have a single reason to change according to Uncle Bob
    -  https://www.youtube.com/watch?v=AEnePs2Evg0
    -  [Why it is required](https://stackify.com/solid-design-principles/)
- OPEN/CLOSE principle
    - Never rewrite , rather create new class . Achievable by poly-morphism and DI .
    - `Class1->Class2`(violating principle). 
    Solution is to create an interface over Class2 and inject it using DI to Class1 using constructor /Setter/Field injection. But still the client of Class1 code will/might change if Class2_V2 is introduced into system instead of CLass2. If we use DI to extreme madness, we can delegate injection to further up in the chain. So, finally in this way we can avoid using new operator usage everywhere and all object creation can happen at top caller in the hierarchy i.e. `main` method.
    - But we can save madness make the change in the client class which is fine as well    
    - https://www.youtube.com/watch?v=DJF_sGOs2V4
- LISKOV principle
    - A child class reference should be able to replace a parent type reference . SO, don't sub-type a class if a behavior of parent class doesn't fit for sub-type . The same reason, don't find work-around of returning null or throwing exception from `SubType Class -> unFitBehavior()` method .
    - Sub-type based on behaviors ,not based on properties
    - Sub-type method/behavior pre-condition should be same or weaker than parent type pre-condition (should accept same set or larger set argument). This is contra-variance ,not supported in Java . So, not sure if this rule is valid for JAVA.
     Sub-type method/behavior post-condition should be same or stronger than parent type post-condition (should accept same set or smaller set argument). This is co-variance ,supported in Java overriding .
     - https://www.youtube.com/watch?v=bVwZquRH1Vk
- INTERFACE SEGREGATION
    - Smaller & more interfaces are better than lesser & large interfaces
    - It leads to favoring Composition over inheritance . There are many advantages to this. `STRATEGY` pattern.
    - https://www.youtube.com/watch?v=xahwVmf8itI
    - [vs SRP](https://stackoverflow.com/a/14388411/2653389)
- DEPENDENCY INJECTION
    - Definition : High-level modules should not depend on low-level modules. Both should depend on abstractions. 
    - Never depend on concrete implementation, rather depend on abstraction(Interfaces)
    - https://www.youtube.com/watch?v=S9awxA1wNNY
