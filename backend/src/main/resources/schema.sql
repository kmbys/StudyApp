CREATE TABLE studies (
  id CHAR(12),
  name VARCHAR(255),
  place VARCHAR(255),
  start_time DATETIME,
  end_time DATETIME,
  PRIMARY KEY(id)
);

CREATE TABLE accounts (
  email VARCHAR(255),
  display_name VARCHAR(255),
  password_hash VARCHAR(255),
  PRIMARY KEY (email)
);

CREATE TABLE sections (
  study_id CHAR(12),
  id CHAR(3),
  name VARCHAR(255),
  presenter VARCHAR(255),
  summary TEXT,
  resource_uri VARCHAR(255),
  start_time DATETIME,
  end_time DATETIME,
  PRIMARY KEY(study_id, id),
  FOREIGN KEY(study_id) REFERENCES studies(id),
  FOREIGN KEY(presenter) REFERENCES accounts(email)
);
