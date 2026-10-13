package randomized;
import java.util.*;
public class RandomizedQuickSort { private static final Random R=new Random(42);public static void sort(int[] a){sort(a,0,a.length-1);}private static void sort(int[] a,int l,int r){if(l>=r)return;int p=l+R.nextInt(r-l+1);int x=a[p];int i=l,j=r;while(i<=j){while(a[i]<x)i++;while(a[j]>x)j--;if(i<=j){int t=a[i];a[i++]=a[j];a[j--]=t;}}sort(a,l,j);sort(a,i,r);} }
