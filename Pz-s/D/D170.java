package D;
import java.util.Scanner;

public class D170 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scannerクラスのインスタンスを作成、引数で標準入力System.inを指定
        int N = sc.nextInt(); //nextInt()メソッドで数値として取得 →変数Nへ代入 →値を1行読み取り
        int M = sc.nextInt(); //nextInt()メソッドで数値として取得 →変数Mへ代入 →値を1行読み取り
        sc.nextLine(); // 行送り
        
        for (int i = 0; i < 1; i++) { // for文で繰り返し処理
        System.out.println(N * M);  // マラソンの結果を出力
      }
    }
}