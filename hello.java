class hello
{
  public static void main(String [] a)
  {
    System.out.println("HEllo Althaf");
  }
}





user@tony:~/Documents/E3S2/ML_Lab$ git init
hint: Using 'master' as the name for the initial branch. This default branch name
hint: is subject to change. To configure the initial branch name to use in all
hint: of your new repositories, which will suppress this warning, call:
hint: 
hint: 	git config --global init.defaultBranch <name>
hint: 
hint: Names commonly chosen instead of 'master' are 'main', 'trunk' and
hint: 'development'. The just-created branch can be renamed via this command:
hint: 
hint: 	git branch -m <name>
Initialized empty Git repository in /home/user/Documents/E3S2/ML_Lab/.git/
user@tony:~/Documents/E3S2/ML_Lab$ git branch
user@tony:~/Documents/E3S2/ML_Lab$ git branch
user@tony:~/Documents/E3S2/ML_Lab$ git remote -v
user@tony:~/Documents/E3S2/ML_Lab$ git remote add origin https://github.com/rohithnrv/Machine-Learning-Lab.git
user@tony:~/Documents/E3S2/ML_Lab$ git remote -v
origin	https://github.com/rohithnrv/Machine-Learning-Lab.git (fetch)
origin	https://github.com/rohithnrv/Machine-Learning-Lab.git (push)
user@tony:~/Documents/E3S2/ML_Lab$ git status
On branch master

No commits yet

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	week1/
	week2/
	week3/
	week4/
	week5/
	week7/
	week8/

nothing added to commit but untracked files present (use "git add" to track)
user@tony:~/Documents/E3S2/ML_Lab$ git branch
user@tony:~/Documents/E3S2/ML_Lab$ git add .
user@tony:~/Documents/E3S2/ML_Lab$ git push origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/rohithnrv/Machine-Learning-Lab.git'
user@tony:~/Documents/E3S2/ML_Lab$ git clone https://github.com/rohithnrv/Machine-Learning-Lab.git
Cloning into 'Machine-Learning-Lab'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.
user@tony:~/Documents/E3S2/ML_Lab$ git init
Reinitialized existing Git repository in /home/user/Documents/E3S2/ML_Lab/.git/
user@tony:~/Documents/E3S2/ML_Lab$ gedit hello.java
Command 'gedit' not found, but can be installed with:
sudo snap install gedit  # version 46.1, or
sudo apt  install gedit  # version 46.1-3
See 'snap info gedit' for additional versions.
user@tony:~/Documents/E3S2/ML_Lab$ touch hello.java
user@tony:~/Documents/E3S2/ML_Lab$ git remote -v
origin	https://github.com/rohithnrv/Machine-Learning-Lab.git (fetch)
origin	https://github.com/rohithnrv/Machine-Learning-Lab.git (push)
user@tony:~/Documents/E3S2/ML_Lab$ git remote add origin https://github.com/rohithnrv/Machine-Learning-Lab.git
error: remote origin already exists.
user@tony:~/Documents/E3S2/ML_Lab$ git status
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
	new file:   week1/.ipynb_checkpoints/week1-checkpoint.ipynb
	new file:   week1/.ipynb_checkpoints/week1Q-checkpoint.ipynb
	new file:   week1/lab 1 machine learning (1).pdf
	new file:   week1/transactions.csv
	new file:   week1/week1.ipynb
	new file:   week1/week1Q.ipynb
	new file:   week2/.ipynb_checkpoints/Car_sales-checkpoint.csv
	new file:   week2/.ipynb_checkpoints/week2-checkpoint.ipynb
	new file:   week2/Car_sales.csv
	new file:   week2/ML Lab 2.pdf
	new file:   week2/week2.ipynb
	new file:   week3/.ipynb_checkpoints/week3-checkpoint.ipynb
	new file:   week3/Regression-1.pdf
	new file:   week3/tvmarketing.csv
	new file:   week3/week3.ipynb
	new file:   week4/Housing.csv
	new file:   week4/MultipleLinearRegression .ipynb
	new file:   week5/.ipynb_checkpoints/Decision Tree-checkpoint.ipynb
	new file:   week5/.ipynb_checkpoints/LabQ5-checkpoint.ipynb
	new file:   week5/Decision Tree.ipynb
	new file:   week5/LabQ5.ipynb
	new file:   week5/train_titanic.csv
	new file:   week7/.ipynb_checkpoints/week7-checkpoint.ipynb
	new file:   week7/2ec9d896-9569-4a32-87fa-d79c63ea90a4.jpeg
	new file:   week7/Week7_test.csv
	new file:   week7/Week7_train.csv
	new file:   week7/week7.ipynb
	new file:   week8/.ipynb_checkpoints/week8-checkpoint.ipynb
	new file:   week8/week8.ipynb

Untracked files:
  (use "git add <file>..." to include in what will be committed)
	Machine-Learning-Lab/
	hello.java

