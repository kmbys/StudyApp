# ER Diagram

```uml
@startuml
ENTITY "studies" {
    + id:CHAR [PK]
    ==
    place:VARCHER
    date:DATE
    start:TIME
    end:TIME
}

ENTITY "presentations" {
    # study_id:CHAR [PK][FK(studies, id)]
    + id:CHAR [PK]
    ==
    presenter:VARCHER
    file_name:VARCHER
    start:TIME
    end:TIME
}

studies --o{ presentations
@enduml```
