
import java.io.IOException;
import java.util.List;

public class MakeFile {

    // FileWriter fr = null;
    // static BufferedWriter bw = null;
    // File file = new File("E:\\file\\file.txt");


    public static void main(String[] args) throws IOException {

        for (int i = 1; i < 9; i++) {

            for (int j = i + 1; j < 9; j++) {
                System.out.println("two     "+i + "   " + j);

                getValuetwo(i, j);

                for (int k = j + 1; k < 9; k++) {

                    System.out.println("three     "+i + "   " + j + "   " + k);
                    getValuethree(i, j, k);

                    for (int l = k + 1; l < 9; l++) {

                        System.out.println("four     "+i + "   " + j + "   " + k + "   " + l);
                        getValueFour(i, j, k, l);

                        for (int m = l + 1; m < 9; m++) {

                            System.out.println("five     "+i + "   " + j + "   " + k + "   " + l + "   " + m);
                            getValueFive(i, j, k, l, m);

                            for (int n = m + 1; n < 9; n++) {

                                System.out.println("six     "+i + "   " + j + "   " + k + "   " + l + "   " + m + "   " + n);
                                getValueSix(i, j, k, l, m, n);

                                for (int o = n + 1; o < 9; o++) {

                                    System.out.println("seven     "+i + "   " + j + "   " + k + "   " + l + "   " + m + "   " + n+"   "+o);
                                    getValueSeven(i, j, k, l, m, n,o);
                                }
                            }
                        }
                    }
                }
            }
        }
        CreateFile cf = new CreateFile();
        cf.closeFile();

    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static void getValuetwo(int... i) throws IOException {

        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileTwo.txt");
    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static List<String> getValuethree(int... i) throws IOException {


        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileThree.txt");
        return null;

    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static List<String> getValueFour(int... i) throws IOException {

        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileFour.txt");
        return null;

    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static List<String> getValueFive(int... i) throws IOException {

        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileFive.txt");
        return null;

    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static List<String> getValueSix(int... i) throws IOException {

        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileSix.txt");
        return null;

    }

    /**
     * 
     * @param i
     * @return
     * @throws IOException
     */
    public static List<String> getValueSeven(int... i) throws IOException {

        for (int o = 1; o < 9; o++) {

            for (int a = 0; a < i.length; a++) {
                if (i[a] == o) {
                    value = value.replace(i[a] + "", "≠");
                }
            }

        }

        value = value.replaceAll("[1-9]", "=");
        // System.out.println(value);

        CreateFile cf = new CreateFile();
        cf.createNewFile(value.replaceAll("かつ", "かつ\r\n"), "E:\\file\\fileSeven.txt");
        return null;

    }
}
