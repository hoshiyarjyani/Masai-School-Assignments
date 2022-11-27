const animals = ['Dodo', 'Tiger', 'Penguin', 'Dodo'];

function arrLastIndex(arr,str){
  for (let i = arr.length-1; i >= 0; i--){
    if(arr[i] == str) return i;
  }
}

console.log(arrLastIndex(animals, 'Dodo'));
// expected output: 3

console.log(arrLastIndex(animals, 'Tiger'));
// expected output: 1

