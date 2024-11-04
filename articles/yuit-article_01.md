---
title: "01_環境構築"
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
    windows/mac　共通
    メモリ 2 GB以上の空き容量 (8 GB以上を推奨)


## 1-1. 事前準備
* jdkインルトール(JDK : Javaのコンパイルや実行に必要な基本ツール)

  まずはJDKがインストールがされているかどうか確認。

  (mac)ターミナルで以下のコマンドを実行

  (windows)コマンドプロンプトで以下のコマンドを実行

      javac -version

  以下からJDKをインストールする
  https://www.oracle.com/jp/java/technologies/downloads/#java8-mac
  windows...windowsタブをクリックして「x64 Installer」のURLでダウンロード
  ![altテキスト](/images/articles/yuit-article_01/1.png)
  mac...macタブをクリックして「x64 DMG Installer」のURLでダウンロード
  ![altテキスト](/images/articles/yuit-article_01//2.png)

## 1-2. sbtインストール(Homebrewを利用してインストールする方法)
WindowsはHomebrewのインストール不要。

まずはターミナル（Terminal.app）を開く。

Homebrewの公式サイトにアクセス。

掲載されているスクリプトをターミナルで実行することでHomebrewコマンドが利用できるようになる。

https://brew.sh/ja/
![altテキスト](/images/articles/yuit-article_01//5.png)


#### 1-2-1. sbtをインストール
ターミナルで以下を実行

    brew install sbt

#### 1-2-2. Java環境変数の設定

ターミナルを開き以下の手順を実行

Javaインストール先を確認

    /usr/libexec/java_home -V

Profileを編集

    vi ~/.bash_profile

#### 1-2-3. 環境変数を追加

以下４行をコピペし、「esc　→　:wq」　で編集終了。

    JAVA_HOME="/Library/Java/JavaVirtualMachines/jdk1.8.0_111.jdk/Contents/Home"
    export JAVA_HOME
    PATH=$PATH:$JAVA_HOME/bin
    export PATH

#### 1-2-4. 有効化

    source ~/.bash_profile
![altテキスト](/images/articles/yuit-article_01/6.png)

## 1-3. IntelliJ IDEA Community Editionインストール

以下のURLからintelliJをインストール。
macOSまたはWindowsのタブを選択し、Downloadをクリック。

https://www.jetbrains.com/idea/download/?section=mac#section=mac
![altテキスト](/images/articles/yuit-article_01/3.png)

自動でダウンロードが開始されない場合は「direct link」をクリックしてダウンロードを開始。

ダウンロード出来たらファイルを開く

「IntelliJ IDEA CE.app」のアイコンを 「Applications」 フォルダにドラッグしてインストールします。
![altテキスト](/images/articles/yuit-article_01/4.png)

セットアップ

初回起動時に「”IntelliJ IDEA CE.app”is an ~~~open it?」が表示された場合はopenをクリックし、起動を進める。

次に「Import IntelliJ IDEA Settings From...」のポップアップが表示されたらOKをクリック

初期インストールのツールの設定は無視してNextをクリック

初期画面でプラグインを選択

「Start using IntelliJ IDEA」をクリックすれば完了。

環境構築はここまでで完了です。

# 2. GitHub連携(clone)

intelliJでGitHubが利用出来るよう連携していきます。

intelliJを再起動します。

最初のプロジェクトを選択する画面で上部にある「Get from VCS」を選択する。

![altテキスト](/images/articles/yuit-article_01/8.png)

Version controlは「Git」を選択する。
URLはGitHubサイトからコピぺする。

![altテキスト](/images/articles/yuit-article_01/9.png)

URLはGitHubの「Java」ブランチから取得します。
「<>Code」のタブを選択し、ブランチは「main」を選択します。
緑色になっている「<>Code」をクリックし、「HTTPS」を選択します。
以下の画面になったら、URLの右側のアイコンをクリックし、コピーします。
intelliJに戻り、URLをペーストし、「Clone」をクリックする。

![altテキスト](/images/articles/yuit-article_01/10.png)

以下の画面になったら、「Use Token..」をクリックする。

![altテキスト](/images/articles/yuit-article_01/11.png)

TokenもGitHubサイトからコピペします。
「Generate...」をクリックするとGitHubサイトへ移行します。

![altテキスト](/images/articles/yuit-article_01/12.png)

以下の画面に移行しない場合は、右上の自身のアカウント(丸いアイコン)をクリックし、Settingsを選択します。
「Developer Settings」、「Personal access tokens」を選択する。
画像のように設定が完了したら、「Create Github App」をクリックする。

![altテキスト](/images/articles/yuit-article_01/13.png)

以下の画面は一度閉じてしまうと確認が出来なくなるため、tokenはメモ帳などに控えておきましょう。
青い箇所のtokenコードをコピーし、intelliJでペースト、「Login」します。

![altテキスト](/images/articles/yuit-article_01/14.png)

「Trust Project」をクリックすると完了となります。

![altテキスト](/images/articles/yuit-article_01/15.png)

# 3. 課題提出方法

## 3-1 IntelliJでレポジトリを切る

IntelliJ左下のブランチマークをクリックする。
「main」を右クリック、「New Branch form 'main'...」をクリックして、ブランチ名を記入して「Creat」で完了。

![altテキスト](/images/articles/yuit-article_01/22.png)
![altテキスト](/images/articles/yuit-article_01/23.png)

## 3-3 IntelliJでファイルを作成する(課題作成)

`Java/src`で右クリックし、New/Fileをクリックする。
![altテキスト](/images/articles/yuit-article_01/17.png)

ファイル名を記入する。
![altテキスト](/images/articles/yuit-article_01/18.png)

「Add」をクリックするとファイルが作成されます。
![altテキスト](/images/articles/yuit-article_01/19.png)

## 3-4 IntelliJで作成したソースの動作確認

`Java/src`で右クリックし、「Mark Directory as」をクリックし、「Sources Root」をクリックすると作成したソースにrun(再生マーク)のアイコンが表示されます。
![altテキスト](/images/articles/yuit-article_01/20.png)

Runのマークをクリックすることでソースの処理を確認することが出来ます。
![altテキスト](/images/articles/yuit-article_01/21.png)

また、画面下の箇所に処理のログが表示され、処理に不備がある場合はエラーも表示されます。

## 3-5 IntelliJでCommit、Pushする(課題提出)

IntelliJの左側で「commit」を選択する。
作成した提出用のソースにチェックを入れ、「Commit」をクリックする。

![altテキスト](/images/articles/yuit-article_01/24.png)

windowsでは左上のメニュー(4本線のアイコン)を選択し、「Git」をクリック、「Push」を選択する。

![altテキスト](/images/articles/yuit-article_01/25.png)

この画面で余計なファイルが入ってないか確認し、Pushをクリックで提出完了です。

![altテキスト](/images/articles/yuit-article_01/26.png)




