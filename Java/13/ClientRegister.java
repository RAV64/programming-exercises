public class ClientRegister {
    public static void main(String[] args) {
        CashClient client1 = new CashClient("Lisa", "101070-1111");
        AccountClient client2 = new AccountClient("Benny", "101070-1111");
        AccountClient client3 = new AccountClient("Barney", "040474-1571", "Someroad 3");
        Client client4 = new Client("Client", "111170-1111", "Road 4");

        client1.payCash(70);
        client2.deposit(100);
        client3.deposit(500);
        client2.withdraw(20);

        System.out.println(client2);
        System.out.println(client3);
    }
}

class Client {

    public String client;
    public String id;
    public String address;

    public Client(String client, String id, String address) {
        this(client, id);
        this.address = address;
    }

    public Client(String client, String id) {
        this.client = client;
        this.id = id;
    }
}

class CashClient extends Client {

    public CashClient(String client, String id) {
        super(client, id);
    }

    public void payCash(int i) {
        System.out.println(client + "(" + id + "): Amount paid " + i + " euros.");
    }
}

class AccountClient extends Client {

    private double balance;

    public AccountClient(String client, String id, String address) {
        super(client, id, address);
    }

    public AccountClient(String client, String id) {
        super(client, id);
    }

    public String toString() {
        return client + "(" + id + "): " + balance;
    }

    public void deposit(int i) {
        this.balance += i;
    }

    public void withdraw(int i) {
        this.balance -= i;
    }
}
