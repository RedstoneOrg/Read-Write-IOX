package em.teste.com;

import com.sun.deploy.util.StringUtils;
import java.util.*;

public class Utils {

    public static List<String> explode(String object, String delim){
        List<String> list = new ArrayList<>();
        String data = delim;
        StringTokenizer tokens = new StringTokenizer(data, object);
        while(tokens.hasMoreElements()) {
            list.add((String) tokens.nextElement());
        }
        return list;
    }

    public static String implode(Collection object, String delim){
        String implode = StringUtils.join(object, delim);
        return implode;
    }

}

