# Java
                                                        Classes & Objects :

Object-oriented programming, or OOP in short, gives you a particular methodology for implementing large and 
complex programming projects in a very simple manner. The methodology uses the structure of classes and objects, 
and four OOP principles, namely abstraction, encapsulation, inheritance and polymorphism, to simplify the large 
programming projects.

All programming languages are not based on this OOP model of classes and objects, and some are known 
as procedural programming languages. But most of the modern general-purpose programming languages, 
such as C++, C#, Java, and Python, are object-oriented programming languages. 

Benefits of Object Oriented Programming:
1. The most important benefit of an object-oriented approach is that you tend to build any project in a more 
organised manner, making the development process very efficient.
2. The second benefit is that an object-oriented approach helps you implement real-world scenarios very 
naturally.
3. The third benefit is that the modification and updation of each independent module is easier in this case.
All of these benefits are the requirements of a good software development methodology; and through this module, 
you will see how all these requirements are met well by an object-oriented programming approach

                                                         Classes

What is a class?

A class is a blueprint of an application, where you implement methods (to perform certain actions/functionalities) 
and declare variables (that describe the properties of the application). For example, Payments could be an entire 
class in itself in the Ola App.

In Java, every program has at least one class, whose structure looks like this:

A class can have ‘variables’ that have certain information in them, ‘methods’ that have functionalities 
linked with different tasks of that class, and it can also have subclasses. For now, let’s focus only on the 
variables and methods. 

Let’s look at an example of a university’s information management system. Now suppose a particular 
department needs to manage all the student information. So there can be a class named Student{ }. The 
pseudocode of this class will be

![image](https://user-images.githubusercontent.com/99068989/160252323-a95325fe-064f-40c9-95f5-4d06b7b638e1.png)




Apart from the variables, the classes mainly contain methods; these basically represent the functionalities 
of different activities related to each class. Now the activities that students may need to perform on the information management system could be editing the profile, registering for a new course, submitting 
assignments, or checking their exam results. So in the case of a student class, the methods can be 
editProfile( ), displayProfile( ), registerCourse( ), submitAssignment( ), checkResult( ), etc. These methods 
can have their own functionalities. For example, you can have a code for printing a student’s name, roll 
number and cgpa on the screen, implemented inside the displayProfile method, as shown in the sample 
code. This is more like a pseudocode. You can see that the return-type for this method is set to void as 
nothing is being returned from this method. Some of these methods, such as editProfile() or 
submitAssignment(), may have some arguments in them; but right now, you need to go into the actual 
implementations of these codes. This is a pseudocode representing the structure of a class:  

![image](https://user-images.githubusercontent.com/99068989/160252306-4db56207-858d-4526-b2c1-315458c796b5.png)

The whole idea behind classes is to have independent modules in the program, each class representing 
one particular entity. That entity can have various data members, variables, and methods linked to it. For 
example, Circle & Square can be examples of different classes in a drawing software. The data members for 
Circle and Square would be variables such as radius and length, respectively.

And as a good practice, keep the public static void main method in a separate class that was named Main
in our example. Also, you can have a different name for the class that contains the main method. However, 
the name of the Java file has to be the same as the name of that particular class.

Let’s say you need to build a program to calculate the area of a circle. The most basic structure for doing this would 
be to create a Circle class that contains a main( ) method and a findArea( ) method. Now you would start with what 
you already know about writing a code with a single method only and then convert it into the ideal object-oriented 
programming structure.

Let’s look at this code in detail. You will define your findArea method in the same way as you defined the 
main method, except for one thing: the return type for this method will be double since the method is 
returning an area that can be a decimal value. You can declare your function as public static double 
findArea(double radius); and inside this, you can write the formula for calculating the radius, and assign 
this to a new variable area that is declared as double. Here it is declared in one line, but you can also 
manage this process in two lines: declaring, assigning, and then returning the area. 

Now you can call this function in main by assigning a value, let’s say, 2, to the radius variable, and then 
calling the findArea( ) method and storing it in a variable called area. This process is called method 
invoking. And then you can write the command to print this variable. So if you run this program, it will print 
the result on the console: the area of the circle is 12.56.

Now you need to modify this code to convert it into a better design as per the object-oriented 
programming style. As we discussed, you need to have two classes: a main class containing the main 
method and a Circle class containing the findArea( ) method.

![image](https://user-images.githubusercontent.com/99068989/160252382-00d91513-b14f-45c6-aa55-5b237eaf0d42.png)
![image](https://user-images.githubusercontent.com/99068989/160252398-7d9bc43c-1fc3-4296-979a-d94a67f559d9.png)

                                                         Objects
                                                         
![image](https://user-images.githubusercontent.com/99068989/160252483-01087078-f8a1-4dcb-ae9b-4ab0ea059c5c.png)
![image](https://user-images.githubusercontent.com/99068989/160252496-c51c8f2a-a7d0-4d91-a981-b1ddcdffe1de.png)

![image](https://user-images.githubusercontent.com/99068989/160252534-6256e7b6-5639-4ffd-bdc4-d8a195a626e8.png)
![image](https://user-images.githubusercontent.com/99068989/160252542-708f8db8-02ca-4b67-8804-1a899b2ca1d6.png)

![image](https://user-images.githubusercontent.com/99068989/160252548-88e6d50a-c772-45fc-821e-f9eb64b4a5a7.png)
![image](https://user-images.githubusercontent.com/99068989/160252554-69151164-6609-4b45-acfd-d6918afb9f24.png)
![image](https://user-images.githubusercontent.com/99068989/160252606-b5de670d-c17a-4453-b76c-49be9bd0fb4a.png)
![image](https://user-images.githubusercontent.com/99068989/160252614-2050cc41-270f-486c-a26b-e74ab031a6ce.png)
![image](https://user-images.githubusercontent.com/99068989/160252628-42594fc3-f303-441e-9c4c-59216935d64d.png)
![image](https://user-images.githubusercontent.com/99068989/160252646-2bfbbcbc-e264-40ee-9103-389816d54590.png)
![image](https://user-images.githubusercontent.com/99068989/160252655-c8d7b6d0-24d7-4db9-a802-c572e81904ee.png)









                                                         


