function palindromeCheck(str) {
  let l = str.length;
  let obj = {};
  for (let i = 0; i < l; i++) {
    if (obj[str[i]] == undefined) {
      obj[str[i]] =1;
    } else {
      obj[str[i]]++;
    }
  }
  let flag = true;
  for(let key in obj){
    
    if(obj[key]%2==1){
      flag = false;
    }
  }
 
  if(flag){
  console.log("Possible!");
  }else{
    console.log("Not Possible!");
  }
  console.log(obj);
}


let str = "rabbbbcar";
palindromeCheck(str);
