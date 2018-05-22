package com.chrisz;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(257));
    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
        int i = number;
        int smallest = 0;
        int largest = 0;
        int count = 0;
        while(i > 0) {
            count++;
            if(count == 1) {
                smallest = i % 10;
            }
            if((i/10) == 0) {
                largest = i % 10;
            }
            i /= 10;

        }
        return smallest + largest;
    }

    public static int bestSolution(int number) {
        if(number < 0) {
            return -1;
        }
        int last = number % 10;
        int first;
        do {
            first = number % 10;
            number /= 10;
        } while (number > 0);
        return first + last;
    }

}
