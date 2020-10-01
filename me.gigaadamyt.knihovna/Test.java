public class Test {

        public static void main(String[] args) {
            Game hra = new Game(new Arena("Test", "mapa", 16, 0));
            System.out.print(hra.getArena().getJmeno_hry());
        }


}
