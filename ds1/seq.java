
import java.util.HashSet;
 
public class Sub {
     
    
    static HashSet<String> st = new HashSet<>();
 
    static void sub(String str)
    {
  
        for (int i = 0; i < str.length(); i++) {
             
       
            for (int j = str.length(); j > i; j--) {
                String s = str.substring(i, j);
             
                if (!st.contains(s))
                    st.add(s);
 
      
                for (int k = 1; k < s.length() - 1; k++) {
                    StringBuffer sb = new StringBuffer(sub_str);
 
        
                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    sub(sb.toString());
                }
            }
        }
    }
 
    
    public static void main(String[] args)
    {
     Scanner obj = new Scanner(System.in);  
      String s = obj.NextLine();
        subsequence(s);
        System.out.println(st);
    }
}
