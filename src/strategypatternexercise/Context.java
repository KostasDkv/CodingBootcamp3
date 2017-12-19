

package strategypatternexercise;

// edw dinw sto Context formatters kai 
// prepei na epistefei analoga to apotelesma tou algorithm
public class Context {
private final Compress compress; // san instance metavliti pairnei to interface pou kanei ta compressions

// contructor
public Context(Compress compress){
    this.compress = compress;
}

public void executeCompress (){
    compress.compressMethod();     
}
}
