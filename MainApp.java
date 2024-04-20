package advance.dev;
import java.util.Scanner;

public class MainApp {
	public static double devide(double a, double b) throws ArithmeticException {
		  if(b == 0) {
			  throw new ArithmeticException("Không thể chia cho 0");
		  }
		  return a / b;
		}
		public static double parse(double a) throws NumberFormatException {
			return a;
		}
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      System.out.print("Nhập a: ");
      double a = sc.nextDouble();
      System.out.print("Nhập b: ");
      double b = sc.nextDouble();
      try {
    	  double result = devide(a, b);
    	  System.out.println("kết quả của phép chia a/b là: "+result);
      }catch(ArithmeticException Exception) {
    	  System.out.println("Lỗi chia cho 0: "+Exception.getMessage());
      }try {
    	  double parses = parse(a);
    	  System.out.println("số thực được chuyển đổi từ chuỗi: "+parses);
      }catch(NumberFormatException Exception) {
    	  System.out.println("Lỗ chuyển đổi chuỗi sang số thực: " +Exception.getMessage());
      }
      sc.close();
    }
}
