class Q40{
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
            System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
            System.out.print((char)('A' + k));
        }
            for (int l = i - 2; l >= 0; l--){
            System.out.print((char)('A' + l));
            }
            System.out.println();
        }
    }
}
