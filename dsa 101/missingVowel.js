// Missing Vowels Ended

// You are given a string, stored in a variablestr, and the length of the string is stored in the variableN

// You have to find all the vowels that are not present in the string and print them.
// If a string contains all the vowels, in that case, print -1.
// For example, consider the value stored inN = 6, andstr = nature
// out of the 5 vowels(a,e,i,o,u)
// the word "nature" contains a,u,e
// The vowel that are not present in the string are : i,o

// hence the output is io

// Note : The string contains only lower case English Alphabets

function missingVowel(str) {
  let beg = "";
  let obj = { a: 1, e: 1, i: 1, o: 1, u: 1 };
  for (let i = 0; i < str.length; i++) {
    delete obj[str[i]];
  }
  for (let key in obj) {
    beg += key;
  }
  console.log(beg);
}

let str = "nature";
missingVowel(str);

let str1 = "hoshiyarjyani";
missingVowel(str1);

//other method

// function missingVowel(N, str) {

//     let arr = ["a", "e", "i", "o", "u"];

//     let presentVowel = "";

//     //find the present vowels
//     for (let i = 0; i < arr.length; i++) {
//       for (let j = 0; j < N; j++) {
//         if (arr[i] == str[j]) {
//           presentVowel += str[j];
//           break;
//         }
//       }
//     }

//     if (presentVowel==""){
//         console.log("aeiou");
//         return;
//     }
//     //find absent vowels

//     let vowelAbsent = "";

//     for (let i = 0; i < arr.length; i++) {
//       for (let j = 0; j < presentVowel.length; j++) {
//         if (arr[i] == presentVowel[j]) {
//           break;
//         } else if (presentVowel.length - 1 == j) {
//           vowelAbsent += arr[i];
//         }
//       }
//     }

//     if (vowelAbsent == "") {
//       console.log("-1");
//     } else {
//       console.log(vowelAbsent);
//        }

//   }
