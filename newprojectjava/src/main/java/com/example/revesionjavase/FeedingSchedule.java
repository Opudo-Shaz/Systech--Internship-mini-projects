package com.example.revesionjavase;

public class FeedingSchedule {

        public static void main(String[] args) {

        boolean keepGoing = true;

        int count = 0;

        int x = 3;

        while(count++ < 3) {

        int y = (1 + 2 * count) % 3;

        switch(y) {

        default:

        case 0: x -= 1; break;

        case 1: x += 5;

        }
/*         switch(y) {
            case 1 -> x += 5;
            case 0 -> x -= 1;
            default -> {}  // empty block
        } */

        System.out.println(x);
        } 
}
}
    

