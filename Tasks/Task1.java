public class Task1 {
    // Написать метод, возвращающий количество
    // чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
    // countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0

    public static void main(String[] args) {

        int[] countEvens = new int[] { 2, 1, 2, 3, 4 };
        int[] countEvens2 = new int[] { 2, 2, 0 };
        int[] countEvens3 = new int[] { 1, 3, 5 };
        System.out.println(countEvens(countEvens));
        System.out.println(countEvens(countEvens2));
        System.out.println(countEvens(countEvens3));

    }

    public static int countEvens(int[] param) {
        int count = 0;
        for (int i = 0; i < param.length; i++) {
            if (param[i] % 2 == 0) {
                count++;
            }

        }
        return count;
    }

}
