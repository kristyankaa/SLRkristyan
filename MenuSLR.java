

public class MenuSLR {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double[] y = {5, 10, 15, 20, 25, 30, 35, 40, 45};

        simpleLinearRegression operations = new simpleLinearRegression(x, y);
        operations.showData();
        operations.sumX();
        operations.sumY();
        operations.sumXY();
        operations.x2();
        operations.Beta0();
        operations.Beta1();
        operations.prediccion();
        operations.Prediccion2();
        operations.Prediccion3();
        operations.Prediccion4();
        operations.Prediccion5();
    }
}

