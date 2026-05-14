/*
Write a program in Java having three classes Apple, Banana and
Cherry. Class Banana and Cherry are inherited from class Apple and each class have their
own member function show() . Using Dynamic Method Dispatch concept display all the show()
method of each class.
*/

class Apple{
    void show(){
        System.out.println("This is show() fn of class Apple");
    }
}

class Banana extends Apple{
    void show(){
        System.out.println("This is show() fn of class Banana");
    }
}

class Cherry extends Apple{
    void show(){
        System.out.println("This is show() fn of class Cherry");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Apple appleRef;
        appleRef = new Apple();
        appleRef.show(); 

        appleRef = new Banana();
        appleRef.show(); 

        appleRef = new Cherry();
        appleRef.show(); 
    }
}
