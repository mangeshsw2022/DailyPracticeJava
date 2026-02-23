public class Level5 {

    //  Print all elements
    void arrayPrint(int[] num) {
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Find element in array
    void findElement(int[] num, int value) {
        boolean found = false;

        for (int i : num) {
            if (i == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found: " + value);
        } else {
            System.out.println("Element not found");
        }
    }

    // Find largest element
    void findLargest(int[] num) {
        int max = num[0];

        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Largest element: " + max);
    }

    // Find smallest element
    void findSmallest(int[] num) {
        int min = num[0];

        for (int i : num) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("Smallest element: " + min);
    }

    // Count even and odd numbers
    void countEvenOdd(int[] num) {
        int even = 0;
        int odd = 0;

        for (int i : num) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
    }

    // Reverse array
    void reverseArray(int[] num) {
        System.out.print("Reversed array: ");
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }

    // Find Min and Max together
    void findMinMax(int[] num) {
        int min = num[0];
        int max = num[0];

        for (int i : num) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}