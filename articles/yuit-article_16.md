---
title: "16_Spring Boot"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: [introduction]
published: true
---

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

  ![altテキスト](/images/articles/yuit-article_16/30.png)

ダウンロードが完了したら、zipファイルを解凍して展開する

展開後IntelliJのプロジェクトが格納されている場所へファイルを移動させる

## 1-2. IntelliJでSpringBootを利用する

IntelliJを起動する

メニューから「開く」をクリックして、ダウンロードした「demoフォルダ」を開く

![altテキスト](/images/articles/yuit-article_16/31.png)

「New Window」で新しくウィンドウを開く

![altテキスト](/images/articles/yuit-article_16/32.png)

＊右下にローディング中の表示が出ると思うので終わるまでは待機してくだい

以下のソースを開いて画像と同様のソースが存在するか確認する
```
demo/src/main/java/com/example/demo

DemoApplication.java
```

エラーが発生している場合は、SpringBoot Initializerでの設定が出来てないか、intelliJでダウンロード出来てない可能性があるため、 再起動、再ビルド、フォルダ削除してやり直してみるなどの対応をしてみてください

![altテキスト](/images/articles/yuit-article_16/33.png)

## 1-2. 動作確認

DemoApplication.java　を実行し、SpringBootを起動させる

![altテキスト](/images/articles/yuit-article_16/34.png)

起動後、コンソール上に「Spring」の表示がされ、その後ログが9行程出力されます
「Started DemoApplication ~~」が表示されていることを確認してください

![altテキスト](/images/articles/yuit-article_16/35.png)

起動が確認出来たら、ブラウザで以下のURLを検索

![altテキスト](/images/articles/yuit-article_16/36.png)

ページが表示され、「Whitelabel Error Page」が表示されれば、正常起動となります

![altテキスト](/images/articles/yuit-article_16/37.png)

画面での確認が出来たら、intelliJに戻り、実行を停止する

![altテキスト](/images/articles/yuit-article_16/38.png)

## 1-2. SpringBoot使用方法

SpringBootをインストールするとライブラリにあらゆるjarファイルが追加されます。
それらをソースコード内でimportすることでアノテーション「@」が使用出来るようになります。

※　jarファイルとは「Java Archive」ファイルの略称で、Java開発で利用するファイルをまとめて保管しているファイル

使用方法としてはシンプルで、あらかじめ決められた文字列の先頭に「@」を記載するだけです。
使用できる便利な機能などはここでは簡単しか説明しないですが、ネットで調べると出でくるので気になる方は調べてみてください


クラスのフィールドに付与することで、使いたいオブジェクトをインスタンス化し、変数に設定してくれるアノテーション。
これにより、毎回newでインスタンス生成をせずにインスタンス(またはオブジェクト)を使用できるようになる。
```
@Autowired
```

@Autowiredとセットで使うアノテーション。
クラス定義の前に記載することで@Autowiredが使用できるようになる。
```
@Component
```

@Autowiredへ生成したインスタンスを渡すために、別の領域へ登録するアノテーション。
```
@Bean
```

@Beanとセットで使用するアノテーション。
クラス定義の前に記載することで@beanの登録ができるようになる。
```
@Configuration

```

Spring Bootの一般的なコントローラーとしてクラスを利用できるようにする。Thymeleafを利用する場合は＠RestControllerを利用する
```
@Controller
```

指定したパスにアクセスがあったときに、付与したメソッドを実行する
```
@RequestMapping("パス")
```

オーバライドをチェックする
```
@Override
```