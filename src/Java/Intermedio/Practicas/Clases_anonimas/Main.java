package Java.Intermedio.Practicas.Clases_anonimas;

public class Main {
    public static void main(String[] args) {

        Purchase customer = new Purchase();
        Purchase specialCustomer = new Purchase() {

            // Sobrescribir el método totalAmount
            @Override
            public int totalAmount(int price) {
                return price - (price * 20) / 100;
            }
        };

        System.out.println(customer.totalAmount(1000));         // Imprime el resultado para customer
        System.out.println(specialCustomer.totalAmount(100000)); // Imprime el resultado para specialCustomer
    }
}

class Purchase {
    int price;

    public int totalAmount(int price) {
        return price - (price * 10) / 100;
    }
}
