---
title: "17_WebApplication"
emoji: "🖥"
type: "tech" # tech: 技術記事 / idea: アイデア
topics: [introduction]
published: true
---

# 1. WebApplication

WebApplicationとは、インターネット（ウェブ）などのネットワークから利用するアプリケーションソフトウェアです。
WEBアプリケーションを開発するにはHTMLだけではなくWEBプログラムを利用するためフレームワークを利用します。


## 1-1. Web

・WEBアプリケーション
WEBを介して利用するサービスを提供する

・WEBサービス
WEBアプリケーション開発のプログラムで利用されるAPIなど

・WEBシステム
WEBサイトやWEBアプリケーション、WEBサービスを提供される仕組み

  ![altテキスト](/images/articles/yuit-article_17/44.png)


## 1-2. MVCモデル


WEBアプリケーション開発において、「MVCモデル」という手法が現在では採択されています。 

「MVCモデル」とは、「Model」「View」「Controller」略した用語です。

「Model」　データと業務処理に関するソース

「View」　結果をユーザ(画面)に出力するソース

「Controller」　ユーザの命令(入力等)を受けて各部に指示を出すソース

上記のように大きく３つに分けて分業開発する仕組みのことをいいます。

MVCモデルを採択するメリットとしては、各要素毎で個別に開発が出来る点です。

これまでの開発では、複雑かつ大規模なソースに対しての改修や機能追加をする際に、他の要素への影響が起きたり、
エラーを原因を特定するのに時間がかかるなどの問題が容易に対応出来るようになりました。

![altテキスト](/images/articles/yuit-article_17/45.png)


