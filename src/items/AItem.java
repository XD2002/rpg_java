package items;

public abstract class AItem implements IItem{
    protected String description = "No description";
    protected String name = "No Name";

    public String getDescription() {
        return this.description;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
