package data;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GayData {
    static String[] sexes = new String[]{"Nam", "Nu"};
    static double[] ages = new double[]{1, 1.25, 1.5, 1.75, 2, 2.5, 3, 3.5, 4, 4.5, 5, 5.5, 6, 6.5, 7, 7.5, 8, 8.5, 9, 9.5, 10};
    static double[] weightMinFemale = new double[]{7, 7.6, 8.1, 8.6, 9, 10, 10.8, 11.6, 12.3, 13.0, 13.7, 14.6, 15.3, 16, 16.8, 17.6, 18.6, 19.6, 20.8, 21, 23};
    static double[] weightMaxFemale = new double[]{11.5, 12.4, 13.2, 14, 14.8, 16.5, 18.1, 19.8, 21.5, 23.2, 24.9, 26.2, 27.8, 29.6, 31.4, 33.5, 35.8, 38.3, 41, 43.8, 46.9};
    static double[] weightTbFemale = new double[]{8.9, 9.6, 10.2, 10.9, 11.5, 12.7, 13.9, 15.0, 16.1, 17.2, 18.2, 19.1, 20.2, 21.2, 22.4, 23.6, 25, 26.6, 28.2, 30.9, 31.9};
    static double[] heightMinFemale = new double[]{
            68.9, 72, 74.9, 77.5, 80, 83.6, 87.4, 90.9, 94.1, 97.1, 99.9, 102.3, 104.9, 107.4, 109.9, 112.4, 115.0, 117.6, 120.3, 123.0, 125.8
    };
    static double[] heightTbFemale = new double[]{
            74, 77.5, 80.7, 83.7, 86.4, 90.7, 95.1, 99, 102.7, 106.2, 109.4, 112.2, 115.1, 118.0, 120.8, 123.7, 126.6, 129.5, 132.5, 135.5, 138.6
    };
    static double[] heightMaxFemale = new double[]{
            79.2, 83.0, 86.5, 89.8, 92.9, 97.7, 102.7, 107.2, 111.3, 115.2, 118.9, 122.0, 125.4, 128.6, 131.7, 134.9, 138.2, 141.4, 144.7, 148.1, 151.4
    };

    static double[] weightMinMale = new double[]{
            7.7, 8.3, 8.8, 9.2, 9.7, 10.5, 11.3, 12.0, 12.7, 13.4, 14.1, 15, 15.9, 16.8, 17.7, 18.6, 19.5, 20.4, 21.3, 22.2, 23.2
    };

    static double[] weightTbMale = new double[]{
            9.6, 10.3, 10.9, 11.5, 12.2, 13.3, 14.3, 15.3, 16.3, 17.3, 18.3, 19.4, 20.5, 21.7, 22.9, 24.1, 25.4, 26.7, 28.1, 29.6, 31.2
    };

    static double[] weightMaxMale = new double[]{
            12, 12.8, 13.7, 14.5, 15.3, 16.9, 18.3, 19.7, 21.2, 22.7, 24.2, 25.5, 27.1, 28.9, 30.7, 32.6, 34.7, 37, 39.4, 42.1, 45
    };

    static double[] heightMinMale = new double[]{
            71, 74.1, 76.9, 79.4, 81, 85.1, 88.7, 91.9, 94.9, 97.8, 100.7, 103.4, 106.1, 108.7, 111.2, 113.6, 116, 118.3, 120.5, 122.8, 125
    };

    static double[] heightTbMale = new double[]{
            75.7, 79.1, 82.3, 85.1, 87.1, 91.9, 96.1, 99.9, 103.3, 106.7, 110.0, 112.9, 116.0, 118.9, 121.7, 124.5, 127.3, 129.9, 132.6, 135.2, 137.8
    };

    static double[] heightMaxMale = new double[]{
            80.5, 84.2, 87.2, 90.9, 93.2, 98.7, 103.5, 107.8, 111.7, 115.5, 119.2, 122.4, 125.8, 129.1, 132.3, 135.5, 138.6, 141.6, 144.6, 147.6, 150.5
    };


    public static void main(String[] args) throws IOException {
        File file = new File("/home/truong/Documents/design_pattern/src/data/gay_data.txt");
        PrintWriter writer = new PrintWriter(file);
        // xác định theo tuổi và giới tính

        for (int i=0; i < 4000; i++) {
            int randomIndex = randomInt(0, 20);
            int randomSexIndex = randomInt(0, 1);
            String sex = sexes[randomSexIndex];
            double age = ages[randomIndex];
            double minWeight = 0;
            double tbWeight = 0;
            double maxWeight = 0;
            double minHeight = 0;
            double tbHeight = 0;
            double maxHeight = 0;
            if (sex.equals("Nam")) {
                minWeight = weightMinMale[randomIndex];
                tbWeight = weightTbMale[randomIndex];
                maxWeight = weightMaxMale[randomIndex];
                minHeight = heightMinMale[randomIndex];
                tbHeight = heightTbMale[randomIndex];
                maxHeight = heightMaxMale[randomIndex];
            }

            if (sex.equals("Nu")) {
                minWeight = weightMinFemale[randomIndex];
                tbWeight = weightTbFemale[randomIndex];
                maxWeight = weightMaxFemale[randomIndex];
                minHeight = heightMinFemale[randomIndex];
                tbHeight = heightTbFemale[randomIndex];
                maxHeight = heightMaxFemale[randomIndex];
            }
            int random = randomInt(0, 12);
            Child child;
            if (random < 2) {
                child = createWeight1(random, minWeight, tbWeight, minHeight, tbHeight, maxHeight);
            }
            else
                if (random < 5) {
                    child = createWeight2(random, minWeight, tbWeight, minHeight, tbHeight, maxHeight);
                }
                else
                    if (random < 9) {
                        child = createWeight3(random, tbWeight, maxWeight, minHeight, tbHeight, maxHeight);
                    }
                    else
                        if (random < 12){
                        child = createWeight4(random, tbWeight, maxWeight, minHeight, tbHeight, maxHeight);
                        }
                        else {
                            child = createCaseWrong(minWeight, maxWeight, minHeight, maxHeight);
                        }
            if (child != null) {
                child.setAge(age);
                child.setSex(sex);
                writer.println(child);
            }
        }

    }

    // case weight 1
    // min - (tb - min)/2 < weight < min + (tb - min)/2 && tb <= height <= max + (max - tb)/2=> suy dinh dưỡng
    //                                                      min - (tb - min)/2 < height < tb  => thieu_can
    private static Child createWeight1(int random, double minWeight, double tbWeight,
                                                double minHeight, double tbHeight, double maxHeight){
        String status = "";
        double startWeight = minWeight - (tbWeight - minWeight)/2;
        double endWeight = minWeight + (tbWeight - minWeight)/2;
        double startHeight = 0;
        double endHeight = 0;
        if (random % 13 == 0 ) {
            startHeight = tbHeight;
            endHeight = maxHeight + (maxHeight - tbHeight)/2;
            status = "suy_dinh_duong";
        }

        if (random % 13 == 1 ) {
            startHeight = minHeight - (tbHeight - minHeight)/2;
            endHeight = tbHeight - 0.1;
            status = "thieu_can";
        }

        if (status.isEmpty())
            return null;
        return new Child(randomDouble(startHeight, endHeight), randomDouble(startWeight, endWeight), status);
    }

    // case weight 2
    // min + (tb - min)/2 < weight <= tb && min - (tb - min)/2 <  height < min + (tb - min)/2  => suy dinh dưỡng
    //                                     min + (tb - min)/2 <= height < tb + (max - tb)/2 => binh_thuong
    //                                     tb + (max - tb)/2 <= height < max + (max - tb)/2 => thieu_can
    private static Child createWeight2(int random, double minWeight, double tbWeight,
                                             double minHeight, double tbHeight, double maxHeight){
        String status = "";
        double startWeight = minWeight + (tbWeight - minWeight)/2;
        double endWeight = tbWeight;
        double startHeight = 0;
        double endHeight = 0;

        switch (random%13){
            case 2:
                startHeight = minHeight - (tbHeight - minHeight)/2;
                endHeight = minHeight + (tbHeight - minHeight)/2 - 0.1;
                status = "suy_dinh_duong";
                break;

            case 3:
                startHeight = minHeight + (tbHeight - minHeight)/2;
                endHeight = tbHeight + (maxHeight - tbHeight)/2 - 0.1;
                status = "binh_thuong";
                break;
            case 4:
                startHeight = tbHeight + (maxHeight - tbHeight)/2;
                endHeight = maxHeight + (maxHeight - tbHeight)/2;
                status = "thieu_can";
                break;
        }

        if (status.isEmpty())
            return null;
        return new Child(randomDouble(startHeight, endHeight), randomDouble(startWeight, endWeight), status);
    }

    // case weight 3
    // tb < weight < tb + (max - tb)/2 && min - (tb - min)/2 < height < min + (tb - min)/2 => beo_phi
    //                                    min + (tb - min)/2 < height <= tb => thua_can
    //                                    tb < height <= max => binh_thuong
    //                                    max < height < max + (max-tb)/2  => thieu_can
    private static Child createWeight3(int random, double tbWeight, double maxWeight,
                                             double minHeight, double tbHeight, double maxHeight){
        String status = "";
        double startWeight = tbWeight + 0.1;
        double endWeight = tbWeight + (maxWeight - tbWeight)/2;
        double startHeight = 0;
        double endHeight = 0;

        switch (random%13){
            case 5:
                startHeight = minHeight - (tbHeight - minHeight)/2;
                endHeight = minHeight + (tbHeight - minHeight)/2 - 0.1;
                status = "beo_phi";
                break;

            case 6:
                startHeight = minHeight + (tbHeight - minHeight)/2;
                endHeight = tbHeight;
                status = "thua_can";
                break;
            case 7:
                startHeight = tbHeight + 0.1;
                endHeight = maxHeight;
                status = "binh_thuong";
                break;
            case 8:
                startHeight = maxHeight + 0.1;
                endHeight = maxHeight + (maxHeight - tbHeight)/2;
                status = "thieu_can";
                break;
        }

        if (status.isEmpty())
            return null;

        return new Child(randomDouble(startHeight, endHeight), randomDouble(startWeight, endWeight), status);
    }

    // case weight 4
    // tb + (max - tb)/2 < weight < max + (max - tb)/2 && min - (tb - min)/2 < height <= tb => beo_phi
    //                                                    tb < height <= max => thua_can
    //                                                    max < height < max + (max-tb)/2 => binh_thuong
    private static Child createWeight4(int random, double tbWeight, double maxWeight,
                                             double minHeight, double tbHeight, double maxHeight) {
        String status = "";
        double startWeight = tbWeight + (maxWeight - tbWeight) / 2 + 0.1;
        double endWeight = maxWeight + (maxWeight - tbWeight) / 2;
        double startHeight = 0;
        double endHeight = 0;

        switch (random % 13) {
            case 9:
                startHeight = minHeight - (tbHeight - minHeight) / 2;
                endHeight = tbHeight;
                status = "beo_phi";
                break;

            case 10:
                startHeight = tbHeight + 0.1;
                endHeight = maxHeight;
                status = "thua_can";
                break;
            case 11:
                startHeight = maxHeight + 0.1;
                endHeight = maxHeight + (maxHeight - tbHeight) / 2;
                status = "binh_thuong";
                break;
        }
        if (status.isEmpty())
            return null;
        return new Child(randomDouble(startHeight, endHeight), randomDouble(startWeight, endWeight), status);
    }

    private static Child createCaseWrong(double minWeight, double maxWeight,
                                         double minHeight, double maxHeight) {
        int random = randomInt(0,3);
        if (random == 3) {
            System.out.println("aaaa");
            String[] listStatus = new String[]{"suy_dinh_duong", "thieu_can", "binh_thuong", "thua_can", "beo_phi"};
            String status = listStatus[randomInt(0, 3)];
            double weight = randomDouble(minWeight, maxWeight);
            double height = randomDouble(minHeight, maxHeight);
            return new Child(height, weight, status);
        }
        return null;
    }

    private static double randomDouble(double min, double max) {
        double x = (Math.random() * ((max - min) + 1)) + min;
        return Math.round(x * 10.0) / 10.0;
    }

    private static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
