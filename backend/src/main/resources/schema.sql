CREATE TABLE studies (
    id CHAR(12),
    name VARCHAR(255) NOT NULL,
    place VARCHAR(255) NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    PRIMARY KEY(id)
);

CREATE TABLE accounts (
    email VARCHAR(255),
    display_name VARCHAR(255) NOT NULL,
    password_hash VARCHAR(255) NOT NULL,
    PRIMARY KEY (email)
);

CREATE TABLE sections (
    study_id CHAR(12),
    id CHAR(3),
    name VARCHAR(255) NOT NULL,
    presenter VARCHAR(255) NOT NULL,
    summary TEXT NOT NULL,
    resource_uri VARCHAR(255) NOT NULL,
    start_time DATETIME NOT NULL,
    end_time DATETIME NOT NULL,
    PRIMARY KEY(study_id, id),
    FOREIGN KEY(study_id) REFERENCES studies(id),
    FOREIGN KEY(presenter) REFERENCES accounts(email)
);
