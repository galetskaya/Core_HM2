public class Task2 {
    // Написать функцию, возвращающую разницу между самым
    // большим и самым маленьким элементами переданного не пустого массива.

    public static void main(String[] args) {

        int[] numbers = new int[] { 2, 1, 2, 3, 4, 2, 1, 156, 3, 4 };

        maxMinDiff(numbers);

    }

    public static void maxMinDiff(int[] param) {
        int result;

        if (param.length == 0) {
            System.out.println("массив пуст");

        } else {
            for (int i = 0; i < param.length - 1; i++) {
                for (int j = i + 1; j < param.length; j++) {
                    if (param[i] > param[j]) {
                        int temp = param[i];
                        param[i] = param[j];
                        param[j] = temp;
                    }
                }
            }
            result = param[param.length - 1] - param[0];

            System.out.println(result);
        }
    }

}
