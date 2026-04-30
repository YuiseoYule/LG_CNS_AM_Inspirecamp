---
layout: post
title: "Git and GitHub: Additional Explanations"
date: 2026-04-30
categories: TIL
---

## 💻 Git Commands in Local

| Command | Description |
| :--- | :--- |
| `git status` | Check the current status of the working tree and staging area. |
| `git init` | Initialize a new local repository. |
| `git add` | Stage files for a commit (place them in the staging area). |
| `git commit` | Record staged changes as a new version. |
| `git log` | View the commit history. |
| `git branch` | Create a new branch. |
| `git merge` | Merge a branch into the current branch. |
| `git checkout` | Switch to a specific branch. |

---

## 🌐 GitHub in Remote

*   **Repository:** A digital storage structure that tracks the entire evolutionary history of a project's files.
*   **Fork:** Create a personal copy of another user's repository.
*   **Pull Request (PR):** A request to merge changes from a local repository into a remote repository on GitHub.
*   **Issue:** A tracking board used to manage bugs, tasks, or improvements.
*   **Actions:** A CI/CD (Continuous Integration and Continuous Deployment) tool that automates workflows from build to deployment.

---

## 📚 Additional Knowledge: Rules of `git pull`

**Scenario:**
> *   **Remote:** Contains file `A'` (a new version of file `A`).
> *   **Local:** Contains file `A` (the old version) and file `B`.

**Q1: Between `A'` and `A`, which one is selected during a pull?**  
**Conflict Resolution (`A` vs. `A'`):** Git does not automatically "select" one version over the other; it attempts a three-way merge. If the changes in `A'` and `A` occur in different sections of the file, Git integrates both. However, if the changes overlap on the same lines, Git declares a "merge conflict," halting the process until the user manually chooses which content to keep.

**Q2: If I pull `A'` into my local repository, will the remote version `A'` subsequently revert to `A`?**  
**Directionality of Data:** The pull command is unidirectional, moving data from the remote repository to the local one. Executing a pull will update your local `A` to match the state of `A'` (or a merged version of both), but it has zero effect on the remote files hosted on GitHub.  
**Remote State Stability:** The remote version `A'` remains unchanged until a `git push` is successfully executed from a local machine.

---

## 🛠️ Practice

Upload the YAML files and verify the repository state using SourceTree.

📂 [Practice Files](/assets/2026-04-30-git-and-github/Practice/)