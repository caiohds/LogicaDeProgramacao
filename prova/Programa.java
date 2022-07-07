public class Programa {
    public static void main(String args[]) {
		
        for(int i = 1; i<=10;i++){
			
			if(i%2 == 0){
				System.out.print(i+", ");
					for(int i2 = 1;i2<i;i2++){
						
					System.out.print( i2 +" ");
				}
				System.out.println();  
					}else{
						System.out.print(i+", ");
					for(int i2 = i+1;i2<=10;i2++){
					System.out.print( i2 +" "); 
						}
					System.out.println();  	
				}
			}
    }
}
