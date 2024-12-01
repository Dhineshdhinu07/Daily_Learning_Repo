package DailyChallenge;

public class CheckIfExist {
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j] * 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] test1 = {10, 2, 5, 3};
        System.out.println(checkIfExist(test1)); // true

        int[] test2 = {7, 1, 14, 11};
        System.out.println(checkIfExist(test2)); // true

        int[] test3 = {3, 1, 7, 11};
        System.out.println(checkIfExist(test3)); // false
    }

    
}
