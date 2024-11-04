---
title: "07_例外処理"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# Javaの例外処理入門

## 1. 例外とは？
プログラムを実行中に何らかの問題が発生すると、その問題を「例外」と呼びます。例えば、次のような状況です。

- ファイルが見つからない
- 配列の範囲外にアクセスしようとした
- 0で割り算をしようとした

これらの問題が発生すると、プログラムは通常そのまま停止してしまいます。しかし、Javaでは「例外処理」を使うことで、これらの問題を適切に処理し、プログラムを続行させることができます。

## 2. 例外処理の基本構文
Javaで例外処理を行うには、`try-catch`文を使用します。基本的な構文は次の通りです。

```java
try {
    // 例外が発生するかもしれない処理
} catch (例外の型 例外の変数) {
    // 例外が発生した時の処理
}
```
### 例:
```java
public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]); // 存在しないインデックスにアクセス
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外にアクセスしようとしました。");
        }
    }
}
```
この例では、存在しない配列のインデックスにアクセスしようとすると、`ArrayIndexOutOfBoundsException`という例外が発生しますが、`catch`ブロック内で適切に処理されるため、プログラムはエラーで停止せずに続行します。

## 3. `finally`ブロック
例外が発生してもしなくても、必ず実行したい処理がある場合は、`finally`ブロックを使用します。`finally`ブロックは、`try-catch`の最後に追加します。
### 例：
```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // 0で割り算を試みる
        } catch (ArithmeticException e) {
            System.out.println("0で割ることはできません。");
        } finally {
            System.out.println("このメッセージは常に表示されます。");
        }
    }
}
```
この例では、`ArithmeticException`が発生し、`catch`ブロックが実行されます。その後、`finally`ブロック内の処理が必ず実行されます。
## 4. 複数の例外をキャッチする
一つの`try`ブロックに対して、複数の`catch`ブロックを使用することができます。これにより、異なる種類の例外を別々に処理できます。
### 例：
```java
public class Main {
    public static void main(String[] args) {
        try {
            String text = null;
            System.out.println(text.length()); // NullPointerExceptionを発生させる
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("配列の範囲外です。");
        } catch (NullPointerException e) {
            System.out.println("オブジェクトがnullです。");
        }
    }
}
```
この例では、`NullPointerException`が発生し、それに対応するcatchブロックが実行されます。

## 5. カスタム例外を作成する
必要に応じて、自分で例外クラスを作成し、特定の状況でそれを投げることができます。カスタム例外は`Exception`クラスを継承して作成します。
### 例：
```java
class MyCustomException extends Exception {
    public MyCustomException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new MyCustomException("これはカスタム例外です。");
        } catch (MyCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
```
この例では、`MyCustomException`という独自の例外を作成し、それを投げて処理しています。

## 6. Javaの主要な例外クラス

### 1. `NullPointerException`
**説明:**  
オブジェクトが`null`である状態で、そのオブジェクトのメソッドやフィールドにアクセスしようとすると発生します。例えば、`null`の変数に対して`length()`メソッドを呼び出すと、この例外がスローされます。
**例:**
```java
String text = null;
System.out.println(text.length());  // ここでNullPointerExceptionが発生します
```

### 2. `ArrayIndexOutOfBoundsException`
**説明:**
配列の範囲外のインデックスにアクセスしようとすると発生します。配列のサイズが3の場合、インデックス0～2が有効範囲ですが、インデックス3以上にアクセスするとこの例外がスローされます。
**例:**
```java
int[] numbers = {1, 2, 3};
System.out.println(numbers[3]);  // ここでArrayIndexOutOfBoundsExceptionが発生します
```
### 3. `ArithmeticException`
**説明:**
数値計算が不正な場合に発生します。最も一般的な例は、整数を0で割ろうとする場合です。
**例:**
```java
int result = 10 / 0;  // ここでArithmeticExceptionが発生します
```
### 4. `ClassCastException`
**説明:**
オブジェクトを不正な型にキャストしようとした場合に発生します。例えば、String型をInteger型にキャストしようとするとこの例外がスローされます。
**例:**
```java
Object obj = "Hello";
Integer num = (Integer) obj;  // ここでClassCastExceptionが発生します
```

### 5. `NumberFormatException`
**説明:**
文字列を数値に変換しようとしたとき、その文字列が有効な数値形式でない場合に発生します。例えば、"abc"を整数に変換しようとするとこの例外がスローされます。
**例:**
```java
String str = "abc";
int num = Integer.parseInt(str);  // ここでNumberFormatExceptionが発生します
```

### 6. `IllegalArgumentException`
**説明:**
メソッドに不正な引数を渡した場合に発生します。例えば、負の値を受け入れないメソッドに負の値を渡した場合に、この例外がスローされることがあります。
**例:**
```java
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("年齢は0以上でなければなりません。");
    }
}
```

### 7. `IOException`
**説明:**
入出力操作（ファイル読み書き、ネットワーク通信など）で問題が発生した場合に発生します。この例外は、ファイルが存在しない、アクセス権がないなどの状況でよく使われます。
**例:**
```java
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent_file.txt");
        } catch (IOException e) {
            System.out.println("ファイルを読み込めませんでした。");
        }
    }
}
```

### 8. `FileNotFoundException`
**説明:**
指定されたファイルが見つからない場合に発生します。`IOException`のサブクラスです。
**例:**
```java
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません。");
        }
    }
}
```

### 9. `SQLException`
**説明:**
データベースアクセスでエラーが発生した場合に発生します。データベースとの接続やクエリの実行に失敗した場合によく使われます。
**例:**
```java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password");
        } catch (SQLException e) {
            System.out.println("データベース接続に失敗しました。");
        }
    }
}
```

### 10. `InterruptedException`
**説明:**
スレッドがスリープ状態の時や待機中に中断された場合に発生します。マルチスレッドプログラミングでスレッドを制御する際に使用されます。
**例:**
```java
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("スレッドが中断されました。");
            }
        });
        thread.start();
        thread.interrupt();  // スレッドを中断します
    }
}
```

これらの例外クラスは、Javaプログラムでよく遭遇する一般的な例外です。例外が発生した場合、その原因を特定し、適切に対処することが重要です。

## 7. まとめ
Javaの例外処理を使うことで、プログラムが予期しないエラーで突然停止するのを防ぎ、ユーザーに適切なフィードバックを提供することができます。初心者のうちは、まずは`try-catch`文を使って、どのように例外が処理されるかを理解しましょう。慣れてきたら、`finally`ブロックやカスタム例外の作成にも挑戦してみてください。
