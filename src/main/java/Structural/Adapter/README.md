##### Adapter Pattern
- **Naming** `Think of Multi-Plug power Adapter which acts as intermediate between USA power system and Indian Electrical Appliances`
- **When To Use**
    - When a service output can't be used directly by Client due to incompatibility ,For example, Client wants a User Details in JSON format while UserDetailSvc provides details in XML , so an adapter required to convert XML to JSON ,so that it can be used by Client (a naive Example :innocent:)
- **Brute Force Programming**
    - Change the service class `UserDetailSvc`, which might not be always possible 
    - Having adapter logic in Client itself, but it will lead to tight coupling , If UserDetailSvc changes its implementation to return YAML, Client also needs to be changed
- [**UML**](AdapterUML.puml)
- **Example**
    - `TODO`
- **Pros**
    - Decouples and encapsulates the adapter logic to separate class
    - You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.
- **Cons**
    - ???