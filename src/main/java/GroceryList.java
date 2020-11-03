public class GroceryList {
    private String[] list;

    public GroceryList() {
        this.list = new String[10];
    }

    public void add(String addition) {
        for (int i = 0; i<this.list.length; i++) {
            if (this.list[i] == null) {
                this.list[i] = addition;
                break;
            }
        }
    }

    public void remove(String removal) {
        for (int i = 0; i<this.list.length; i++) {
            if (this.list[i].equals(removal)) {
                this.list[i] = null;
                break;
            }
        }
    }

    public String toString() {
        String str = "";
        for(int i = 0; i<this.list.length; i++) {
            if (!(this.list[i] == null)) {
                str += this.list[i] + ", ";
            }
        }
        return str;
    }
}