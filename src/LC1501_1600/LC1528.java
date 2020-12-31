package LC1501_1600;

public class LC1528 {
    public String restoreString(String s, int[] indices) {

        char[] ar = new char[s.length()];


        for(int i=0;i<indices.length;i++)
            ar[indices[i]] = s.charAt(i);


        System.out.println(new String(ar));


        return new String(ar);

    }
}
