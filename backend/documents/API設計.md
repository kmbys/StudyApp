# API設計

## 勉強会一覧取得

### リクエスト
```
GET /studies/{勉強会ID}
```

### レスポンス

```
200 OK

{
    “name”: 勉強会名,
    “startTime”: 開始時刻,
    “endTime”: 終了時刻
    “sectionIds”: [
      セクションID1,
      セクションID2,
      …
    ]
}
```

## セクション一覧取得

### リクエスト

```
GET /studies/{勉強会ID}/sections/{セクションID}
```

### レスポンス

```
200 OK

{
    “name”: セクション名,
    “presenter”: 担当者名,
    “summary”: 概要,
    “resourceUri”: 資材のURI,
    “startTime”: 開始時間,
    “endTime”: 終了時刻
}
```
