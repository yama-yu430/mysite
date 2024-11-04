---
title: "08_カプセル化"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# Javaのカプセル化

## 1. カプセル化とは？

**カプセル化**は、オブジェクト指向プログラミング（OOP）の基礎概念の一つで、データ（フィールド）と、それに関連するメソッド（機能）を一つの単位（クラス）にまとめ、外部からのアクセスを制限する手法です。これにより、データの一貫性や安全性を保ちながら、クラスの使用方法を明確に定義できます。

### 1.1 カプセル化の目的
- **データの保護:** クラス内部のデータを直接外部から変更できないようにし、不正なデータ操作を防ぎます。
- **内部実装の隠蔽:** 外部に公開する必要のない詳細を隠し、クラスの利用者には必要最低限の操作のみを許可します。
- **保守性の向上:** クラスの内部構造を変更しても、外部からのインターフェースを維持することで、他の部分への影響を最小限に抑えます。

## 2. カプセル化の基本: アクセス修飾子

Javaでは、アクセス修飾子を使ってクラス、メソッド、フィールドのアクセス範囲を指定します。これがカプセル化の基本です。

### 2.1 アクセス修飾子の種類
- **`private`:** クラス内部からのみアクセス可能。データのカプセル化を実現するために最もよく使われます。
- **`default`（修飾子なし）:** 同じパッケージ内のクラスからのみアクセス可能。
- **`protected`:** 同じパッケージ内およびサブクラスからアクセス可能。
- **`public`:** どこからでもアクセス可能。カプセル化を実現するためには、必要最小限の部分のみ`public`にします。

### 2.2 基本的な例
次の例では、`Person`クラスを使ってカプセル化を説明します。

```java
public class Person {
    private String name;  // 名前フィールドは外部からアクセスできない
    private int age;      // 年齢フィールドも外部からアクセスできない

    // 名前を取得するためのpublicメソッド
    public String getName() {
        return name;
    }

    // 名前を設定するためのpublicメソッド
    public void setName(String name) {
        this.name = name;
    }

    // 年齢を取得するためのpublicメソッド
    public int getAge() {
        return age;
    }

    // 年齢を設定するためのpublicメソッド
    public void setAge(int age) {
        if (age >= 0) {  // 年齢が0以上の場合のみ設定
            this.age = age;
        }
    }
}
```
### 2.3 この例のポイント

- `name`と`age`は`private`として宣言されており、直接アクセスすることはできません。
- `getName()`や`setName()`のようなゲッターとセッターメソッドを使って、外部からデータにアクセス・変更が可能です。
- `setAge(int age)`メソッド内では、年齢が負の数でないことをチェックしており、これによりデータの一貫性が保たれます。

## 3. カプセル化のメリット

### 3.1 データの保護と制御
カプセル化により、クラスの外部から内部データに直接アクセスできなくなり、データが不正に操作されるのを防ぎます。例えば、年齢の値が負にならないようにするために、`setAge`メソッドでチェックを行うことができます。

```java
public void setAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("年齢は0以上でなければなりません。");
    }
    this.age = age;
}
```

### 3.2 クラスの再利用性
内部データの処理方法が変わっても、外部からのアクセス方法が変わらなければ、クラスを再利用することが容易になります。たとえば、`Person`クラスの内部で年齢のデータを管理する方式を変更したとしても、`getAge()`や`setAge()`メソッドがそのまま利用できるなら、他のクラスに影響はありません。

### 3.3 メンテナンス性の向上
クラスの内部実装を隠すことで、内部の処理を自由に変更できるため、バグの修正や新機能の追加がしやすくなります。外部に公開しているインターフェース（メソッドのシグネチャ）が変更されなければ、既存のコードに影響を与えずに修正できます。


## 4. さまざまなカプセル化の例

### 4.1 ゲッターとセッターを使わない完全なカプセル化
次の例では、内部データを全く外部に公開しないケースです。データの操作はすべてクラス内部で行われます。
```java
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```
- `balance`は`private`で保護されており、外部から直接操作できません。
- `deposit`と`withdraw`メソッドを使って、預金や引き出しができますが、不正な金額を操作しようとする行為を防ぎます。

### 4-2 不変クラス（イミュータブルクラス）でのカプセル化
カプセル化の応用として、不変クラス（Immutable Class）を作成することも可能です。これは、一度作成されたオブジェクトの状態が変わらないことを保証するクラスです。
```java
public final class ImmutablePerson {
    private final String name;
    private final int age;

    public ImmutablePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
```
** ポイント: **
- フィールドはすべて`final`であり、一度設定されたら変更されません。
- クラス自体も`final`であり、継承されることはありません。
- `ImmutablePerson`のインスタンスを作成した後、その状態は変更されません。

### 4.3 内部クラスでのカプセル化
内部クラスを使うことで、親クラスの一部のデータやメソッドをさらに細かく制御することができます。
```java
public class OuterClass {
    private String outerField = "Outer Field";

    // 内部クラス
    private class InnerClass {
        public void printOuterField() {
            System.out.println(outerField);  // 外部クラスのフィールドにアクセス可能
        }
    }

    public void createInner() {
        InnerClass inner = new InnerClass();
        inner.printOuterField();
    }
}
```
- `InnerClass`は`OuterClass`の内部にカプセル化されており、`OuterClass`のフィールドに直接アクセスできますが、外部からはアクセスできません。
- `InnerClassはOuterClass`の内部でのみ使われるため、`OuterClassの`一部の機能を隠蔽しつつ、内部での柔軟な操作が可能です。

## 5 まとめ
カプセル化は、Javaプログラムの安全性、再利用性、メンテナンス性を高めるための重要な手法です。データを保護し、外部に公開するインターフェースを明確に定義することで、健全で効率的なプログラムを作成することができます。さまざまな例を通じて、カプセル化の概念を理解し、実際のプログラムで活用してみましょう。
