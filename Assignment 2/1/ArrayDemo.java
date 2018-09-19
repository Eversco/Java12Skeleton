class ArrayDemo {
    public static void main(String[] args) {

        int[] ar1 = { -20, 19, 1, 5, -1, 27, 19, 5 };

        ArrayOps operate = new ArrayOps(); // create an ArrayOps object
        operate.Print(ar1); //Prints the list of numbers
        int biggest = operate.FindMax(ar1); // call the findMax () method with the array
        System.out.println("The maximum is: " + biggest);
        int lowest = operate.FindLowest(ar1); // find the lowest
        System.out.println("The lowest is: " + lowest);
        int sum = operate.SumArray(ar1); // adds all number together
        System.out.println("All add together equals " + sum);
        System.out.println("Backward is ");
        operate.PrintBackwards(ar1); // printing backward
        System.out.println("Odd indexes: ");
        operate.PrintOddElements(ar1); //Print odd numbers
        System.out.println("Even indexes: ");
        operate.PrintEvenElements(ar1); //Prints even numbers
        operate.ZeroOut(ar1);//makes all value to zero
        operate.Print(ar1);
    }
}

class ArrayOps {
/**
 * Finds biggest number
 * parameter finds the biggest
 * return the biggest
 */
    int FindMax(int[] x) {
        int max = x[0];

        for (int index = 0; index < x.length; index++) {
            if (x[index] > max) {
                max = x[index];
            }
        }

        return max;
    }
/**
 * Find the lowest value
 * parameter x find the lowest
 * return gives the lowest
 */
    int FindLowest(int[] x) {
        int low = x[0];// you can do the rest from here just < instead of > from findMax comparisons.

        for (int index = 0; index < x.length; index++)
            if (x[index] < low)
                low = x[index];

        return low;
    }
/**
 * Adds up the number of index inorder to print out every single numbers
 */
    void Print(int[] x) {

        for (int j = 0; j < x.length; j++) {
            System.out.print(x[j] + " ");
        }

        System.out.println();
    }
/**
 * let variable sum to add the numbers through the loop
 * index increases for sum to increase its value by adding all the numbers
 */
    int SumArray(int[] x) {
        int sum = 0;
        for (int i = 0; i < x.length ; i++) {
            sum += x[i];
        }
        return sum;
    }
/**
 * let the index start from the end of list and decrease to the beginning
 * print as the index decrease which result the list printe in backward
 */
    void PrintBackwards(int[] x) {
        for (int i = x.length - 1; i >= 0 ; i--) {
            System.out.print(x[i] + ", ");
        }
        System.out.println();
    }
/**
 * starting from the second number of the list and skip the next one so the index are all odd
 */
    void PrintOddElements(int[] x) {
        for (int i = 1; i < x.length; i += 2) {
            System.out.print(x[i] + ", ");
        }
        System.out.println();
    }
/**
 * start from the beginning and skip the next number which results all even indexes
 */
    void PrintEvenElements(int[] x) {
        for (int i = 0; i < x.length ; i += 2) {
            System.out.print(x[i] + ", ");
        }
        System.out.println();
    }
    /**
     * increase the index number and then change every value of every number in the list to 0
     */
    void ZeroOut(int[] x) {
        for (int i = 0; i < x.length; i++){
            x[i] = 0;
        }
    }
}