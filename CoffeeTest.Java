class TooHotException extends Exception {
    public TooHotException() {
        super("The coffee is too hot to drink!");
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class CoffeeTest {
    public static void main(String arr[]) {
        try {
            int t = Integer.parseInt(arr[0]); // Parsing the temperature value
            if (t > 90) {
                throw new TooHotException(); // Throwing TooHotException
            } else if (t < 30) {
                throw new TooColdException("Coffee is too cold, unable to drink."); // Throwing TooColdException
            } else {
                System.out.println("Coffee is drinkable."); // If the temperature is between 30 and 90
            }
        } catch (TooHotException e) {
            System.out.println(e.getMessage()); // Print the message from TooHotException
        } catch (TooColdException e) {
            System.out.println(e.getMessage()); // Print the message from TooColdException
        } catch (Exception e) {
            System.out.println(e); // Catch any other exceptions
        }
    }
}
