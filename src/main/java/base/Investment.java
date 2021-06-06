package base;

public class Investment {
    public float principal;
    public float interestRate;
    public float years;

    public void setPrincipal(float principal) {
        this.principal = principal;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    public void setYears(float years) {
        this.years = years;
    }

    public float getPrincipal() {
        return principal;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public float getYears() {
        return years;
    }

    public float worth(float principle, float interestRate, float years)
    {
        return principle * (1 + (interestRate / 100) * (float)years);
    }

}
