package com.pluralsight;

import java.math.BigDecimal;

public class BasicMembership extends Membership {
    private boolean offPeakOnly;

    public BasicMembership(String memberName, int months, BigDecimal baseRate, boolean offPeakOnly) {
        super(memberName, months, baseRate);
        this.offPeakOnly = offPeakOnly;
    }

    public boolean isOffPeakOnly() {
        return offPeakOnly;
    }

    public void setOffPeakOnly(boolean offPeakOnly) {
        this.offPeakOnly = offPeakOnly;
    }

    @Override
    public BigDecimal getMonthlyPrice() {
        BigDecimal monthlyPrice;
        if (offPeakOnly){
        monthlyPrice = getBaseRate().subtract(new BigDecimal("5.00"));
        }else monthlyPrice = getBaseRate();

        return monthlyPrice;
    }

    @Override
    public String toString() {
        return "Basic | " +
                getMemberName() + " | " +
                getMonths() + " months | off-peak only: " +
                offPeakOnly;

    }
}
