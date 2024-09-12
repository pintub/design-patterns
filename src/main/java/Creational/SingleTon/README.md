##### SingleTon
###### Most popular and well-known DP
- [Effective Java Item 3](https://github.com/pintub/EffectiveJava-Summary/blob/master/EffectiveJavaSummary/CreateAndDestroyObjects.todo)
- [Examples](https://github.com/pintub/EffectiveJava-Summary/tree/master/src/main/java/com/sf/effectivejava/item3)
- SingleTon meaning
    - Only one object per application
    - It can be mutable object. If mutable, take cate of thread-safety     
-  Things to take care:
    - Lazy initialization
    - Reflection(Private constructor calling)
    - Serialization
    - Multi-threading
- Usecases
    - Logger Object
    - Cnfigurations of applications
- Cons
    - Static instance life-span lasts till application is alive or Class-loader is alive
    - Unit Test of singleton method `Classic rivalry between static method and Unit test. My opinion: mocking still can be done using powermock or Jmockit which ideally should be avoided . If Stubbing(Real objects with minimal fields populated or behavior defined) is possible instead of mocking, Use stubbing. A workaround for mocking is having a layer of abstraction over Singleton class and achieve mocking. And Again, mocking still can be done using powermock or Jmockit or even new mockito` 

