public class Main{
    public static void main(String[] args) {
        int i = 0;
        while(i < 3){
            int j = 0;
            i++;
            while (j < 4){
                System.out.println("x");
                j++;
            }
        }
    }
}

/* mesmo codigo usando for ->

    for (int i = 0; i < 3; i++){
        for(int j = 0; i < 4. j++){}
            sout("x");
    }
 */