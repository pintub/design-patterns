##### State Pattern
- **Naming** `State transition of an object`
- **When To Use**
    - When on object goes a finite set of states(For example, Document has draft, final, reviewed , published states),
    there are switching rules,i.e. one state can switch to only few other states(example,Draft can next move to only final state)
    And with each state the behavior of object changes(example, in review state edit() is not allowed)
    , Use STATE Pattern
    - Original class can be called `Context` class with `State` object field and `State` can have a reference to `Context` as each state should have the switching rule and should tell what should be next state of current object
    - `State` class will have same set of behavior() as that of `Context` class .
     `Context` has an extra method `changeState()` only to be used by State class ,not from client ,so it can be default method. 
- **Brute Force Programming**
    - have a `state` field in the class itself and use lot of if-else in behavior()
    - [example](./example/bruteforce/TVRemoteBasic.java) 
- **Intuitive Example**
    - Indian Traffic light system(3 states, YELLOW, GREEN, ORANGE)
    - Document approval goes through state transition
    - Any workflow transaction 
- **UML**
    - [UML](UML.puml)
- [**Code Example**]
    - `TODO`
- **Pros** 
    - Avoid if-else , rightly If-else violates 'S' in SINGLE
- **Cons**
    ???
- **Comparision with Other Patterns**
- **Additional Note**