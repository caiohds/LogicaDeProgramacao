
class Ex47{
public static void main(String[] args){

int cont = 0;

for(int i = 1;i<100;i++){
cont = 0 ;
for(int i2 = 2;i2<i;i2++){
 if( i%i2 == 0){
		cont++;
			break;
		}
}
if(cont ==0){
System.out.println(i);
}
}
}
}
