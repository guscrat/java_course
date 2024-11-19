public class Switch {
    public static void main(String[] args) {
        int dia = 3;
        String nomeDia;

        switch (dia) {
            case 1:
                nomeDia = "domingo";
                break;
        
            default:
                nomeDia = "dia invalido";
                break;
        }

        System.out.println(nomeDia);
    }
}
