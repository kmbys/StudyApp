# ER図

```uml
@startuml
ENTITY "studies" {
    + id:CHAR(12) [PK]
    ==
    place:VARCHER
    start_time:DATETIME
    end_time:DATETIME
}

ENTITY "sections" {
    # study_id:CHAR(12) [PK][FK(studies, id)]
    + id:CHAR(3) [PK]
    ==
    # presenter:VARCHER(255) [FK(accounts, email)]
    resource_uri:VARCHER
    start_time:DATETIME
    end_time:DATETIME
}

ENTITY "accounts" {
    + email:VARCHAR(255) [PK]
    ==
    display_name:VARCHAR(255)
    password_hash:VARCHAR(255)
}

ENTITY "comments" {
    # study_id:CHAR(12) [PK][FK(sections, study_id)]
    # section_id:CHAR(3) [PK][FK(sections, id)]
    + id:CHAR(12) [PK]
    ==
    # author:VARCHAR(255) [FK(accounts, email)]
    post_time:DATETIME
    comment:VARCHAR
}

studies --o{ sections
accounts --o{ sections
sections --o{ comments
accounts --o{ comments
@enduml```
