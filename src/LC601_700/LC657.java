package LC601_700;

public class LC657 {
    public boolean judgeCircle(String moves) {
        int dx = 0;
        int dy = 0;

        for (int i=0;i<moves.length();i++){

            char c = moves.charAt(i);

            switch (c){

                case 'R' : dx = dx+1;
                    break;
                case 'D' : dy = dy-1;
                    break;
                case 'L' : dx = dx-1;
                    break;
                case 'U' : dy = dy+1;
                    break;


            }



        }

        if (dx==0 && dy==0)
            return true;
        return false;
    }
}
