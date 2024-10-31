---
title: "Spring Boot
"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: [introduction]
published: true
---
本カリキュラムでは、Java開発をする上での必要な環境を構築します。
環境を構築し、Java開発をするための準備をしましょう。

# 1. Spring Boot
Spring Bootとは、Spring Frameworkとも呼ばれ、「フレームワーク」の一種でJavaやKotlinを使ったアプリケーション開発に使用されるツールです。

フレームワークとは、ある特定のソフトウェアを対象にした再利用可能な設計プロダクトを構成するクラスの集合。
プログラマが書いた処理を必要に応じて呼びだす便利な枠組み。

フレームワークはアプリケーションのアーキテクチャーも形成します。
フレームワークを使うことによって、 よく使う機能はもちろん定型的な処理や設計の大枠なども自分で実装する必要がなくなります。 
つまり、アプリケーションの中身にだけ集中することができるということです。
フレームワークを使わないプログラミングでは、 アプリケーションの全体的な流れはプログラマが決定するが 、フレームワークを使ったソフトウェアでは、 プログラマがアプリケーション全体の流れを直接指定しないかわりに、フレームワークがプログラマが書いた処理を必要に応じて呼びだしてくれます。
WEBアプリからREST-API、バッチ機能まで幅広く利用できるフレームワーク


## 1-1. SpringBootの雛形をダウンロードする

  SpringBoot Initializerにアクセスする
  https://start.spring.io

　以下の画像と同様にチェックを入れる

「Add Dependencies」をクリックして「Spring Web」を追加する

「GENERATE」をクリックしてダウンロード開始

  ![altテキスト](/images/articles/30.png)

ダウンロードが完了したら、zipファイルを解凍して展開する

展開後IntelliJのプロジェクトが格納されている場所へファイルを移動させる

## 1-2. IntelliJでSpringBootを利用する

IntelliJを起動する

メニューから「開く」をクリックして、ダウンロードした「demoフォルダ」を開く

![altテキスト](/images/articles/31.png)

「New Window」で新しくウィンドウを開く

![altテキスト](/images/articles/32.png)

＊右下にローディング中の表示が出ると思うので終わるまでは待機してくだい

以下のソースを開いて画像と同様のソースが存在するか確認する
```
demo/src/main/java/com/example/demo

DemoApplication.java
```

エラーが発生している場合は、SpringBoot Initializerでの設定が出来てないか、intelliJでダウンロード出来てない可能性があるため、 再起動、再ビルド、フォルダ削除してやり直してみるなどの対応をしてみてください

![altテキスト](/images/articles/33.png)

## 1-2. 動作確認

DemoApplication.java　を実行し、SpringBootを起動させる

![altテキスト](/images/articles/34.png)

起動後、コンソール上に「Spring」の表示がされ、その後ログが9行程出力されます
「Started DemoApplication ~~」が表示されていることを確認してください

![altテキスト](/images/articles/35.png)

起動が確認出来たら、ブラウザで以下のURLを検索

![altテキスト](/images/articles/36.png)

ページが表示され、「Whitelabel Error Page」が表示されれば、正常起動となります

![altテキスト](/images/articles/37.png)

画面での確認が出来たら、intelliJに戻り、実行を停止する

![altテキスト](/images/articles/38.png)
