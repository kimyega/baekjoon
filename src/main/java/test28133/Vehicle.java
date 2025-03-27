package test28133;

import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int walkingTimeToStation = sc.nextInt();
        int busArrivalTime = sc.nextInt();
        int trainArrivalTime = sc.nextInt();
        if (busArrivalTime < 1 || busArrivalTime > 1000000 || trainArrivalTime > 1000000 || walkingTimeToStation < 1 || walkingTimeToStation > trainArrivalTime) return;

        if (busArrivalTime == trainArrivalTime) {
            System.out.println("Anything");
        } else if (busArrivalTime > trainArrivalTime) {
            System.out.println("Subway");
        } else {
            System.out.println("Bus");
        }

    }
}
