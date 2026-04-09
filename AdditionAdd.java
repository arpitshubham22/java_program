import java.io.*;

class AdditionAdd {
    public static void main(String arr[]) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter any two numbers:");

            // Read the numbers as strings and convert to double
            double num1 = Double.parseDouble(reader.readLine());
            double num2 = Double.parseDouble(reader.readLine());

            // Calculate the sum
            double sum = num1 + num2;

            // Output the sum
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            // Handle any exceptions (like incorrect input)
            System.out.println(e);
        }
    }
}
