import java.util.Arrays;

public class simpleLinearRegression {
    private double[] Fire;
    private double[] ICE;

    double sumaX = 0;
    double sumaY = 0;
    double sumaXY = 0;
    double sumaX2 = 0;
    double beta0 = 0; 
    double beta1 = 0;
    double prediccion = 0;
    double prediccion2 = 0;
    double prediccion3 = 0;
    double Prediccion4 = 0;
    double Prediccion5 = 0;

    double[] arreglo;

    simpleLinearRegression(double[] Fire, double[] ICE) {
        this.Fire = Fire;
        this.ICE = ICE;
        this.arreglo = new double[Fire.length];
    }

    public void showData() {
        System.out.println("=========DATA SET========");
        System.out.println("Datos de Columna X = : " + Arrays.toString(Fire));
        System.out.println("Datos de Columna Y = : " + Arrays.toString(ICE));
        System.out.print("\n");
    }

    public void sumX() {
        for (int i = 0; i < ICE.length; i++) {
            sumaX += Fire[i];
        }
        System.out.println("Suma de columna X:" + sumaX);
    }

    public void sumY() {
        for (int i = 0; i < ICE.length; i++) {
            sumaY += ICE[i];
        }
        System.out.println("Suma columna Y: " + sumaY);
    }

    public void sumXY() {
        for (int i = 0; i < Fire.length; i++) {
            double juancho = Fire[i] * ICE[i];
            arreglo[i] = juancho;
        }
        System.out.println("Columna XY: " + Arrays.toString(arreglo));
        for (int i = 0; i < arreglo.length; i++) {
            sumaXY += arreglo[i];
        }
        System.out.println("Suma Columna XY: " + sumaXY);
    }

    public void x2() {
        for (int i = 0; i < Fire.length; i++) {
            sumaX2 += Fire[i] * Fire[i];
        }
        System.out.println("Suma Columna X^2: " + sumaX2);
        System.out.print("\n");
    }

    public double Beta0() {
        System.out.println("=========BETAS========");
        int n = Fire.length;
        beta0 = (sumaY * sumaX2 - sumaX * sumaXY) / (n * sumaX2 - sumaX * sumaX);
        System.out.println("Beta 0 = " + beta0);
        return beta0;
    }

    public double Beta1() {
        int n = Fire.length;
        beta1 = (n * sumaXY - sumaX * sumaX) / (n * sumaX2 - sumaX * sumaX);
        System.out.println("Beta 1 = " + beta1);
        System.out.print("\n");
        return beta1;
    }

    public double prediccion() {
        System.out.println("=========PREDICCIONES========");
        prediccion = beta0 + beta1 * 5;
        System.out.println("Predicción 1 = " + prediccion);
        return prediccion;
    }

    public double Prediccion2() {
        prediccion2 = beta0 + beta1 * 10;
        System.out.println("Predicción 2 = " + prediccion2);
        return prediccion2;
    }

    public double Prediccion3() {
        prediccion3 = beta0 + beta1 * 15;
        System.out.println("Predicción 3 = " + prediccion3);
        return prediccion3;
    }

    public double Prediccion4() {
        Prediccion4 = beta0 + beta1 * 50;
        System.out.println("Predicción 4 = " + Prediccion4);
        return Prediccion4;
    }

    public double Prediccion5() {
        Prediccion5 = beta0 + beta1 * 100;
        System.out.println("Predicción 5 = " + Prediccion5);
        return Prediccion5;
    }
}


