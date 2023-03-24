import java.util.ArrayList;

public class Latihan {
    public static void main(String[] args) {
 
        ArrayList<Object> animals = new ArrayList<Object>();
        
        Hewan hewan = new Hewan();
        DeleteHewan deleteHewan = new DeleteHewan();
        
        hewan.addData("Sapi");
        hewan.addData("Kelinci");
        hewan.addData("Kambing");
        hewan.addData("Unta");
        hewan.addData("Domba");

        deleteHewan.addData("Kelinci");
        deleteHewan.addData("Kambing");
        deleteHewan.addData("Unta");
        
        animals.add(hewan);
        animals.add(deleteHewan);
         
        for (String data : deleteHewan.getData()) {
            hewan.removeData(data);
        }
        
        System.out.println("Output hewan: " + animals);
    }
}

class Hewan {
    ArrayList<String> data = new ArrayList<String>();
    
    public void addData(String s) {
        data.add(s);
    }
    
    public void removeData(String s) {
        data.remove(s);
    }
    
    public String toString() {
        return "Hewan : " + data;
    }
}

class DeleteHewan {
    ArrayList<String> data = new ArrayList<String>();
    
    public void addData(String s) {
        data.add(s);
    }
    
    public ArrayList<String> getData() {
        return data;
    }
    
    public String toString() {
        return "Hewan yang dihapus : " + data;
    }
}
