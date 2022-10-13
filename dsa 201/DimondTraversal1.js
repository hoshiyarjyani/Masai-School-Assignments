function diamondTraversal(matrix) {
    //Write your code over here
    let result = "";
    let n = matrix.length;
    let i = (n-1)/2; let j = n-1;
    while(i>=0){
        result+=matrix[i][j]+" ";
        i--;j--;
    }
    let k = 1; let l = ((n-1)/2)-1;
    while(l>=0){
        result+=matrix[k][l]+" ";
        k++;l--;
    }
     let o = ((n-1)/2)+1; let p = 1;
    while(o<=n-1){
        result+=matrix[o][p]+" ";
        o++;p++;
    }
     let q = n-2; let r = ((n-1)/2)+1;
    while(q>=((n-1)/2)+1){
        result+=matrix[q][r]+" ";
        q--;r++;
    }
    
    
    
    console.log(result);
    
  }
  
diamondTraversal([
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
]);
