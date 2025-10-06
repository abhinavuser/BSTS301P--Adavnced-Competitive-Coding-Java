import java.util.*;
class Main{
    public static String pali(String str){
        int freq[] = new int[26];
        for(char c :str.toCharArray()) freq[c-'a']++;
        int oddcount=0,oddindex=-1;
        for(int i=0;i<26;i++){
            if(freq[i]%2 !=0){
                oddcount++;
                oddindex=i;
            }
        }
        if((str.length()%2==0 && oddcount > 0) || (str.length()%2==1 && oddcount != 1)){
            System.out.println("no palindrime");
        }
        if(oddindex != -1) freq[oddindex]--;
        String front ="";
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++)
            front+=(char)(i+'a');
        }
        String rear = new StringBuilder(front).reverse().toString();
        String mid = oddindex == -1?"":""+(char)(oddindex+'a');
        return front+mid+rear;
        }
        public static void main(String[] args) {
        System.out.println(pali("malayalam"));
    }
}
