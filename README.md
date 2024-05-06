# DesignPatternsTraining

author: Vadim Zubchenko
date of start: 29.3.2024

## We will start from 8 more importens patters from 23 available.

- Factory
- Builder
- Singleton
- Observer
- Iterator
- Strategy
- Adapter
- Facade
- Bridge

### Factory

- The Factory Method pattern suggests that you replace direct object construction calls (using the new operator) with calls to a special factory method. Don’t worry: the objects are still created via the new operator, but it’s being called from within the factory method. Objects returned by a factory method are often referred to as products.

### Builder

- The Factory Method pattern suggests that you replace direct object construction 
calls (using the new operator) with calls to a special factory method. Don’t 
worry: the objects are still created via the new operator, but it’s being called 
from within the factory method. Objects returned by a factory method are often 
referred to as products

### Singleton

All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the 
new operator with the Singleton class. 

- Create a static creation method that acts 
as a constructor. Under the hood, this method calls the private constructor to 
create an object and saves it in a static field. All following calls to this 
method return the cached object.

### Observer

- The object that has some interesting state is often called subject, but since 
it’s also going to notify other objects about the changes to its state, we’ll call 
it publisher. All other objects that want to track changes to the publisher’s 
state are called subscribers.

- The Observer pattern suggests that you add a subscription mechanism to the publisher class so individual objects can subscribe to or unsubscribe from a stream of events coming from that publisher. 

