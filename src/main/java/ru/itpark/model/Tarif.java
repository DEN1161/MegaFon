package ru.itpark.model;

    public abstract  class Tarif {
        private String Url;
        private String name;
        private int price;
        private String territory;

        public Tarif(String url, String name, int price, String territory) {
            this.Url = url;
            this.name = name;
            this.price = price;
            this.territory = territory;

        }

        public String getUrl() {
            return Url;
        }

        public void setUrl(String url) {
            Url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public String getTerritory() {
            return territory;
        }

        public void setTerritory(String territory) {
            this.territory = territory;
        }
    }

