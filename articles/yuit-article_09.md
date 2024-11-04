---
title: "09_継承"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: ["programming"]
published: true
---

# Javaの継承について

## 1. 継承とは？
**継承**（Inheritance）は、オブジェクト指向プログラミング（OOP）の重要な概念の一つです。継承を使うと、あるクラス（**親クラス**や**スーパークラス**と呼ばれる）から別のクラス（**子クラス**や**サブクラス**と呼ばれる）に、フィールドやメソッドを引き継ぐことができます。
これを例えると、継承は親から子への「財産や特性の相続」と似ています。たとえば、親が持っている「車」や「家」という財産（メソッドやフィールド）は、子も同じように使うことができる、というイメージです。

### 1.1 継承の基本的な仕組み
Javaでは、継承を使って新しいクラスを作成するために、`extends`というキーワードを使います。次に示すのは、その基本的な書き方です。

```java
class ParentClass {
    // 親クラスのフィールドやメソッド
}

class ChildClass extends ParentClass {
    // 子クラスのフィールドやメソッド
}
```
この例では、`ParentClass`が親クラスで、`ChildClass`が子クラスです。`ChildClass`は`ParentClass`のフィールドやメソッドを「継承」して使うことができます。

## 2. 継承を使った具体的な例

実際に、継承を使った具体的なコード例を見てみましょう。

### 2.1 例1: 動物クラスと犬クラス
```java
// 親クラス
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }
}

// 子クラス
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}
```
この例では、`Animal`という親クラスがあります。`Animal`クラスには、`name`というフィールドと、`eat()`というメソッドが定義されています。

`Dog`クラスは`Animal`クラスを継承しています。そのため、`Dog`クラスは`Animal`クラスの`name`フィールドと`eat()`メソッドを引き継いで使うことができます。

```java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Buddy";  // nameフィールドを使う
        myDog.eat();            // eat()メソッドを使う
        myDog.bark();           // bark()メソッドを使う
    }
}
```
このコードを実行すると、次のように表示されます。
```java
Buddy is eating.
Buddy is barking.
```
`myDog`という`Dog`クラスのオブジェクトが、`Animal`クラスのメソッド`eat()`を使えるのは、`Dog`クラスが`Animal`クラスを継承しているからです。


### 2.2 例2: 車クラスとスポーツカー

```java
// 親クラス
class Car {
    String model;
    int year;

    void drive() {
        System.out.println("Driving " + model + " (" + year + ").");
    }
}

// 子クラス
class SportsCar extends Car {
    boolean isTurbo;

    void activateTurbo() {
        if (isTurbo) {
            System.out.println("Turbo mode activated!");
        } else {
            System.out.println("This car does not have turbo.");
        }
    }
}
```
この例では、`Car`という親クラスがあり、`model`と`year`というフィールド、`drive()`というメソッドが定義されています。

`SportsCar`クラスは`Car`クラスを継承しており、さらに`isTurbo`というフィールドと`activateTurbo()`というメソッドを追加しています。
```java
public class Main {
    public static void main(String[] args) {
        SportsCar myCar = new SportsCar();
        myCar.model = "Ferrari";
        myCar.year = 2020;
        myCar.isTurbo = true;

        myCar.drive();          // Carクラスのdrive()メソッドを使う
        myCar.activateTurbo();  // SportsCarクラスのactivateTurbo()メソッドを使う
    }
}
```
このコードを実行すると、次のように表示されます。
```java
Driving Ferrari (2020).
Turbo mode activated!
```
このように、`SportsCar`クラスは`Car`クラスから継承された`drive()`メソッドを使いながら、自身の特有の機能である`activateTurbo()`メソッドも実行できます。



## 3 継承のメリット
継承を使うことで、以下のようなメリットがあります。

- **コードの再利用性**:継承によって、既存のコードを再利用できます。これにより、同じ機能を持つ複数のクラスを作る際に、一から書き直す必要がなくなります。
- **階層構造の整理**:クラスの階層構造を整理できます。親クラスに共通の機能を持たせ、子クラスに個別の機能を追加することで、コードの構造が明確になります。
- **保守性の向上**:親クラスに変更を加えるだけで、その変更がすべての子クラスに反映されるため、コードの保守がしやすくなります。

## 4. 継承に関する注意点
継承には便利な面が多いですが、注意点もあります。

- **Javaは単一継承**:Javaでは、あるクラスは一つの親クラスしか継承できません。複数のクラスを同時に継承することはできません（これを「単一継承」と言います）。
- **親クラスのコンストラクタの呼び出し**:子クラスを作る際には、親クラスのコンストラクタが自動的に呼び出されます。親クラスに特定のコンストラクタがある場合、子クラスでそのコンストラクタを明示的に呼び出す必要があります。
例）
```java
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // 親クラスのコンストラクタを呼び出す
    }
}
```

## 5 まとめ
継承は、Javaのオブジェクト指向プログラミングにおいて非常に強力なツールです。クラス間の関係を明確にし、コードの再利用性と保守性を高めることができます。ただし、適切に使わないとコードが複雑になりやすいため、設計時には注意が必要です。
