public interface Greeter {
    void login(Account guest);
    void logout(Account guest);
    void like(Account guest);
}

   /* private String getLoginMessege(Account guest) {
        switch (guest.getCountry()) {
            case JAPAN:
                return String.format("こんにちは、%sさん。", guest.getName());
            case FRANCE:
                return String.format("Bonjour, %s.", guest.getName());
            case SPAIN:
                return String.format("Buenos Dias, %s", guest.getName());
            case GERMANY:
                return String.format("Guten Tag, %s", guest.getName());
            case USA:
            default:
                return String.format("Hello, %s.", guest.getName());
        }
    }

    public void logout(Account guest) {
        System.out.println(getLogoutMessege(guest));
    }

    private String getLogoutMessege(Account guest) {
        switch (guest.getCountry()) {
        case JAPAN:
            return "さようなら。";
        case FRANCE:
            return "Au revoir.";
        case GERMANY:
            return "Aus Wiedersehen.";
        case SPAIN:
            return "Hasta luego.";
        case USA:
        default:
            return "Goodbye.";
        }
    }
}*/
