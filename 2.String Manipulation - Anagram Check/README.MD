Here is the `README.md` content for your **Anagram Question** in a structured format:  

```markdown
# Anagram Checker

## Problem Statement  
Write a program to check if two given strings are anagrams of each other.  
An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, using all the original letters exactly once.

## Requirements  
- The program should take two input strings.
- It should determine if they are anagrams.
- The solution should be case-insensitive.
- Ignore spaces and special characters.

## Example  
**Input:**  
```
String 1: "listen"  
String 2: "silent"
```
**Output:**  
```
The given strings are anagrams.
```

**Input:**  
```
String 1: "hello"  
String 2: "world"
```
**Output:**  
```
The given strings are not anagrams.
```

## Approach  
1. Remove any spaces and convert both strings to lowercase.  
2. Sort the characters in both strings.  
3. Compare the sorted versions of both strings.  
4. If they match, the strings are anagrams; otherwise, they are not.

## Technologies Used  
- Java 
- String manipulation techniques
- Sorting algorithms

## How to Run   
 Run the Java program:  
   javac AnagramChecker.java
   java AnagramChecker
  

## Output Sample  
```
Enter first string: listen  
Enter second string: silent  
Result: The strings are anagrams.
```

## Author  
- **Keerthi Siva Teja**  
```
