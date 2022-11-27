// print this Pattern.

// 0 1 0 3 0
// 1 1 1 3 1
// 2 1 2 3 2
// 3 1 3 3 3
// 4 1 4 3 4


let N=5;
for(let i=0;i<N;i++){
    let z="";
    for(let j=0;j<N;j++){
        x=j%2===0;
        if(x){
            z+=i+" ";
        }else{
            z+=j+" ";
        }
        }console.log(z);
    }