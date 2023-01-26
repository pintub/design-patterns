##### Null Object Pattern 
- **Chronology** (:wink:)
    - Null check leads to If-Else (branching)
    - If-Else should be avoided, violates 'S' in SINGlE . 
    - So, replace If-Else by polymorphism (Not possible at `Edge of application`, where based on User input we want to change logic or where based on REST input request ,we want to decide some logic)
    - On a side note, Primitives also lead to branching , should be replaced by object type to achieve polymorphism . (Again for If you are taking If-else removal to extreme level)  
    - [Reference](https://www.youtube.com/watch?v=os6ssw1qylU)