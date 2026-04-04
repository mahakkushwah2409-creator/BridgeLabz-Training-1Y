package wrapperClasses;

public class WrapperAutoExample {
    public static void main (String[] args) {
        //autoBoxing
        int a=10;
      //  Integer i=a; (manual approach
        Integer i = Integer.valueOf(a); //compiler will run internally
        System.out.println("value:" +i);

        //unboxing

        Integer b=120;
        int m=b;// manual approach
        // int m=b.intvalue(); //Compiler side
        System.out.println("Unboxing:" + m);


        float c = 24.4f;
        Float j=c; // manually
        System.out.println("Autoboxing " + j);





    }
}
