/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author lucascoiado
 */
public class User {
    private static String nombdd;
    private static String login;
    private static String motpasse;
    private static String loginECE;
    private static String motpasseECE;
    private static boolean local;

    public static String getLoginECE() {
        return loginECE;
    }

    public static void setLoginECE(String loginECE) {
        User.loginECE = loginECE;
    }

    public static String getMotpasseECE() {
        return motpasseECE;
    }

    public static void setMotpasseECE(String motpasseECE) {
        User.motpasseECE = motpasseECE;
    }

    public static String getNombdd() {
        return nombdd;
    }

    public static void setNombdd(String nombdd) {
        User.nombdd = nombdd;
    }

    public static String getLogin() {
        return login;
    }

    public static void setLogin(String login) {
        User.login = login;
    }

    public static String getMotpasse() {
        return motpasse;
    }

    public static void setMotpasse(String motpasse) {
        User.motpasse = motpasse;
    }

    public static boolean isLocal() {
        return local;
    }

    public static void setLocal(boolean local) {
        User.local = local;
    }

    public static User getINSTANCE() {
        return INSTANCE;
    }

    public static void setINSTANCE(User INSTANCE) {
        User.INSTANCE = INSTANCE;
    }

    
    
    private User()
    {}
    
    private static User INSTANCE = null;
    
    public static User getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new User(); 
        }
        return INSTANCE;
    }
}
