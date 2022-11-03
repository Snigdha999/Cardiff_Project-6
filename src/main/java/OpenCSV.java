import java.io.FileReader;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class OpenCSV {

    public static void main(String[] args) {
        try {
            CSVReader reader = new CSVReaderBuilder(new FileReader("yourfile.csv")).build();
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                // nextLine[] is an array of values from the line
                if(Integer.parseInt(nextLine[2])==41) {
                    System.out.println(nextLine[0] + nextLine[1] + "etc...");
                }
            }
        }catch (Exception e){
            System.out.println(e);

        }
    }
}
