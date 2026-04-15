/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題3 マカロンを作る
 *
 * シトロン、ショコラ、ピスターシュを30個ずつ作成します。
 * シトロン、ショコラ、ピスターシュの個数を格納する変数を
 * 宣言し、それぞれに30を代入してください。
 * [問題2]の表示を以下の実行例のように改変します。
 * （表示する個数はそれぞれの変数の値とします。）
 *
 * <実行例>
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り30個
 * ショコラ      \280 ・・・ 残り30個
 * ピスターシュ  \320 ・・・ 残り30個
 *
 */

package lesson01.challenge03;

public class Patisserie {
	public static void main(String[] args) {

		int sitoron_num;
		sitoron_num = 30;
		int syokora_num;
		syokora_num = 30;
		int pisuta_num;
		pisuta_num = 30;

		System.out.println("シトロン\t\t\\250・・・残り" + sitoron_num + "個");
		System.out.println("ショコラ\t\t\\280・・・残り" + syokora_num + "個");
		System.out.println("ピスターシュ\t\\320・・・残り" + pisuta_num + "個");

	}

}
