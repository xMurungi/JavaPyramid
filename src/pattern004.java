public class pattern004{  
    public static void main(String[] args){
        for(int i=5; i>=1; i--){
            for(int k=1; k<=(i*2)-i; k++){
                System.out.print(" ");
           }
            for(int j=i; j<=5; j++){
                System.out.print("*"+" ");
            }
           
            System.out.println();
        } 
    }
}

        
