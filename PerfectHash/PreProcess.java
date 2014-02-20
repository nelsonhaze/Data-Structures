/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p6;

/**
 *
 * @author Nelson
 */
public class PreProcess {

    public static int PreProcess(String myKey) {
        int pseudoKey = 0;
        int n = 1;
        int cn = 0;
        char c[] = myKey.toCharArray();
        int grouping = 0;
        while (cn < myKey.length()) // there is still more character in the key
        {
            grouping = grouping << 8;      // pack next four characters in i
            grouping = grouping + c[cn];
            cn = cn + 1;
            if (n == 4 || cn == myKey.length()) // 4 characters are processed or no more characters
            {
                pseudoKey = pseudoKey + grouping;
                n = 1;
                grouping = 0;
            }
            n = n + 1;
        }
        pseudoKey = pseudoKey - 2000;
        return Math.abs(pseudoKey);
    
}