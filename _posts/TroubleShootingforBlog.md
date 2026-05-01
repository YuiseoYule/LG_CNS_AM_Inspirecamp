---
layout: post
title: "Which trouble did I suffered from this blog organizing"
date: 2026-05-01 - 2026-05-01
categories: TIL
---

## 🔍 GitHub Pages 404 Error on Directory Links

*   **Symptom:** PNG images, specifically `SourceTree.png`, displayed correctly in the GitHub repository preview but failed to render on the live Jekyll blog site.
*   **Context/Environment:** GitHub Pages hosting using the Minima theme, with Markdown files following a "Daily Unit" directory structure within the `_posts` folder.
*   **Root Cause:** The absolute path (`/assets/...`) was interpreted differently by the two environments; GitHub's native viewer resolved it to the repository root, while the live site interpreted the leading `/` as the root of the entire domain, bypassing the repository subdirectory.
*   **Resolution:** Replaced the static absolute path with the Jekyll Liquid tag `{{ site.baseurl }}` to dynamically prepend the repository name during the site build.
*   **System Rule (Takeaway):** Always utilize Liquid variables like `{{ site.baseurl }}` for static asset routing to ensure path consistency between local previews and live deployments.


## 🛠️ Broken Directory Links in Jekyll Deployment

* **Symptom:** Links to practice directories resulted in a 404 error on the live blog, despite functioning correctly in the local Markdown editor.
* **Context/Environment:** GitHub Pages, Jekyll Static Site Generator, "Daily Unit" directory structure within `_posts`.
* **Root Cause:** Architectural discrepancy between local file resolution and production routing. Static web servers cannot render a directory tree without an `index.html` file, and Jekyll's compiler does not treat nested folders within `_posts` as web-accessible directories by default.
* **Resolution:** Replaced the local relative directory path with the absolute remote GitHub repository URL.
* **System Rule (Takeaway):** Distinguish between Local Preview Logic and Production Static Routing. Use absolute remote URLs for repository browsing to ensure link persistence across environments.










## Basic format for this page
```bash
## 🛠️ Brief Issue Title

*   **Symptom:** [Describe what failed. e.g., PNG displayed in GitHub preview but broke on the live Jekyll deployment.]
*   **Context/Environment:** [List the conditions. e.g., GitHub Pages, Markdown absolute path, `_posts` directory.]
*   **Root Cause:** [Explain the underlying mechanism of the failure. e.g., Jekyll's deployment routing conflicted with GitHub's native Markdown viewer regarding the `/` root directory.]
*   **Resolution:** [State the exact fix. e.g., Replaced the absolute path with the Liquid tag `{{ site.baseurl }}`.]
*   **System Rule (Takeaway):** [Define the generalized rule to prevent recurrence. e.g., Always use Liquid variables for static asset routing in Jekyll.]
```
