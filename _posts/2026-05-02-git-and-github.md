---
layout: post
title: "Git and GitHub: Synchronization and Terminology"
date: 2026-05-02
categories: TIL
---
# Today's lecture


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
| `git merge [branch]` | Join histories | Combines changes via a **new merge commit**; preserves original history. |
| `git rebase [branch]` | Rewrite history | Moves your local commits to the **tip** of the target branch; creates a linear path. |

---

## 📚 Deep Dive: `git log` vs. `git log --graph`

**Scenario:**
> You want to see the project's evolution without getting overwhelmed by details.

**Q: What is the main difference between these two views?**

**`git log` (The "Linear" View):** This only shows the commits belonging to the branch you are currently on. It provides a simple, chronological list of your local progress.

**`git log --all --graph` (The "Tree" View):** This shows the information for every branch. The `--graph` flag draws lines to visualize how different branches diverge and merge, providing a map of the entire repository.

---

## 📚 Deep Dive: `git merge` vs. `git rebase`

**Scenario:**
> You have finished working on a feature branch and need to integrate it with the main codebase.

**Q1: Which method should I use to combine my work?**

**`git merge` (The "Preserver"):** This creates a special "merge commit" that connects the two branches. It is non-destructive, keeping the original history of your feature branch intact. This is best for public or shared branches.

**`git rebase` (The "Cleaner"):** This "moves" your feature branch commits so they start from the very end of the main branch. This creates a clean, straight line of history without extra merge commits. This is best for personal, local branches before pushing.

---
## 💻 Git Integration: Pros & Cons

| Method | Pros (Advantages) | Cons (Disadvantages) |
| :--- | :--- | :--- |
| **`git merge`** | • **Non-destructive:** Preserves original history.<br>• **Traceable:** Shows exactly when branches joined.<br>• **Safe:** Best for shared/public branches. | • **Messy History:** Creates extra "merge commits."<br>• **Complex Graph:** Can be hard to read in large projects. |
| **`git rebase`** | • **Clean History:** Results in a linear commit log.<br>• **Readability:** Easy to follow the project narrative.<br>• **Debugging:** Simplifies the use of `git bisect`. | • **Rewrites History:** Changes commit hashes (dangerous if shared).<br>• **Conflicts:** Requires resolving conflicts for each commit. |

---


## 🛠️ Practice

Sync the latest metadata and verify the `origin/main` status using SourceTree.

📂 [Practice Files](https://github.com/YuiseoYule/LG_CNS_AM_Inspirecamp/tree/main/assets/2026-05-02-git-and-github/Practice/)


![Sourcetree]({{ site.baseurl }}/assets/2026-05-02-git-and-github/SourcetreePractice.png)...

![Sourcetree]({{ site.baseurl }}/assets/2026-05-02-git-and-github/SourcetreePractice2.png)...

