function applyBasicMaths(N, A) {
    //write code here
    
    let index = -1;
    let value = Infinity;

    for(let i=0;i<N;i++){
        let sum = 0;
        for(let j=0;j<N;j++){
            if(i!=j){
             sum+=A[j];
            }
        }
        if(sum%7==0 && value>A[i]){
            value=A[i];
            index=i;
        }
    }
    console.log(index);


}

A = [14, 7, 9, 2, 4];
applyBasicMaths(5, A);
