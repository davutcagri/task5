import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        //Öğrenci numaralarına karşılık gelen notlar.
        Map<Integer, Double> grades = new HashMap();
        grades.put(45, 79.0);
        grades.put(1040, 92.5);
        grades.put(735, 87.2);

        //En yüksek notun belirlenmesi.
        Map.Entry<Integer, Double> maxGrade = null;
        for (Map.Entry<Integer, Double> grade : grades.entrySet()) {
            if (maxGrade == null || grade.getValue().compareTo(maxGrade.getValue()) > 0) {
                maxGrade = grade;
            }
        }
        System.out.println("En Yüksek Not\n--------------\n" + "Öğrenci numarası: " + maxGrade.getKey() + "\n" + "Not: " + maxGrade.getValue());

        //En düşük notun belirlenmesi.
        Map.Entry<Integer, Double> minGrade = null;
        for(Map.Entry<Integer, Double> grade: grades.entrySet()) {
            if(minGrade == null || grade.getValue().compareTo(minGrade.getValue()) < 0) {
                minGrade = grade;
            }
        }
        System.out.println("En Düşük Not\n--------------\n" + "Öğrenci numarası: " + minGrade.getKey() + "\n" + "Not: " + minGrade.getValue());

        //Notların ortalamasını alma.
        System.out.println("Notların ortalaması: " + grades.values().stream().mapToDouble((a) -> a).average().orElse(0));
    }
}