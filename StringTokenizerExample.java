import java.util.StringTokenizer;
public class StringTokenizerExample {
    public static void main(String[] args){
        String str = "java,python,c++,javascript";
        StringTokenizer st=new StringTokenizer(str,",");
        while(st.hasMoreTokens()){
            System.err.println(st.nextToken());
        }
    }
    
}
