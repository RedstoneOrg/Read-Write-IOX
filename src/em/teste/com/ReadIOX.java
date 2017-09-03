package em.teste.com;

import java.util.ArrayList;
import java.util.List;

public class ReadIOX implements IOX {

    private List<Object> objects = new ArrayList<>();

    public ReadIOX() {
        objects.clear();
    }

    public void read(String line){
        List<String> type = Utils.explode(",", line);
        int id = Integer.parseInt(type.get(0));
        switch(id){
            case Batch:
                break;
            case InformationPacket:
                String packetName = type.get(1);
                String message = type.get(2);

                objectAdd(id, packetName, message);
                break;
        }
    }


    private void objectAdd(Object... object){
        for(Object obj : object){
            objects.add(obj);
        }
    }

    public List<Object> getObjects() {
        return objects;
    }
}
