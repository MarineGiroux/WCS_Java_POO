package com.wcs;

public class Classroom {
    public static void main(String[] args) {
        Wilder Topper = new Wilder("Topper", true);
        Wilder Fernand = new Wilder("Fernand", false);
        Wilder Arthur = new Wilder("Arthur", false);

        System.out.println(Topper.whoAmI());
        System.out.println(Fernand.whoAmI());
        System.out.println(Arthur.whoAmI());
    }
}
