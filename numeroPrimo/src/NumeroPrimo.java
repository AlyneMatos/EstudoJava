public class NumeroPrimo {
    public static boolean Primo(int inteiro) {
        for(int i=2; i<inteiro;i++){
            if(inteiro % i == 0) {
                return false;
            }
        }
        return true;
    }
}