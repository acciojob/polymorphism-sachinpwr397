package com.driver;

public class Main {
   public static void main(String[] args) {
        // Task 2: create object of Product in Main function called p
        Product p = new Product();

        // Task 3: call method product(int x, int y) from Main using Product class object p
        int result1 = p.product(2, 3);
        System.out.println("Result of product(int x, int y): " + result1);

        // Task 4: call overloaded method product(int x, int y, int z) from Main using Product class object p
        int result2 = p.product(2, 3, 4);
        System.out.println("Result of product(int x, int y, int z): " + result2);

        // Task 5: call overloaded method product(double x, double y) from Main using Product class object p
        double result3 = p.product(2.5, 3.5);
        System.out.println("Result of product(double x, double y): " + result3);
    }

    // Task 1: create a class Product inside Main class
    public static class Product {
        // Task 3: create a method product(int x, int y)
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: create an overloaded method product(int x, int y, int z)
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: create an overloaded method product(double x, double y)
        public double product(double x, double y) {
            return x * y;
        }

}
}
