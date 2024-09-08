public class BinaryConverter
{
    /**
     *
     * This method converts an integer into a binary number which is returned as a String object.
     *
     * Precondition: Passes in an integer parameter from BinaryConverterDriver Class
     *
     * @param num
     * @return a String that prints out a binary number
     */
    public static String convertInt(int num)
    {
        String empty = "";
        String output = "";
        while(num > 0)
        {
            int x = num % 2;
            if(x == 0)
            {
                empty += 0;
            }
            else
            {
                empty += 1;
            }
            num = (int)num/2;

        }
        for (int i = empty.length() - 1; i >= 0 ; i--)
        {
            output += empty.charAt(i); // Adds Remainders to the String
        }
        return output;
    }

    /**
     *
     * This method converts a double into a binary number which is returned as a String object.
     *
     * Precondition: Passes in an double parameter from BinaryConverterDriver Class
     *
     * @param num
     * @return
     */

    public static String convertDouble(double num)
    {
        String empty = "0.";
        while(num <= 1)
        {
            num = num * 2;
            if(num == 1)
            {
                empty += 1; // adds a 1 to the String
                break;
            }
            else
            {
                empty += 0; // adds a 0 to the String
            }
        }
        return empty;

    }

    /**
     *
     * This method converts a double into a binary number which is returned as a String object.
     *
     * Precondition: Passes in an double parameter from BinaryConverterDriver Class
     *
     * @param num
     * @return
     */
    public static String convert(double num)
    {
        int integerNumber = (int) num;
        double doubleNumber = num - integerNumber;

        String empty = "";
        String output = "";
        while(integerNumber > 0)
        {
            int x = integerNumber % 2;
            if (x == 0)
            {
                empty += 0;
            }
            else
            {
                empty += 1;
            }
            integerNumber = integerNumber/2;

        }
        for (int i = empty.length() - 1; i >= 0 ; i--)
        {
            output += empty.charAt(i);
        }

        String empty2 = ".";
        while (doubleNumber <= 1)
        {
            doubleNumber = doubleNumber * 2;
            if(doubleNumber == 1)
            {
                empty2 += 1;
                break; // Command that makes program leave the loop
            }
            else
            {
                empty2 += 0;
            }
        }
        output += empty2; // Combines integer part of String with double part of the String
        return output; //Returns final output
    }
}
