import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] myIntArray = getInteger(5);
       // printArray(myIntArray);
        int[] sorted = sortIntegers(myIntArray);

        printArray(sorted);

    }

    public static int[] getInteger(int arrayLength){
        int[] arrayInt = new int[arrayLength];
        System.out.println("Enter 5 integers to your array: \r");
        for(int i = 0; i < arrayLength; i++){
            arrayInt[i]= scanner.nextInt();
        }

        return arrayInt;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("#"+i+" "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int temp;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-1-i; j++){
                temp = array[j];
                if(array[j] < array[j+1]){
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}