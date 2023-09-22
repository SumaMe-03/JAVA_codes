class ADD {
    // Constructor overloading
    ADD() {
        System.out.println("This is a method for adding numbers");
    }

    // Method overloading for integer addition
    int add(int a, int b) {
        return a + b;
    }

    // Method overloading for double addition
    double add(double a, double b) {
        return a + b;
    }

    // Method overloading for three integers addition
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    //Method overloading for int and double type addition
    double add(int a, double b) {
    	return a+b;
    }
    
    double add(double a, int b) {
    	return a+b;
    }
}

public class method_overloading {
    public static void main(String[] args) {
        ADD obj = new ADD();

        System.out.println("Sum of integers: " + obj.add(5, 10));

        System.out.println("Sum of doubles: " + obj.add(3.5, 7.2));

        System.out.println("Sum of three integers: " + obj.add(2, 4, 6));
        
        System.out.println("Sum of int and double: "+obj.add(6, 34.2));
        
        System.out.println("Sum of double and int: "+obj.add(82.12,91));
    }
}
