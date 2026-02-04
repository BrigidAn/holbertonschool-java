public class Numbers0to99 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print(i + (i < 99 ? ", " : "\n"));
        }
    }
}
