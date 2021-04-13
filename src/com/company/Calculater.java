package com.company;

class Calculater {
        public static int count = 0;

        public static int sum(int a, int b) {
            count++;
            return a + b;

        }

        public static double mult(double a, double b) {
            count++;
            return a * b;
        }

        public static int differ(int a, int b) {
            count++;
            return a - b;
        }

        public static double divid(double a, double b) {
            count++;
            return a / b + a % b;

        }
        public static void counter(){
            System.out.println(count);
        }
    }
class Main {

    public static void main(String[] args) {
        System.out.println(Calculater.sum(3, 5));
        System.out.println(Calculater.mult(7.3, 8.9));
        System.out.println(Calculater.differ(4, 9));
        System.out.println(Calculater.divid(-14, 5));
        Calculater.counter();

    }
}
