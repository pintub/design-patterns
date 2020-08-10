##### Visitor Pattern
- **Naming** `Encapsulate a common behavior of different type of objects to a Visitor class`
- **When To Use**
    - When there are different type of objects of different classes and they need to have a common behavior
    - Create an interface `IBehavior` of that common behavior and delegate the task to IVisitor
    - IVisitor interface is for poly-morphism if different implementation of that common behavior is required . 
- **Brute Force Programming**
    - To have that common behavior in each different classes. But what if we don't have control of those classes and also will this behavior() addition violate single responsibility .
- **Intuitive Example**
    - A seasoned insurance agent who’s eager to get new customers. He can visit every building in a neighborhood. If it’s a residential building, he sells medical insurance.If it’s a bank, he sells theft insurance.
    - Shopping cart of different type of object need a common behavior(i.e. calculatePrice())
- **UML**
    - [UML](UML.puml)
- [**Code Example**]
    - `TODO`
- **Pros** 
    - Poly-morphism with Visitor Interface
    - 'S' in SINGLE
- **Cons**
    ???
- **Comparision with Other Patterns**
- **Additional Note**
    - Visitor reference of element as common behavior() implementation can differ based on each class object.
    IBehavior refers Visitor for delegation .
     