function alanAndFrequency(N, str) {
    //masai
    let k =[];
    for(let i=0; i<str.length; i++){
        k[i]=str[i];
    }
   let sortStr = k.sort();
   let beg ="";
    for(let i =0; i<sortStr.length;i++){
        beg+=sortStr[i];
    }
    
    
    let obj={};
    for(let i = 0; i<N;i++){
        if(obj[beg[i]] == undefined){
            obj[beg[i]]=1;
        }else{
             obj[beg[i]]++;
        }
    }
  
    for(let key in obj){
        console.log(key+"-"+obj[key]);
    }
  }
  let str ="masai";
  alanAndFrequency(5, str);