package a2_1901040156;

/**
 * @overview
 * A class uses PC and has only one instance.
 */
public class PCFactory {
    private static PCFactory instance = null;

    /**
     * @effects
     *  initialise this to be an empty object
     */
    private PCFactory() {}

    /**
     * @effects
     *  if instance = null
     *    initialise it
     *  return instance
     */
    public static PCFactory getInstance() {
        if (instance == null) {
            instance = new PCFactory();
        }
        return instance;
    }

    /**
     * @effects
     *  create a PC and return it
     */
    public static PC createPC(String model, int year, String manufacture, Set<String> comps) {
        return new PC(model, year, manufacture, comps);
    }
}
