public class ShapesDisplay {
    public static void main(String[] args) {
        displayBox();
        System.out.println();
        displayOval();
        System.out.println();
        displayArrow();
        System.out.println();
        displayDiamond();

    }

    public static void displayBox(){
        int width= 9;
        int height = 9;

        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    public static void displayOval(){
        int width = 6;
        int height = 3;

        for (int i = 0; i < width; i++){
            for (int j = 0; j < height; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void displayArrow(){
            int height = 4;

            for (int i = 0; i < height; i++){
                for (int j = 0; j < i; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void displayDiamond(){
            int size = 5;

            for (int i = 0; i < size; i++){
                for (int j = size - 1; j > i; j--){
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            for (int i = size - 2; i >= 0; i--){
                for (int j = size - 1; j > i; j--){
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++){
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
}
