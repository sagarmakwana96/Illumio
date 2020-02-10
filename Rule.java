public class Rule {
    String direction;
    String protocol;
    Port port;
    Ip ip_address;

    public Rule(String direction, String protocol, String port, String ip_address) {
        this.direction = direction;
        this.protocol = protocol;
        this.port = new Port(port);
        this.ip_address = new Ip(ip_address);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        Rule input = (Rule) obj;
        return (input.direction.equals(this.direction) && input.protocol.equals(this.protocol) && input.port.port_range(this.port) && input.ip_address.ip_range(this.ip_address));
    }
}