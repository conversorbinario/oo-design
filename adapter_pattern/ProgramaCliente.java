import adapter_package.*;


public class ProgramaCliente {
    public static void main(String[] args) {

        CoffeeTouchscreenAdapter coffeTouchScreen = new CoffeeTouchscreenAdapter(new OldCoffeeMachine());

        coffeTouchScreen.chooseFirstSelection();
        coffeTouchScreen.chooseFirstSelection();

    }
}