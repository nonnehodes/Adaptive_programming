package Summatieve_opdracht_2;

public class MainSum2 {
    public static void main(String[] args) {
        Helpers hp = new Helpers();
        String invoer = "abac";
        Integer dobbelsteen = 10;

        FSM2a fsm = new FSM2a(hp.getFSMNodes());
        fsm.run(invoer);

        MCM2b mcm = new MCM2b(hp.getMCMNode(dobbelsteen));
        mcm.run();
    }
}
