---
title: "14_JUnit"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# JUnit入門

## 1. JUnitとは
Javaのアプリケーションを開発する際に、コードが意図した通りに動作することを確認するために、テストを書くことが重要です。そのために使われる代表的なテストフレームワークの1つが JUnit です。JUnitは、Javaアプリケーションの 単体テスト（ユニットテスト）を自動化するためのライブラリで、コードの動作を簡単に検証するためのツールです。

**なぜJUnitを使うのか？**
- 品質の確保：バグを早期に発見するため、JUnitを使ってコードの品質を保ちます。
- メンテナンスの簡便化：コードが修正された場合も、再度テストを実行することで影響を簡単にチェックできます。
- 時間の節約：手動でテストを行う代わりに、JUnitで自動的にテストできるため、開発の効率を上げます。

## 2. JUnitの基本用語
- テストケース：テストを行うためのコードのことです。JUnitでは通常、各テストケースは1つのメソッドとして定義されます。
- アサーション (Assertion)：特定の条件が成り立つかどうかを確認するコードです。例えば、「計算結果が期待通りか？」などを確認するために使います。
- テストスイート：複数のテストケースをまとめて1つのグループとして実行できるようにしたものです。

## 3 JUnitの準備
まず、JUnitを使うために JUnitライブラリ をプロジェクトに追加します。JUnitは一般的なJavaプロジェクトのビルドツール（MavenやGradle）で簡単に追加できます。
※ここでは追加は必要ありません。
※ビルドツールについては、後ほど別のカリキュラムで説明します。

### 3.1 MavenでJUnitを追加する方法
以下の依存関係を pom.xml に追加します
```java
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-engine</artifactId>
        <version>5.8.1</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

### 3.2 GradleでJUnitを追加する方法
build.gradle に以下を追加します
```java
dependencies {
    testImplementation 'org.junit.jupiter:junit-jupiter-engine:5.8.1'
}
```

## 4 JUnitの基本的な使い方
JUnitでテストを作成する際、以下のアノテーションを使用します。

- @Test：このアノテーションをつけることで、そのメソッドがテストであることを示します。
- @BeforeEach：各テストメソッドの実行前に呼び出される処理を定義します。
- @AfterEach：各テストメソッドの実行後に呼び出される処理を定義します。

### 4.1 基本的なテストの例
以下のように、Calculator クラスに対するテストを作成してみましょう。

1. まず、テスト対象の Calculator クラスを用意します。
```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
```

2. 次に、Calculator クラスをテストするためのJUnitテストクラスを作成します。
```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result); // 期待する結果が5かを確認
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result); // 期待する結果が2かを確認
    }
}
```
このコードでは、testAdd メソッドと testSubtract メソッドを使って、Calculator クラスの add メソッドと subtract メソッドのテストを行っています。
- assertEquals(expected, actual)：予想する結果と実際の結果が同じであることを確認します。


## 5 よく使われるアサーション
JUnitでは、以下のようなアサーションがよく使われます。

- assertEquals(expected, actual)：期待値と実際の値が等しいかを確認。
- assertNotEquals(unexpected, actual)：期待しない値と実際の値が異なることを確認。
- assertTrue(condition)：条件が true であるかを確認。
- assertFalse(condition)：条件が false であるかを確認。
- assertNull(object)：オブジェクトが null であるかを確認。
- assertNotNull(object)：オブジェクトが null でないことを確認。

## 6 テストの実行
JUnitで作成したテストを実行するには、IntelliJ IDEAを使ってテストを実行するのが一般的です。テストクラスまたはメソッドを右クリックして「Run」を選択すると、テストが実行され、成功・失敗が表示されます。

## 7 まとめ
JUnitは、Javaでテストを自動化するための非常に強力なツールです。初めてのテストケースでは、単純な計算の確認などから始め、慣れてきたら複雑なロジックのテストにも挑戦すると良いでしょう。JUnitの基本を押さえ、プロジェクトの品質向上に役立ててみてください。

