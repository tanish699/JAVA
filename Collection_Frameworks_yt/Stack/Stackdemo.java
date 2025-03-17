// package Collection_Frameworks_yt.Stack;
import java.util.Stack;

public class Stackdemo {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(0);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        st.pop();
        System.out.println(st);

        Integer el = st.peek();  // Agr sirf dekhna hai remove nhi krna
        System.out.println(el);

        System.out.println(st.isEmpty());
        System.out.println(st.size());
        System.out.println(st.search(2));

    }
    
}
