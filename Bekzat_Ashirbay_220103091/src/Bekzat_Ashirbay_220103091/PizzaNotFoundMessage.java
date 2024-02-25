package Bekzat_Ashirbay_220103091;

    public class PizzaNotFoundMessage extends Exception{
        public PizzaNotFoundMessage() {
        }

        public PizzaNotFoundMessage(String message) {
            super(message);
        }

        public PizzaNotFoundMessage(String message, Throwable cause) {
            super(message, cause);
        }

        public PizzaNotFoundMessage(Throwable cause) {
            super(cause);
        }

        public PizzaNotFoundMessage(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
            super(message, cause, enableSuppression, writableStackTrace);
        }
    }


