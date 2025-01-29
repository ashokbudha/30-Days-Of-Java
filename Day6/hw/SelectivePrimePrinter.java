
public class SelectivePrimePrinter{

    static public void print_filtered_primes(){ 
        for(int i=1;i<=100;i++){
            if(check_prime(i)){
                boolean should_print = true;
                for(int j= 13;j<=100;j=j+13){
                    if(i==13){
                        // since we have already filtered prime number. except 13 tesko multiples ya aaune tah kurai bhayena
                        should_print=false;
                        break;
                    }
                    else if(i % reverse_number(j) ==0){
                        // instead of calculation reverse number everytime i could precalculate and store in array but its ok array napadeko le use nagareko
                        should_print = false;
                        break;
                    }
                    else if(check_digit(i)){
                        should_print = false;
                        break;
                    }

                }

                if(should_print){
                    System.out.println(i);

                }
            }
        }
        
    } 

    static public boolean check_prime(int num){
        for(int i =2;i<num;i++){
            if(num%i==0){
                return false;
            }
            
        }   
        return true;

        
    }

    static public int reverse_number(int num){
        int reverse =0;
        while(num!=0){
            int digit = num%10;
            reverse = reverse*10 +digit;
            num /=10;
        }
        return reverse;
    }
    static public boolean check_digit(int i){
        // 1 ra 3 matra check garna parne raixa bt initially maile 13 ko sabai multiples ko digit check garne hoki sochira
        while(i != 0){
            int digit = i%10;
            if(digit==1 || digit ==3){
                return true;
            }
            i/=10;
        }
        
        return false;
        
        

    }


  public static void main(String[] args)
  {
        print_filtered_primes();

  }
}


