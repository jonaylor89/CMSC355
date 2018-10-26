
public class InClass10 {
    
    public static void main(String[] argv) {
    
        Controller c = new Controller();
        Observer1 o1 = new Observer1();
        Observer2 o2 = new Observer2();
        c.addObserver(o1);
        c.addObserver(o2);

       o1.addItem(new Item());
       o2.addItem(new Item());

    }

}

class Item {
    
}

interface Observer {
    void addItem(Item item);
    Item removeItem();
}

class Observer1 implements Observer {

    void addItem() {
    
    }

    Item removeItem() {
    
    }
}

class Observer2 implements Observer {

    void addItem() {
    
    }

    Item removeItem() {
    
    }
}

class Controller {
    Observer[] observers;

    void addObserver(Observer o) {
    
    }

    void removeObserver() {
    
    }

}
