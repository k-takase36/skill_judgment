package D;
import java.util.Scanner;

public class D182 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int n = sc.nextInt(); // nextInt()メソッドで数値として取得する →変数nへ代入 →値を1行読み取り
        int m = sc.nextInt(); // nextInt()メソッドで数値として取得する →変数mへ代入 →値を1行読み取り
        sc.nextLine(); // 行送り
        
        for (int i = 0; i < 1; i++) { // for文で繰り返し処理
        System.out.println(n / m);  // 燃費（走行距離 / 燃料）の結果を出力
      }
    }
}