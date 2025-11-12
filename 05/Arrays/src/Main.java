//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // store a roll number
        int a = 20;
        // store a person's name
        String name = "Dipanshu Sharma";

        // store 5 roll numbers or more than use array:-
        // synatax:-
//        datatype[] variable_name = new datatype[size]

        // store 5 roll nos
//        int[] ros = new int[5];
        // or directly
        //int[] ros = {1,2,4,6,8};

        int[] ros; // declaration of array. ros is getting defined in the stack memory
        ros = new int[5]; // initialization :- actually here object is being created in the heap memory

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]); // null

    }

}

// INTERNALLY IN JAVA MEMORY ALLOCATION TOTALLY DEPENDS ON JVM WHETHER IT BE CONT OR NOT.
// IN C++ IT IS CONT.

// OBJECTS ARE STORED IN HEAP MEMORY
// IN JAVA LANG SPECIFICATION IT IS MENTIONED THAT HEAP OBJECTS ARE NOT CONT.
// DUE TO DYNAMIC MEMORY ALLOCATION

// HENCE ARRAY OBJECTS IN JAVA MAY NOT BE CONT.