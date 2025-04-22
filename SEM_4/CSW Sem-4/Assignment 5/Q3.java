class CustomNullPointerException extends RuntimeException {
    public CustomNullPointerException(String message) {
        super(message);
    }

    public static void main(String[] args) {
        try {
            String nullString = null;
            if (nullString == null) {
                throw new CustomNullPointerException("Custom NullPointerException: String is null.");
            }
        } catch (CustomNullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
