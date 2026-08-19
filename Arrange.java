import java.util.*;
public class Arrange{
    public void Arranges(int[] arr){
        int C0=0;
        int C1=0;
        int C2=0;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                C0+=1;
            }
            else if(arr[i]==1){
                C1+=1;
            }
            else if(arr[i]==2){
                C2+=1;
            }
        }
        for(int i=0;i<C0;i++){
            arr[i]=0;
        }
        for(int i=0;i<C1;i++){
            arr[i+C0]=1;
        }
        for(int i=0;i<C2;i++){
            arr[i+C0+C1]=2;
        }
    }
    public static void main(String[] args){
        int arr[]={0,1,2,0,1,2};
        Arrange obj=new Arrange();
        obj.Arranges(arr);
        System.out.println(Arrays.toString(arr));
    }
}