/*  Given a route containig 4 direction (E,W,N,S), find the shortest path to reach the destination.
    "WNEENESENNN"
    Result = 5
 */
package String;
public class ShortestPath {

    public static void shortestPath(String path){
        int x=0, y=0;
        for(int i=0; i<path.length(); i++){
            switch (path.charAt(i)) {
                case 'N': y+=1;
                    break;
                case 'S': y-=1;
                    break;
                case 'W': x-=1;
                    break;
                case 'E': x+=1;
                break;
                default:
                    break;
            }
        }
        int  d =(int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The shortest path is "+d);
    }
    public static void main(String[] args) {
        String path = new String("WNEENESENNN");
        shortestPath(path);
    }
}
