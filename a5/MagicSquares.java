import java.io.*;

public class MagicSquares{

  /**
  * testBoard() checks whether the rows and columns of the input file add to the same numbers
  */
  public static boolean testBoard(String fileName){
    String currLine;
    int lastSum = -1;
    boolean isValid = true;
    try{
      BufferedReader inputFile = new BufferedReader(new FileReader(fileName));
      //for each line in inputFile sum rows and columns
      while((currLine = inputFile.readLine()) != null){
        String[] numbers = currLine.split("\t");//input files are delimited by tabs
        int rowSum = 0;
        for(String num: numbers){
          rowSum += Integer.parseInt(num);
        }
        if(lastSum == -1){ //if first row
          lastSum = rowSum;
        }else{
          if(lastSum != rowSum){
            isValid = false;
          }
        }
      }
      inputFile.close();
    }catch(IOException ioe){

    }
    return isValid;
  }

  public static void main(String[] args){
    System.out.println("");
  }

}
