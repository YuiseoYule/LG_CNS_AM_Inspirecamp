---
layout: post
title: "Webservice2"
date: 2026-05-11
categories: TIL
---

# Today's lecture



# 🎨 Deep Dive: Front-end Technology Stack & Modern Frameworks



### 1. The Core Trinity (Web Basics)
The Front-end is the area where the system communicates with the user via the browser.

*   **HTML (Hypertext Markup Language):** The **Skeleton**. Defines the structure using semantic tags (e.g., `<table>`, `<form>`, `<header>`).
*   **CSS (Cascading Style Sheets):** The **Decoration**. Handles styling, layout, and responsiveness.
*   **JavaScript (JS):** The **Behavior**. Implements dynamic functions and handles user events.



---

### 2. Evolution: Static vs. Dynamic Files
While the browser ultimately renders HTML, the source files often differ based on the backend language:
*   **JSP (Java Server Pages):** HTML + Java code. Used widely in enterprise environments.
*   **ASP (Active Server Pages):** HTML + C#/.NET (Microsoft ecosystem).
*   **Transition:** Adding programming logic (Java/C#) transforms a static HTML page into a **Dynamic** resource.



---

### 3. Responsive Web Design (RWD)
*   **Concept:** A single HTML file that adjusts its UI based on the screen resolution (Desktop vs. Mobile).
*   **Media Queries:** The CSS technology used to detect resolution and apply different styles.
*   **Bootstrap:** A popular CSS framework (template) that provides pre-built responsive components.



---

### 4. Modern FE: Single Page Application (SPA)
Unlike traditional websites that reload the entire page, SPAs load once and swap **Components** dynamically.

| Feature | Description |
| :--- | :--- |
| **Logic** | Swaps components (Transition) instead of reloading (Reload). |
| **Pros** | Faster transitions, reduced server load (data-only requests). |
| **Cons** | Slower initial loading, requires SEO optimization (SSR). |

#### 🛠️ Key Technologies: React vs. Vue.js
*   **React:** Classified as a **Library**. Uses `.jsx` (JavaScript XML) extensions. High flexibility where the developer controls the flow.
*   **Vue.js:** Classified as a **Framework**. Uses `.vue` or `.js` files. Provides a more rigid structure/template for the developer to follow.



---

### 5. Library vs. Framework (The "Control" Factor)
The fundamental difference lies in **Inversion of Control (IoC)**:
*   **Library (React):** *You* call the library code. You are in control of the application flow.
*   **Framework (Vue/Spring):** The *Framework* calls your code. It dictates the structure and flow.w what happened:

*   **200s (Success):** "Everything is okay" (e.g., `200 OK`, `201 Created`).
*   **400s (Client Error):** "You made a mistake" (e.g., `404 Not Found`, `400 Bad Request`).
*   **500s (Server Error):** "The server crashed" (e.g., `500 Internal Server Error`).

---



## 🛠️ Deep Dive: IDE Selection & Web Server Fundamentals

### 1. IDE (Integrated Development Environment) Tools
Choosing the right tool depends on the language focus and the need for extensibility.

*   **Eclipse:** The traditional, dedicated tool for **Java development**. Highly stable for classic Java environments.
*   **IntelliJ IDEA:** A modern, powerful IDE known for intelligent code completion and deep static analysis.
*   **VS Code (Visual Studio Code):** A versatile **code editor** that supports multiple languages (Java, Python, JS, etc.) via extensive **Extensions (Plugins)**. It is currently favored for its lightweight nature and flexibility.

---



### 2. Serving Web Resources
To view web pages in a browser, a server must host the files.

*   **Static Resources:** These include **HTML, CSS, JavaScript, and Images**. They do not change based on user logic.
*   **Server Options:**
    *   **Apache HTTP Server:** A long-standing, reliable web server for static content.
    *   **NGINX:** A high-performance server often used for static hosting and load balancing.

---



### 3. Practical Setup in VS Code
In VS Code, developers utilize the **Extensions** menu (the icon with four square blocks) to install local server tools.
*   **The Workflow:**
    1. Write source code (HTML/CSS/JS).
    2. Use a plugin (e.g., *Live Server*) to simulate a web server environment.
    3. Deploy or run the code to view the result in a **Browser**.
 
* ---

* 

## HTML Basic Structure

- **Hierarchy**: HTML consists of **tags**, which can contain **attributes**, which are assigned specific **values**.
- **Rule**: Every opening tag must have a corresponding closing tag to properly encapsulate content.

### Syntax Template
`<tag attribute="value">Content</tag>`

### Component Breakdown
1. **Tag**: Defines the element type (e.g., `p`, `div`, `h1`).
2. **Attribute**: Provides additional information about the element (e.g., `class`, `id`, `src`).
3. **Value**: The specific setting for the attribute (e.g., `"header"`, `"main-image"`).

---

## CSS Syntax Overview

- **Selector**: The target area (or "Selector") identifies the HTML element you wish to style.
- **Declaration Block**: Styles are contained within curly braces `{}`.
- **Key-Value Pairs**: Specific styling is applied using properties (keys) and values.

### Syntax Template


```css
selector {
    key: value;
    key: value;
}
```


📂 [Practice Files](https://github.com/YuiseoYule/LG_CNS_AM_Inspirecamp/tree/main/assets/2026-05-11-Webservice/Practice/)

![Login]({{ site.baseurl }}/assets/2026-05-11-Webservice/Login.png)...
