# ER図

```uml
@startuml
ENTITY "studies" {
    + id:CHAR(12) [PK]
    ==
    place:VARCHER
    start:DATETIME
    end:DATETIME
}

ENTITY "sections" {
    # study_id:CHAR(12) [PK][FK(studies, id)]
    + id:CHAR(3) [PK]
    ==
    # presenter:VARCHER(255) [FK(accounts, email)]
    resource_uri:VARCHER
    start:DATETIME
    end:DATETIME
}

ENTITY "accounts" {
    + email:VARCHAR(255) [PK]
    ==
    display_name:VARCHAR(255)
    password_hash:VARCHAR(255)
}

studies --o{ sections
accounts --o{ sections
@enduml```
