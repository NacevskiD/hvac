package com.company;

import java.util.Date;

/**
 * Created by David on 3/21/2017.
 */
public class WaterHeater extends ServiceCall{
 double age;
 static double FEE = 20;

    public WaterHeater(String serviceAddress, String problemDescription, Date date, Double age) {
        super(serviceAddress, problemDescription, date);
        this.age = age;

    }
        @Override
        public String toString() {


            String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
            String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
            String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee + FEE);
            String ageString = Double.toString(age);


            return "Water Heater Service Call " + "\n" +
                    "Service Address= " + serviceAddress + "\n" +
                    "Problem Description = " + problemDescription  + "\n" +
                    "Water Heater Age = " + ageString + "\n" +
                    "Reported Date = " + reportedDate + "\n" +
                    "Resolved Date = " + resolvedDateString + "\n" +
                    "Resolution = " + resolutionString + "\n" +
                    "Fee(20$ city fee) = " + feeString ;

        }

}
