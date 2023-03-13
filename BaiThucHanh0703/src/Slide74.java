public class Slide74  {
    public static void Slide74(String[] args) {
      // Khởi tạo mảng 1 chiều
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  
      // Khởi tạo biến tổng
      int sum = 0;
  
      // Duyệt qua tất cả các phần tử của mảng
      for (int i = 0; i < arr.length; i++) {
        // Nếu phần tử là số chẵn, cộng vào biến tổng
        if (arr[i] % 2 == 0) {
          sum += arr[i];
        }
      }
  
      // In ra tổng các số chẵn
      System.out.println("Tổng các số chẵn của mảng là: " + sum);
    }
  }