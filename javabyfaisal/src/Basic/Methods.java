package Basic;

public class Methods {
    /*
    🧩 Why We Use Methods

Without methods, your code becomes a huge messy blob 😩
With methods, you can:
reuse code (write once, use many times)
organize code into small, neat pieces
understand what’s going on easily
test small parts separately
Think of methods like LEGO blocks 🧱.
Each block does one thing. You can build anything by combining them.

🔢 Example 2 – Greeting Robot
void sayHello() {
    System.out.println("Hello, Arman!");
}


Now if you say:
sayHello();


It will print:
Hello, Arman!
Notice void means — “I don’t return anything, I just do something”.

🎁 Example 3 – Method With Return
int multiply(int x, int y) {
    return x * y;
}


Call it:

int result = multiply(4, 5);
System.out.println(result);


Output → 20

🧮 Example 4 – Method That Decides Something
boolean isEven(int number) {
    if (number % 2 == 0)
        return true;
    else
        return false;
}


Call it:

System.out.println(isEven(6)); // true
System.out.println(isEven(7)); // false


So this method checks and tells you whether the number is even.

👨‍🍳 Example 5 – Method with Many Inputs
void makeSandwich(String bread, String filling) {
    System.out.println("Making a " + filling + " sandwich with " + bread + " bread.");
}


Call it:

makeSandwich("brown", "cheese");


Output:

Making a cheese sandwich with brown bread.

🧠 Keywords You’ll See in Methods
Keyword	What it Means
public	Everyone can use it (open to all)
private	Only this class can use it (secret 🤫)
static	Belongs to the class, not the object
void	Does something but doesn’t give anything back
return	Gives something back
int, String, boolean	The type of thing it gives back or takes in
👀 Example with public static void main

This line you see in every program:

public static void main(String[] args)


That’s a method too!
It’s where your program starts running.

Let’s decode it:
public → anyone can run it
static → belongs to the class
void → doesn’t return anything
main → the name of the method
(String[] args) → it can take words you type when you run it

🎯 Rules to Remember
Every method has a name.
Every method can have inputs (inside brackets).
A method can return something (or void if nothing).
You must call it to make it work.
Methods make your code clean and easy to read.
     */
    public static void main(String[] args) {
        sayhello("Arman");
        sayhello("Nabeel");
        sayhello("John");
        System.out.println("Add : " + add(10, 20));

        // 1.    add my name
        printname("Arman Tyagi ");

        //2. A method that adds 3 numbers
        System.out.println("Addition of three number is " + printnumber(34, 56, 75));

        //3.A method that checks if you can vote (age ≥ 18).
        checkvote(56);


    }

    private static void sayhello(String name) {
        System.out.println("Hello " + name);
        System.out.println("welcome to my program");
    }

    private static int add(int a, int b) {
        return a + b;
    }


    //A method that prints your name.
    private static void printname(String name) {
        System.out.println("Name : " + name);
    }

    //A method that adds 3 numbers.
    private static int printnumber(int a, int b, int c) {
        return a + b + c;
    }

    //A method that checks if you can vote (age ≥ 18).
    private static int checkvote(int age) {
        if (age >= 18) {
            System.out.println("You can give vote !");
        }
  else {
            System.out.println("You are not eligible !");
        }
  return age;
    }
}