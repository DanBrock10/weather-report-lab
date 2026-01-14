import java.util.Scanner;
 
 
/*
    Week 2 Lab: Weather Report Program
    Topics: Conditional statements, loops, typecasting, input validation
    Objective: Ask the user for weather info, validate input, and display a full report
    
    Daniel Brock 200431816 
    Date : 1/14/26
*/
 
 
public class Main {
    public static void main(String[] args) {
 
 
        Scanner input = new Scanner(System.in);
 
 
        /*
        STEP 1: Declare variables for weather information
        a) Today's weather conditions (String)
        b) Possibility of precipitation (String)
        c) Wind speed (String)
        d) Daily high temperature (int or double)
        e) Daily low temperature (int or double)
        f) UV index (int)
        */
 
 
        // TODO: Declare your variables here
     String conditions; //words like sunny or cloudy
     int precipitation; //percent (0–100)
     int windSpeed; //km/h
     double highTemp; //high temperature
     double lowTemp; //low temperature
     int uvIndex; //UV index number

 
        /*
        STEP 2: Get input from the user using Scanner
        - Ask for each variable above
        - Validate numeric input using loops
        - Example: Ensure highTemp >= lowTemp
        */
 
 
        // TODO: Prompt user and read input
        // TODO: Use loops to validate high/low temperatures and UV index

        
     input.nextLine();

     //Ask user to describe the weather
     System.out.print("Describe today's weather (ex: sunny, cloudy): ");
     conditions = input.nextLine();


     //Ask for chance of precipitation
     do {
     System.out.print("Chance of precipitation (0-100): ");
     precipitation = input.nextInt();

     //If number is outside range, show error message
     if (precipitation < 0 || precipitation > 100) {
        System.out.println("Invalid input. Enter a value between 0 and 100.");
     }
     } while (precipitation < 0 || precipitation > 100);


     //Ask for wind speed
     do {
     System.out.print("Wind speed (km/h): ");
     windSpeed = input.nextInt();

     //Wind speed cannot be less than 0
     if (windSpeed < 0) {
        System.out.println("Wind speed cannot be negative.");
     }
     } while (windSpeed < 0);


     //Ask for the daily high temperature
     System.out.print("Daily high temperature (°C): ");
     highTemp = input.nextDouble();


     //Ask for daily low temperature
     do {
     System.out.print("Daily low temperature (°C): ");
     lowTemp = input.nextDouble();

     //Low temperature must be less than or equal to high temperature
     if (lowTemp > highTemp) {
        System.out.println("Low temperature cannot be higher than the high temperature.");
     }
     } while (lowTemp > highTemp);


     //Ask for UV index
     do {
     System.out.print("UV Index (0-20): ");
     uvIndex = input.nextInt();

     //UV index must be within 0-20
     if (uvIndex < 0 || uvIndex > 20) {
        System.out.println("Invalid UV index. Enter a number between 0 and 20.");
     }
     } while (uvIndex < 0 || uvIndex > 20);

 
        /*
        STEP 3: Typecasting (if needed)
        - Example: if you read a double but want to display as int
        */
 
 
        // TODO: Apply typecasting where necessary

       //Convert double temperatures to int
     int highTempInt = (int) highTemp;
     int lowTempInt = (int) lowTemp;
 
        /*
        STEP 4: Conditional statements
        - Example: 
          - If UV index >= 6, suggest "Use sunscreen"
          - If precipitation >= 50%, suggest "Carry an umbrella"
          - If wind speed > 40 km/h, suggest "Windy conditions"
        */
 
 
        // TODO: Write if, if-else, or nested if statements to display tips
     // STEP 4: Weather tips using conditional statements

     String tips = "";

     //UV index advice
     if (uvIndex >= 6) {
         tips += "- UV level is high: use sunscreen.\n";
     } else {
         tips += "- UV level is low.\n";
     }

     //Rain advice
     if (precipitation >= 50) {
         tips += "- High chance of rain: bring umbrella.\n";
     } else {
         tips += "- Low chance of rain.\n";
     }

     //Wind advice
     if (windSpeed > 40) {
         tips += "- High wind conditions.\n";
     } else if (windSpeed >= 20) {
         tips += "- Moderate wind.\n";
     } else {
         tips += "- Light wind.\n";
     }

 
        /*
        STEP 5: Create a fullReport String
        - Combine all user inputs and tips into one formatted sentence or paragraph
        - Use String concatenation (+) or String.format()
        */
 
 
        // TODO: Construct your full weather report here
      
      String fullReport = "";
       fullReport += "-----------------------------\n";
       fullReport += "Weather Report\n";
       fullReport += "-----------------------------\n";
       fullReport += "Conditions: " + conditions + "\n";
       fullReport += "Chance of precipitation: " + precipitation + "%\n";
       fullReport += "Wind speed: " + windSpeed + " km/h\n";
       fullReport += "High temperature: " + highTemp + "°C (rounded: " + highTempInt + "°C)\n";
       fullReport += "Low temperature: " + lowTemp + "°C (rounded: " + lowTempInt + "°C)\n";
       fullReport += "UV Index: " + uvIndex + "\n\n";
       fullReport += "Weather Tips:\n";
       fullReport += tips;
       fullReport += "-----------------------------\n";
 
        /*
        STEP 6: Print the full weather report
        */

       //Display the full weather report
      System.out.println();
      System.out.println(fullReport);

 
        // TODO: Output your report using System.out.println()
 
 
        /*
        STEP 7: Optional extra challenge
        - Use loops to ask if the user wants to enter another day's report
        - Continue until the user types "no"
        */
 
 
        // TODO: Implement loop for multiple reports
 
 
        input.close();
    }
}
 