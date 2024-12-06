# Counting-the-URL-Words-Characters
I have written a Java code which fetches and analyzes the content of a webpage (in this case, the Wikipedia page for Java programming language) using URL and BufferedReader.
1) Fetching the content:
   It creates a URL object for the target webpage.
   Then, it opens a stream to read the content of the webpage using BufferedReader.
2) Reading the content:
   The program reads the webpage line by line and appends each line to a StringBuilder to accumulate the entire page's content.
3) Analyzing the content:
   It calculates the total number of characters in the page's content by checking the length of the string.
   It calculates the total number of words by splitting the content on spaces.
   It uses a regular expression (https?://) to find and count URLs in the content.
4) Output:
   Finally, the program prints the total number of characters, words, and URLs found on the webpage.
   
