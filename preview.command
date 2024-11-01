#!/bin/bash
# 作業ディレクトリの移動
cd `dirname $0`

# リポジトリ更新
git pull

# ZennCLIの最新化
npm init -y
npm install zenn-cli@latest

# index.htmlにカスタムCSSの追加
sed -i '' "s/<\/head>/$(cat config/insert_mac.txt)/g" node_modules/zenn-cli/dist/client/index.html

# メニューのデフォルトの並び順の変更
find . -type f -name "*.js" -exec sed -i '' "s/defaultValue:\"modified\"/defaultValue:\"system\"/g" {} +

# 画像変更
cp -f config/images/favicon.png node_modules/zenn-cli/dist/client/favicon.png
cp -f config/images/logo.svg node_modules/zenn-cli/dist/client/logo.svg

# ZennCLI起動
npx zenn preview --port 8010 --open