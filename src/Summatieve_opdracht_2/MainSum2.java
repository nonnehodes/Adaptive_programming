package Summatieve_opdracht_2;

public class MainSum2 {
    public static void main(String[] args) {
        Helpers hp = new Helpers();
        String invoer = "BbAcBa";
        Integer dobbelsteen = 10;

        FSM2a fsm = new FSM2a(hp.getFSMNodes());
        System.out.println(fsm.run(invoer));

        MCM2b mcm = new MCM2b(hp.getMCMNode(dobbelsteen));
        System.out.println(mcm.run());
    }
}
