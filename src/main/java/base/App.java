package base;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);
    public int counter = 0;

    public static void main(String[] args) {
        App investing = new App();
        Investment investWorth = new Investment();

        //receive input and set the instance variables of Investment instance to correct value
        investWorth.setPrincipal(investing.getValue());
        investWorth.setInterestRate(investing.getValue());
        investWorth.setYears(investing.getValue());

        investing.output(investWorth);
    }

    public float getValue()
    {
        if(counter == 0)
        {
            System.out.print("Enter the principal: ");
            counter++;
            return input.nextFloat();
        }

        else if(counter == 1)
        {
            System.out.print("Enter the rate of interest: ");
            counter++;
            return input.nextFloat();
        }
        else
        {
            System.out.print("Enter the number of years: ");
            counter = 0;
            return input.nextFloat();
        }
    }

    public void output(Investment investWorth)
    {
        float future = investWorth.worth(investWorth.getPrincipal(), investWorth.getInterestRate(), investWorth.getYears());
        DecimalFormat nf = new DecimalFormat("$0.00");
        System.out.println("After " + investWorth.getYears() + " years at " + investWorth.getInterestRate() + "%, the investment" +
                " will be worth " + nf.format(future));
    }
}
