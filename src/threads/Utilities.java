/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.net.URISyntaxException;

/**
 *
 * @author usefw
 */
public interface Utilities {
    public abstract  boolean isValid(String url)throws URISyntaxException;
    public abstract boolean isValid2(String url);
    public abstract String getDomain(String FatherLink);
    public abstract String combine(String domain,String link);
}
