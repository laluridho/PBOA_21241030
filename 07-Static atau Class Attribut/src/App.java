class Display {

private String name;
   public static String type = "layar";

    public static String getType() {
        return type;
    }

    public static void setType(String type) {
        Display.type = type;
    }

    Display(String name) {
        this.name = name;

    }

    /// method tanpa return, tanpa parameter
    void show() {
        System.out.println("Nama Display : " + this.name);

    }

}

public class App {
    public static void main(String[] args) throws Exception {
        //intansiasi atau penciptaan objek
        Display tampil1 = new Display("Monitor");
        Display tampi2 = new Display("Lcd");
        //tampil.show

        //menampilkan static dan atribut
        System.out.println("Menampilkan Static Atribut");
        System.out.println(tampil1.type);
        System.out.println(tampi2.type);
        System.out.println(Display.type);

        Display.type = "Megatron";

        System.out.println("Menampilkan Static atribut ");
        System.out.println(tampil1.type);
        System.out.println(tampi2.type);
        System.out.println(Display.type);


       
    }
}
