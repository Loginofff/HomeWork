

    public class Figure {

    private final static  String COLORS = "Red Green Yellow Blue";


    private final static String DEFAULT_COLOR = " Black";
        private  int x;

        private  int y;

        private String color;

        public Figure (int x, int y){
            this.x = x;
            this.y = y;
            this.color = DEFAULT_COLOR;
        }

        public void  setColors ( String color) {
            if (COLORS.contains(color)) {
                this.color = color;
            } else {
                this.color = DEFAULT_COLOR;
            }
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getColor() {
            return color;
        }
    }

