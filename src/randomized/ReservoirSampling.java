package randomized;
import java.util.*;
public class ReservoirSampling { public static <T> List<T> sample(List<T> data,int k){Random r=new Random(42);List<T> res=new ArrayList<>();for(int i=0;i<data.size();i++){if(i<k)res.add(data.get(i));else{int j=r.nextInt(i+1);if(j<k)res.set(j,data.get(i));}}return res;} }
