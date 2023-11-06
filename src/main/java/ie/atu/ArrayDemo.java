package ie.atu;

public class ArrayDemo
{
    public static void main(String[] args)
    {
        int[] numArray;
        int i, x = 0;

        numArray = new int [10];

        numArray[0] = 100;

        for (i = 0; i < 10; i++)
        {
            x+=100;
            numArray[0 + i] = x;
        }

        int indexValue = 0;

        for (int value : numArray)
        {
            System.out.println("Element at index " + indexValue + ":" + value);
            indexValue++;
        }
    }
}