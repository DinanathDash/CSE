public class Q14 {
    public static void main(String[] args) {
        char direction = 'N';
        char west = 'W';
        switch(direction){
            case 'N': System.out.println("North");
            break;
            case 'E': System.out.println("East");
            break;
            case west: System.out.println("West");
            break;
            case 'S': System.out.println("South");
        }
    }
}
// case expressions must be constant expressions