user@tony:~/Documents/E3S2/ML_Lab$ git commit -m "Hello"
[master (root-commit) c8e18d3] Hello
 29 files changed, 86495 insertions(+)
 create mode 100644 week1/.ipynb_checkpoints/week1-checkpoint.ipynb
 create mode 100644 week1/.ipynb_checkpoints/week1Q-checkpoint.ipynb
 create mode 100644 week1/lab 1 machine learning (1).pdf
 create mode 100644 week1/transactions.csv
 create mode 100644 week1/week1.ipynb
 create mode 100644 week1/week1Q.ipynb
 create mode 100644 week2/.ipynb_checkpoints/Car_sales-checkpoint.csv
 create mode 100644 week2/.ipynb_checkpoints/week2-checkpoint.ipynb
 create mode 100644 week2/Car_sales.csv
 create mode 100644 week2/ML Lab 2.pdf
 create mode 100644 week2/week2.ipynb
 create mode 100644 week3/.ipynb_checkpoints/week3-checkpoint.ipynb
 create mode 100644 week3/Regression-1.pdf
 create mode 100644 week3/tvmarketing.csv
 create mode 100644 week3/week3.ipynb
 create mode 100644 week4/Housing.csv
 create mode 100644 week4/MultipleLinearRegression .ipynb
 create mode 100644 week5/.ipynb_checkpoints/Decision Tree-checkpoint.ipynb
 create mode 100644 week5/.ipynb_checkpoints/LabQ5-checkpoint.ipynb
 create mode 100644 week5/Decision Tree.ipynb
 create mode 100644 week5/LabQ5.ipynb
 create mode 100644 week5/train_titanic.csv
 create mode 100644 week7/.ipynb_checkpoints/week7-checkpoint.ipynb
 create mode 100644 week7/2ec9d896-9569-4a32-87fa-d79c63ea90a4.jpeg
 create mode 100644 week7/Week7_test.csv
 create mode 100644 week7/Week7_train.csv
 create mode 100644 week7/week7.ipynb
 create mode 100644 week8/.ipynb_checkpoints/week8-checkpoint.ipynb
 create mode 100644 week8/week8.ipynb
user@tony:~/Documents/E3S2/ML_Lab$ ^[[200~git push -u origin main
git: command not found
user@tony:~/Documents/E3S2/ML_Lab$ git push  origin main
error: src refspec main does not match any
error: failed to push some refs to 'https://github.com/rohithnrv/Machine-Learning-Lab.git'
user@tony:~/Documents/E3S2/ML_Lab$ ^[[200~git remote add origin https://github.com/rohithnrv/ML_Lab.git
git: command not found
user@tony:~/Documents/E3S2/ML_Lab$ ls
hello.java            week1  week3  week5  week8
Machine-Learning-Lab  week2  week4  week7
user@tony:~/Documents/E3S2/ML_Lab$ cd Machine-Learning-Lab/
user@tony:~/Documents/E3S2/ML_Lab/Machine-Learning-Lab$ git add .
user@tony:~/Documents/E3S2/ML_Lab/Machine-Learning-Lab$ git commit -m "ML_LAB"
[main 812ae96] ML_LAB
 30 files changed, 86502 insertions(+)
 create mode 100644 hello.java
 create mode 100644 week1/.ipynb_checkpoints/week1-checkpoint.ipynb
 create mode 100644 week1/.ipynb_checkpoints/week1Q-checkpoint.ipynb
 create mode 100644 week1/lab 1 machine learning (1).pdf
 create mode 100644 week1/transactions.csv
 create mode 100644 week1/week1.ipynb
 create mode 100644 week1/week1Q.ipynb
 create mode 100644 week2/.ipynb_checkpoints/Car_sales-checkpoint.csv
 create mode 100644 week2/.ipynb_checkpoints/week2-checkpoint.ipynb
 create mode 100644 week2/Car_sales.csv
 create mode 100644 week2/ML Lab 2.pdf
 create mode 100644 week2/week2.ipynb
 create mode 100644 week3/.ipynb_checkpoints/week3-checkpoint.ipynb
 create mode 100644 week3/Regression-1.pdf
 create mode 100644 week3/tvmarketing.csv
 create mode 100644 week3/week3.ipynb
 create mode 100644 week4/Housing.csv
 create mode 100644 week4/MultipleLinearRegression .ipynb
 create mode 100644 week5/.ipynb_checkpoints/Decision Tree-checkpoint.ipynb
 create mode 100644 week5/.ipynb_checkpoints/LabQ5-checkpoint.ipynb
 create mode 100644 week5/Decision Tree.ipynb
 create mode 100644 week5/LabQ5.ipynb
 create mode 100644 week5/train_titanic.csv
 create mode 100644 week7/.ipynb_checkpoints/week7-checkpoint.ipynb
 create mode 100644 week7/2ec9d896-9569-4a32-87fa-d79c63ea90a4.jpeg
 create mode 100644 week7/Week7_test.csv
 create mode 100644 week7/Week7_train.csv
 create mode 100644 week7/week7.ipynb
 create mode 100644 week8/.ipynb_checkpoints/week8-checkpoint.ipynb
 create mode 100644 week8/week8.ipynb
user@tony:~/Documents/E3S2/ML_Lab/Machine-Learning-Lab$ git push origin main
Username for 'https://github.com': rohithnrv
Password for 'https://rohithnrv@github.com': 
Enumerating objects: 40, done.
Counting objects: 100% (40/40), done.
Delta compression using up to 4 threads
Compressing objects: 100% (39/39), done.
Writing objects: 100% (39/39), 24.53 MiB | 529.00 KiB/s, done.
Total 39 (delta 5), reused 0 (delta 0), pack-reused 0
remote: Resolving deltas: 100% (5/5), done.
remote: warning: See https://gh.io/lfs for more information.
remote: warning: File week7/Week7_train.csv is 73.22 MB; this is larger than GitHub's recommended maximum file size of 50.00 MB
remote: warning: GH001: Large files detected. You may want to try Git Large File Storage - https://git-lfs.github.com.
To https://github.com/rohithnrv/Machine-Learning-Lab.git
   388f36f..812ae96  main -> main

