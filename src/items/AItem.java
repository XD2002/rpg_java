package items;

public abstract class AItem implements IItem{
    protected String description = "No description";
    protected String name = "No Name";

    /**
     * get the description of the item
     * @return the description of the item
     */
    @Override
    public String getDescription() {
        return this.description;
    }

    /**
     * get the name of the item
     * @return the name of the item
     */
    @Override
    public String getName() {
        return this.name;
    }
}
