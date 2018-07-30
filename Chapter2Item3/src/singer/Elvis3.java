package singer;
//Enum singleton - the preferred approach
public enum Elvis3 {
    INSTANCE;

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
