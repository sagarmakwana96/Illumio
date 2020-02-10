public class Port {
    int start_range;
    int end_range;

    public Port(String port_inp) {
        if (port_inp.indexOf('-') != -1) {
            start_range = Integer.parseInt(port_inp.split("-")[0]);
            end_range = Integer.parseInt(port_inp.split("-")[1]);
        }
        else {
            start_range = Integer.parseInt(port_inp);
            end_range = Integer.parseInt(port_inp);
        }
    }

    public boolean port_range(Port port) {
        return (port.start_range >= this.start_range) && (port.end_range <= this.end_range);
    }
}