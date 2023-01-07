# LAUNDROMAT SERVICES
`                                                                  `-OOP PROJECT


VIDEO LINK:

<https://drive.google.com/drive/folders/1yOMR1s7yqwczKMWdCRSeKEDkftoNd8bF?usp=sharing>



ANTI-PLAGIARISM STATEMENT

We declare on our honour that what code has been done in this work has been written by us and that no part has been copied from any books, the Internet or from the past or present projects done in this field by other students. 

This assignment is our own work, or my group’s own unique group assignment. I acknowledge that copying someone else’s assignment, or part of it, is wrong, and that submitting identical work to others constitutes a form of plagiarism.  I have not allowed, nor will I in the future allow, anyone to copy my work with the intention of passing it off as their own work.

I also declare that I have taken note of the sanctions provided for in case of plagiarism by the current regulations.


DESIGN PATTERN

“Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.”

In the project code, we have partially implemented the factory method. Elaborating, we could have implemented it completely by creating a user interface and then create a subclass declaring it as student or admin depending on the requirement. However, we implemented this in the main class itself; wherein the student or admin is decided by the main class and the details of student or admin is further decided by the subclass thus partially implementing it. 

However, given a chance to redo the project we would have neatly implemented the factory design pattern for more convenience and better clarity. 



SOLID PRINCIPLES

1.**The single responsibility theorem**- It basically states that every class should have just one reason to change. We have successfully followed this principle in our project. We have tried to implement small classes with each class having its own unique functionality. The project is well organized wherein no class has dual utility. 
for example to drop a laundry we have drop class; to check status of a drop we have status class; to update the status we have update class, to receive it there is a separate receive class and so on. Thus if we want to change one functionality or some details we just need to change that class. Moreover , we have also separated student account plan- not taking them one as whole so that any change in one would not affect the other.

2.**Open Closed Principle-** States that classes should be open for extension and modification. Well we can easily add any functionality in our project by simply extending the class. For example, when we had to create the revenue class; we simply generated the function from the text files in which data was stored from the account class. This means that to add any new functionality in our code we can either add a new class or create a new function in the existing classes.

3.**Liskov Substitution Principle-** If a class A is subtype of B we should be able to replace B with A without disrupting behaviour. This issue can never come in our project; this is because only the student and admin extend the userlogin class wherein no functionality of userlogin gets disrupted even if we add or change the existing classes. 

4.**Interface segregation principle-** The user should not be forced to implement a method that they do not use. In short, we should keep the interfaces separate and segregated according to use. Due to no visible requirement, we did not create any interface. Hence since there are no interfaces segregating them did not come into question. In other words, its all upto user. He decides what he needs to do. Its upto him when to drop, when to receive etc.

5.**Dependency inversion principle-** It implies that a high level module should not depend on a low level module, instead it should depend on abstractions. To be honest, we have lacked a bit in implementing this principle. But we definitely kept this in mind and would look into it in all our future projects.

Hence we have successfully analysed and tried implementing our code based on SOLID principles.

Note: 

Admin username:admin

Admin password:laundropilani
