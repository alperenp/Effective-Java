package singer;
// Singleton with public final field
public class Elvis1 {
    public static final Elvis1 INSTANCE = new Elvis1();
    private Elvis1(){
        //...
    }

    public void leaveTheBuilding(){
        //...
    }

    /* FOR SERIALIZATION */
    // readReseolve method to preserve singleton property
    private Object readResolve(){
        // Return one true Elvis and let the garbage collector
        // take care of the Elvis impersonator
        return INSTANCE;
    }
}
