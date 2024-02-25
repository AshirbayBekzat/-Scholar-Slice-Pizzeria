 package Bekzat_Ashirbay_220103091;

import java.util.List;

    public class Customer{
        private String customerName;
        private int customerId;
        private long mobile;
        private String email;
        Address address;
        private List<Order> orders;

        public Customer(String customerName, int customerId,
                        long mobile, String email, List<Order> orders,Address address) {
            this.customerName = customerName;
            this.customerId = customerId;
            this.mobile = mobile;
            this.email = email;
            this.address=address;
            this.orders = orders;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public int getCustomerId() {
            return customerId;
        }

        public void setCustomerId(int customerId) {
            this.customerId = customerId;
        }

        public long getMobile() {
            return mobile;
        }

        public void setMobile(long mobile) {
            this.mobile = mobile;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Order> getOrders() {
            return orders;
        }

        public void setOrders(List<Order> orders) {
            this.orders = orders;
        }

        @Override
        public String  toString() {
            return "Customer{" +
                    "customerName='" + customerName + '\'' +
                    ", customerId=" + customerId +
                    ", mobile=" + mobile +
                    ", email='" + email + '\'' +
                    ", orders=" + orders +
                    '}';
        }
    }


