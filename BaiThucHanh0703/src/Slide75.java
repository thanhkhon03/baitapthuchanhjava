public class Slide75 {
    public static void main(String[] args) {
      // Khởi tạo mảng 2 chiều
      int[][] arr = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
      };
  
      // Khởi tạo biến tổng
      int sum = 0;
  
      // Duyệt qua tất cả các phần tử của mảng 2 chiều
      for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          // Nếu phần tử là số chẵn, cộng vào biến tổng
          if (arr[i][j] % 2 == 0) {
            sum += arr[i][j];
          }
        }
      }
  
      // In ra tổng các số chẵn
      System.out.println("Tổng các số chẵn của mảng 2 chiều là: " + sum);
    }
  }
  
    
