package collection;

public class StdentCollection implements Comparable<StdentCollection>{
    private int id;
    private String name;

    public StdentCollection(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return String.format("Name-%s,id-%d",name,id);

    }

    @Override
    public int compareTo(StdentCollection that) {
        return Integer.compare(this.id,that.id);
    }
}
