chcp 65001
@echo off
set dirpath=%~dp0

cd /d %dirpath%

call "config/init.bat"

call "config/update.bat"

powershell -Command "$content = Get-Content -Raw -Path 'config/insert_win.txt'; $html = Get-Content -Raw -Path 'node_modules/zenn-cli/dist/client/index.html'; $html = $html -replace '</head>', $content; Set-Content -Path 'node_modules/zenn-cli/dist/client/index.html' -Value $html;"

cd node_modules\zenn-cli\dist\client\assets
powershell -Command "Get-ChildItem -Recurse -Filter *.js | ForEach-Object {(Get-Content -Raw -Path $_.FullName -Encoding UTF8) -replace 'defaultValue:\"modified\"', 'defaultValue:\"system\"' | Set-Content -Path $_.FullName -Encoding UTF8}"
cd %dirpath%

copy /Y config\images\favicon.png node_modules\zenn-cli\dist\client\favicon.png
copy /Y config\images\logo.svg node_modules\zenn-cli\dist\client\logo.svg

start npx zenn preview --port 8010 --open