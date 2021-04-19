package bai2;

import java.util.Collections;

public class StreetMain {
    public static void main(String[] args) {
        Street street= new Street();
        street.addFamily();
        System.out.println("people has age is 80");
        street.displayByDateOfBirth(80);

    }
}
