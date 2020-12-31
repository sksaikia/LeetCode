package LC701_800;

public class LC796 {
    public boolean rotateString(String A, String B) {
        return A.length()==B.length() && (A+A).contains(B);
    }
}
