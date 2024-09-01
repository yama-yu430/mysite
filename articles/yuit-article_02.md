---
title: "環境構築"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: [introduction]
published: true
---
本カリキュラムでは、Java開発をする上での必要な環境を構築します。
環境を構築し、Java開発をするための準備をしましょう。

# 1. 環境構築
* インストールする際の注意点

IntelliJ IDEAをインストールする環境には以下が必要です。

    macOS 10.11 or later
    メモリ 2 GB以上の空き容量 (8 GB以上を推奨)


## 1-1. 事前準備
* jdkインルトール(JDK : Javaのコンパイルや実行に必要な基本ツール)

  まずはJDKがインストールがされているかどうか確認。

  ターミナルで以下のコマンドを実行

      javac -version

  URLが出ない場合は以下からインスール
  https://www.oracle.com/jp/java/technologies/downloads/#java8-mac
  ![altテキスト](/images/articles/1.png)
  ![altテキスト](/images/articles/2.png)

## 1-2. sbtインストール(Homebrewを利用してインストールする方法)
  まずはターミナル（Terminal.app）を開く。

  Homebrewの公式サイトにアクセス。

  掲載されているスクリプトをターミナルで実行することでHomebrewコマンドが利用できるようになる。

  https://brew.sh/ja/
  ![altテキスト](/images/articles/5.png)


  #### 1. sbtをインストール
  ターミナルで以下を実行

    brew install sbt

  #### 2. Java環境変数の設定

  ターミナルを開き以下の手順を実行

  Javaインストール先を確認

    /usr/libexec/java_home -V

  Profileを編集

    vi ~/.bash_profile

  #### 3. 環境変数を追加

  以下４行をコピペし、「esc　→　:wq」　で編集終了。

    JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home"
    export JAVA_HOME
    PATH=$PATH:$JAVA_HOME/bin
    export PATH

  #### 4. 有効化

    source ~/.bash_profile
![altテキスト](/images/articles/6.png)

## 2-1. IntelliJ IDEA Community Editionインストール
https://www.jetbrains.com/idea/download/?section=mac#section=mac
![altテキスト](/images/articles/3.png)

自動でダウンロードが開始されない場合は「direct link」をクリックしてダウンロードを開始。

ダウンロード出来たらファイルを開く

「IntelliJ IDEA CE.app」のアイコンを 「Applications」 フォルダにドラッグしてインストールします。
![altテキスト](/images/articles/4.png)

セットアップ

初回起動時に「”IntelliJ IDEA CE.app”is an ~~~open it?」が表示された場合はopenをクリックし、起動を進める。

次に「Import IntelliJ IDEA Settings From...」のポップアップが表示されたらOKをクリック

初期インストールのツールの設定は無視してNextをクリック

初期画面でプラグインを選択

「Scala」プラグインのインストールをクリックし、「Start using IntelliJ IDEA」をクリックすれば完了。

環境構築はここまでで完了です。

## 2-2. 動作確認
動作確認では、Scalaの開発環境を利用して確認します。

  #### 1. ターミナルを開き以下のコマンドを実行する(Scalaのプロジェクトを作成する)


    sbt new scala/scala-seed.g8

  任意の名前を要求される為、入力する。(ここでは「helloworld」とする)

    name [Scala Seed Project]: helloworld

  コマンドが完了すると「helloworld」ディレクトリが生成される。

  #### 2. ScalaプロジェクトをIntelliJで開く(インポートする)

  デスクトップからIntelliJを起動し、Openをクリック

  Scala環境で作成したディレクトリを選択し、次のインポート設定画面ではOKをクリック。

  Not Empty Folder(上書きの確認)という表示が出てきますので、Yesをクリックするとプロジェクトが開く。

  #### 3. プログラムをsbtシェルで実行してみる

  プロジェクトが開いたら、左下の「sbt shell」をクリックしてsbt shellを開く。

  sbt shellで、以下を実行し、コンソールに「hello」と表示されれば成功。

    run com.example.HelloWorld
  ![altテキスト](/images/articles/7.png)

  動作確認はこれで完了です。


