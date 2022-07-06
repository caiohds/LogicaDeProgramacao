
class Ex42{
public static void main(String[] args){

 
int fat = 1;

for(int i = 1;i<=10;i++){
	fat = 1;
for(int i2 = 1;i2<=i;i2++){
	fat*=i2;
	if(i2<i){
	
	System.out.print( " "+i2 + " *");
}else{
	System.out.print(" "+ i2 + " = ");
	}
	}
	System.out.print(fat);
	System.out.println();
	
	
	}
	
}			
}
