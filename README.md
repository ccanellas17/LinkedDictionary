# Pair-programming
### w/ Charly Laba and Carlos Cañellas


**Process:**
1. Member A creates a repository on GitHub and IntelliJ following the usual instructions
2. Member A adds member B to the project as a “collaborator”
3. Member A and B works on member A’s computer
4. Stage (add to the stage) and commit code as usual in the local repository in A’s computer
5. After a while push the code to the remote repository on Github:
https://help.github.com/en/github/using-git/pushing-commits-to-a-remote-repository
6. Switch to member B’s computer and clone the repository
7. Stage and commit code as usual in the local repository of the actual computer
8. After a while push the code to the remote repository on Github
9. Switch to the other member’s computer and pull the code:
  * git pull –u origin master (syntax is the same as push, “git pull” should work as well)
10. Go back to step 7 (keep doing until the code is finished)

**Requisites:**
* The application will be able to open a file called “unsorteddict.txt”
* This file will be a collection of words where each line contains a word
* The application will read the file line by line, in other words, it will read a new word each time a new line is read
* Each time a new line is read, the new word will be inserted in the correct position of a data structure called “dictionary” that will be of a Linked list
type
* Therefore , this “dictionary” will be a sorted list of all the words read from the file
* After the “unsorteddict.txt” has been fully read, the application will create another file called “sorteddict.txt” which will contain all the words
(one word per line) alphabetically ordered
* The application will also accept command line arguments, i.e. it could be executed as java LinkDictionary 23 butterfly
* The application will accept a minimum of 0 arguments and a maximum of 10 arguments
* If the argument is a number, the corresponding word placed in that position in the ordered linked list “dictionary” should be printed out on the
console
* If the argument is a word, the application should print out in the console the number that represent the order of that word inside the dictionary. If it
doesn’t exist, it should write “-1”.
* Using the LinkedList<T> class from JAVA API is allowed
* Using any method that automatically sort the list is not allowed, you have to create an algorithm that does the sorting
