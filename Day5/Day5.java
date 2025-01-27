public class Day5{
    static void practice(){
        int i; 
        for(i=0;i<=10;i++){
            System.out.println(i);
        }
        i=0;
        while(i<=10){
            if(i==7){
                // break;
                i=i+1;
                continue;
                
            }
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args){
        practice();
    }
}