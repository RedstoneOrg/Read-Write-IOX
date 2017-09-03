package em.teste.com;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class Main {

    public static void main(String[] args){
        long atual = System.currentTimeMillis();

        String textoQueSeraEscrito = "1,InformationPacket,Sou o InformationPacket";

        FileWriter arquivo;

        try {
            arquivo = new FileWriter(new File("vrau.iox"));
            arquivo.write(textoQueSeraEscrito);
            arquivo.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("vrau.iox"));
            String line = "";
            while((line = reader.readLine()) != null) {
                ReadIOX iox = new ReadIOX();
                iox.read(line);
                for(int i = 0; i < iox.getObjects().size(); i++){
                    System.out.println(iox.getObjects().get(i));
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        long pos = System.currentTimeMillis();
        System.out.println(pos - atual);
    }

}
