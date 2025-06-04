# Java Date and Time Utilities

A collection of Java programs that demonstrate working with dates and times using the Java Time API.

## Overview

This repository contains three Java programs that perform various date and time operations:

1. **MonthLengthCalculator**: Reports the length of each month within a given year
2. **MondayFinder**: Lists all Mondays in a given month of the current year
3. **FridayThirteenthChecker**: Tests whether a given date falls on Friday the 13th

All programs use the modern Java Time API (java.time package) for accurate date and time handling.

## Requirements

- Java 8 or higher (programs use the Java Time API)
- Java Development Kit (JDK) for compilation

## Programs

### 1. MonthLengthCalculator

**Description:**  
This program takes a year as input and displays the length of each month within that year. It correctly handles leap years, showing February with 29 days in leap years.

**How to Run:**

```bash

# Compile the program
javac MonthLengthCalculator.java

# Run the program
java MonthLengthCalculator
```

**Example Output:**

```bash

Enter a year: 2024

Year: 2024
Is leap year: true

Month Lengths:
------------------
JANUARY     : 31 days
FEBRUARY    : 29 days
MARCH       : 31 days
APRIL       : 30 days
MAY         : 31 days
JUNE        : 30 days
JULY        : 31 days
AUGUST      : 31 days
SEPTEMBER   : 30 days
OCTOBER     : 31 days
NOVEMBER    : 30 days
DECEMBER    : 31 days
```

### 2. MondayFinder

**Description:**  
This program takes a month input (1-12) and finds all dates that fall on a Monday within that month of the current year. It displays these dates in a formatted manner.

**How to Run:**

```bash
# Compile the program
javac MondayFinder.java

# Run the program
java MondayFinder
```

**Example Output:**

```bash

Enter a month (1-12): 6

Mondays in June 2025:
----------------------------------------
1. Monday, June 2, 2025
2. Monday, June 9, 2025
3. Monday, June 16, 2025
4. Monday, June 23, 2025
5. Monday, June 30, 2025

Total Mondays in June 2025: 5
```

### 3. FridayThirteenthChecker

**Description:**  
This program checks if a given date falls on Friday the 13th. It takes a date input in YYYY-MM-DD format, validates it, and provides a clear response.

**How to Run:**

```bash
# Compile the program
javac FridayThirteenthChecker.java

# Run the program
java FridayThirteenthChecker
```

**Example Output:**

For a Friday the 13th:

```bash
Enter a date (YYYY-MM-DD): 2024-09-13

Date: Friday, September 13, 2024
This date IS Friday the 13th!
```

For a non-Friday the 13th:

```bash
Enter a date (YYYY-MM-DD): 2025-10-13

Date: Monday, October 13, 2025
This date is NOT Friday the 13th.
It's the 13th, but not a Friday.
```

## Features

- **Input Validation**: All programs include proper input validation and error handling
- **Modern API**: Uses Java Time API for accurate date and time handling
- **User-Friendly Output**: Clear, formatted output that is easy to read
- **Well-Documented Code**: Includes descriptive comments and Javadoc

## Implementation Details

These programs demonstrate several important Java Time API concepts:

- Working with `LocalDate` for date representation
- Using `Month` and `DayOfWeek` enums
- Date parsing and formatting with `DateTimeFormatter`
- Date calculations and manipulations
- Leap year detection

Each program is designed to be self-contained and includes detailed comments to explain the implementation.
