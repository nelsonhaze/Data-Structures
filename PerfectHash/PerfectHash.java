/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author Nelson
 */
public class PerfectHash {

    int N = 60000;
    int ip = 0;
    int pk = 0;
    private Ticket[] data;

    public PerfectHash(int length) {
        {
            int pseudokey = k - kmin;
            n = length
            data = new Listing[N];
            deleted = new Listing("", "", "");
            for (int i = 0; i < N; i++) {
                data[i] = null;
            }
        }

    }

    public boolean insert(Ticket newTicket) {
        boolean success = false;
        int key = stringToInt(newTicket.getKey());
        pk = key-1999;
        ip = pk;
        if(ip < N){
            data[ip] = newTicket.deepCopy();
            success = true;
        }
        return success;
        
    }

    public static int stringToInt(String aKey) // from Figure 5.18
    {
        int pseudoKey = 0;
        int n = 1;
        int cn = 0;
        char c[] = aKey.toCharArray();
        int grouping = 0;
        while (cn < aKey.length()) // there is still more character in the key
        {
            grouping = grouping << 8;      // pack next four characters in i
            grouping = grouping + c[cn];
            cn = cn + 1;
            if (n == 4 || cn == aKey.length()) // 4 characters are processed or no more characters
            {
                pseudoKey = pseudoKey + grouping;
                n = 1;
                grouping = 0;
            }
            n = n + 1;
        }
        return Math.abs(pseudoKey);
    }
