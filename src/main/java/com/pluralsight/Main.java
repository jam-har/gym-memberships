package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("====Gym Memberships=====");
        Membership member = new Membership("Henry Clark", 3, new BigDecimal("30.00"));
        System.out.println(member);
    }
}
