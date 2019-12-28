# 勉強会アプリ
### 開発手順
#### 1. docker-compose.yml内の以下の項目を修正する。
- AWS_ACCESS_KEY_ID
- AWS_SECRET_ACCESS_KEY
#### 2. docker-compose build でコンテナをビルド
#### 3. docker-compose up -d でコンテナを起動
#### 4. 以下のコマンドで各コンテナにログインすることができる。
- docker-compose exec ${コンテナ名} bash
#### 5. アプリの起動方法は以下。
- backend
    ##### cd StudyApp && chalice local
- frontend
    ##### cd StudyApp && ng serve --host 0.0.0.0
