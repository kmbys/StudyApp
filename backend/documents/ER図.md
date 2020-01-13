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
    # study_id:CHAR [PK][FK(studies, id)]
    + id:CHAR(3) [PK]
    ==
    presenter:VARCHER
    resource_uri:VARCHER
    start:DATETIME
    end:DATETIME
}

studies --o{ sections
@enduml```
