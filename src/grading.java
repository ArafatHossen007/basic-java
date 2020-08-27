public class grading {

    public static void main(String[] args){
        //array list
        int arr[] = {80,85,79,90,95,55};
        int sum = 0;
        int arrayLength = arr.length;
        //creating object
        score obj = new score();
        System.out.println("scores And grade");
        //iterate
        for(int i = 0; i<arrayLength; i++){
            sum += arr[i];
            obj.grade(arr[i]);
            System.out.println("score:"+arr[i]);
        }
        System.out.println("sum of scores: " + sum);
        System.out.println("average: " + (sum/arr.length));
    }
}
class score{
     public void grade(int j){
         if(j>=93&&j<=100) {
             System.out.println("grade: A");
         }
         else if(j>=90&&j<=92){
             System.out.println("grade: A-");
         }
         else if(j>=85&&j<=89){
             System.out.println("grade: B+");
         }
          else if(j>=80&&j<=84){
              System.out.println("grade: B-");
          }
          else if(j>=75&&j<=79){
              System.out.println("grade: C");
          }
          else if(j>=70&&j<=74){
              System.out.println("grade: C-");
          }
          else if(j>=65&&j<=69){
              System.out.println("grade: D");}
          else if(j>=60&&j<=64){
              System.out.println("grade: D-");
          }
           else if(j>=0&&j<=69){
               System.out.println("grade: F");
           }




     }
     }
