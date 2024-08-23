package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        args[0] = "123";
        if (args.length > 0) {
            try {
                short height = Short.parseShort(args[0]);
                if (height > 0 && height < 300) {
                    double man = manWeight(height);
                    double woman = womanWeight(height);
                    System.out.println("Man " + height + "cm is " + man + " kg");
                    System.out.println("Woman " + height + "cm is " + woman + " kg");
                } else {
                    System.out.println("Please enter a valid height between 1 and 300 cm.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number for height.");
            }
        } else {
            System.out.println("Please provide height as an argument.");
        }
    }
}

