---
layout: post
title: "Git and GitHub: Synchronization and Terminology"
date: 2026-05-02
categories: TIL
---
# Today's lecture

## 💻 Git Commands in Local

## 💻 Git Branching Commands

| Command | Action | Key Detail |
| :--- | :--- | :--- |
| `git branch` | Check branch list | Lists all local branches in the current repository. |
| `git branch [name]` | Create branch | Generates a new branch pointer; does not switch to it. |
| `git switch [name]` | Relocate to branch | Updates the working directory to the specified branch state. |
| `git switch -c [name]` | Create & relocate | Combined action of generating and moving to a new branch. |
| `git branch -d [name]` | Delete branch | Removes a branch that has already been merged. |
| `git branch -m [old] [new]` | Rename branch | Modifies the name of an existing branch. |
| `git branch -D [name]` | Forced delete | Permanently removes a branch even if it contains unmerged work. |
| `git log` | View commit history | Shows the full chronological list of commits. |
| `git log --all --decorate --oneline --graph` | Visual history tree | Displays a condensed, graphical view of all branches. |

---

## 📚 Deep Dive: `git log` vs. `git log --graph`

**Scenario:**
> You want to see the project's evolution without getting overwhelmed by details.

**Q: What is the main difference between these two views?**

**`git log` (The "Linear" View):** This only shows the commits belonging to the branch you are currently on. It provides a simple, chronological list of your local progress.

**`git log --all --graph` (The "Tree" View):** This shows the information for every branch. The `--graph` flag draws lines to visualize how different branches diverge and merge, providing a map of the entire repository.
---

## 🛠️ Practice

Sync the latest metadata and verify the `origin/main` status using SourceTree.

📂 [Practice Files](https://github.com/YuiseoYule/LG_CNS_AM_Inspirecamp/tree/main/assets/2026-05-02-git-and-github/Practice/)


![Sourcetree]({{ site.baseurl }}/assets/2026-05-02-git-and-github/SourcetreePractice.png)...
