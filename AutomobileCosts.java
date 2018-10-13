import java.util.Scanner;
public class AutomobileCosts {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        final double LBS_CO2_PER_GALLON_E10 = 18.9;
        final double LBS_CO2_PER_KWH = 0.58815;
        double milesDriven;
        double gasPrice;
        double mpg;
        double gallonsPerYear;
        double gasCost;
        double gasco2;
        double mpkwh;
        double cpkwh;
        double kwhYear;
        double elecCost;
        double elecco2;
        double costDiff;
        double co2Diff;
        
        System.out.print("How many miles do you drive per year? ");
        milesDriven = scnr.nextDouble();
        System.out.print("What is the current price per gallon of gas? ");
        gasPrice = scnr.nextDouble();
        System.out.print("How many miles per gallon does your car get? ");
        mpg = scnr.nextDouble();
        
        gallonsPerYear = milesDriven / mpg;
        gasCost = gallonsPerYear * gasPrice;
        gasco2 = gallonsPerYear * LBS_CO2_PER_GALLON_E10;
        
        System.out.println();
        System.out.println("You use " + gallonsPerYear + " gallons of gas per year.");
        System.out.println("This costs $" + gasCost + " and produces " + gasco2 + " lbs of CO2 pollution");
        System.out.println();
        
        System.out.println("Now consider an electric car.");
        System.out.print("How many miles per kilowatt hour (kwh) does it get? ");
        mpkwh = scnr.nextDouble();
        System.out.print("What is the cost/kwh of your electricity (in cents)? ");
        cpkwh = scnr.nextDouble();
        
        kwhYear = milesDriven / mpkwh;
        elecCost = kwhYear * cpkwh / 100;
        elecco2 = kwhYear * LBS_CO2_PER_KWH;
        
        System.out.println();
        System.out.println("That electric car would use " + kwhYear + " kwh's of electricity per year.");
        System.out.println("This costs $" + elecCost + " and produces " + elecco2 + " lbs of CO2 pollution.");
        System.out.println();
        
        costDiff = gasCost - elecCost;
        co2Diff = gasco2 - elecco2;
        
        System.out.println();
        System.out.println("That would save $" + costDiff + " per year, and reduce carbon emission by " + co2Diff + " lbs.");

    }

}
