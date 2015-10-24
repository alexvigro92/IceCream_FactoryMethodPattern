package mx.iteso.factory;

public abstract class ConeIceCream {
    public String name;


    public void serve() {
        System.out.println("Sirviendo un cono de helado..." );
    }

    public void prepare() {
        System.out.println("Preparando " + name);

    }
    public String getName(){
        return name;
    }
}