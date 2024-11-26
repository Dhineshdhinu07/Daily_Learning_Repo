class Main{
    public static void main(String[] args) {
        int n = 4;
        // pattern1(n);
        // pattern2(n);
        // pattern3(n);
        // pattern4(n);
        // pattern5(n);
        // pattern6(n);
        // pattern7(n);
        // pattern8(n);
        pattern9(n);
    }
    // private static void pattern1(int n){
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j < n; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output: 
    // *****
    // *****
    // *****
    // *****
    // *****
//
    // private static void pattern2(int n){
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j <= i; j++){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output: 
    // *
    // **
    // ***  
    // ****
    // *****
    // private static void pattern3(int n){
    //     for(int i = 0; i < n; i++){
    //         for(int j = 0; j <= i; j++){
    //             System.out.print(j + 1 + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output: 
    // 1
    // 1 2
    // 1 2 3
    // 1 2 3 4
    // 1 2 3 4 5
    // private static void pattern4(int n){
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= i; j++){
    //             System.out.print(i + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output: 
    // 1
    // 2 2
    // 3 3 3
    // 4 4 4 4
    // 5 5 5 5 5
    // private static void pattern5(int n){
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= n - i + 1; j++){
    //             System.out.print( "* ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output: 
    // * * * * *
    // * * * *
    // * * *
    // * *
    // *
    // private static void pattern6(int n){
    //     for(int i = 1; i <= n; i++){
    //         for(int j = 1; j <= n - i + 1; j++){
    //             System.out.print( j + " ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output:
    // 1 2 3 4 5
    // 1 2 3 4
    // 1 2 3
    // 1 2
    // 1
    // private static void pattern7(int n){
    //     for (int i = 0; i < n; i++) {
    //         for(int j = 0; j < n - i -1; j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 0; k < i * 2 + 1; k++){
    //             System.out.print("*");
    //         }
    //         for(int j = 0; j < n - i - 1; j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output:
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    // private static void pattern8(int n){
    //     for (int i = n; i > 0; i--) {
    //         for(int j = 0; j < n - (i - 1) ; j++){
    //             System.out.print(" ");
    //         }
    //         for(int k = 0; k < 2 * i - 1; k++){
    //             System.out.print("*");
    //         }
    //         for(int j = 0; j < n - (i - 1) ; j++){
    //             System.out.print(" ");
    //         }
    //         System.out.println();
    //     }
    // }
    //Output:
    // *********
    //  *******
    //   *****
    //    ***
    //     *
    private static void pattern9(int n){
        for (int i = n; i > 0; i--) {
            for(int j = 0; j < n - (i - 1) ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < 2 * i - 1; k++){
                System.out.print("*");
            }
            for(int j = 0; j < n - (i - 1) ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}