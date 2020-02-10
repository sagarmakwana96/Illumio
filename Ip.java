import java.util.*;

public class Ip {
    List<Integer> start_ip_range;
    List<Integer> end_ip_range;

    public Ip(String ip_inp) {
        if (ip_inp.indexOf('-') != -1) {
            String[] range = ip_inp.split("-");
            this.start_ip_range = Arrays.stream(range[0].split("\\.")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
            this.end_ip_range = Arrays.stream(range[1].split("\\.")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        }
        else {
            this.start_ip_range = this.end_ip_range = Arrays.stream(ip_inp.split("\\.")).map(e -> Integer.parseInt(e)).collect(Collectors.toList());
        }
    }

    public boolean ip_range(IpAddress input) {
        for (int i=0; i<4; i++) {
            if (input.start_ip_range.get(i) < this.start_ip_range.get(i) || input.end_ip_range.get(i) > this.end_ip_range.get(i)) {
                return false;
            }
        }
        return true;
    }
}