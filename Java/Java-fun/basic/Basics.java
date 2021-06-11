import java.util.ArrayList;
import java.util.Iterator;

public class Basics{
    public static void main(String[] args) {
        printet(256);
        oddnum(256);
        summation(256);
        int[] arr={1,6,7,5};
        arraysd(arr);
        int[] array = {1,3,5,7,9,13};
		maximmum(array);
        int[] ar={2, 10, 3};
        average(ar);
        odd(256);
        int[] c={1,3,5,7};
        greater(c);
        int[] x={0,1,5,10,-2};
        sqaure(x);
        int[] z={1,-5,2,7};
        eliminate(z);
        int[] n={5,-1,2,8};
        summin(n);
        int[] h={7,5,3,9};
        shift(h);
    }

    public static void printet(int num){
        int sum=0;
        for (int i =0; i< num; i++){
            sum= sum+i;
        }
        System.out.println(sum);
    }

    public static void oddnum(int s){
        int tot=0;
        for( int i=1; i<s; i+=2){
            tot=tot+i;
        }
        System.out.println(tot);
    }

    public static void summation(int a){
        int total=0;
        for(int i=1; i<a; i++){
            total=total+i;
            System.out.printf("new number: %d  Sum: %d", i, total);
        }
    }

    public static void arraysd(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void maximmum(int[] array){
        int max=0;
        for(int i=0; i< array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        System.out.println(max);
    }
    public static void average(int[] ar){
        int sum=0;
        for(int i=0; i<ar.length; i++){
            sum= sum+ ar[i];
        }
        int avg = sum / ar.length;
        System.out.println(avg);
    }
    public static void odd(int num){
        ArrayList<Object> list = new ArrayList<Object>();
		for (int i=1; i<=num; i+=2) {
			list.add(i);
		}
		System.out.println(list);
    }
    public static void greater(int[] c){
        int sum=0;
        
        for(int i=0; i< c.length;i++){
            int max = c[0];
            if(c[i]> max){
                sum= sum +1;
            }
        }
        System.out.println(sum);
    }
    public static void sqaure(int[] x){
        for(int i=0; i<x.length; i++){
            x[i]= x[i]* x[i];
        }
        System.out.println(x);
    }
    public static void eliminate(int[] z){
        for(int i=0; i< z.length; i++){
            if(z[i]<0){
                z[i]=0;
            }
        }
        System.out.println(z);
    }
    public static void summin(int[] n){
        int min=n[0];
        int max=n[0];
        int sum=0;
        for(int i=0; i<n.length; i++){
            if(n[i]< min){
                min=n[i];
            }
            if(n[i]> max){
                max= n[i];
            }
            sum= sum+ n[i];
        }
        int av= sum/ n.length;
        System.out.println(min);
        System.out.println(max);
        System.out.println(av);
    }
    public static void shift(int[] h){
        for(int i=0; i<h.length; i++){
            h[i]=h[i+1];
            h[h.length-1]=0;
        }
        System.out.println(h);
    }

}