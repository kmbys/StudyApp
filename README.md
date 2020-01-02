# 勉強会アプリ
### 開発手順
#### 1. docker-compose.yml内の以下の項目を修正する。（設定内容はredmineを参照）
- AWS_ACCESS_KEY_ID
- AWS_SECRET_ACCESS_KEY
#### 2. docker-compose up -d --build でコンテナを起動
#### 3. 以下のコマンドで各コンテナにログインすることができる。
- docker-compose exec ${コンテナ名} bash
#### 4. アプリの起動方法は以下。
- backend
    ##### cd StudyApp && sls offline start
- frontend
    ##### cd StudyApp && ng serve --host 0.0.0.0
#### 5. 開発を終了する際は、 docker-compose downでコンテナを停止
