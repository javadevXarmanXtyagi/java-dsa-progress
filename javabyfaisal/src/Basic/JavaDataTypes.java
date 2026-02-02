package Basic;

public class JavaDataTypes  {
    /*
    **********************************************************************
                     😅😅  DATA TYPES IN JAVA
    ***********************************************************************
    *
    🎈 What are Data Types ?
    *  A Data type defines what kind of data a variable can store.
    *
    *
    * Example :
    * int age = 25;     --> age is an integer
    * String name = "Arman"   --> name is text
    *
    * think of it as th "shape" or "category" of the data.
    *
    *
    ************************************************************************
            🎈🎈 Categories of Data Types in java
    *************************************************************************
    *
    * these are the most basic types, directly stored in memory..
    *
    * | Type                 |Size                |Example
    * |----------------------|--------------------|----------|
    * |byte                  | 8-bit (1byte)            | byte b = 10; |
    * |short                 |16-bit(2byte}             | short s = 200; |
    * |int                   | 32-bit(4byte)           |int age = 25;    |
    * |long                  |64-bit(8byte)            | long views = 1_000_000L;|
    *|float                   |32-bit(4byte)            | float pi = 3.14f;  |
    *|double                  |64-bit(8byte)             | double price= 99.99;|
    * |char                   |16-bit(2byte)              |char grade = 'A'; |
    *|boolean                  |1-bit(true/false)           boolean isActive= true; |
    *
    *
    *       ✨✨✨Non-Primitive Data Types
    * ----------------------------------------------------------------------------
    * ----------------------------------------------------------------------------
    * Examples : String,Arrays,Classes,Interfaces
    * These are created by the programmer or java itself.
    *          */
    public static void main(String[] args) {
        String name = "JAVA";
        boolean b = false;
        float pi = 3.14f;
        double price = 99.99;
        System.out.println(pi);
        System.out.println(price);
        System.out.println(b);

    }
}
