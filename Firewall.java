import java.io.*;
import java.util.*;

public class Firewall {
    HashSet<Rule> rule_set;
    public Firewall(String path) throws IOException {
        rule_set = new HashSet<>();
        File input = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(input));
        String str;
        while ((str = br.readLine()) != null) {
            String[] param = str.split(",");
            rule_set.add(new Rule(parak[0], param[1], param[2], param[3]));
        }
    }

    public boolean accept_packet(String direction, String protocol, int port, String ip_address) {
        Rule r = new Rule(direction, protocol, String.valueOf(port), ip_address);
        Iterator<Rule> i = rule_set.iterator();
        while (i.hasNext()) {
            if (r.equals(i.next())) {
                return true;
            }
        }
        return false;
    }
}
