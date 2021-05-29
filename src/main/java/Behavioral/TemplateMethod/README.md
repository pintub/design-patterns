##### Template Method Pattern
- **Naming** `Template=Skeleton of a algorithm with sequqnce of overridable intermediate Steps`
- **When To Use**
    - When you have algorithm with a Step which invokes sequence of other steps (let's call it parentStep and should be final)
    , few steps are overridable in different classes (concreteStep)
    , few steps should be overridable in different classes (abstractStep),
    Use TEMPLATE METHOD Pattern.
    - Also we dont want client to know about this sequence of steps, thus client will know about the complex parent step. And the parent step si fix , ie. no scope of change in future
- **Brute Force Programming**
    - Multiple class with redundant coding for repeated steps 
- **Intuitive Example**
    - Building House with buildHouse() Step(final method defining sequence of otherSteps , yes self-use pattern , But no issues as buildHouse() method is final ) ,  abstract steps , and concrete Steps
- **UML**
    - [UML](UML.puml)
- [**Code Example**](https://www.journaldev.com/1763/template-method-design-pattern-in-java#template-method-abstract-class)
- **Pros** 
    - Code Re-usability achieved because of inheritance
- **Cons**
    - ???
- **Comparision with Other Patterns**
    - vs Decorator(Because of Code-reusability)
        - Decorator also adds enhancement of a default behavior using Composition, and the advantage of composition is flexibility .So client can add toppings in the order it wants, which gives flexible dynamic behavior .
        But in some cases, this flexibility is not required and algorithm has run a given sequence i.e.e static sequence , If we let client do this ordering mistake is bound to happen, thus we can use Template pattern(inheritance) with a final parentStep, to give as this static sequence of child steps.   
- **Additional Note**
    - [Discussed in Effective Java Item-20, Combination of Interface + Abstract class is preferred , as >Java8 Interface can have default method implementation](https://github.com/pintub/EffectiveJava-Summary/blob/master/EffectiveJavaSummary/ClassesAndInterfaces.todo) . If abstract class not required , can be avoided and Interface alone can be used. Need of Abstract Class is only when state field, private methods or Object class method implementation is required. In-case of private method step , we can't use Interface (Check the Code-example fot that) 
