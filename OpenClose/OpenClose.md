# Open/Close Principle (OCP)
> Software entities (classes, modules, functions, etc.) should be open for extension but closed for modification.\
=> ✅ you can extend the behavioer of class/module\
=> ❌ you shouldn't change its existing source code when adding new functionality
=> use polymorphism and abstraction


## EXAMPLES
### 🔌 Power socket
- the socket is **closed** - you don't modify the wall every time you need a new device
- you **extend** it with diffrent kinds of plugs or adapters (USB adapter, EU?US converter)
- you get new behavior without changing the socket itself
