package components;

public class Computer {
    private String computerOS;
    private int computerRAM;

    public Computer(String computerOS, int computerRAM) {
        this.computerOS = computerOS;
        this.computerRAM = computerRAM;
    }

    public String getComputerOS() {
        return computerOS;
    }

    public void setComputerOS(String computerOS) {
        this.computerOS = computerOS;
    }

    public int getComputerRAM() {
        return computerRAM;
    }

    public void setComputerRAM(int computerRAM) {
        this.computerRAM = computerRAM;
    }
}
