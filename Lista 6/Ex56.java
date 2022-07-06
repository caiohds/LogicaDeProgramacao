class Ex56{
public static void main(String[] args){



int divisor = 0;



for(int i = 1;i<=900;i++){
	divisor = 0;
for(int i2 = 1;i2<i;i2++){
	if(i%i2 == 0){
		divisor+=i2;
		}
		
	}
	if(divisor == i){
		System.out.println(i);
		}
	}
	


}
}
