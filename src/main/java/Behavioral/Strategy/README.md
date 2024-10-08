##### Strategy Pattern
- **Naming** `Composition over Inheritance, Create Stratery interfaces for behaviors or algorithm`
- **When To Use**
    - When there is inheritance hierarchy , below scenarios arises . Let's consider Duck(yes bird :smile:) class and its sub-classes . Duck can have fly(), quack() behavior .
        -   A RubberDuck can't fly(), violates Liskov's principle . But few can argue, than no flying is also one type of fLy() implementation .
        - Reuse behavior among WildDuck and CityDuck . Well it is simply not possible in inheritance as both are siblings. You will have to duplicate code in both classes .
    - Well Composition comes in for rescue . Break inheritance and move behaviors to `IBehavior` interfaces , each subclass object will be now one instance of Parent class.
- **Brute Force Programming**
    - Inheritance . I won't say avoid inheritance completely , If you don't have above complications ,Inheritance is fine to use . [UML](UML_AntiPattern.puml)
- **Intuitive Example**
    - PricingStratgy or FindCabStrategy in Uber
- **UML**
    - [UML](UML.puml)
- [**Code Example**]
    - `TODO`
- **Pros** 
    - Poly-morphism , you can combine different type of quack() and fly() behavior at client side without creating new classes. 
- **Cons**
    ???
- **Comparison with Other Patterns**
- Difference between Model inheritance & Behavior Inheritance
    - Stragegy pattern is about Behavior Inheritance, when thee are multiple algorithm possible, Example how to find appropriate parking slot for a car
- **Additional Note**
    - This Pattern again says, Prefer Composition to Inheritance. [Refer Additional Note](../../Structural/Bridge/README.md) .
    Also , inheritance provides re-usability (again very thin) only if sub-class has exact same behavior or partially same behavior(super.behavior(); //Do something extra). In this case, you can sub-class.</BR>
    Else if there can be cases like this . There are 4 sub-class (let's say Duck subclass) objects can fly , but only 2 Duck subclass which can use default fly() of parent class(this is re-use) , other 2 Duck subclass have completely different fly() (so, they can't reuse the parent default fly()).</BR>
    To add complexity , Let's think one Duck can't fly(), breaks 'L' in SOLID</BR>
    To add additional complexity, Duck Class A and B have same fly() behavior, which needs re-usability along siblings ,which inheritance can't provide . `Inheritance can only give re-usability in the hierarchy` , not to siblings.</BR>
    
    In-short, `Inheritance provides re-use in very restricted cases only in hierarchy direction`. Ahh Inheritance = re-usability is a myth (at-least not completely true)
    
    - Composition let you encapsulate fly() to different interface-class and use this to the necessary Duck class   
    - Till now ,I have seen only one pattern wrt [inheritance :wink:](../TemplateMethod), Other use inheritance + composition combination (`Note this`)
