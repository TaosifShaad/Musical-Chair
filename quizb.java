public class quizb{
  public int start;
  public int size;
  public Object []source;
  
  public quizb(Object s[],int sze,int str){
  source=s;
  size=sze;
  start=str;
  }
  
  public void initialize(){
    
    int st=start;
    for (int i=0,j=1;i<size;i++,j++,st++){
    source[st%source.length]=j;
    }
  
  
  }

  public void print(){
  int st=start;
  for(int i=0;i<size;i++,st++){
  System.out.print(source[st%source.length]+" ");
  }
  System.out.println();
  }

  public void leftrotate(){
    //double n=Math.random()*10;
    
    Object temp=source[0];
    for (int i=1;i<source.length;i++){
    source[i-1]=source[i];
    }
    source[source.length-1]=temp;
  start--;
  }
  
  public void eliminate(){
  source[source.length-1]=null;
  Object source2[]=new Object[source.length-1];
  for(int i=0,j=0;i<source2.length;i++,j++){
    if(source[i]!=null){
    source2[i]=source[j];
    }else{
    j++;
    }
  }
  source=source2;
  }
  
  public void printlin(){
    for (int i=0;i<source.length;i++){
      
    System.out.print(source[i]+" ");
     
    }
  System.out.println();
  }
  
  
}