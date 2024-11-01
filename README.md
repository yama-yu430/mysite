# ZennCLIの表示の仕方
クローンしたフォルダ内の以下のファイルをダブルクリックで実行する。
* macの場合：「preview.command」
* windowsの場合：「preview.bat」

ブラウザが立ち上がり、プレビューができる。

## 実行権限のエラーが出た時
1. ターミナルを起動

2. cdコマンドでクローンしたディレクトリに移動
例）
```
$ cd /Users/ユーザー名/Backend-wiki
```

3. 以下のコマンドでアクセス権を変更します。
```
$ chmod u+x xxx.command
```