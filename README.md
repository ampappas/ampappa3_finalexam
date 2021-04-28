# ampappa3_finalexam

CodeReview:
This code is incorrect. Sub should be the appended value that keeps a total, and is returned at the end. First can keep an index. The goal is to return a value that is a total, so we want to store it in a variable then return that variable.

Edited program to properly reflect description of assignment.


BlackBox:
For boundary value analysis I would be sure to test to make sure we cannot go past the limitations of the array. I would also be sure test equivalence partitioning to make sure our data works with positive and negative numbers alike.

WhiteBox:
For node and edge coverage I could draw out a graph to make sure every branch/edge is visited in my test. We can also use tools like jacoco that allow us to get a coverage report. As far as test cases I would be sure to use different values and array sizes. However, this program is rather simple and should execute with 100% coverage assuming I pass it a proper array.
