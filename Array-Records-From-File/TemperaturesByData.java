import java.util.Scanner;

class TemperatureSample {
    int month, day, year;
    double temperature;
}

public class TemperaturesByData {
    public static void main(String[] args) throws Exception {
        // String site = "https://learnjavathehardway.org";
        String path = "avg-daily-temps-with-dates-atx.txt";
        Scanner inFile = new Scanner((new java.io.File(path)));

        TemperatureSample[] tempDB = new TemperatureSample[10000];
        int numRecords, i = 0;

        while ( inFile.hasNextInt() && i < tempDB.length ) {
            TemperatureSample e = new TemperatureSample();
            e.month = inFile.nextInt();
            e.day   = inFile.nextInt();
            e.year  = inFile.nextInt();
            e.temperature = inFile.nextDouble();
            if ( e.temperature == -99 )
                continue;
            tempDB[i] = e;
            i++;
        }
        inFile.close();
        numRecords = i;

        System.out.println(numRecords + " daily temperatures loaded.");

        double total = 0, avg, high = -50;
        int count = 0;
        for ( i=0; i < numRecords; i++ ) {
            if ( tempDB[i].month == 12 ) {
                total += tempDB[i].temperature;
                count++;
                if ( tempDB[i].temperature > high )
                    high = tempDB[i].temperature;
            }
        }

        avg = total / count;
        avg = roundToOneDecimal(avg);
        System.out.print("Average dailytemperature over " + count);
        System.out.println( " days in December: " + avg);
        System.out.println("The highest recorded temperature in December is: " + high);

    }

    public static double roundToOneDecimal(double d) {
        return Math.round(d * 10) / 10.0;
    }
}