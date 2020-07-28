##### Decorator Pattern
- **Naming** `Decorates or adds 1 or more toppings to a behavior using Composition`
- **When To Use**
    - When there is a base implementation(For example Base pizza with only dough) and need to add multiple toppings.
    - Read the differences with other patterns `Additional Note` section
- **Brute Force Programming**
    - Subclassing , Topping1Class -> BaseClass, Topping2Class -> BaseClass. Suppose you now want, Topping2Class behavior on top of Topping1Class , you have to create another class  Topping2OnTopping1Class . The point is inheritance is static , for each behavior you will write new classes .
    - Interface for each topping behavior , If there are `n` toppings, for each combination of behavior you will end up writing `2^n` classes for implementing those interfaces.
    - So, Composition is preferable here over Inheritance ,which provides lot of flexibility without creating classes at run-time 
- [**UML**](UML.puml)
- **Example**
    - `TODO`
- **Pros**
    - You can extend an object’s behavior without making a new subclass.
    - You can combine several behaviors by wrapping an object into multiple decorators.
    - Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.
- **Cons**
    - ???
- **Additional Note**
    - vs Adapter 
        - Both looks similar , server a wrapper on a base service provider(Adapter) or behavior(Decorator) , But Decorator can recursively add more than one toppings like a stack, which is not possible in Adapter
    - vs Composite (Because of recursion)
        - Think of Decorator as a topping and Composite as a tree of components with same behavior . Both for different purpose.
        - Decorator recursively adding toppings (Base behavior + Topping1 + Topping2 so on...)
        Composite recursively traverse through tree and sums/aggregates the behavior of all components .
         