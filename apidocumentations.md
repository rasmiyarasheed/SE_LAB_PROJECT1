# SE Lab Project API Documentation

## Authentication

### Login

- **Endpoint:** `POST /login`
- **Description:** Authenticate a user.
- **Request:**
  - **Parameters:**
    - `username` (String, required) - User's username.
    - `password` (String, required) - User's password.
- **Response:**
  - **Success:**
    - **Code:** 302 Found
    - **Redirect:** `/dashboard` on successful login.
  - **Error:**
    - **Code:** 200 OK
    - **Body:** JSON with error message if authentication fails.

## User Management

### Register

- **Endpoint:** `GET /register`
- **Description:** Display the registration form.
- **Request:**
  - None.
- **Response:**
  - **Success:**
    - **Code:** 200 OK
    - **Body:** HTML form for user registration.

- **Endpoint:** `POST /register`
- **Description:** Register a new user.
- **Request:**
  - **Parameters:**
    - `lname` (String, required) - Last name of the user.
    - `email` (String, required) - Email address of the user.
    - `password` (String, required) - Password for the user.
    - `dob` (String, required) - Date of birth of the user.
    - `phone` (String, required) - Phone number of the user.
    - `tandc` (String, optional) - Terms and conditions acceptance text.
    - `consent` (Boolean, required) - User's consent to terms and conditions.
- **Response:**
  - **Success:**
    - **Code:** 302 Found
    - **Redirect:** `/` on successful registration.
  - **Error:**
    - **Code:** 200 OK
    - **Body:** HTML form with error messages if registration fails.

## Dashboard

### Home

- **Endpoint:** `GET /dashboard`
- **Description:** Display the user's dashboard.
- **Request:**
  - None.
- **Response:**
  - **Success:**
    - **Code:** 200 OK
    - **Body:** HTML page displaying user dashboard.

## Paper Review

### Reviewers

- **Endpoint:** `GET /reviewers`
- **Description:** Display a list of reviewers.
- **Request:**
  - None.
- **Response:**
  - **Success:**
    - **Code:** 200 OK
    - **Body:** HTML page displaying a list of reviewers.

### Accepted Papers

- **Endpoint:** `GET /accepted`
- **Description:** Display a list of accepted papers.
- **Request:**
  - None.
- **Response:**
    - **Code:** 200 OK
    - **Body:** HTML page displaying a list of accepted papers.

### Rejected Papers

- **Endpoint:** `GET /rejectedpapers`
- **Description:** Display a list of rejected papers.
- **Request:**
  - None.
- **Response:**
    - **Code:** 200 OK
    - **Body:** HTML page displaying a list of rejected papers.

## Reviewer Assignment

### Assign Reviewers

- **Endpoint:** `GET /assignreviewers`
- **Description:** Display a form for assigning reviewers to papers.
- **Request:**
  - None.
- **Response:**
  - **Success:**
    - **Code:** 200 OK
    - **Body:** HTML form for assigning reviewers.

## Responses

### Responses

- **Endpoint:** `GET /responses`
- **Description:** Display a list of paper review responses.
- **Request:**
  - None.
- **Response:**
  - **Success:**
    - **Code:** 200 OK
    - **Body:** HTML page displaying a list of paper review responses.

---
