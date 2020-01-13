# docker-swagger


## ディレクトリ構成
```
.
backend
├── README.md
├── nginx
│   └── default.conf
└── swagger
    └── openapi.yml
```


## 概要
`Docker`より、下記のコンテナを起動する。

- `swagger-editor`  
`swagger-spec`を編集

- `swagger-ui`  
`swagger-spec`をドキュメントとして表示

- swagger-api (`apisprout`)  
`example`を利用したレスポンスを返してくれるモック
- swagger-nginx  
apisproutがヘッダーに`Access-Control-Allow-Origin`を付けてくれないので、前段にnginxを置き、ヘッダーを付与してAPIにプロキシしています。  
(他ドメインからAPIにアクセスできないと不便なので。`CORS`対策。)


## 起動方法
1. `Docker`の起動
```
$ docker-compose up -d
```

2. `Docker`のプロセスを確認
```
$ docker ps
```
```
PORTS                     NAMES
0.0.0.0:8081->8080/tcp    swagger-editor
0.0.0.0:8082->8080/tcp    swagger-ui
0.0.0.0:8083->8000/tcp    swagger-api
0.0.0.0:8084->8084/tcp    swagger-nginx
```

2. `swagger-ui`の起動
```
$ open http://localhost:8082
```


## 編集方法

### `swagger-editor`を使う場合

1. `swagger-editor`の起動
```
$ open http://localhost:8081
```

2. `openapi.yaml`を読み込む
```
File > Import File > ファイルを選択 > swagger/openapi.yml
```

3. `swagger-editor`で編集を行う

4. 編集結果をダウンロードする
```
File > Save as Yaml
```

5. `swagger/openapi.yaml`と置き換える

6. コンテナの再起動
```
$ docker-compose restart
```


### `VSCode`を使う場合

1. EXTENSIONから、`Swagger Viewer`をインストール

2. `Shift + Alt + P` より、Previewを表示

3. `VSCode`で編集を行う

4. 編集結果を保存する

5. コンテナの再起動
```
$ docker-compose restart
```


## モックの動作確認

1. ユーザ一覧を表示
```
$ curl -i http://localhost:8084/users
```
```yml
HTTP/1.1 200 OK
Server: nginx/1.15.8
Date: Mon, 31 Dec 2018 11:23:45 GMT
Content-Type: application/json
Content-Length: 84
Connection: keep-alive
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: POST, GET, PATCH, DELETE, PUT, OPTIONS
Access-Control-Allow-Headers: Origin, Authorization, Accept
Access-Control-Allow-Credentials: true
```
```json
[
  {
    "id": 1,
    "name": "John"
  },
  {
    "id": 2,
    "name": "Yuki"
  }
]
```

2. IDが1のユーザを表示
```
curl -i http://localhost:8084/users/1
```
```yml
HTTP/1.1 200 OK
Server: nginx/1.15.8
Date: Mon, 31 Dec 2018 11:24:39 GMT
Content-Type: application/json
Content-Length: 31
Connection: keep-alive
Access-Control-Allow-Origin: *
Access-Control-Allow-Methods: POST, GET, PATCH, DELETE, PUT, OPTIONS
Access-Control-Allow-Headers: Origin, Authorization, Accept
Access-Control-Allow-Credentials: true
```
```json
{
  "id": 1,
  "name": "John"
}
```


## 参考サイト
- https://qiita.com/matsuda_chikara/items/a4119a972535a4b69201
- https://windii.jp/tool/swagger
