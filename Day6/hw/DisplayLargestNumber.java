public class DisplayLargestNumber{
    public static void main(String[] args){
        int largest_number = Integer.parseInt(args[0]);
        for(int i =0;i<args.length;i++){
            int num = Integer.parseInt(args[i]);
            if(num>largest_number){
                largest_number=num;
            }
        }
        System.out.printf("Largest number among input is %d\n",largest_number);
    }
}