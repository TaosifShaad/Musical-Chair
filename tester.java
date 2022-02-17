public class tester{
  public static void main(String args []){
int siz=20,strt=10;
    Object a[]=new Object[20];
quizb b=new quizb(a,siz,strt);
b.initialize();
b.print();

while(true){ 
double n=Math.random()*10;

  for(int i=0;i<(int)n;i++){
  b.leftrotate();
  }
  b.eliminate();
  siz--;
  if(siz!=1){
  
  b.printlin();
  }else{
  b.printlin();
  break;
 }
}

  }
}