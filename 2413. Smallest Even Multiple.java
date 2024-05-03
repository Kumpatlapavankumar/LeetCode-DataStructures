class Solution {
    public int smallestEvenMultiple(int n) {
        // Calculate the least common multiple (LCM) of 2 and n
        // LCM(a, b) = (a * b) / GCD(a, b)
        // Since one of the numbers is 2, we can simplify it to n / GCD(2, n)
        int gcd = gcd(2, n);
        return (2 * n) / gcd;
    }
    
    // Function to find the greatest common divisor (GCD) of two numbers
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
