package experiments;

public class Exception {
    public static void main(String[] args) {
        String[] strArray ={"str1","str2","str3"};
        uncheckedException(strArray);
        try {
            pause();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        uncheckedException(strArray);
    }
    private static void uncheckedException(String[]strArray){
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println(strArray[i]);

            }
        }catch (ArrayIndexOutOfBoundsException e ){
            e.printStackTrace();
            System.out.println("Create Exception");
        }
        System.out.println("Program is working");


    }

    private static void pause() throws InterruptedException {

        Thread.sleep(3000);
    }


}

