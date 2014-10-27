/**
 * Created by apple on 14/10/27.
 */
public class Function {

    public int sum(int a, int b){
            return a + b;
    }

    public int compareTo(String a, String b){
        if(a == null || b == null)
            return 0;
        return a.compareTo(b);
    }

}
