package adapter_package;


public class CoffeeTouchscreenAdapter implements CoffeMachineInterface {

    private OldCoffeeMachine oldCoffeMachine;

    public CoffeeTouchscreenAdapter(OldCoffeeMachine oldMachine) {
        this.oldCoffeMachine = oldMachine;
    }

    public void chooseFirstSelection() {
        this.oldCoffeMachine.selectA();
    }

    public void chooseSecondSelection() {
        this.oldCoffeMachine.selectB();
    }

}
