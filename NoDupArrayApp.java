
package noduparrayapp;


public class NoDupArrayApp {

    
    public static void main(String[] args) {
       NoDupArray x=new NoDupArray(10);
       x.insert(7);
       x.insert(3);
       x.insert(2);
       x.display();
       x.delete(7);
       x.display();
       
    }
    
}

class NoDupArray
{
    private long[]a;
    private int nElements;
    
    public NoDupArray(int max){
        this.a=new long[max];
        this.nElements=0;
        
    }
    public boolean find(long searchKey){
        for(int i=0;i<a.length;i++){
           if (a[i]==searchKey){
               return true;
           } 
        }
        return false;
    }
    public void insert(long value){
       if(this.a.length ==this.nElements){
           System.out.println("array is fu;;.cannot insert");
           return;
          
       } 
       if(find(value)){
           System.out.println("value is already exists");
       }
       else{
           this.a[this.nElements]=value;
           this.nElements++;
           System.out.println("value inserted");
       }
    }
    public boolean delete(long value){
        for(int i=0;i<this.nElements;i++){
            if(this.a[i]==value){
                for(int j=i;j<this.nElements;j++){
                    this.a[j]=this.a[j+1];
                    
                }
                System.out.println("recored deleted");
                this.nElements--;
                return true;
                
            }
            
        }
        System.out.println("value not found for deletion");
        return false;
    }
    public void display(){
        for(int i=0;i<nElements;i++){
        System.out.print(a[i]+" ");
    }
    }
    
}
