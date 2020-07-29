##### Flyweight Pattern
- **Naming** `Flyweight is a boxing weight class, meaning not too heavy or not too light. Also provides a sort of caching`
- **When To Use**
    - When lots objects of a Class are used in application, and they consume lots of memory . On analysing object fields ,you found two types of fields . `Intrinsic` Fields(naturally belongs to object and doesn't change much or shareable state) and   `Extrinsic` Fields(state unique to each object) .SO, these Intrinsic Fields are kept as part of this object and cached(This is called flyweight object) and  Extrinsic Fields+Flyweight object are moved to a new Class called `Contextual` class . So, number of contextual class objects are still same before the pattern applied , but will use shared/cached flyweight objects.
    - From Client point of view all state belong to original object/Class
- **Brute Force Programming**
    - Lot of objects owning Intrinsic fields , leads to huge memory consumption.
- [**UML**](UML.puml)
- [**Example**]
    - `TODO`
- **Pros**
    - save lots of RAM.
    - No need of creating many classes
- **Cons**
    - Static cached objects life span though-out application lifecycle
- **Additional Note**
    - Resemblance with Singleton due to caching
        - Singleton ensures one object, which can be mutable (Though Enum Singletons are immutable), Flyweight objects are immutable
        - Singleton ensures one and only object, Flyweight pattern has no such restriction