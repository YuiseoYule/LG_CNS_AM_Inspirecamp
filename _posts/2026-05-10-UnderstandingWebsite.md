---
layout: post
title: "UnderstandingWebsite"
date: 2026-05-10
categories: TIL
---

# Today's lecture

## 📚 Deep Dive: Web Service Architecture & Developer Roles

### Scenario
A user wants to search for a product on an e-commerce site. They click a button, wait a moment, and see a list of items. Behind this simple action lies a complex interaction between different layers of technology and specialized engineering roles.

---

### 🏛️ Web Service Flow: Request & Response
Web services operate on a continuous loop of **Request** and **Response**.

1.  **Event:** The user triggers an event (e.g., clicking a button) in the **Browser (Client)**.
2.  **Request:** The Front-end sends a formal request to the **Server (Back-end)**.
3.  **Processing:** The Server performs logic and retrieves data from the **Database (Storage)**.
4.  **Response:** The Server sends the result back to the Front-end.
5.  **Visualization:** The Browser renders the response into a UI for the user to see.

---

### 🛠️ The Developer's Career Path

| Role | Nickname | Focus Area |
| :--- | :--- | :--- |
| **Front-end (FE)** | The "Interface" | UI/UX, Browser-side logic, and visualization. |
| **Back-end (BE)** | The "Logic" | Business logic, server-side processing, and API design. |
| **DBA / Engineer** | The "Vault" | Managing physical data storage, security, and performance. |
| **DevOps** | The "Bridge" | Merging development and operations for automated deployment. |
| **Full-Stack** | The "All-Rounder" | A developer capable of handling FE, BE, and Database layers. |

---

### 🔗 Key Concept: API (Application Programming Interface)
An **API** is a set of rules or protocols that allows the Front-end and Back-end to talk to each other.

*   **The "Contract":** It defines exactly how data should be requested and how the response will be formatted.
*   **Collaboration:** Using tools like **Swagger**, developers document these rules so that FE and BE teams can work independently without communication errors.

---

# 🌐 Web Service Flow & Infrastructure

### 1. The Entry Point: From URL to IP
*   **DNS (Domain Name System):** Users use URLs (e.g., naver.com) because IP addresses are difficult to memorize. The DNS binds a specific domain name to a numeric IP address.
*   **Protocols:** 
    *   **HTTP:** Standard communication rule.
    *   **HTTPS:** The secure version of HTTP (S = Secure).

---

### 2. The Server Layer: Web Server vs. WAS
A professional infrastructure separates static and dynamic content for efficiency.

| Component | Full Name | Primary Resource | Examples |
| :--- | :--- | :--- | :--- |
| **Web Server** | Web Server | **Static:** HTML, CSS, JS, Images | Apache, NGINX |
| **WAS** | Web Application Server | **Dynamic:** JSP, Servlet, Java logic | Tomcat, WebLogic, Jeus |

> **Key Concept:** A WAS can often handle static resources, but large-scale systems use a dedicated Web Server as the first point of contact to forward requests to the WAS.

---

### 3. Internal WAS Architecture: The Spring Framework
Within the WAS, the logic is organized into layers to maintain order:
*   **Controller:** Receives the user request.
*   **Service:** Handles the core business logic.
*   **Repository:** Manages data access (Interacts with the DB).

---

### 4. The Data Layer: DBMS & Interaction
The communication between the application (Java) and the database requires specific technologies.

*   **DBMS (Database Management System):** Software that manages the physical database.
    *   **RDBMS (Relational):** Uses SQL (e.g., Oracle, MySQL, MSSQL).
    *   **NoSQL (Non-Relational):** Flexible structures (e.g., MongoDB, Redis, Cassandra).
*   **Interaction Technologies:**
    *   **JDBC:** The basic Java standard for connecting to a DB.
    *   **ORM (Object-Relational Mapping):** A technique to map Java objects to DB tables.
    *   **Tools:** **JPA** (Java Persistence API) and **MyBatis**.

---

### 5. Final Step: Rendering
Once the server processes the request, it sends a response back to the browser. The browser **renders** the HTML/CSS/JS, transforming the code into the visual interface the user interacts with.



---

# 📚 Deep Dive: IDE, CRUD, and RESTful Communication

### Scenario
Imagine writing a letter to a friend in a foreign country. You need a desk and pen (**IDE**) to write it, a standardized envelope format (**HTTP Header/Body**), a specific request like "Send me a book" (**CRUD/GET**), and a way to know if they received it (**Status Codes**).

---

### 🛠️ Development Setup & Tools

| Category | Tool / Concept | Role |
| :--- | :--- | :--- |
| **Editor** | **IDE** | Coding, building, and debugging (e.g., IntelliJ, VS Code). |
| **Application Server** | **Apache Tomcat** | The "WAS" that runs Java web applications for learning/testing. |
| **Data Format** | **JSON** | A lightweight "Key-Value" format used to exchange data between FE and BE. |

---

### 📡 The Anatomy of a Web Request (API)
When a Front-end talks to a Back-end, it uses a specific structure:

*   **Header:** Contains "Meta Information" (e.g., "I'm sending JSON," "Here is my security token").
*   **Body:** Contains the actual "Data" being sent (e.g., the text of a new post).
*   **Endpoint:** The specific URL destination (e.g., `/users/10/posts`).

---

### 📊 Mapping CRUD to HTTP Methods

| CRUD Action | HTTP Method | Example Endpoint | Description |
| :--- | :--- | :--- | :--- |
| **Create** | `POST` | `/users` | Submitting new data (e.g., signing up). |
| **Read** | `GET` | `/users/1` | Fetching or Reading data. |
| **Update** | `PUT` / `PATCH` | `/users/1` | Modifying existing data. |
| **Delete** | `DELETE` | `/users/1` | Removing data. |

---

### ✅ Understanding Server Responses (Status Codes)
The server always replies with a **Status Code** to let the client know what happened:

*   **200s (Success):** "Everything is okay" (e.g., `200 OK`, `201 Created`).
*   **400s (Client Error):** "You made a mistake" (e.g., `404 Not Found`, `400 Bad Request`).
*   **500s (Server Error):** "The server crashed" (e.g., `500 Internal Server Error`).



