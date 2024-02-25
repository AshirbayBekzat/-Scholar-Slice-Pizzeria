package Bekzat_Ashirbay_220103091;

    public class Address {
        private String state;
        private String district;
        private String city;
        private int doorNumber;

        public Address(String customerName, int customerId, long mobile,
                       String email,
                       String state, String district, String city, int doorNumber) {
            this.state = state;
            this.district = district;
            this.city = city;
            this.doorNumber = doorNumber;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getDoorNumber() {
            return doorNumber;
        }

        public void setDoorNumber(int doorNumber) {
            this.doorNumber = doorNumber;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "state='" + state + '\'' +
                    ", district='" + district + '\'' +
                    ", city='" + city + '\'' +
                    ", doorNumber=" + doorNumber +
                    '}';
        }
    }


