public class EquivalentExpressions {
    public static void main(String[] args) {
        int x = 1; // try with x = -1, x = 0, and x = 1
        System.out.println(!(x == 0 || x >= 1));
        // add print statements for expressions in #2 and #3
        // to see if they are equivalent when x = -1, 0, and 1.
        System.out.println(!(x == 0) && !(x >= 1));
        System.out.println((x != 0) && (x < 1));

    }
}
// 1. This is the set of negative numbers. The expression is false when x is
// positive and is true when x is negative

// 2. This is the set of negative numbers as well

// 3. This is also the set of negative numbers

// 4. Yes the 3 booleans are equivalent because they all return the same thing
// when the value of x is changed to 1, 0, and -1.