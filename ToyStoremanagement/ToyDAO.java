package toyproject;
import java.util.ArrayList;
public class ToyDAO {

	    private ArrayList<Toy> toys = new ArrayList<>();
	    private int idCounter = 1;

	    public void addToy(String name, double price) {
	        toys.add(new Toy(idCounter++, name, price));
	    }

	    public ArrayList<Toy> getAllToys() {
	        return toys;
	    }

	    public boolean updateToy(int id, String name, double price) {
	        for (Toy t : toys) {
	            if (t.getId() == id) {
	                t.setName(name);
	                t.setPrice(price);
	               
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean deleteToy(int id) {
	        return toys.removeIf(t -> t.getId() == id);
	    }
	  

	    public Toy getCheapestToy() {
	        if (toys.isEmpty()) return null;

	        Toy cheapest = toys.get(0);
	        for (Toy t : toys) {
	            if (t.getPrice() < cheapest.getPrice()) {
	                cheapest = t;
	            }
	        }
	        return cheapest;
	    }

	    public Toy searchToy(String name) {
	        for (Toy t : toys) {
	            if (t.getName().equalsIgnoreCase(name)) {
	                return t;
	            }
	        }
	        return null;
	    }
	}


