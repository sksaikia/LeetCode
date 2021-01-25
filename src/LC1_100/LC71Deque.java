package LC1_100;

import java.util.*;

public class LC71Deque {
    public String simplifyPath(String str) {


//         "/a/./b/../../c/"
//          Splitting by '/' -> a,.,b,..,..,c

//             String         Stack            Action
//                 a           (a)
//                 .           (a)              ".",".." and "" is skipped
//                 b           (a),(b)
//                 ..          (a)             top element is popped as we encounter ".."
//                 ..          EMPTY           top element is pooped as we encounter ".." , stack is empty
//                 c           (c)




        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));

        for (String dir : str.split("/")) {
            if (dir.equals("..") && !stack.isEmpty())
                stack.pop();
            else if (!skip.contains(dir))
                stack.push(dir);
        }

        String res = "";

        for (String dir : stack)
            res = "/" + dir + res;

        if(res.isEmpty())
            return "/";
        return res;

    }
}
