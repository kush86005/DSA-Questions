package Trie;

public class Question04 {
    /* Here is a summary of the recursive Word Break explanation using the example
    key="ilikeicecream" and dictionary {"i","like","ice","cream"}.

The wordbreak function solves the problem by using recursion and backtracking to test
every possible way to segment the input string into dictionary words.


1. The Goal of Each Call
Every time wordbreak(segment) is called, its goal is the same:
Find any way to split segment into two parts (a prefix and a suffix) such that:

The prefix is a valid word in the dictionary (checked by search()).

The suffix can also be segmented (checked by a recursive call to wordbreak()).

2. The Initial Deep Dive (The Unsuccessful Path)
The process immediately tries the first possible path, pushing function calls onto the Call Stack:

Call No.   	Key Segment 	Split                       Attempt (Prefix)Action
Call 1	"ilikeicecream"	     "i"	                 True. Recurse on → "likeicecream"
Call 2	"likeicecream"	    "like"	                 True. Recurse on → "icecream"
Call 3	"icecream"	         "i"	                 True. Recurse on → "cecream"
Call 4	"cecream"	  (Tries all prefixes)	         False for all. Returns false.


3. Backtracking and Finding the Solution
When Call 4 returns false, the program backtracks to Call 3.

Backtrack: Call 3 realizes the "i" split failed and resumes its loop to check the next possible prefix for "icecream".

Success: Call 3 finds the split: "ice" (True) → "cream" (Recurse to Call 4 - new instance).

Base Case: The new Call 4 (on "cream") succeeds, which leads to Call 5 on the Empty String ("").
The empty string is the Base Case, which immediately returns true.

4. The Short-Circuit Unwind
Once the Base Case returns true, the result propagates rapidly up the stack, and the successful path is confirmed:
The first function to find a complete successful path immediately returns true, making the search efficient.
The final result for "ilikeicecream" is True.
     */

}