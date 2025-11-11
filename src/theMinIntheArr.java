public class theMinIntheArr {
    public static void main(String[] args) {
        int[] arr = {4, 3, 23, 238, 22, 38, 9, 8, 11};
        int index = minValue(arr);
        System.out.println("Số nhỏ nhất trong mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
