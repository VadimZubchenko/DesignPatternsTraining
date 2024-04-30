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

- The Builder pattern suggests that you extract the object construction code out of its own class and move it to separate objects called builders.

### Singleton

All implementations of the Singleton have these two steps in common:

- Make the default constructor private, to prevent other objects from using the new operator with the Singleton class.
- Create a static creation method that acts as a constructor. Under the hood, this method calls the private constructor to create an object and saves it in a static field. All following calls to this method return the cached object.
