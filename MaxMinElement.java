public class MaxMinElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6};
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<=arr.length-1;i++){
            if( max<arr[i]){
                max=arr[i];

            }
            if(min>arr[i]){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);
        
    
    }
}