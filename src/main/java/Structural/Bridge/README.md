##### Bridge Pattern
- **Naming** `Bridge between object of InterfaceA and object of InterfaceB`
- **When To Use**
    - There are two interfaces for developing Savaan app UI to display artist and album details in a form page.
     Interface1(For example `FormView`) is directly used by Client and Interface1 in turn delegates task to Interface2(For Example `MediaResource`). From Client Point of view each form-view(LongFormView, ShortFormView) can be paired with each media-resource(Album/Artist) . If such pairing required, it can be achieved using bridge Pattern instead of creating multiple Classes(LongFormAlbumView, ShortFormAlbumView, LongFormArtistView, ShortFormArtistView).
- **Brute Force Programming**
    - Creating multiple classes for each pair of functionality of Interface1 and Interface2 as shown in above section.
- [**UML**](UML.puml)
- **Code Example**
    - `TODO`
- **Pros**
    - Open/Closed Principle. You can introduce new subclasses to Interface1 and Interface2 independently of each other.
    - No need of creating many classes
- **Cons**
    - ???
- **Additional Note**
    - This pattern uses Composition over Inheritance, advantages are:
        - Inheritance is static , to achieve LongFormView + Album functionality, you have to create new class called LongFormAlbumView(duplicate code of both LongFormView & Album in this class) and Client will call display() of this class .
        Composition doesn't require this new class . Client can do this `new LongFormView(new Artist()).display()`. If you are wondering what is a Client, think of a Class with run(). So so, people say `Composition achieved it at run-time` without creating unnecessary classes.
        - Inheritance has to follow Liskov's Design Principle , each subclass should have all methods implemented or all methods should fit for each subclass . Composition is choosy , uses the method it needs , rather than using all methods.
        -  Inheritance/Classes are compile-time concept ,i.e Class has certain behavior, its object will behave like this certain pre-defined way
        Run-time concept adds some flexibility to static classes . For example, adding interface abstraction and achieving polymorphism behavior at runtime based on a concrete object of that interface . Or using composition and decorating an existing class object behavior without creating new Classes.
        - Even Class in a way provides some sort of interface/contract though parameterized methods , which provides runtime flexibility . Client can pass parameters to method and achieve intended behavior . Yes , it is not polymorphism , but my point is Class is some capability of providing contract / run-time flexibility . That's why if you really don't have multiple implementations of contract , don't create interface . It violates [YAGNI](https://en.wikipedia.org/wiki/You_aren%27t_gonna_need_it#:~:text=%22You%20aren't%20gonna%20need,add%20functionality%20until%20deemed%20necessary).  
        - Hope this note helps in understanding jargons like `run-time`, `polymorphism` etc etc.