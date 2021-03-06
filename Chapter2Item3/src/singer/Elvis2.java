package singer;
// Singleton with static factory
public class Elvis2 {
    private static final Elvis2 INSTANCE = new Elvis2();
    private Elvis2(){
        //...
    }

    public static Elvis2 getInstance(){
        return INSTANCE;
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
