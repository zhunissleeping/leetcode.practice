package problems.Easy.Valid_Parenthese;

public class test {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.isValid("()"));
        System.out.println(sol.isValid("()[]{}"));
        System.out.println(sol.isValid("(]"));
        System.out.println(sol.isValid("([])"));
    }
}
