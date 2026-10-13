package parallel;
import java.util.*;import java.util.concurrent.*;
public class ParallelReduce { public static long sum(int[] a,int threads)throws Exception{ExecutorService ex=Executors.newFixedThreadPool(threads);List<Future<Long>> fs=new ArrayList<>();int chunk=(a.length+threads-1)/threads;for(int s=0;s<a.length;s+=chunk){int from=s,to=Math.min(a.length,s+chunk);fs.add(ex.submit(()->{long x=0;for(int i=from;i<to;i++)x+=a[i];return x;}));}long total=0;for(Future<Long> f:fs)total+=f.get();ex.shutdown();return total;} }
