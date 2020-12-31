package LC101_200;

import java.util.ArrayList;
import java.util.List;

public class LC118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        if(numRows==0)
            return ans;

        List<Integer> first_row = new ArrayList<>();

        first_row.add(1);
        ans.add(first_row);


        for(int i=1;i<numRows;i++){

            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = ans.get(i-1);

            curr.add(1);

            for(int j=1;j<i;j++){

                curr.add(prev.get(j-1) + prev.get(j));
            }

            curr.add(1);

            ans.add(curr);



        }



        return ans;

    }
}
