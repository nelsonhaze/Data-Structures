/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author Nelson
 */
public class Ticket {

    private String ticketNumber;
    private String name;

    public Ticket(String n, String t) {
        name = n;
        ticketNumber = t;
    }
    public Ticket deepCopy() {
        Ticket clone = new Ticket(name, ticketNumber);
        return clone;
    }

    public int compareTo(String targetKey) {
        return (name.compareTo(targetKey));
    }

    public void setTicketNumber(String t)
    {
        ticketNumber = t;
    }

    public String getKey() {
        return ticketNumber;
    }
}
