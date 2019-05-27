import java.util.Scanner;

/**
 * @author wangchong
 * @date 2019/5/27 17:24
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01 {
    public static boolean isRight(int[][] arr, int i, int j) {
        if (j + 2 < arr[i].length) {
            if (arr[i][j + 2] == 1) {
                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
    public static boolean isLeft(int[][] arr, int i, int j) {
        if (j - 2 >= 0) {
            if (arr[i][j - 2] == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    public static boolean isUp(int[][] arr, int i, int j) {
        if (i - 2 >= 0) {
            if (arr[i - 2][j] == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    public static boolean isDown(int[][] arr, int i, int j) {
        if (i + 2 < arr.length) {
            if (arr[i + 2][j] == 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
    public static boolean isValid(int[][] arr, int i, int j) {
        int row = arr.length;
        int col = arr[i].length;
        if (i < 2 && j < 2) {
            if (isRight(arr,i,j) || isDown(arr,i,j)) {
                return false;
            } else {
                return true;
            }
        } else if (i < 2  && j < col - 2) {
            if (isDown(arr,i,j) || isRight(arr,i,j) || isLeft(arr,i,j)) {
                return false;
            } else {
                return true;
            }

        } else if (j >= 2 && i >= 2 && j + 2 < col && i + 2 >= 0) {
            if (isDown(arr,i,j) || isRight(arr,i,j) || isLeft(arr,i,j ) || isUp(arr,i,j)) {
                return false;
            } else {
                return true;
            }

        } else if (i >= 2 && j < 2 && i < row - 2) {
            if (isUp(arr,i,j) || isRight(arr,i,j) || isDown(arr,i,j)){
                return false;
            } else {
                return true;
            }
        } else if (i >= row - 2 && j < 2) {
            if ((isUp(arr,i,j) || isRight(arr,i,j))) {
                return false;
            } else {
                return true;
            }
        } else if (i >= row - 2 && j >= col - 2) {
            if (isUp(arr, i, j) || isLeft(arr, i, j)) {
                return false;
            } else {
                return true;
            }
        } else if (i >= row - 2 && j < col - 2) {
            if (isUp(arr,i,j) || isLeft(arr,i,j) || isRight(arr,i,j)) {
                return false;
            } else {
                return true;
            }
        } else if (i < 2 && j >= col - 2) {
            if (isLeft(arr,i,j) || isDown(arr,i,j)) {
                return false;
            } else {
                return true;
            }
        } else {
            if (isDown(arr,i,j) || isLeft(arr,i,j) || isUp(arr,i,j)) {
                return false;
            } else {
                return true;
            }
        }

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];
        if (row == 1 && col == 1) {

        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
                if (i < 2 && j < 2) {
                    arr[i][j] = 1;
                } else if (isValid(arr,i,j)) {
                    arr[i][j] = 1;
                }
            }
        }
        int sum = 0;
        for (int[] i : arr
             ) {
            for (int j : i
                 ) {
                if (j == 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}
