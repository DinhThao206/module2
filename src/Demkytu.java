public class Demkytu {
    public static void main(String[] args) {
        String chuoi = "canh hoc lap trinh java co ban";
        char kiTuDem = 'a';
        int count = 0 ;
        for( int i = 0;i < chuoi.length(); i++){
            if(chuoi.charAt(i) == kiTuDem){
                count++;
            }
        }
        System.out.println("Số kí tự cần đếm là: "+ count);
    }
}
