# Dependency Inversion Principle (DIP)
> High-level modules should not depend on low-level modules.\
Both should depend on abstractions.\
Abstractions should not depend on details.\
Details should depend on abstractions.

=> High-level code (business logic) shouldn't care about how low-level details (database, network, file system) are implemented.
=> Instead both should depend on interfaces (abstractions).

## EXAMPLES
### 🔌Wall socket
- A laptop dends on **electricity** (abstraction)
- It doesn't care whether the power **comes from coal, solar, or nuclear** (implementation)
- The plug standard (interface) ensures they can work together
