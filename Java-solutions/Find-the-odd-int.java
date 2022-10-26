public class FindOdd {
	public static int findIt(int[] a) {
    
    int results = 0;
    
    for(int i = 0; i < a.length; i++) {
      int currentComparison = a[i];
      int counter = 0;
      
      for(int v = 0; v < a.length; v++) {
        if(a[i] == a[v]) {
          counter++;
        }
        if(v == a.length - 1 && counter % 2 == 0) {
          counter = 0;
          System.out.println("counter = " + counter);
          System.out.println("v =" + v);
          System.out.println("a.length =" + a.length);
        }
      }
      if(counter % 2 != 0) {
        System.out.println("Counter is odd! Counter = " + counter);
        results = a[i];
        break;
      }
    }
    
    System.out.println("End of test!");
    
  	return results;
  }
}