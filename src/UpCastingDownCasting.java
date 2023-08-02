// Parent class
class Parent {
    String name;

    // A method which prints the
    // signature of the parent class
    void method()
    {
        System.out.println("Method from Parent");
    }
}

// Child class
class Child extends Parent {
    int id;

    // Overriding the parent method
    // to print the signature of the
    // child class
    @Override
    void method()
    {
        System.out.println("Method from Child");
    }

    void childMethod() {
        System.out.println("This is solely child method");
    }
}

public class UpCastingDownCasting {
    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();
        p.name = "ParentMethod";

        //Printing the parentclass name
        System.out.println(p.name);
        //parent class method is overridden method hence this will be executed
        p.method();

        // p.childMethod(); // will give compilation error since the type is parent type

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); - > compile time error

        // Downcasting Explicitly
        // this will produce java.lang.ClassCastException: class Parent cannot be cast to class Child
        // Parent p2 = new Parent();
        // Child c = (Child)p2;

        Child c = (Child) p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.method();
        c.childMethod();
    }
}
