public abstract class Reversor {
    public static String revertString(String palavra){
        String palavraReversa = "";

        for (int i = palavra.length() - 1; i >= 0; i--){
            palavraReversa += palavra.charAt(i);
        }
        return palavraReversa;
    }
}
