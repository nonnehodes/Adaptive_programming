package Summatieve_opdracht_2;

public class MainSum2 {
    public static void main(String[] args) {
        // Initialize
        Helpers hp = new Helpers();
//        String invoer = "bca";
//
//        FSM2a fsm = new FSM2a(hp.getFSMNodes());
//        fsm.run(invoer);

        Integer dobbelsteen = 10;
        MCM2b mcm = new MCM2b(hp.getMCMNode(dobbelsteen));
        System.out.println(mcm.run());
    }
}
