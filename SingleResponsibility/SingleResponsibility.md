# Single Responsibility Principle (SRP)
> A class should have only one reason to change\
=> Every class or module should focus on **only one job** or **responsibility** 

## EXAMPLES
### ☕️ Coffee machine
- its job is to make coffe
- but main developer made it print receipts and play music also
- so coffie machine became multiple-reasponsibilities machine

➡️ So if the company wants to change how coffee is brewed, they risk breaking the music system or receipt printer.

👉 Bad design: too many reasons to change.\
👉 Good design: separate machines: one for coffee, one for music, one for receipts.


