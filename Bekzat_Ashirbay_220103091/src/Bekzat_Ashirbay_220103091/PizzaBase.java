 package Bekzat_Ashirbay_220103091;

    public class PizzaBase {
        private String baseTitle;
        private String baseType;
        private String description;

        public PizzaBase(String baseTitle, String baseType,
                         String description) {
            this.baseTitle = baseTitle;
            this.baseType = baseType;
            this.description = description;
        }

        public String getBaseTitle() {
            return baseTitle;
        }

        public void setBaseTitle(String baseTitle) {
            this.baseTitle = baseTitle;
        }

        public String getBaseType() {
            return baseType;
        }

        public void setBaseType(String baseType) {
            this.baseType = baseType;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "PizzaBase{" +
                    "baseTitle='" + baseTitle + '\'' +
                    ", baseType='" + baseType + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

