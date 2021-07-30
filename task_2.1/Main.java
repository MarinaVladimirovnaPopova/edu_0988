ppublic class Main {
    public static void main(String[] args) {
        String[] mama = {"Мама", "Мыла", "Раму"};
        for(int i=0; i<=2; i++){
            for(int j=0; i<=2; i++){
                for(int k=0; i<=2; i++){
                    String word = mama[i]+mama[j]+mama[k];
                    System.out.println(""+word);
                }
            }

        }
