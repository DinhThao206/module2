package StopWatch;

public class Main {
    public static void main(String[] args) {
        class TestStopWatch {
            public static void main(String[] args) {
                int n = 100_000;
                int[] arr = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = (int) (Math.random() * 100_000);
                }
                StopWatch stopwatch = new StopWatch();
                stopwatch.start();

                selectionSort(arr);

                stopwatch.stop();
                System.out.println("Thời gian thực thi Selection Sort: " + stopwatch.getElapsedTime() + " ms");
            }

            public static void selectionSort(int[] arr) {
                int n = arr.length;
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i;
                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }
                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
            }
        }

    }
}
