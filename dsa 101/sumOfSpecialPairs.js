function sumOfSpecialPairs(N,A){

    let sum=0;
    for(let i=0;i<N;i++){
        for(let j=i;j<N;j++){
            if(j-i==2 || j-i==3 ||j-i==5||j-i==7||j-i==11||j-i==13){
                sum+=Math.abs(A[j]-A[i]);
            }
        }
    }
    console.log(sum);
    }
    let A =[1, 2, 3, 5, 7, 12]
    sumOfSpecialPairs(6,A);