
class sort {

    public void cocktailSort(int[] arr) {


        int length = arr.length;
        int leftToRight = 0;
        int rightToLeft = length - 1;
        boolean alreadySwapped;

        while (leftToRight < rightToLeft) {
            alreadySwapped = false;
            //left to right
            for (int i = leftToRight; i < rightToLeft; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    alreadySwapped = true;
                }
            }
            rightToLeft--;

            if (!alreadySwapped) {
                break;
            }

            //right to left
            for (int i = rightToLeft; i > leftToRight; i--) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftToRight++;

        }
    }
}


public class Cocktail_Sorting {
    public static void main(String[] args) {
        int [] array = {5, 3, 9, 0, 1, 8, 2, 6, 7, 4};
        System.out.println("BEFORE SORT: ");
        for (int e : array) System.out.print(e + " ");

        System.out.println("\nAFTER SORT");
        sort cocktail = new sort();
        cocktail.cocktailSort(array);
        for (int e : array) System.out.print(e + " ");
    }
}


