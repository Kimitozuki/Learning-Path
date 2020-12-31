import java.util.Arrays;
public class Java_43_Operator_Array {
    public static void main(String[] args) {
        //Copy Array
        System.out.println("Copy Array \n====================");
        System.out.println("Copy with Loop:");
        int[] arrayInt1 = {2,3,5,7,11};
        int[] arrayInt2 = new int[5];
        System.out.println(arrayInt1);
        printArray(arrayInt1);
        System.out.println(arrayInt2);
        printArray(arrayInt2);
        for (int loop = 0; loop < arrayInt1.length; loop++){
            arrayInt2[loop] = arrayInt1[loop];
        }
        System.out.println(arrayInt1);
        printArray(arrayInt1);
        System.out.println(arrayInt2);
        printArray(arrayInt2);

        System.out.println("\nCopy with copyOf Syntax:");
        int[] arrayInt3 = {2,4,6,8,10};
        int[] arrayInt4 = new int[5];
        System.out.println(arrayInt3);
        printArray(arrayInt3);
        System.out.println(arrayInt4);
        printArray(arrayInt4);
        arrayInt4 = Arrays.copyOf(arrayInt3,arrayInt3.length);
        System.out.println(arrayInt3);
        printArray(arrayInt3);
        System.out.println(arrayInt4);
        printArray(arrayInt4);

        System.out.println("\nCopy with copyOfRange Syntax:");
        int[] arrayInt5 = {1,3,5,7,9};
        int[] arrayInt6 = new int[5];
        System.out.println(arrayInt5);
        printArray(arrayInt5);
        System.out.println(arrayInt6);
        printArray(arrayInt6);
        arrayInt6 = Arrays.copyOfRange(arrayInt5,1,4);
        System.out.println(arrayInt5);
        printArray(arrayInt5);
        System.out.println(arrayInt6);
        printArray(arrayInt6);

        //Fill Array
        System.out.println("\nFill Array \n====================");
        printArray(arrayInt1);
        Arrays.fill(arrayInt1, 5);
        printArray(arrayInt1);

        //Array Comparator
        System.out.println("\nArray Comparator \n====================");
        int[] arrayInt7 = {1,2,3,4};
        int[] arrayInt8 = {1,7,8,4,5};
        printArray(arrayInt7);
        printArray(arrayInt8);

        System.out.println("\nCompare:");
        System.out.println(Arrays.equals(arrayInt7,arrayInt8));

        System.out.println("\nGreater:");
        //Output 0, sama besar                1         -1
        //Output -1, kanan yang besar         |          |
        System.out.println(Arrays.compare(arrayInt7,arrayInt8));

        System.out.println("\nDifference:");
        System.out.println(Arrays.mismatch(arrayInt7,arrayInt8));

        //Array Sort
        System.out.println("\nArray Sort \n====================");
        System.out.print("Before: ");
        printArray(arrayInt8);
        Arrays.sort(arrayInt8);
        System.out.print("After: ");
        printArray(arrayInt8);

        //Array Search Index
        //Sintaks binarySearch dapat digunakan apabila nilai data dalam array sudah diurutkan
        System.out.println("\nArray Search Index \n====================");
        printArray(arrayInt8);
        int target = 8;
        System.out.println("Target: " + target);
        int index = Arrays.binarySearch(arrayInt8,target);
        System.out.println("Index: " + index);

        //Array Reverse Sort
        System.out.println("\nArray Reverse Sort \n====================");
        printArray(arrayInt8);
        int[] arrayInt9 = new int[arrayInt8.length];
        int i = 0;
        for(int loop = arrayInt8.length - 1; loop >= 0; loop--){
            arrayInt9[i] = arrayInt8[loop];
            i++;
        }
        printArray(arrayInt9);

        //SUM Array
        System.out.println("\nSUM Array \n====================");
        printArray(arrayInt8);
        printArray(arrayInt7);
        SUMarray(arrayInt8, arrayInt7);

    }
    private static void printArray(int[] arrayDataInt){
        System.out.println(Arrays.toString(arrayDataInt));
    }
    private static void SUMarray(int[] arrayDataInt1, int[] arrayDataInt2){
        int loopLimit = arrayDataInt1.length < arrayDataInt2.length ? arrayDataInt1.length : arrayDataInt2.length;
        int[] resultArray = new int[loopLimit];
        for (int loop = 0; loop < loopLimit; loop++){
            resultArray[loop] = arrayDataInt1[loop] + arrayDataInt2[loop];
        }
        printArray(resultArray);
    }
}
