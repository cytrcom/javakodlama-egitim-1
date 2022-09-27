public class miniProjeHarfler {

    public static void main(String[] args) {
        //bir karakterin sesli mi sessiz harf mi onu öğrenmek
        char harf = 'E'; //değeri tek tırnak içinde girmeyi unutma

        switch (harf) {
            case 'A': //değeri tek tırnak içinde girmeyi unutma
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Harf sesli harf");
                break;
            default:
                System.out.println("Harf sesli harf değil");
        }
    }
}
