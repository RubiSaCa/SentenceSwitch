public class SentenceSwitch {
    public static void main (String[] args){
        System.out.println("Cambios");
        String colorModeSelected = "Dark";

        switch (colorModeSelected) {
            case "Light":
                System.out.println("Selecionaste Light Mode");
                break;
            case "Night":
                System.out.println("Selecionaste Night Mode");
                break;
            case "Blue Dark":
                System.out.println("Selecionaste Blue Dark Mode");
                break;
            case "Dark":
                System.out.println("Selecionaste Dark Mode");
                break;
        
            default:
                System.out.println("Seleciona una opcion");
                break;
        }
    }
}
