import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Formatter;

public class Main
{
    public static void main(String[] args)
    {

        Employee[] productionworkers = new Employee[50];

        try
        {


            FileReader fileReader = new FileReader("C:\\Users\\Kozochka\\IdeaProjects\\lab0_ASDC\\src\\employee.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            for(int i = 0; i < productionworkers.length; i++)
            {
                productionworkers[i] = new Employee();
                productionworkers[i].readingFile(bufferedReader);
            }


            Formatter form = new Formatter(System.out);
            for(int i = 0; i < productionworkers.length; i++)
            {
                productionworkers[i].writeTable(form);
            }

            bufferedReader.close();
        }

        catch (IOException e)
        {
            System.out.println("Error " + e.getMessage());
        }
    }
}