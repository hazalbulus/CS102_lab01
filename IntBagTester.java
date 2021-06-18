import java.util.Scanner;

/**
 * Lab01 part d, a program that presents the user with a menu having 7 options 
 * (which can be selected in any order by typing the corresponding number)
 * @author Hazal Buluş
 * @version 1.0 17.06.2021
 */
public class IntBagTester {
    public static void main(String[] args) {

        //Variables
        int selection;
        IntBag newCollection = new IntBag();

        Scanner scan = new Scanner(System.in);

        System.out.println("IntBag Tester");

        do{
            System.out.println("Please make a selection: ");
            System.out.println(" 1. Create a new empty collection(any previous values are lost!)\n 2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)\n 3. Print the collection of values.\n 4. Add a value to the collection of values at a specified location\n 5. Remove the value at a specified location from the collection of values\n 6. Remove all instances of a value within the collection* (see note below).\n 7. Quit the program.");
            System.out.println();
            System.out.println("Type your selection number: ");
            selection = scan.nextInt();
            System.out.println();

            if(selection == 1){
                newCollection = new IntBag();
                System.out.println("New collection has created.");
                System.out.println();
            }
            else if(selection == 2){
                int input;
                System.out.println("Enter a set of non-negative integers that you want to put into collection(Enter 0 for ending.)");
                System.out.println();
                do {
                    System.out.println("Enter the value:");
                    input = scan.nextInt();
                    System.out.println();
                    if(input != 0)
                        newCollection.addToEnd(input);
                    
                } while (input != 0);
            }
            else if(selection == 3){
                System.out.println();
                System.out.println(newCollection);
            }
            else if(selection == 4){
                int index;
                int value;
                System.out.println("Enter the value:");
                value = scan.nextInt();
                System.out.println();
                System.out.println("Enter the index you want to put the value at:");
                index = scan.nextInt();
                System.out.println();;
                newCollection.addToIndex(value, index);
            }
            else if(selection == 5){
                int index;
                System.out.println("Enter the index you want to remove:");
                index = scan.nextInt();
                newCollection.remove(index);
            }
            else if(selection == 6){
                int value;
                System.out.println("Enter the value that you want to remove:");
                value = scan.nextInt();
                newCollection.removeAll(value);
            }
        }while(selection != 7);

        System.out.println("Program is stopped.");

        scan.close();
    }   
}
