class Solution {
    public String multiply(String num1, String num2) {
        java.math.BigInteger n1 = new java.math.BigInteger(num1);
        java.math.BigInteger n2 = new java.math.BigInteger(num2);
        return n1.multiply(n2).toString();
    }
}