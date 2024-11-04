---
title: "06_条件分岐"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

## 1 Javaにおける条件分岐

Javaでは、プログラムの実行フローを制御するために条件分岐が使用されます。条件分岐を使用すると、特定の条件が満たされた場合にのみコードを実行し、そうでない場合には異なるコードを実行することが可能になります。

Javaでよく使用される条件分岐には、以下のものがあります:

- `if`文
- `else`文
- `else if`文
- `switch`文
- 条件演算子（`?:`）

### 1.1 `if`文

`if`文は、最も基本的な条件分岐です。指定された条件に一致した場合（`true`の場合）に、コードブロックを実行します。`if`文は以下のように使用します。

```java
int num = 10;

if (num > 5) {
    System.out.println("numは5より大きいです。");
}
```
上記の例では、numが5より大きいため、if文の中のコードが実行されます。

### 1.2 `else`文

`else`文は、`if`文の条件が一致しない場合（`false`である場合）に実行されるコードブロックを指定するために使用します。これにより、条件が満たされない場合でも、別のアクションを取ることができます。

```java
int num = 3;

if (num > 5) {
    System.out.println("numは5より大きいです。");
} else {
    System.out.println("numは5以下です。");
}
```
### 1.3 `else if`文

`else if`文を使用すると、複数の条件を順番にチェックすることができます。これにより、複数の異なる条件に基づいて、異なる処理を行うことが可能です。

```java
int num = 5;

if (num > 5) {
    System.out.println("numは5より大きいです。");
} else if (num == 5) {
    System.out.println("numは5です。");
} else {
    System.out.println("numは5より小さいです。");
}
```
この例では、numが5と等しいため、else ifブロックのコードが実行されます。

### 1.4 `switch`文
`switch`文は、特定の変数の値に基づいて複数の分岐を行うために使用されます。これは、`if-else`, `if`文の代わりとして使われることがあり、特に複数の値に対して異なる処理を行う場合に便利です。

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("日曜日");
        break;
    case 2:
        System.out.println("月曜日");
        break;
    case 3:
        System.out.println("火曜日");
        break;
    default:
        System.out.println("無効な日です。");
        break;
}
```

この例では、dayが3であるため、"火曜日"が出力されます。`switch`文では、caseごとに`break`文を使用して、次のcaseに処理が流れないようにします。`default`ブロックは、どのcaseにも該当しない場合に実行されます。

### 1.5 条件演算子`（?:）`
Javaには、条件分岐を簡潔に表現するための条件演算子`（?:）`があります。この演算子は、if-else文の代わりとして使用でき、1行で条件分岐を記述できるため、コードが簡潔になります。

```java
int num = 8;
String result = (num > 5) ? "numは5より大きいです。" : "numは5以下です。";
System.out.println(result);
```

この例では、`num`が5より大きいため、「`num`は5より大きいです。」が`result`に代入され、出力されます。
Javaの条件分岐を正しく使用することで、プログラムの実行フローを細かく制御でき、複雑なロジックをシンプルに実現することができます。これにより、プログラムがさまざまな状況に柔軟に対応できるようになります。

