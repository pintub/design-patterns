##### Facade Pattern
- **Naming** `Facade is The face of a building, Facade/Wrapper to a complex s/w sub-system, which is abstracted from Client`
- **When To Use**
    - When you want to hide complex sub-system from Client ,Create a simple contract in form of Facade and expose to Client.
    So, client doesn't have to bother about how to use sub-system classes and in which order to call the APIs'
    - There won't be any change is client side even sub-system is changed until contract is intact
- **Brute Force Programming**
    - Tight coupling of implementation class and Client class
- [**UML**](UML.puml)
- [**Example**]
    - `TODO`
- **Pros**
    - Loose coupling.
- **Cons**
    - ???
- **Additional Note**
    - Facade might be confused with Abstraction due to information hiding, but there is thin difference . Facade delegates the task to sub-system(which can be another interface or class) and Abstraction Interface hides the complexity of an implementation/Concrete class .