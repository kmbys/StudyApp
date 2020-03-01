# ER図

```uml
@startuml
ENTITY "studies" {
    + id:CHAR(12) [PK]
    ==
    name:VARCHER(255) NOT NULL
    place:VARCHER(255) NOT NULL
    start_time:DATETIME NOT NULL
    end_time:DATETIME NOT NULL
}

ENTITY "sections" {
    # study_id:CHAR(12) [PK][FK(studies, id)]
    + id:CHAR(3) [PK]
    ==
    name:VARCHER(255) NOT NULL
    # presenter:VARCHER(255) NOT NULL [FK(accounts, email)] 
    summary:TEXT NOT NULL
    resource_uri:VARCHER(255) NOT NULL
    start_time:DATETIME NOT NULL
    end_time:DATETIME NOT NULL
}

ENTITY "accounts" {
    + email:VARCHAR(255) [PK]
    ==
    display_name:VARCHAR(255) NOT NULL
    password_hash:VARCHAR(255) NOT NULL
}

ENTITY "comments" {
    # study_id:CHAR(12) [PK][FK(sections, study_id)]
    # section_id:CHAR(3) [PK][FK(sections, id)]
    + id:CHAR(12) [PK]
    ==
    # author:VARCHAR(255) NOT NULL [FK(accounts, email)]
    post_time:DATETIME NOT NULL
    comment:TEXT NOT NULL
}

studies --o{ sections
accounts --o{ sections
sections --o{ comments
accounts --o{ comments
@enduml```
