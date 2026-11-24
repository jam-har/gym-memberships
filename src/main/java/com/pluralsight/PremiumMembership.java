package com.pluralsight;

import java.math.BigDecimal;

public class PremiumMembership extends Membership{
    private int guestPasses;

    public PremiumMembership(String memberName, int months, BigDecimal baseRate, int guestPasses) {
        super(memberName, months, baseRate);
        this.guestPasses = guestPasses;
    }

    public int getGuestPasses() {
        return guestPasses;
    }

    public void setGuestPasses(int guestPasses) {
        this.guestPasses = guestPasses;
    }

    public void useGuestPass() {
        if (guestPasses >= 1) {
            guestPasses -= 1;
            System.out.println(getMemberName() + " used a guest pass. Passes left: " + guestPasses);
        } else System.out.println(getMemberName() + " has no guess passes left.");
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal monthlyPrice = getBaseRate().add(new BigDecimal("18.50"));
        return monthlyPrice;
    }
}
