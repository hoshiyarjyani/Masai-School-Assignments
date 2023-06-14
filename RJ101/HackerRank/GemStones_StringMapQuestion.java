// There is a collection of rocks where each rock has various minerals embeded in it. Each type of mineral is designated by a lowercase letter in the range . There may be multiple occurrences of a mineral in a rock. A mineral is called a gemstone if it occurs at least once in each of the rocks in the collection.

// Given a list of minerals embedded in each of the rocks, display the number of types of gemstones in the collection.

// Example

// The minerals  and  appear in each rock, so there are  gemstones.

// Function Description

// Complete the gemstones function in the editor below.

// gemstones has the following parameter(s):

// string arr[n]: an array of strings
// Returns

// int: the number of gemstones found
// Input Format

// The first line consists of an integer , the size of .
// Each of the next  lines contains a string  where each letter represents an occurence of a mineral in the current rock.

// Constraints


//  | arr[i] | 
// Each composition  consists of only lower-case Latin letters ('a'-'z').

// Sample Input

// STDIN       Function
// -----       --------
// 3           arr[] size n = 3
// abcdde      arr = ['abcdde', 'baccd', 'eeabg']
// baccd
// eeabg
// Sample Output

// 2
// Explanation

// Only  and  occur in every rock.


