USE flexi;

INSERT INTO flexi (firstname, lastname, address, occupation, date) 
VALUES ('John', 'Doe', '123 Main St, New York, NY', 'Software Engineer', '2025-01-15');

INSERT INTO flexi (firstname, lastname, address, occupation, date) 
VALUES 
    ('Jane', 'Smith', '456 Oak Ave, Los Angeles, CA', 'Data Analyst', '2025-02-20'),
    ('Mike', 'Johnson', '789 Pine Rd, Chicago, IL', 'Project Manager', '2025-03-10'),
    ('Sarah', 'Wilson', '321 Elm St, Houston, TX', 'Designer', '2025-04-05');

UPDATE flexi 
SET occupation = 'Senior Software Engineer' 
WHERE id = 1;

UPDATE flexi 
SET address = '999 Broadway, New York, NY', 
    occupation = 'Lead Developer' 
WHERE firstname = 'John' AND lastname = 'Doe';

UPDATE flexi 
SET date = '2025-06-01' 
WHERE occupation LIKE '%Engineer%';


DELETE FROM flexi WHERE id = 3;

DELETE FROM flexi WHERE occupation = 'Designer';

DELETE FROM flexi WHERE address IS NULL;

-- delete all records
SELECT * FROM flexi;

SELECT id, firstname, lastname, occupation FROM flexi;

SELECT * FROM flexi WHERE occupation LIKE '%Engineer%';

SELECT COUNT(*) as total_records FROM flexi;
