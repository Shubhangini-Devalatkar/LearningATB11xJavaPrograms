package ex_22_AccessModifiers.Police;

public class Cop {
    private int gun;
    String iCard;

    // Param Con
    public Cop(int bullet) {
        this.gun = bullet;
    }

    // Method / Behav
    protected void canIShoot() {
        System.out.println("Yes You can shoot!");
    }
}