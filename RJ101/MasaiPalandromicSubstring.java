public public static void masaiPalindromicSubstring(String str){
    //write your code here
    int len = 1;
    for(int i = 0; i<str.length();i++){
        StringBuilder sb = new StringBuilder();
        for(int j = i; j<str.length();j++){
            sb.append(str.charAt(j));
            StringBuilder rev = new StringBuilder(sb).reverse();
            if(sb.toString().equals(rev.toString()) && len<rev.length()){
                len = rev.length();

            }
        }
    
    }
    System.out.println(len);
  } {
    
}
