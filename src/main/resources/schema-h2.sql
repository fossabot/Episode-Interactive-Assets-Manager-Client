-- Create required tables

CREATE TABLE IF NOT EXISTS PUBLIC.STORY_DETAILS (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	STORY_NAME VARCHAR(100) NOT NULL,
	STORY_DESCRIPTION VARCHAR(180) NOT NULL,
	STORY_URL VARCHAR(255) NOT NULL
);