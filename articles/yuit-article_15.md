---
title: "15_Maven"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: [introduction]
published: true
---

# 1. Maven

## ・Mavenとは

「Maven」とは、要するにJavaプログラムをビルドするためのツールです。
コンパイルの前後に依存するライブラリを自動で追加して揃えたりしてくれるツールです。
事前にmavenの設定しておくことで、これまで手動で行っていたインストール作業やバージョンアップ等をビルドをするタイミングで自動的させることが可能になります。
mavenを設定するにはpom.xmlというファイルを編集することで設定を変更、追加することできます。

ビルドとは、人間が書いたソースコードをコンピュータが実行できる形式に変換し、実行可能なプログラムを作成するプロセス全体のことです。

## Mavenをインストール(Windows)

Maven本体をダウンロードします。


https://maven.apache.org

![altテキスト](/images/articles/yuit-article_15/28.png)

Version:
apache-maven-3.9.9-bin.zipを選択する。

![altテキスト](/images/articles/yuit-article_15/29.png)

ダウンロード後、ZIPファイルを適当な場所に展開します。
パスがわかりづらい場合は、フォルダを新たに作成し展開する。

## Apache Mavenの設定

環境変数を設定します。

以下のコマンドをコマンドプロンプトで実行する
「”C:\〜〜〜”」内は自身でMavenを展開したパスに書き換える

```
setx /M Path "C:\tools\apache-maven-3.9.6\bin;%Path%"
```
cmdでmvnコマンドでバージョンを確認して完了です。

$ mvn -version


## ・Macでのインスール


Homebrewがインストールされているか以下のコマンドで確認する。
HomebrewとはmacOS用のパッケージマネージャーです。(AppleStoreのようなもの)
PCに入れたいソフトのインストールの手間が大幅に省けます。

```
brew --version

Homebrew 4.4.0
```

インストールがされていない場合は以下のコマンドを実行する。

```
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
```


Mavenをインストールする。

Mavenがインストールされていないことを確認し、
以下のログが出ることを確認する。

```
mvn -v

zsh: command not found: mvn
```

以下のコマンドを実行し、インストール可能かどうか確認し、ログが確認できればインストールを実行する。

```
brew search maven 


==> Formulae
maven               maven-completion    maven-shell         raven

==> Casks
font-maven-pro             marvel                     mauve
font-maven-pro-vf-beta     marvin                     mavensmate

```

インストールの実行

```
brew install maven
```

インストール完了が確認出来たら、反映されていることを確認する

```
mvn -v

Apache Maven 3.9.9 (8e8579a9e76f7d015ee5ec7bfcdc97d260186937)
```

## Mavenビルド

Mavenインストールが完了したら、intelliJで動作するか確認します

intelliJを開き、「New Project」で画像のように設定し、「Create」をクリック

![altテキスト](/images/articles/yuit-article_15/39.png)

intelliJが起動したら、画面右に「M」のアイコンが追加されているのでクリック

以下の順に展開し、「compile」を右クリック
```
test/Lifecycle/compile
```
![altテキスト](/images/articles/yuit-article_15/40.png)


「Run Maven Build」を実行し、コンソールにエラーが表示されなければ、正常動作として完了となります

![altテキスト](/images/articles/yuit-article_15/41.png)

✅が正常の表示となります。

![altテキスト](/images/articles/yuit-article_15/42.png)


## Mavenの設定

Mavenを設定する際に設定を記載するPom.xmlファイルというものがあります

Pom.xml

![altテキスト](/images/articles/yuit-article_15/43.png)

画像のようにファイル内に設定内容が記載されています
このファイルはMavenをインストールすると自動生成されます

以下で内容について軽く触れていきます

設定する際はパッケージごとにタグ内の内容を記載して設定します。

記載内容についてはタグの内容を確認するれば、およその検討はつくと思うので概要を把握する程度で良いです

#### Pom.xml記載方法
設定を記載する際はソースの始まりに 「project」 タグを記述します

その中には、少なくとも以下の次の４つのタグを記述する必要があります
```
<modelVersion>
<groupId>
<artifactId>
<version>
```
「modelVersion」はPOMのバージョンであり、基本的に変わらない為、雛形としてそのまま記載する。

```
<modelVersion>4.0.0</modelVersion>
```

大元(親)の設定
```
<!-- 親の設定 -->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>3.3.5</version>
		<relativePath/> <!-- lookup parent from repository -->
	</parent>
```
基本的に「parent」タグ内に記載されている内容は変更、追加、削除はしません

「groupId」、「artifactId」、「version」の３つは、プロジェクトを一意に識別するための情報です。

パッケージのID
```
<groupId> ... </groupId>
<artifactId> ... </artifactId>
```
ここではSpringが提供している「springframework」のパッケージ設定がされており、それに関する機能が利用できるようになっています

「groupId」パッケージ、「artifactId」設定対象の詳細といったイメージです。

バージョン
```
<version> ... </version>
```
バージョンによって設定されている機能の制限がある為、状況に応じて数値を変更させます
開発中のバージョンには末尾に「-SNAPSHOT」のプレフィックスがつく。

```
<version>1.0.0-SNAPSHOT</version>
```

パスの設定
```
<relativePath/>
```

依存関係の設定
```
<!-- 依存関係 -->
<dependencies>
	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-web</artifactId>
	</dependency>

	<dependency>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-test</artifactId>
		<scope>test</scope>
	</dependency>
</dependencies>
```
ここで依存を追加することにより細かい機能を利用できるようにしています。
「parent」では親パッケージを設定しており、「dependencies」でその中の機能を指定しています。
```
parent：spring-boot-starter-parent //springbootの起動設定

dependencies：spring-boot-starter-web //springbootのweb起動の設定
```

ビルドの設定
```
<build>
	<plugins>
		<plugin>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-maven-plugin</artifactId>
		</plugin>
	</plugins>
</build>
```

プラグインの設定
```
<plugins> ... </plugins>
```
拡張機能の設定です。

コメント
```
<!-- comment -->
```
コメントを記載する際には上記のように記載します。

変数

```
${ ... }

${project.groupId}
```
紹介した画像にはないですが、Pom.xmlでも変数の記載が可能です。「${}」内に利用したい値のパスを「.」で連結して記載します。

現場によって設定されている内容は異なる為、現場での仕様書や指示にしたがってください。

そのため詳細な内容については割愛します。

以上がPom.xmlの概要です。

