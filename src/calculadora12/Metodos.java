package calculadora12;

public class Metodos {

    //Valores calculadora
    public float x = 0, y = 0, px = 10, py = 10, pxn = 10;

    // x positivo
    public void bx(int n) {
        x = x * 10;
        x = x + n;
    }
    public void bx0() {
        x = x * 10;
    }

    // x flotante positivo
    public void bxp(int n) {
        x = (x) + (n / px);
        px = px * 10;
    }
    public void bxp0() {
        px = px * 10;
    }

    // y positivo
    public void by(int n) {
        y = y * 10;
        y = y + n;
    }
    public void by0() {
        y = y * 10;
    }

    // y flotante positivo
    public void byp(int n) {
        y = (y) + (n / py);
        py = py * 10;
    }
    public void byp0() {
        py = py * 10;
    }

    // x negativo
    public void bxn(int n) {
        x = x * 10;
        x = x - n;
    }
    public void bxn0() {
        x = x * 10;
    }

    // x flotante negativo
    public void bxnp(int n) {
        x = (x) - (n / pxn);
        pxn = pxn * 10;
    }
    public void bxnp0() {
        pxn = pxn * 10;
    }
}
