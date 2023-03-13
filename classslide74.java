public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // mảng 1 chiều có 10 phần tử
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) { // nếu số chẵn thì tính tổng
                sum += arr[i];
            }
        }
        System.out.println("Tổng các số chẵn trong mảng là: " + sum);
    }
}
