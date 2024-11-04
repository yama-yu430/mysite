---
title: "13_while"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# Java の `while` ループについて

## 1. `while` ループの基本
`while` ループは、条件が「真 (true)」である間、同じ処理を繰り返し実行するための制御構文です。`for` ループのように、事前に繰り返し回数が決まっていないときや、繰り返しを続ける条件が動的に変化する場合に便利です。ここでは、`while` ループの使い方を基礎から見ていきましょう。


## 2. `while` ループの基本構文
まずは、正規表現の基本となる記号を理解しましょう。

```java
while (条件式) {
    // 繰り返し実行したい処理
}
```
- 条件式: `while` のすぐ後に書く条件式が `true` の間、ブロック内の処理が繰り返されます。
- 処理内容: `{ }` の中に書かれた処理が繰り返し実行されます。
もし条件式が最初から `false` である場合、`while` ループの中の処理は一度も実行されません。

## 3 基本的な使用例

### 3.1 例 1: 数字を 1 から 5 まで順に表示する
この例では、変数 `i` を `1` から始めて、`i` が `5` 以下の間、繰り返し `i` を表示します。各ループで `i` に `1` を加算することで、`i` が `5` 以上になったらループを終了します。
```java
public class WhileExample {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {  // 条件式が true の間ループ
            System.out.println(i);
            i++;  // ループを抜けるために i に 1 を加算
        }
    }
}
// 出力:
// 1
// 2
// 3
// 4
// 5
```
### 3.2 例 2: 合計が 100 を超えるまで数を加算
この例では、変数 `sum` に 1 ずつ数を足していき、`sum` が 100 を超えるまでループを続けます。

```java
public class SumExample {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        while (sum <= 100) {  // 合計が 100 を超えるまでループ
            sum += number;
            number++;
        }
        System.out.println("合計が 100 を超えました: " + sum);
    }
}
// 出力:
// 合計が 100 を超えました: 105
```

### 3.3 無限ループに注意
`while` ループでは、ループの中で条件を満たさなくするような処理が必要です。処理が無いと、`while` の条件が永遠に `true` のままになる「無限ループ」になってしまいます。

無限ループの例
```java
public class InfiniteLoopExample {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 5) {  // この条件は変化しないので無限ループになる
            System.out.println("これは無限ループです");
            // count++ がないため、count が 5 を超えない
        }
    }
}
```
無限ループを避けるためには、条件を変更するための処理 (`count++` など) を忘れずに書くようにしましょう。

## 4 while と do-while の違い
`Java` には `while` の他に `do-while` というループもあります。この違いを理解しておきましょう。

- `while`: 条件を先にチェックするので、条件が `false` なら一度も実行されません。
- `do-while`: 最初に一度は実行され、ループの最後に条件をチェックします。したがって、条件が `false` でも最低1回は実行されます。

### 4.1 do-while を使った例
```java
public class DoWhileExample {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("これは1回だけ表示されます");
        } while (i < 5);  // 最初の条件が false でも 1 回は実行
    }
}
// 出力:
// これは1回だけ表示されます
```
## 5 まとめ
- `while` ループは、条件が `true` の間、繰り返し処理を実行するための構文です。
- 繰り返しの回数が事前に決まっていない場合や、ループの中で動的に条件が変化する場合に便利です。
- `while` の条件が `false` のときは、ループ内の処理は実行されません。
- 無限ループを避けるため、条件が変わるような処理を忘れずに入れることが重要です。
以上が `while` ループの基本的な説明です。次のステップとして、`while` を使って簡単なプログラムを書いてみましょう！

