---
layout: post
title: "Git and GitHub: Synchronization and Terminology"
date: 2026-05-01
categories: TIL
---



# Additional study by myself

## 💻 Git Synchronization Logic

| Category | Local → Remote (Outbound) | Remote → Local (Inbound) |
| :--- | :--- | :--- |
| **Preparation** | `git add` / `git commit` | `git fetch` |
| **Execution** | `git push` | `git pull` |

---

## 🌐 Core Terminology

*   **origin:** The default **alias** for the remote repository URL. It acts as a pointer to the hosted server (e.g., GitHub) so you don't have to type the full URL for every command.
*   **main:** The primary **branch** of the repository. It represents the official, stable version of the source code.

---

## 📚 Deep Dive: `git fetch` vs. `git pull`

**Scenario:**
> You want to check the latest updates on GitHub without immediately overwriting your local files.

**Q1: How do I inspect changes without affecting my local work?**
**`git fetch` (The "Preview"):** This command downloads the latest metadata and commits from the remote repository but does **not** merge them into your local branch. It updates the remote-tracking branches (e.g., `origin/main`), allowing you to review changes safely.

**Q2: What is the risk of using `git pull` directly?**
**`git pull` (The "Auto-Update"):** This is a composite command that performs `git fetch` followed immediately by `git merge`. 
*   **Effect:** It updates your local files to match the remote state instantly.
*   **Safety:** Lower than fetch. If the remote changes overlap with your local edits, Git will trigger an immediate **merge conflict** that must be resolved before you can continue working.

---

## 🛠️ Theoretical Grounding

In **Distributed Version Control System (DVCS)** principles, `git fetch` is the primary operation for synchronizing the local copy of the remote's state (Remote-Tracking Branches). According to software engineering best practices, using `fetch` followed by a manual `merge` or `rebase` is preferred in complex collaborative environments to maintain a cleaner commit history and prevent unintended overwrites of local code.

---

## 🛠️ Practice

Sync the latest metadata and verify the `origin/main` status using SourceTree.

📂 [Practice Files](https://github.com/YuiseoYule/LG_CNS_AM_Inspirecamp/tree/main/assets/2026-05-01-git-and-github/Practice/)
