package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    //国内のハイフンあり携帯電話番号のパターンを登録
    Pattern operatorPattern = Pattern.compile(
        "0[5789]0-[0-9]{4}-[0-9]{4}");

    System.out.print("携帯電話番号を入力してください: ");
    //入力が指定した形式かどうかチェック
    if (scanner.hasNext(operatorPattern)) {
      System.out.println(scanner.next() + " は有効な携帯電話番号です。");
    } else {
      System.out.println(scanner.next() + " は無効な携帯電話番号です。");
    }
  }
}
