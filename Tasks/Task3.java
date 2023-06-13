public class Task3 {

    // Написать функцию, возвращающую истину, если в переданном массиве есть два
    // соседних элемента, с нулевым значением.
    public static void main(String[] args) {

        int[] numbers = new int[] { 2, 1, 0, 0, 4, 2, 1, 0, 3, 0 };

        System.out.println(isZeros(numbers));

    }

    public static boolean isZeros(int[] param) {

        for (int i = 0; i < param.length - 1; i++) {
            if (param[i] == 0 && param[i + 1] == param[i]) {
                return true;
            }

        }
        return false;

    }

}
