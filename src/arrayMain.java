import java.util.Arrays;

public class arrayMain {
    public static void main(String[] args){

        String[] arrayString = new String[5];
        arrayString[0] = "Zero";
        arrayString[1] = "One";
        arrayString[2] = "Two";
        arrayString[3] = "Three";
        arrayString[4] = "Four";

        System.out.print("String numbers: ");
        for(int i=0; i<arrayString.length; i++) {
            System.out.print(arrayString[i] + " ");
        }
        System.out.println();

        int[] numberArray = new int[10];
        for(int i=0; i<10; i++){
            numberArray[i] = i*3;
        }
        System.out.println("numbers array : "+Arrays.toString(numberArray));
        System.out.println();
        for(int i : numberArray){
            System.out.print(i+" ");
        }
    }
}
