package ait.arrays.tools;

public class ArrayTools {
    public static int maxArray(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int search(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }

    public static void swapFirstLast(int[] arr) {
        int t = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = t;
    }


    public static void pow2Arr(int[] arr) {
        arr[1] = arr[1] * arr[1];
        System.out.println("arr[1] in method = " + arr[1]);
    }

    public static void pow2Var(int a) {
        a = a * a;
        System.out.println("a in method = " + a);
    }
    public static void printReverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println("[" + i + "] = " + arr[i]);
        }
        System.out.println("===================");
    }

    public static int sumOddArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i]; // sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int multiplyEvenIndexArray(int[] arr) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                res *= arr[i]; // res = res * arr[i];
            }
        }
        return res;
    }
    public static void reverseArray1(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
    }

    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }

    public static double average(int[] arr) {
        return 1. * sumArray(arr) / arr.length;
    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; // sum = sum + arr[i];
        }
        return sum;
    }

    public static int indexOfMax(int[] arr) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfMax1(int[] arr) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int binarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (value > arr[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l - 1;
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (min + Math.random() * (max + 1 - min));
        }
    }
}
