public class Main {
    public static void main(String[] args) {

        }
        public int countOccurence(String word, char bogstav){
        if(word == null){
            return -1;
        }
        int number = 0;
        String wordChecking = word.toUpperCase();
        char bogstavChecking = Character.toUpperCase(bogstav);
            for(int i = 0; i < wordChecking.length(); i++){
                if(wordChecking.charAt(i) == bogstavChecking){
                    number++;
                }
            }
            return number;
        }
    }

