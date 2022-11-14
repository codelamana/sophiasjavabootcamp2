package de.jakob.telefon;


public class PhoneNumber {

    String name;
    String vorname;
    String vorwahl;
    String nummer;

    public PhoneNumber(String name, String vorname, String vorwahl, String nummer) {
        this.name = name.replace("\"", "");
        this.vorname = vorname.replace("\"", "");
        this.vorwahl = vorwahl.replace("\"", "");
        this.nummer = nummer.replace("\"", "");
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "name='" + name + '\'' +
                ", vorname='" + vorname + '\'' +
                ", vorwahl='" + vorwahl + '\'' +
                ", nummer='" + nummer + '\'' +
                '}';
    }
}
