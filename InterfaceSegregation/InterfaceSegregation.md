# Interface Segragation Principle (ISP)
> Clients should not be force to depend on interfaces they do not use

=> Interfaces should be small, focused and specific\
=> Better to have many small, role-specific interfaces than one giant "god interface"

## EXAMPLES
### 🚗 Renting a car
- imagine you rent a car
- you expect a car manual to explaining drive, steer and brake
- what if manual also contains instructions for flying airplane?
- you don't need them, but still have to carry them around
- so:\
✅ it's better to separate manuals for cars, planes and boats\
❌ wrong: one giant manula for all vehicles
