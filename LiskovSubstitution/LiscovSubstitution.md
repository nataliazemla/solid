# Liskov Substititutuion Principle (LSP)
> Objects of superclass should be replaceable with objects of its subclass without affecting the correctness of the program

## EXAMPLES
### 🪞 Electric cars and gas cars
- you rent a car (parent class is Car)
- and it's replaced with an electric car (inheriting class ElectricCar)
- you should still be able to:
    - drive it
    - steer it
    - brake
- **if you suddenly find out you must also learn how to operate a nuclear reactor just to drive it -> the subclass has broken the parent's promise**

### 🚀 Android AppCompatActivity
- if you extand AppCompatActivity, your subclass must behave like an Activity:
    - handle lifecycle methods,
    - support context, etc.

### 🧱 LEGO
- every 2x4 brick should fit wherecer 2x4 bric is expected
- if one 2x4 requires special pressure or a secret tool it breaks rhe substitution rule
