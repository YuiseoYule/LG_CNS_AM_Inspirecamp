---
layout: post
title: "Git and GitHub: Synchronization and Terminology"
date: 2026-05-01
categories: TIL
---
# Today's lecture

## 💻 Git Commands in Local

| Command | Action | Key Detail |
| :--- | :--- | :--- |
| `git commit -m` | Commit staged changes | Requires `git add` first. |
| `git commit -am` | Stage & commit tracked files | **Cannot** stage new (untracked) files. |
| `git reset --hard` | Reset to a specific state | Defaults to `HEAD`; **permanently** deletes uncommitted work. |
| `git revert` | Undo a specific commit | Creates a **new** commit; safe for public history. |
| `git revert --no-commit` | Apply inverse changes | Workspace changes only; does not record a commit automatically. |
| `git rm` | Remove file | Deletes from both the working directory and staging area. |


### **`git commit -am "message"`**
*   **The `-m` Flag**: This stands for "message." It allows you to write the commit log directly in the command line instead of opening a text editor. It only commits files that are already in the **Staging Area** (files you have already run `git add` on).
*   **The `-am` Flag**: This is a combination of `-a` (all) and `-m`. It automatically **stages** every file that is already being tracked by Git and has been modified or deleted, then commits them.
*   **The Key Difference**: `-am` cannot stage **new (untracked)** files. If you create a brand new file, you must use `git add` before you can commit it.



### **`git reset --hard [commit_hash]`**
*   **The Meaning**: This command "resets" your current project to a specific point in history. The `--hard` flag is the most direct; it changes your Commit History, your Staging Area, and your Actual Files (Working Directory) to match the state of the specified hash. Any work not committed will be permanently lost.
*   **The Default Value**: If you do not provide a `[commit_hash]` and simply run `git reset --hard`, the default target is **`HEAD`**.
*   **Effect of Default**: Running `git reset --hard` (without a hash) will discard all local changes you've made since your last commit, returning your code to exactly how it looked at the most recent commit point.

---

## 🔄 Undo Operations

*   **`git revert [commit_hash]`**: Creates a **new commit** that introduces the exact opposite changes of the specified commit. This effectively undoes the effects of that commit while preserving history.
*   **`git revert --no-commit [commit_hash]`**: Applies the inverse changes of the specified commit to the working directory and staging area but does **not** automatically create a new commit, allowing for further manual adjustments.



---

## 📂 File Removal

*   **`git rm [file_path]`**: Removes a file from both the working directory and the staging area.
*   **Note on Pathing**: If the file is inside a subdirectory, you must provide the full path relative to the repository root (e.g., `git rm assets/2026-05-01-git-and-github/lions.yaml`).

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
![Sourcetree]({{ site.baseurl }}/assets/2026-05-21-git-and-github/Sourcetree Practice.png)...
