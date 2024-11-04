---
title: "12_正規表現"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# Javaの正規表現について

## 1. Javaにおける正規表現の基本
Javaの正規表現は、文字列のパターンを使って文字列の検証や検索、置換を行うための仕組みです。例えば、特定の文字列形式（メールアドレスや電話番号など）を確認する場合や、特定の文字列を探す場合に役立ちます。
Javaでは、正規表現を扱うために`java.util.regex`パッケージに含まれる`Pattern`クラスと`Matcher`クラスを使用します。


## 2. 正規表現の基礎
まずは、正規表現の基本となる記号を理解しましょう。
| 記号 | 説明                          | 使用例                    |
|------|-------------------------------|---------------------------|
| `.`  | 任意の1文字                   | `a.b` は `aab`, `acb` にマッチ|
| `*`  | 直前の文字が0回以上           | `ab*c` は `ac`, `abc`, `abbc` |
| `+`  | 直前の文字が1回以上           | `ab+c` は `abc`, `abbc` |
| `?`  | 直前の文字が0回か1回           | `ab?c` は `ac`, `abc`    |
| `[]` | 文字クラス：括弧内の任意の1文字 | `[abc]` は `a`, `b`, `c` にマッチ |
| `[^]`| 否定：括弧内以外の1文字       | `[^abc]` は `a`, `b`, `c` 以外にマッチ |
| `^`  | 行の先頭                      | `^abc` は `abc`で始まる行 |
| `$`  | 行の末尾                      | `abc$` は `abc`で終わる行 |
| `{n}`| 正確に`n`回の繰り返し         | `a{3}` は `aaa` にマッチ  |
| `{n,}`| `n`回以上の繰り返し           | `a{2,}` は `aa`, `aaa`, `aaaa` にマッチ |
| `{n,m}`| `n`回から`m`回の繰り返し    | `a{2,4}` は `aa`, `aaa`, `aaaa` |

## 3 Javaで正規表現を使う基本的な方法
Javaで正規表現を使うために、一般的に以下の3つのクラスが使われます。
1. **Pattern** - 正規表現のパターンを表すクラス。
2. **Matcher** - Patternオブジェクトと文字列を照合し、パターンがマッチするかを確認するクラス。
3. **String** - `matches`、`replaceAll`、`split`メソッドなどで正規表現をサポート。

### 3.1 例1: パターンのマッチング
`Pattern`と`Matcher`クラスを使って、文字列が正規表現にマッチするかを確認します。

```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        String regex = "\\d+";  // 数字にマッチする正規表現
        String text = "Java123Regex";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("マッチしました: " + matcher.group());
        } else {
            System.out.println("マッチしませんでした");
        }
    }
}
// 出力例: マッチしました: 123
```
- `\\d+` は1つ以上の数字にマッチする正規表現です。
- `matcher.find()` は、文字列内にパターンがあるかをチェックします。
- `matcher.group()` は、マッチした部分を返します。

### 3.2 例2: 'String.matches'メソッド
文字列が正規表現に完全に一致するかを確認する場合は、'String'クラスの'matches'メソッドが便利です。
```java
public class RegexExample {
    public static void main(String[] args) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        String email = "test@example.com";

        if (email.matches(emailRegex)) {
            System.out.println("有効なメールアドレスです");
        } else {
            System.out.println("無効なメールアドレスです");
        }
    }
}
// 出力例: 有効なメールアドレスです
```
この例では、メールアドレスの形式を確認するための正規表現を使用しています。

### 3.3 例3: `replaceAll`メソッドで置換
`replaceAll`メソッドを使って、特定のパターンにマッチした部分を別の文字列に置き換えます。
```java
public class RegexExample {
    public static void main(String[] args) {
        String text = "The price is $100";
        String replacedText = text.replaceAll("\\d+", "###");

        System.out.println(replacedText);
    }
}
// 出力例: The price is $###
```

`\\d+ `は1つ以上の数字にマッチし、`replaceAll`によりそれを`###`に置き換えます。

## 4 よく使う正規表現のパターン例
| パターン | 説明                          |
|------|-------------------------------|
|\\d |1桁の数字 |
|\\D	|数字以外の1文字			|
|\\w	|英数字、またはアンダースコアの1文字  |
|\\W	|英数字とアンダースコア以外の1文字  |
|\\s	|空白（スペース、タブなど）  |
|\\S	|空白以外の1文字  |
|[a-zA-Z]	|英字の1文字（大小区別）  |
|\\b	|単語の境界  |
|[aeiou]	|母音の1文字  |
|`(abc	|def)`  |


## 5 まとめ
- Javaの正規表現は、`Pattern`と`Matcher`クラスで利用します。
- 正規表現の基本的な記号や特殊文字を組み合わせて、さまざまなパターンを作成できます。
- `matches`、`replaceAll`、`split`などの`String`メソッドを使用して、正規表現を手軽に活用できます。
正規表現を活用することで、文字列操作が格段に効率的になります。少しずつ練習しながら、使いこなせるようになっていきましょう！

