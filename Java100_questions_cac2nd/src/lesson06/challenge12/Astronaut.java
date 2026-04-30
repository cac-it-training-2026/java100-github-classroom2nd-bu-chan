/**
 * 第6章 宇宙飛行士のお仕事
 *
 * 問題12 StringBufferクラス（replace）
 *
 * 宇宙船が次の目的地Ω星に到着しました。
 * Ω星は不思議な星です。Ω星では名前の
 * 末尾が数字が入っているものは英語表記に置き換える
 * というルールがあります。
 * 例えば、「apple2」は「appletwo」に
 * 「windows98」は「windows9eight」に変更されます。
 *
 * Ω星人クラスOmegalianを新たに作成してください。
 * OmegalianはString型フィールドitemを持ち、メソッドsetItem()で登録します。
 * また、setItem()内で呼び出されるメソッドとして、
 * 受け取った数字を英語表記に変換して戻す
 * private String changeLastChar(char ch)を持ちます。
 *
 * <実行例>
 *
 * Ω星人にアイテムを渡してください＞iPhone6
 *
 * Ω星人：
 * えっ！iPhonesixをくれるオメガか！
 * ありがとうオメガ。
 *
 */

package lesson06.challenge12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//ここにOmegalianクラスを記述する
class Omegalian {

	private String item;

	/**
	 * @return item
	 */
	public String getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public void setItem(String item) {
		int lastIndex = item.length() - 1;
		char lastch = item.charAt(lastIndex);
		String change_str = changeLastChar(lastch);

		if (change_str != null) {
			StringBuffer sb = new StringBuffer(item);
			sb.replace(lastIndex, lastIndex + 1, change_str);
			this.item = new String(sb);
		} else {
			this.item = item;
		}

	}

	private String changeLastChar(char ch) {
		String change_str = null;
		switch (ch) {
		case '0':
			change_str = "zero";
			break;
		case '1':
			change_str = "one";
			break;
		case '2':
			change_str = "two";
			break;
		case '3':
			change_str = "three";
			break;
		case '4':
			change_str = "four";
			break;
		case '5':
			change_str = "five";
			break;
		case '6':
			change_str = "six";
			break;
		case '7':
			change_str = "seven";
			break;
		case '8':
			change_str = "eight";
			break;
		case '9':
			change_str = "nine";
			break;
		default:
			break;
		}
		return change_str;
	}
}

public class Astronaut {

	public static void main(String[] args) throws IOException {

		System.out.print("Ω星人にアイテムを渡してください＞");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String present = br.readLine();

		//ここに適切な処理を記述する
		Omegalian omegalian = new Omegalian();
		omegalian.setItem(present);

		String item = null;

		//ここに適切な処理を記述する
		item = omegalian.getItem();

		System.out.println("\nΩ星人：");
		System.out.println("えっ！" + item + "をくれるオメガか！");
		System.out.println("ありがとうオメガ。");
	}
}
