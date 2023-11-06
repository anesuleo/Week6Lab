package ie.atu;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int i, x = 100;

        numbers.add(100);

        for (i = 0; i < 10; i++)
        {
            numbers.add(x);
            x+=100;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add new element: ");
        numbers.add(scanner.nextInt());

        int indexValue = 0;
        for (int value: numbers)
        {
            System.out.println("Element at index " + indexValue + ": " + value);
            indexValue++;
        }

    }
}
