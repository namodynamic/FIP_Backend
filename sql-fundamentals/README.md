# Flexi Database - SQL Fundamentals

## Overview

This project demonstrates basic SQL database creation and CRUD (Create, Read, Update, Delete) operations using a simple employee/user management system called "Flexi".

## Database Structure

### Database: `flexi`

The database contains a single table with user information.

### Table: `flexi`

| Column     | Type         | Constraints   | Description                    |
|------------|--------------|---------------|--------------------------------|
| id         | INT          | PRIMARY KEY   | Unique identifier for each record |
| firstname  | VARCHAR(100) | -             | User's first name              |
| lastname   | VARCHAR(100) | -             | User's last name               |
| address    | TEXT         | -             | User's full address            |
| occupation | VARCHAR(100) | -             | User's job title/occupation    |
| date       | DATE         | -             | Associated date (hire/join date) |

## Files

### 1. `create_flexi_database.sql`

Creates the database and table structure.

**Operations:**

- Creates the `flexi` database

- Switches to the `flexi` database
- Creates the `flexi` table with appropriate columns and data types

### 2. `flexi_operations.sql`

Contains CRUD operations on the flexi table.

## Operations Demonstrated

### CREATE (INSERT)
- **Single record insertion**: Adds one user record
- **Multiple record insertion**: Adds multiple users in a single statement

### READ (SELECT)

- **Select all records**: `SELECT * FROM flexi`
- **Select specific columns**: `SELECT id, firstname, lastname, occupation FROM flexi`
- **Conditional selection**: `SELECT * FROM flexi WHERE occupation LIKE '%Engineer%'`
- **Aggregate functions**: `SELECT COUNT(*) as total_records FROM flexi`

### UPDATE

- **Single field update**: Updates occupation for a specific ID
- **Multiple field update**: Updates both address and occupation for a specific user
- **Conditional update**: Updates date for all records matching a pattern

### DELETE

- **Delete by ID**: Removes record with specific ID
- **Delete by condition**: Removes records matching specific criteria
- **Delete null records**: Removes records where address is NULL
- **Delete all records**: Removes all records from the table

## Usage Instructions

### 1. Database Setup

```sql
-- Run the database creation script
mysql -u [username] -p < create_flexi_database.sql
```

### 2. Execute Operations

```sql
-- Run the operations script
mysql -u [username] -p flexi < flexi_operations.sql
```

### 3. Interactive Usage

```sql
-- Connect to MySQL
mysql -u [username] -p

-- Use the flexi database
USE flexi;

-- Execute any of the operations from flexi_operations.sql
```

## Sample Data

The operations file includes sample data for:

- John Doe (Software Engineer → Senior Software Engineer → Lead Developer)
- Jane Smith (Data Analyst)
- Mike Johnson (Project Manager)
- Sarah Wilson (Designer)

## Key SQL Concepts Demonstrated

1. **Database and Table Creation**
2. **Data Types** (INT, VARCHAR, TEXT, DATE)
3. **Primary Key Constraints**
4. **INSERT Operations** (single and bulk)
5. **SELECT Queries** (basic, conditional, aggregate)
6. **UPDATE Operations** (single and multiple fields)
7. **DELETE Operations** (by ID, condition, NULL values)
8. **Pattern Matching** with LIKE operator
9. **Aggregate Functions** (COUNT)

## Prerequisites

- MySQL server installed and running
- MySQL client or compatible database management tool
- Appropriate database user permissions

## Notes

- Remember to replace `[username]` with your actual MySQL username
- Ensure proper backup procedures before running DELETE operations in production
- The sample data is for demonstration purposes only
