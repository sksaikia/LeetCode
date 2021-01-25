package LC1_100;

import java.util.*;

public class LC71 {
    public static void main(String[] args) {
        String str = "/a/./b/../../c/";
        System.out.println(method(str));
    }

    private static String method(String str) {



//         "/a/./b/../../c/"
//          Splitting by '/' -> a,.,b,..,..,c

//             String         Stack            Action
//                 a           (a)
//                 .           (a)              ".",".." and "" is skipped
//                 b           (a),(b)
//                 ..          (a)             top element is popped as we encounter ".."
//                 ..          EMPTY           top element is pooped as we encounter ".." , stack is empty
//                 c           (c)




        //Splitting the str by "/" .
        String[] ar = str.split("/");

        Stack<String> stack = new Stack<>();
        //We put these 3 strings in a set such that
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
        for (String a:ar){
            if (a.equals("..") && !stack.isEmpty())
                stack.pop();
            else if(!skip.contains(a))
                stack.push(a);
        }


        if (stack.isEmpty())
            return "/";
        String ans = "";
        while (!stack.isEmpty())
            ans = "/"+ stack.pop() + ans;

        return ans;


    }
}
